(ns ch.lyrion.carbon.form-item.ui-form-item
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/FormItem/FormItem.js" :default FormItem]))

(def ui-form-item

"Props:
  - children (node): Provide content to be rendered in the form item  
  - className (string): Provide a custom className to be applied to the containing node  
"
  (h/factory-apply FormItem))