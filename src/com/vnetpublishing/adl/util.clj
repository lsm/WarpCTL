(ns com.vnetpublishing.adl.util
  (:gen-class)
)

(defn strerror
  "Returns error message as string"
  [error_code]
  (cond
    (= error_code com.vnetpublishing.swig.adl.jadl_sdk/ADL_OK) "ADL_OK"
    (= error_code com.vnetpublishing.swig.adl.jadl_sdk/ADL_ERR) "ADL_ERR"
    (= error_code com.vnetpublishing.swig.adl.jadl_sdk/ADL_ERR_NOT_INIT) "ADL_ERR_NOT_INIT"
    (= error_code com.vnetpublishing.swig.adl.jadl_sdk/ADL_ERR_INVALID_PARAM) "ADL_ERR_INVALID_PARAM"
    (= error_code com.vnetpublishing.swig.adl.jadl_sdk/ADL_ERR_INVALID_PARAM_SIZE) "ADL_ERR_INVALID_PARAM_SIZE"
    (= error_code com.vnetpublishing.swig.adl.jadl_sdk/ADL_ERR_INVALID_ADL_IDX) "ADL_ERR_INVALID_ADL_IDX"
    (= error_code com.vnetpublishing.swig.adl.jadl_sdk/ADL_ERR_INVALID_CONTROLLER_IDX) "ADL_ERR_INVALID_CONTROLLER_IDX"
    (= error_code com.vnetpublishing.swig.adl.jadl_sdk/ADL_ERR_INVALID_DIPLAY_IDX) "ADL_ERR_INVALID_DIPLAY_IDX"
    (= error_code com.vnetpublishing.swig.adl.jadl_sdk/ADL_ERR_NOT_SUPPORTED) "ADL_ERR_NOT_SUPPORTED"
    (= error_code com.vnetpublishing.swig.adl.jadl_sdk/ADL_ERR_NULL_POINTER) "ADL_ERR_NULL_POINTER"
    (= error_code com.vnetpublishing.swig.adl.jadl_sdk/ADL_ERR_DISABLED_ADAPTER) "ADL_ERR_DISABLED_ADAPTER"
    (= error_code com.vnetpublishing.swig.adl.jadl_sdk/ADL_ERR_INVALID_CALLBACK) "ADL_ERR_INVALID_CALLBACK"
    (= error_code com.vnetpublishing.swig.adl.jadl_sdk/ADL_ERR_RESOURCE_CONFLICT) "ADL_ERR_RESOURCE_CONFLICT"
    (= error_code com.vnetpublishing.swig.adl.jadl_sdk/ADL_ERR_SET_INCOMPLETE) "ADL_ERR_SET_INCOMPLETE"
    (= error_code com.vnetpublishing.swig.adl.jadl_sdk/ADL_ERR_NO_XDISPLAY) "ADL_ERR_NO_XDISPLAY"
    :else (str "UNKNOWN_ERROR (" error_code ")")
  )
)

(defn assert-success [f result]
  (if (= result com.vnetpublishing.swig.adl.jadl_sdk/ADL_OK)
    com.vnetpublishing.swig.adl.jadl_sdk/ADL_OK
    (throw (Exception. (str "Error: " (strerror result) " in call to " f)))
  )
)