(ns ch.lyrion.carbon.ui-shell.ui-switcher-item
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/SwitcherItem.js" :default SwitcherItem]))

(def ui-switcher-item

"Props:
  - className (string): Optionally provide a custom class to apply to the underlying <li> node  
  - children (node) (required): Specify the text content for the link  
"
  (h/factory-apply SwitcherItem))