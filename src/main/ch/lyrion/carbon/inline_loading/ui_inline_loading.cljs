(ns ch.lyrion.carbon.inline-loading.ui-inline-loading
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/InlineLoading/InlineLoading.js" :default InlineLoading]))

(def ui-inline-loading

"Props:
  - status (enum): Specify the loading status Default: success ? 'finished' : 'active' 
  - successDelay (number): Provide a delay for the `setTimeout` for success Default: 1500 
  - className (string): Specify a custom className to be applied to the container node  
  - success (custom): Specify whether the load was successful  
  - description (node): Specify the description for the inline loading text  
  - iconDescription (string): Specify the description for the inline loading text  
  - onSuccess (func): Provide an optional handler to be inovked when <InlineLoading> is
successful  
"
  (h/factory-apply InlineLoading))