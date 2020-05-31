(ns ch.lyrion.carbon.ui-shell.ui-switcher-divider
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/SwitcherDivider.js" :default SwitcherDivider]))

(def ui-switcher-divider

"Props:
  - className (string): Optionally provide a custom class to apply to the underlying <li> node  
"
  (h/factory-apply SwitcherDivider))