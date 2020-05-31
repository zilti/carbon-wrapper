(ns ch.lyrion.carbon.select-item-group.ui-select-item-group
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/SelectItemGroup/SelectItemGroup.js" :default SelectItemGroup]))

(def ui-select-item-group

"Props:
  - disabled (bool): Specify whether the <SelectItemGroup> should be disabled Default: false 
  - label (string): Specify the label to be displayed Default: 'Provide label' 
  - children (node): Provide the contents of your <SelectItemGroup>  
  - className (string): Specify an optional className to be applied to the node  
"
  (h/factory-apply SelectItemGroup))