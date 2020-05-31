(ns ch.lyrion.carbon.ui-shell.ui-header
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/Header.js" :default Header]))

(def ui-header

"Props:
  - className (string): Optionally provide a custom class name that is applied to the underlying <header>  
"
  (h/factory-apply Header))