(ns com.vnetpublishing.adl.core
  (:gen-class)
  (:require com.vnetpublishing.adl.util)
)

(defn init []
  (try
    (do 
      (com.vnetpublishing.swig.adl.jadl_sdk/jadl_init)
      (let [result 
          (com.vnetpublishing.swig.adl.jadl_sdk/ADL_Main_Control_Create 
            (com.vnetpublishing.swig.adl.jadl_sdk/getFunction_JADL_Main_Memory_Alloc) 
            1
          )
        ]
        (com.vnetpublishing.adl.util/assert-success "com.vnetpublishing.swig.adl.jadl_sdk/ADL_Main_Control_Create" result)
      )
      (println "JADL-SDK Initialized")
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
  
  ;(com.vnetpublishing.swig.adl.jadl_sdk/ADL_Main_Control_Create (com.vnetpublishing.swig.adl.jadl_sdk/getFunction_JADL_Main_Memory_Alloc) 1)
)

(defn ADL_Adapter_NumberOfAdapters_Get
  []
  (let [n (int-array 1)
       result (com.vnetpublishing.swig.adl.jadl_sdk/ADL_Adapter_NumberOfAdapters_Get n)
     ]
     (com.vnetpublishing.adl.util/assert-success "com.vnetpublishing.swig.adl.jadl_sdk/ADL_Adapter_NumberOfAdapters_Get" result)
     (get n 0)
  )
)

(defn ADL_Overdrive5_Temperature_Get
  [adapter-index]
  
  (let [thermal-control-index 0
      temp (com.vnetpublishing.swig.adl.ADLTemperature.)
      result (com.vnetpublishing.swig.adl.jadl_sdk/ADL_Overdrive5_Temperature_Get adapter-index thermal-control-index temp)
    ]
    (com.vnetpublishing.adl.util/assert-success "com.vnetpublishing.swig.adl.jadl_sdk/ADL_Overdrive5_Temperature_Get" result)
    (.getITemperature temp)
  )
)

(defn ADL_Adapter_AdapterInfo_Get
  []
  (let [n (ADL_Adapter_NumberOfAdapters_Get)
      sz (int (* n (com.vnetpublishing.swig.adl.jadl_sdk/getAdapterInfoSize)))
      intl-adapters (com.vnetpublishing.swig.adl.jadl_sdk/new_LPAdapterInfo n)
      adapters (make-array  com.vnetpublishing.swig.adl.AdapterInfo n)
      result (com.vnetpublishing.swig.adl.jadl_sdk/ADL_Adapter_AdapterInfo_Get intl-adapters sz)
    ]
    (try
      (com.vnetpublishing.adl.util/assert-success "com.vnetpublishing.swig.adl.jadl_sdk/ADL_Adapter_AdapterInfo_Get" result)
      (loop [ctr 0]
        (if (= ctr n)
          adapters
          (recur
            (do
               (aset adapters ctr (com.vnetpublishing.swig.adl.jadl_sdk/LPAdapterInfo_getitem intl-adapters ctr))
               (+ ctr 1)
            )
          )
        )
      )
      (catch Exception e
        (throw e)
      )
      (finally
          (com.vnetpublishing.swig.adl.jadl_sdk/delete_LPAdapterInfo intl-adapters)
        )
    )
  )
)

(defn uninit []
  nil
)