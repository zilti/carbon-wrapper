(ns ch.lyrion.carbon.ui-shell.ui-switcher
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/Switcher.js" :default Switcher]))

(def ui-switcher

"Props:
  - className (string): Optionally provide a custom class to apply to the underlying <ul> node  
  - children (node) (required): expects to receive <SwitcherItem />  
"
  (h/factory-apply Switcher))