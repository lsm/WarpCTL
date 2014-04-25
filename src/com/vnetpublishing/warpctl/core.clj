(ns com.vnetpublishing.warpctl.core
  (:gen-class)
  (:require
     [com.vnetpublishing.opencl.core :as opencl]
     [com.vnetpublishing.adl.core :as adl]
     [com.vnetpublishing.warpctl.obj]
  )
)

(def appinfo (com.vnetpublishing.warpctl.obj.AppInfo. ))

(defn print-banner  []
  (println (str (.app-name appinfo) " v" (.version appinfo)))
  (println (.copyright appinfo))
)

(def kernel_code 
  (str
   " void kernel simple_add(global const int* A, global const int* B, global int* C){ "
   " C[get_global_id(0)]=A[get_global_id(0)]+B[get_global_id(0)]; "
   " } "
) )


(defn test-device [device]
    (let [
      platform (.getPlatform device)
      context (.createContext platform [device] nil nil)
      program (.buildProgram (.createProgramWithSource context [kernel_code]) nil nil nil)
      kernel_add (.createKernel program "simple_add")
      buffer_sz (* 10 (/ Integer/SIZE Byte/SIZE))
      buffer_a (.createBuffer context org.jocl.CL/CL_MEM_READ_WRITE buffer_sz nil)
      buffer_b (.createBuffer context org.jocl.CL/CL_MEM_READ_WRITE buffer_sz nil)
      buffer_c (.createBuffer context org.jocl.CL/CL_MEM_READ_WRITE buffer_sz nil)
      queue (.createCommandQueue context device nil)
      A (int-array [0 1 2 3 4 5 6 7 8 9])
      B (int-array [0 1 2 0 1 2 0 1 2 0])
      C (int-array 10)
      work_dim 1
    ]
    
    (println (str "Preparing device: " (.getStringParam device org.jocl.CL/CL_DEVICE_VENDOR) (.getStringParam device org.jocl.CL/CL_DEVICE_NAME) (.getStringParam device org.jocl.CL/CL_DEVICE_VERSION))) 
    
    (.enqueueWriteBuffer queue buffer_a org.jocl.CL/CL_TRUE 0 buffer_sz A nil nil nil)
    (.enqueueWriteBuffer queue buffer_b org.jocl.CL/CL_TRUE 0 buffer_sz B nil nil nil)
    
    (.setArg kernel_add 0 org.jocl.Sizeof/cl_mem buffer_a)
    (.setArg kernel_add 1 org.jocl.Sizeof/cl_mem buffer_b)
    (.setArg kernel_add 2 org.jocl.Sizeof/cl_mem buffer_c)
    
    (.enqueueNDRangeKernel queue kernel_add work_dim nil (long-array [10]) nil nil nil nil)
    (.finish queue)
    
    (.enqueueReadBuffer queue buffer_c org.jocl.CL/CL_TRUE 0 buffer_sz C nil nil nil)
    
    (loop [ctr 0 result_str "result:"]
      (if (= ctr 10)
        (println result_str)
        (recur (+ ctr 1) (str result_str " " (aget C ctr)))
      )
    )
  )
)

(defn- test-platform [platform]
  (let [n (.getDeviceCount platform org.jocl.CL/CL_DEVICE_TYPE_ALL)
        
     ]
    (println 
      (str 
        "Testing platform: " 
        (.getStringParam platform org.jocl.CL/CL_PLATFORM_VENDOR) 
        (.getStringParam platform org.jocl.CL/CL_PLATFORM_NAME) 
        (.getStringParam platform org.jocl.CL/CL_PLATFORM_VERSION)
    ) )
     (loop [dn 0]
       (if (= dn n)
         nil
         (recur (do
           (test-device (.getDeviceByType platform org.jocl.CL/CL_DEVICE_TYPE_ALL dn))
           (+ dn 1)
         )
       )
      )
    )
  )
)

(defn- test-adl
  []
  (let [adapters (adl/ADL_Adapter_AdapterInfo_Get)]
    (println (str "type: " (type adapters)))
    (println (str "Found " (alength adapters) " ADL Adapters"))
    (loop [ctr 0]
      (if (= ctr (alength adapters))
        nil
        (recur
          (do
            (println 
              (str
                "name: "
                (if (aget adapters ctr) (.getStrAdapterName (aget adapters ctr)) " nul ")
                "temp: " 
                (if (aget adapters ctr) (/ (adl/ADL_Overdrive5_Temperature_Get (.getIAdapterIndex (aget adapters ctr))) 1000) " nul ")
                "C" 
              )
              
            )
            (+ ctr 1)
          )
        )
      )
    )
  )
)

(defn -main [& args]
  (print-banner)
  (if (adl/init)
    (test-adl)
  )
  (let [n (opencl/get-platform-count)]
    (loop [ctr 0]
      (if (= ctr n)
        nil
        (recur 
          (do
            (test-platform (opencl/get-platform ctr))
            (+ ctr 1)
          )
        )
      )
    )
  )
  (adl/uninit)
)
