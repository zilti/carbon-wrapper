(ns ch.lyrion.carbon.ui-shell.ui-header-menu-button
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/HeaderMenuButton.js" :default HeaderMenuButton]))

(def ui-header-menu-button

"Props:
  - className (string): Optionally provide a custom class name that is applied to the underlying
button  
  - onClick (func): Optionally provide an onClick handler that is called when the underlying
button fires it's onclick event  
  - isActive (bool):   
"
  (h/factory-apply HeaderMenuButton))