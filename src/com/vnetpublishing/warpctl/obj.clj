(ns com.vnetpublishing.warpctl.obj
  (:gen-class)
  (:require com.vnetpublishing.core)
)

(defrecord AppInfo [] com.vnetpublishing.core.ApplicationInfo
  (^{:type String} author [this] "Ralph Ritoch")
  (^{:type String} author-email [this] "Ralph Ritoch <rritoch@gmail.com>")
  (^{:type String} copyright [this] "Copyright \u00A9 2014 Ralph Ritoch. All rights reserved.")
  (^{:type String} app-name [this] "WarpCTL")
  (^{:type String} version [this] "1.0.0-alpha")
)
