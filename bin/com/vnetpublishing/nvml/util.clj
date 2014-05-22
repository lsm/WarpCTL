(ns com.vnetpublishing.nvml.util
  (:gen-class)
)

(defn strerror
  "Returns error message as string"
  [error_code]
  (let [c (Class/forName "com.vnetpublishing.swig.nvml.nvmlReturn_t")]
  (cond
    (= error_code (.get (.getField c "NVML_SUCCESS") nil)) "NVML_SUCCESS"
    (= error_code (.get (.getField c "NVML_ERROR_UNINITIALIZED") nil)) "NVML_ERROR_UNINITIALIZED"
    (= error_code (.get (.getField c "NVML_ERROR_INVALID_ARGUMENT") nil)) "NVML_ERROR_INVALID_ARGUMENT"
    (= error_code (.get (.getField c "NVML_ERROR_NOT_SUPPORTED") nil)) "NVML_ERROR_NOT_SUPPORTED"
    (= error_code (.get (.getField c "NVML_ERROR_NO_PERMISSION") nil)) "NVML_ERROR_NO_PERMISSION"
    (= error_code (.get (.getField c "NVML_ERROR_ALREADY_INITIALIZED") nil)) "NVML_ERROR_ALREADY_INITIALIZED"
    (= error_code (.get (.getField c "NVML_ERROR_NOT_FOUND") nil)) "NVML_ERROR_NOT_FOUND"
    (= error_code (.get (.getField c "NVML_ERROR_INSUFFICIENT_SIZE") nil)) "NVML_ERROR_INSUFFICIENT_SIZE"
    (= error_code (.get (.getField c "NVML_ERROR_INSUFFICIENT_POWER") nil)) "NVML_ERROR_INSUFFICIENT_POWER"
    (= error_code (.get (.getField c "NVML_ERROR_DRIVER_NOT_LOADED") nil)) "NVML_ERROR_DRIVER_NOT_LOADED"
    (= error_code (.get (.getField c "NVML_ERROR_TIMEOUT") nil)) "NVML_ERROR_TIMEOUT"
    (= error_code (.get (.getField c "NVML_ERROR_IRQ_ISSUE") nil)) "NVML_ERROR_IRQ_ISSUE"
    (= error_code (.get (.getField c "NVML_ERROR_LIBRARY_NOT_FOUND") nil)) "NVML_ERROR_LIBRARY_NOT_FOUND"
    (= error_code (.get (.getField c "NVML_ERROR_FUNCTION_NOT_FOUND") nil)) "NVML_ERROR_FUNCTION_NOT_FOUND"
    (= error_code (.get (.getField c "NVML_ERROR_CORRUPTED_INFOROM") nil)) "NVML_ERROR_CORRUPTED_INFOROM"
    (= error_code (.get (.getField c "NVML_ERROR_GPU_IS_LOST") nil)) "NVML_ERROR_GPU_IS_LOST"
    (= error_code (.get (.getField c "NVML_ERROR_UNKNOWN") nil)) "NVML_ERROR_UNKNOWN"
    :else (str "UNKNOWN_ERROR (" error_code ")")
  )
  )
)

(defn assert-success [f result]
  (let [c (Class/forName "com.vnetpublishing.swig.nvml.nvmlReturn_t")]
    (if (= result (.get (.getField c "NVML_SUCCESS") nil))
      (.get (.getField c "NVML_SUCCESS") nil)
      (throw (Exception. (str "Error: " (strerror result) " in call to " f)))
    )
  )
)

