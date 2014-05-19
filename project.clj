(defproject WarpCTL "1.0.0"
  :description "Accelerated parallel processing"
  :url "http://www.vnetpublishing.com"
  :license {:name "VNETLPL - Limited Public License"
            :url "http://www.vnetpublishing.com/Legal/Licenses/2010/10/vnetlpl.txt"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.vnetpublishing.clj/clj-nativedep "0.0.1"]
                 ]
  :resource-paths ["extra/JOCL/JOCL-0.1.9.jar" 
                   "extra/JADL-SDK/jadl-sdk-1.0.jar"
                   "extra/JNVML/jnvml-1.0.jar"
  ]
  :aot [
    com.vnetpublishing.opencl.util
    com.vnetpublishing.opencl.obj
    com.vnetpublishing.opencl.core
    com.vnetpublishing.warpctl.core
  ]
  :javac-target "1.6"
  :jar-name "warpctl-lib-1.0.0.jar"
  :uberjar-name "warpctl-1.0.0.jar"
  :native-path "%s/native"
  :main com.vnetpublishing.warpctl.core
)
