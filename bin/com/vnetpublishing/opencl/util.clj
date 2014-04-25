(ns com.vnetpublishing.opencl.util
  (:gen-class)
)

(defn strerror
  "Returns error message as string"
  [error_code]
  (cond
    (= error_code org.jocl.CL/CL_SUCCESS) "CL_SUCCESS"
    (= error_code org.jocl.CL/CL_INVALID_VALUE) "CL_INVALID_VALUE"
    (= error_code org.jocl.CL/CL_OUT_OF_HOST_MEMORY) "CL_OUT_OF_HOST_MEMORY"
    (= error_code org.jocl.CL/CL_INVALID_PLATFORM) "CL_INVALID_PLATFORM"
    (= error_code org.jocl.CL/CL_DEVICE_NOT_FOUND) "CL_DEVICE_NOT_FOUND"
    (= error_code org.jocl.CL/CL_OUT_OF_RESOURCES) "CL_OUT_OF_RESOURCES"
    (= error_code org.jocl.CL/CL_INVALID_DEVICE_TYPE) "CL_INVALID_DEVICE_TYPE"
    (= error_code org.jocl.CL/CL_INVALID_DEVICE) "CL_INVALID_DEVICE"
    (= error_code org.jocl.CL/CL_INVALID_CONTEXT) "CL_INVALID_CONTEXT"
    (= error_code org.jocl.CL/CL_INVALID_PROPERTY) "CL_INVALID_PROPERTY"
    (= error_code org.jocl.CL/CL_DEVICE_NOT_AVAILABLE) "CL_DEVICE_NOT_AVAILABLE"
    (= error_code org.jocl.CL/CL_INVALID_BUFFER_SIZE) "CL_INVALID_BUFFER_SIZE"
    (= error_code org.jocl.CL/CL_INVALID_HOST_PTR) "CL_INVALID_HOST_PTR"
    (= error_code org.jocl.CL/CL_MEM_OBJECT_ALLOCATION_FAILURE) "CL_MEM_OBJECT_ALLOCATION_FAILURE"
    (= error_code org.jocl.CL/CL_INVALID_PROGRAM) "CL_INVALID_PROGRAM"
    (= error_code org.jocl.CL/CL_INVALID_PROGRAM_EXECUTABLE) "CL_INVALID_PROGRAM_EXECUTABLE"
    (= error_code org.jocl.CL/CL_INVALID_KERNEL_NAME) "CL_INVALID_KERNEL_NAME"
    (= error_code org.jocl.CL/CL_INVALID_KERNEL_DEFINITION) "CL_INVALID_KERNEL_DEFINITION"
    (= error_code org.jocl.CL/CL_INVALID_KERNEL) "CL_INVALID_KERNEL"
    (= error_code org.jocl.CL/CL_INVALID_ARG_INDEX) "CL_INVALID_ARG_INDEX"
    (= error_code org.jocl.CL/CL_INVALID_ARG_VALUE) "CL_INVALID_ARG_VALUE"
    (= error_code org.jocl.CL/CL_INVALID_MEM_OBJECT) "CL_INVALID_MEM_OBJECT"
    (= error_code org.jocl.CL/CL_INVALID_SAMPLER) "CL_INVALID_SAMPLER"
    (= error_code org.jocl.CL/CL_INVALID_ARG_SIZE) "CL_INVALID_ARG_SIZE"
    
    
    
    :else (str "UNKNOWN_ERROR (" error_code ")")
  )
)

(defn assert-success [f result]
  (if (= result org.jocl.CL/CL_SUCCESS)
    org.jocl.CL/CL_SUCCESS
    (throw (Exception. (str "Error: " (strerror result) " in call to " f)))
  )
)