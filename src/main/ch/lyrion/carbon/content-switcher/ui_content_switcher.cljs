(ns ch.lyrion.carbon.content-switcher.ui-content-switcher
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ContentSwitcher/ContentSwitcher.js" :default ContentSwitcher]))

(def ui-content-switcher

"Props:
  - selectedIndex (number): Specify a selected index for the initially selected content Default: 0 
  - selectionMode (enum): Choose whether or not to automatically change selection on focus Default: 'automatic' 
  - children (node): Pass in Switch components to be rendered in the ContentSwitcher  
  - className (string): Specify an optional className to be added to the container node  
  - onChange (func) (required): Specify an `onChange` handler that is called whenever the ContentSwitcher
changes which item is selected  
"
  (h/factory-apply ContentSwitcher))