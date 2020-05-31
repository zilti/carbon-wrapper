(ns ch.lyrion.carbon.list-item.ui-list-item
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ListItem/ListItem.js" :default ListItem]))

(def ui-list-item

"Props:
  - children (node): Specify the content for the ListItem  
  - className (string): Specify an optional className to apply to the underlying <li> node  
"
  (h/factory-apply ListItem))