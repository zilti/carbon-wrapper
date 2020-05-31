(ns ch.lyrion.carbon.ui-shell.ui-header-navigation
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/HeaderNavigation.js" :default HeaderNavigation]))

(def ui-header-navigation

"Props:
  - className (string): Optionally provide a custom class to apply to the underlying <nav> node  
  - children (node): Provide valid children of HeaderNavigation, for example `HeaderMenuItem`
or `HeaderMenu`  
"
  (h/factory-apply HeaderNavigation))