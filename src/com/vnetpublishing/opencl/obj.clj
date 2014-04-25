(ns com.vnetpublishing.opencl.obj
  (:gen-class)
  (:require com.vnetpublishing.opencl.util)
)

(definterface KernelType
  (getProgram [] program)
  (getKernelRef [] cl_kernel_ref)
  (setArg [arg_index arg_size arg_value])
)

(defrecord Kernel [program cl_kernel_ref]
  KernelType
  (getProgram [this] program)
  (getKernelRef [this] cl_kernel_ref)
  (setArg [this arg_index arg_size arg_value]
    (let [result (org.jocl.CL/clSetKernelArg cl_kernel_ref arg_index arg_size (org.jocl.Pointer/to arg_value))]
     (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clSetKernelArg" result)
      nil
    )
  )
)

(definterface ProgramType
  (getContext [])
  (getProgramRef [])
  (createKernel [kernel_name])
  (buildProgram [options pfn_notify user_data])
)

(defrecord Program [context cl_program_ref]
  ProgramType
  (getContext [this] context)
  (getProgramRef [this] cl_program_ref)
  (createKernel [this kernel_name]
    (let [errcode_ret (int-array 1)
        result (org.jocl.CL/clCreateKernel cl_program_ref kernel_name errcode_ret)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clCreateKernel" (get errcode_ret 0))
      (com.vnetpublishing.opencl.obj.Kernel. this result)
    )
  )
  
  (buildProgram [this options pfn_notify user_data]
    (let [devices (.getDeviceRefs context)
      result (org.jocl.CL/clBuildProgram cl_program_ref (alength devices) devices options pfn_notify user_data)]
     (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clBuildProgram" result)
      this
    )
  )
)

(definterface CommandQueueType
  (getContext [])
  (getCommandQueueRef [])
  (enqueueWriteBuffer [buffer blocking_write offset size ptr num_events_in_wait_list event_wait_list event])
  (enqueueReadBuffer [buffer blocking_read offset size ptr num_events_in_wait_list event_wait_list event])
  (enqueueNDRangeKernel [kernel work_dim global_work_offset global_work_size local_work_size num_events_in_wait_list event_wait_list event])
  (finish [])
  ;(retain [])
  ;(release [])
  ;(getUIntParam [param_name])
  ;(getLongsParam [param_name])
  ;(getULongParam [param_name])
)

(defrecord CommandQueue [context cl_command_queue_ref]
  CommandQueueType
  
  (getContext [this] context)
  
  (getCommandQueueRef [this] cl_command_queue_ref)
  
  (enqueueWriteBuffer [this buffer blocking_write offset size ptr num_events_in_wait_list event_wait_list event]
    (let [blocking blocking_write
        result (org.jocl.CL/clEnqueueWriteBuffer cl_command_queue_ref buffer blocking offset size (org.jocl.Pointer/to ptr) (if num_events_in_wait_list num_events_in_wait_list 0) event_wait_list event)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clEnqueueWriteBuffer" result)
      nil
    )
  )
  
  (enqueueReadBuffer [this buffer blocking_read offset size ptr num_events_in_wait_list event_wait_list event]
    (let [blocking blocking_read
        result (org.jocl.CL/clEnqueueReadBuffer cl_command_queue_ref buffer blocking offset size (org.jocl.Pointer/to ptr) (if num_events_in_wait_list num_events_in_wait_list 0) event_wait_list event)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clEnqueueWriteBuffer" result)
      nil
    )
  )
  
  (enqueueNDRangeKernel [this kernel work_dim global_work_offset global_work_size local_work_size num_events_in_wait_list event_wait_list event]
    (let [cl_kernel_ref (.getKernelRef kernel)
        result (org.jocl.CL/clEnqueueNDRangeKernel cl_command_queue_ref cl_kernel_ref work_dim global_work_offset global_work_size local_work_size (if num_events_in_wait_list num_events_in_wait_list 0) event_wait_list event)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clEnqueueNDRangeKernel" result)
      nil
    )
  )
  
  (finish [this]
    (let [
        result (org.jocl.CL/clFinish cl_command_queue_ref)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clFinish" result)
      nil
    )
  )
  
  ;end defrecord CommandQueue
)

(definterface ContextType
  (getPlatform [])
  (getContextRef [])
  (getDeviceRefs [])
  (createProgramWithSource [sources])
  (createBuffer [flags size host_ptr])
  (createCommandQueue [device properties])
)

(defrecord Context [platform cl_context_ref cl_device_refs]
  ContextType
  
  (getPlatform [this] platform)
  
  (getContextRef [this] cl_context_ref)
  
  (getDeviceRefs [this] cl_device_refs)
  
  (createProgramWithSource [this sources]
    (let [n (count sources)
        lens (long-array n)
        strs (loop [ctr 0 out (make-array String n)]
          (if (= ctr n)
            out
            (recur 
              (+ ctr 1) 
              (do
                (aset lens ctr (long (alength (.getBytes (get sources ctr) "UTF-8"))))
                (aset out ctr (str (get sources ctr)))
                out
              )
            )
          )
        )
        errcode_ret (int-array 1)
        result (org.jocl.CL/clCreateProgramWithSource cl_context_ref n strs lens errcode_ret)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clCreateProgramWithSource" (get errcode_ret 0))
      (com.vnetpublishing.opencl.obj.Program. this result)
    )
  )
  
  (createBuffer [this flags size host_ptr]
    (let [errcode_ret (int-array 1)
        result (org.jocl.CL/clCreateBuffer cl_context_ref flags (long size) (if host_ptr (org.jocl.Pointer/to host_ptr) nil) errcode_ret)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clCreateBuffer" (get errcode_ret 0))
      result
    )
  )
  
  (createCommandQueue [this device properties]
    (let [errcode_ret (int-array 1)
        result (org.jocl.CL/clCreateCommandQueue cl_context_ref (.getDeviceRef device) (long (if properties properties 0)) errcode_ret)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clCreateBuffer" (get errcode_ret 0))
      (CommandQueue. this result)
    )
  )
  
  ; end defrecord Context
)

(definterface DeviceType
  (getPlatform [])
  (getDeviceRef [])
  (getParamSize [param_name])

  (getIntsParam [param_name])
  (getIntParam [param_name])
  (getUIntsParam [param_name])
  (getUIntParam [param_name])
  (getLongsParam [param_name])
  (getLongParam [param_name])
  (getULongsParam [param_name])
  (getULongParam [param_name])
  (getSizesParam [param_name])
  (getSizeParam [param_name])
  (getStringParam [param_name])
  (getBoolParam [param_name])
  
  (createSubDevices [properties num_devices])
  (retain [])
  (release [])
)



(defrecord Device [platform device_ref] 
  DeviceType

  (getPlatform [this] platform)
  
  (getDeviceRef [this] device_ref)
  
  (getParamSize
    [this param_name]
    (let [
        n (long-array [9999])
        r (org.jocl.CL/clGetDeviceInfo device_ref param_name 0 nil n)
        ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clGetDeviceInfo" r)
      (get n 0)
    )                                                                        
  )

  (getIntsParam [this param_name]
    (let [
       tsz (/ Integer/SIZE Byte/SIZE)
       n (int (Math/ceil (/ (.getParamSize this param_name) tsz)))
       sz (* n tsz)
       buffer (int-array n)
       r (org.jocl.CL/clGetDeviceInfo device_ref param_name sz (org.jocl.Pointer/to buffer) nil)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clGetDeviceInfo" r)
      buffer
   )
  )
  
  (getIntParam [this param_name]
    (get (.getIntsParam this param_name) 0)
  )
  
  (getUIntsParam [this param_name]
    (let [
       tsz (/ Integer/SIZE Byte/SIZE)
       n (int (Math/ceil (/ (.getParamSize this param_name) tsz)))
       sz (* n tsz)
       buffer (int-array n)
       r (org.jocl.CL/clGetDeviceInfo device_ref param_name sz (org.jocl.Pointer/to buffer) nil)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clGetDeviceInfo" r)
      buffer
      (loop [ctr 0 out []]
        (if (= ctr n)
          out
          (recur 
            (+ ctr 1) 
            (into out [(bit-and (get buffer ctr) (long 0x00000000ffffffff))])
          )
        )
      )
    )
  )
    
  (getUIntParam [this param_name]
    (get (.getUIntsParam this param_name) 0)
  )
  
  (getLongsParam [this param_name]
    (let [
       tsz (/ Long/SIZE Byte/SIZE)
       n (int (Math/ceil (/ (.getParamSize this param_name) tsz)))
       sz (* n tsz)
       buffer (long-array n)
       r (org.jocl.CL/clGetDeviceInfo device_ref param_name sz (org.jocl.Pointer/to buffer) nil)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clGetDeviceInfo" r)
      buffer
   )
  )
  
  (getLongParam [this param_name]
    (get (.getLongsParam this param_name) 0)
  )
  
  (getULongsParam [this param_name]
    (let [
       tsz (/ Long/SIZE Byte/SIZE)
       n (int (Math/ceil (/ (.getParamSize this param_name) tsz)))
       sz (* n tsz)
       buffer (long-array n)
       r (org.jocl.CL/clGetDeviceInfo device_ref param_name sz (org.jocl.Pointer/to buffer) nil)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clGetDeviceInfo" r)
      buffer
      (loop [ctr 0 out []]
        (if (= ctr n)
          out
          (recur 
            (+ ctr 1) 
            (into out [
               (if (> (get buffer ctr) 0) 
                 (get buffer ctr)
                 (+ (bigint (get buffer ctr)) 18446744073709551616N)
               )]
            )
          )
        )
      )
    )
  )
  
  (getULongParam [this param_name]
    (get (.getULongsParam this param_name) 0)
  )

  (getSizesParam [this param_name]
    (let [
        tsz org.jocl.Sizeof/size_t
        sz (.getParamSize this param_name)
        n (int (Math/ceil (/ sz tsz)))
        buffer (.order (java.nio.ByteBuffer/allocate (* n tsz)) (java.nio.ByteOrder/nativeOrder))
        r (org.jocl.CL/clGetDeviceInfo device_ref param_name sz (org.jocl.Pointer/to buffer) nil)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clGetDeviceInfo" r)
      (if (> n 0)
        (if (= 4 tsz)
          (loop [ctr 0 out []]
            (if (= ctr n)
              out
              (recur (+ ctr 1) (into out [(.getInt buffer (* tsz ctr))]))
            )
          )
          (loop [ctr 0 out []]
            (if (= ctr n)
              out
              (recur (+ ctr 1) (into out [(.getLong buffer (* tsz ctr))]))
            )
          )
        )
        []
      )
    )
  )
  
  (getSizeParam [this param_name]
    (get (.getSizesParam this param_name) 0)
  )
  
  (getStringParam [this param_name]
    
    (let [
       sz (.getParamSize this param_name)
       buffer (byte-array sz)
       r (org.jocl.CL/clGetDeviceInfo device_ref param_name sz (org.jocl.Pointer/to buffer) nil)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clGetDeviceInfo" r)
      (String. buffer 0 (- sz 1))
   )
  )
  
  (getBoolParam [this param_name]
    (let [
       sz (/ Integer/SIZE Byte/SIZE)
       buffer (int-array 1)
       r (org.jocl.CL/clGetDeviceInfo device_ref param_name sz (org.jocl.Pointer/to buffer) nil)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clGetDeviceInfo" r)
      (not (= 0 (get buffer 0)))
   )
  )
  
  (createSubDevices [this properties num_devices]
    
    (let [
        out_devices (make-array org.jocl.cl_device_id num_devices)
        num_devices_ret (int-array 1)
        r (org.jocl.CL/clCreateSubDevices device_ref properties num_devices out_devices num_devices_ret)
        n (get num_devices_ret 0)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clCreateSubDevices" r)
      (if (> n 0)
        (loop [ctr 0 ret []]
          (let [dev_ptr (get out_devices ctr)
            ob (Device. platform  dev_ptr) 
            ]
            (if (= ctr n)
              ret
              (recur (+ ctr 1) (into ret [ob]))
            )
          )
        )
      )
    )
  )
  
  (retain [this]
    (let [r (org.jocl.CL/clRetainDevice device_ref)]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clRetainDevice" r)
      nil
    )
  )
  
  (release [this]
    (let [r (org.jocl.CL/clReleaseDevice device_ref)]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clReleaseDevice" r)
      nil
    )
  )
)

(definterface PlatformType
  (getPlatformID [])
  (getParamSize [param_name])
  (getStringParam [param_name])
  (getDeviceCount [device_type])
  (getDeviceIDs [device_type])
  (getDeviceID [device_type device_num])
  (getDevice [device_num])
  (getDeviceByType [device_type device_num])
  (createContext [devices pfn_notify user_data])
  (createContextFromType [device_type pfn_notify user_data])
)

(defrecord Platform [platform_id] 
  PlatformType

  (getPlatformID [this] platform_id)
  
  (getParamSize
    [this param_name]
    (let [
        n (long-array [9999])
        r (org.jocl.CL/clGetPlatformInfo platform_id param_name 0 nil n)
        ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clGetPlatformInfo" r)
      (get n 0)
    )                                                                        
  )
  
  (getStringParam [this param_name]
    
    (let [
       sz (.getParamSize this param_name)
       buffer (byte-array sz)
       r (org.jocl.CL/clGetPlatformInfo platform_id param_name sz (org.jocl.Pointer/to buffer) nil)
      ]
      (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clGetPlatformInfo" r)
      (String. buffer 0 (- sz 1))
   )
  )
  
  (getDeviceCount [this device_type]
    (let [n (int-array [9999]) r (org.jocl.CL/clGetDeviceIDs platform_id device_type 0 nil n)]
      (if (= r org.jocl.CL/CL_DEVICE_NOT_FOUND)
        0
        (do
           (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clGetDeviceIDs" r)
           (get n 0)
        )
      )
    )
  )

  (getDeviceIDs [this device_type]
    (let [n (.getDeviceCount this device_type)]
      (if (> n 0)
        (let [devices (make-array org.jocl.cl_device_id n) 
            result (org.jocl.CL/clGetDeviceIDs platform_id device_type n devices nil)
          ]
          (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clGetDeviceIDs" result)
          devices
        )
        (make-array org.jocl.cl_device_id 0)
      )
    )
  )

  (getDeviceID [this device_type device_num]
    (let [devices (.getDeviceIDs this device_type)]
      (if (< device_num (alength devices))
        (aget devices device_num)
        nil
      )
    )
  )
  
  (getDevice [this device_num]
    (com.vnetpublishing.opencl.obj.Device. this (.getDeviceID this org.jocl.CL/CL_DEVICE_TYPE_ALL device_num))
  )
   
  (getDeviceByType [this device_type device_num]
    (com.vnetpublishing.opencl.obj.Device. this (.getDeviceID this device_type device_num))
  )
  
  (createContext [this devices pfn_notify user_data]
    (let [properties (org.jocl.cl_context_properties.)
         num_devices (count devices)
         dev_ids (loop [ctr 0 out (make-array org.jocl.cl_device_id num_devices)]
           (if (= ctr num_devices)
             out
             (recur 
               (+ ctr 1) 
               (do
                 (aset out ctr (.getDeviceRef (get devices ctr)))
                 out
               )
             )
           )
         )
      ]
      (.addProperty properties org.jocl.CL/CL_CONTEXT_PLATFORM platform_id)
      (let [
            errcode_ret (int-array 1)
            cl_context (org.jocl.CL/clCreateContext properties num_devices dev_ids pfn_notify user_data errcode_ret)
            result (get errcode_ret 0)
        ]
        (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clCreateContext" result)
        (com.vnetpublishing.opencl.obj.Context. this cl_context dev_ids)
      )
    )
  )
  
  ;TODO: Generate device list for context
  (createContextFromType [this device_type pfn_notify user_data]
    
    (let [properties (org.jocl.cl_context_properties.)]
      (.addProperty properties org.jocl.CL/CL_CONTEXT_PLATFORM platform_id)
      (let [
            errcode_ret (int-array 1)
            cl_context (org.jocl.CL/clCreateContextFromType properties device_type pfn_notify user_data errcode_ret)
            result (get errcode_ret 0)
        ]
        (com.vnetpublishing.opencl.util/assert-success "org.jocl.CL/clCreateContextFromType" result)
        (com.vnetpublishing.opencl.obj.Context. this cl_context nil)
      )
    )
  )
  
  
)


