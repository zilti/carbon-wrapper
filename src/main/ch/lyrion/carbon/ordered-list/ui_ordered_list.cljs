(ns ch.lyrion.carbon.ordered-list.ui-ordered-list
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/OrderedList/OrderedList.js" :default OrderedList]))

(def ui-ordered-list

"Props:
  - nested (bool): Specify whether this ordered list is nested inside of another nested list Default: false 
  - children (node): Provide list items to be rendered in the ordered list  
  - className (string): Provide an optional className to be applied to the containing <ol> node  
"
  (h/factory-apply OrderedList))