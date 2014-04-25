(ns com.vnetpublishing.opencl.core
  (:gen-class)
  (:require com.vnetpublishing.opencl.util)
  (:require com.vnetpublishing.opencl.obj)
)

(defn get-platform-count []
  (let [n (int-array [9999]) r (org.jocl.CL/clGetPlatformIDs 0 nil n)]
    (com.vnetpublishing.opencl.util/assert-success "clGetPlatformIDs()" r)
    (get n 0)
  )
)

(defn get-platform-ids []
  (let [n (get-platform-count)]
    (let [platforms (make-array org.jocl.cl_platform_id n) result (org.jocl.CL/clGetPlatformIDs n platforms nil)]
      (com.vnetpublishing.opencl.util/assert-success "clGetPlatformIDs()" result)
      platforms
    )
  )
)

(defn get-platform-id [platform_num]
  (let [platforms (get-platform-ids)]
    (if (< platform_num (alength platforms))
      (aget platforms platform_num)
      nil
    )
  )
)

(defn get-platform [platform_num]
  (com.vnetpublishing.opencl.obj.Platform. (get-platform-id platform_num))
)

(defn get-device [platform_num device_num]
  (.getDevice (get-platform platform_num) device_num)
)


;*** clCreateKernel
;*** clCreateKernelArg
;*** clEnqueueNDRangeKernel




