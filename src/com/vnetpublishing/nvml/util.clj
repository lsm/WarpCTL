(ns com.vnetpublishing.nvml.util
  (:gen-class)
)

(defn strerror
  "Returns error message as string"
  [error_code]
  (cond
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_SUCCESS) "NVML_SUCCESS"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_UNINITIALIZED) "NVML_ERROR_UNINITIALIZED"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_INVALID_ARGUMENT) "NVML_ERROR_INVALID_ARGUMENT"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_NOT_SUPPORTED) "NVML_ERROR_NOT_SUPPORTED"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_NO_PERMISSION) "NVML_ERROR_NO_PERMISSION"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_ALREADY_INITIALIZED) "NVML_ERROR_ALREADY_INITIALIZED"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_NOT_FOUND) "NVML_ERROR_NOT_FOUND"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_INSUFFICIENT_SIZE) "NVML_ERROR_INSUFFICIENT_SIZE"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_INSUFFICIENT_POWER) "NVML_ERROR_INSUFFICIENT_POWER"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_DRIVER_NOT_LOADED) "NVML_ERROR_DRIVER_NOT_LOADED"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_TIMEOUT) "NVML_ERROR_TIMEOUT"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_IRQ_ISSUE) "NVML_ERROR_IRQ_ISSUE"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_LIBRARY_NOT_FOUND) "NVML_ERROR_LIBRARY_NOT_FOUND"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_FUNCTION_NOT_FOUND) "NVML_ERROR_FUNCTION_NOT_FOUND"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_CORRUPTED_INFOROM) "NVML_ERROR_CORRUPTED_INFOROM"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_GPU_IS_LOST) "NVML_ERROR_GPU_IS_LOST"
    (= error_code com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_ERROR_UNKNOWN) "NVML_ERROR_UNKNOWN"
    :else (str "UNKNOWN_ERROR (" error_code ")")
  )
)

(defn assert-success [f result]
  (if (= result com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_SUCCESS)
    com.vnetpublishing.swig.nvml.nvmlReturn_t/NVML_SUCCESS
    (throw (Exception. (str "Error: " (strerror result) " in call to " f)))
  )
)

