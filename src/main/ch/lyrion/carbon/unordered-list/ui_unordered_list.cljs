(ns ch.lyrion.carbon.unordered-list.ui-unordered-list
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UnorderedList/UnorderedList.js" :default UnorderedList]))

(def ui-unordered-list

"Props:
  - nested (bool): Specify whether the list is nested, or not Default: false 
  - children (node): Specify a collection of ListItem's to be rendered in the UnorderedList  
  - className (string): Specify an optional className to be applied to the underlying <ul> node  
"
  (h/factory-apply UnorderedList))