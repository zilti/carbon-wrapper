(ns ch.lyrion.carbon.loading.ui-loading
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Loading/Loading.js" :default Loading]))

(def ui-loading

"Props:
  - active (bool): Specify whether you want the loading indicator to be spinning or not Default: true 
  - withOverlay (bool): Specify whether you want the loader to be applied with an overlay Default: true 
  - small (bool): Specify whether you would like the small variant of <Loading> Default: false 
  - description (string): Specify an description that would be used to best describe the loading state Default: 'Active loading indicator' 
  - id (string): Provide an `id` to uniquely identify the label  
  - className (string): Provide an optional className to be applied to the containing node  
"
  (h/factory-apply Loading))