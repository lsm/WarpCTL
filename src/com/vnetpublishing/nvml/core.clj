(ns com.vnetpublishing.nvml.core
  (:gen-class)
  (:require com.vnetpublishing.nvml.util)
)

(defn init []
  (try
    (do
      (let [result (com.vnetpublishing.swig.nvml.jnvml/nvmlInit_v2)]
         (com.vnetpublishing.nvml.util/assert-success "com.vnetpublishing.swig.nvml/nvmlInit_v2" result)
      )
      (println "NVML Initialized")
       true
    )
    (catch Throwable e 
      (do 
        (println "WARNING Unable to initialize ADL")
        (println e)
        false
      )
    )
  )
  
)

(defn nvml-unit-get-count
  []
  (let [
     value (int-array [-1])
     result (com.vnetpublishing.swig.nvml.jnvml/nvmlUnitGetCount value)
   ]
   (com.vnetpublishing.nvml.util/assert-success "com.vnetpublishing.swig.nvml.jnvml/nvmlUnitGetCount" result)
   (aget value 0)
  )
)

(defn uninit []
  nil
)