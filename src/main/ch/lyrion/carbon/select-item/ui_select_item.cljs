(ns ch.lyrion.carbon.select-item.ui-select-item
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/SelectItem/SelectItem.js" :default SelectItem]))

(def ui-select-item

"Props:
  - disabled (bool): Specify whether the <SelectItem> should be disabled Default: false 
  - hidden (bool): Specify whether the <SelectItem> is hidden Default: false 
  - value (any): Specify the value of the <SelectItem> Default: '' 
  - text (string): Provide the contents of your <SelectItem> Default: '' 
  - className (string): Specify an optional className to be applied to the node  
"
  (h/factory-apply SelectItem))