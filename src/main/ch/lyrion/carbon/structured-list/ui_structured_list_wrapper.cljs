(ns ch.lyrion.carbon.structured-list.ui-structured-list-wrapper
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/StructuredList/StructuredList.js" :default StructuredListWrapper]))

(def ui-structured-list-wrapper

"Props:
  - selection (bool): Specify whether your StructuredListWrapper should have selections Default: false 
  - ariaLabel (string): Specify a label to be read by screen readers on the container node Default: 'Structured list section' 
  - children (node): Provide the contents of your StructuredListWrapper  
  - className (string): Specify an optional className to be applied to the container node  
  - border (custom): Specify whether a border should be added to your StructuredListWrapper  
"
  (h/factory-apply StructuredListWrapper))