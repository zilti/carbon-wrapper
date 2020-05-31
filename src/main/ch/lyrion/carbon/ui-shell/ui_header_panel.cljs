(ns ch.lyrion.carbon.ui-shell.ui-header-panel
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/HeaderPanel.js" :default HeaderPanel]))

(def ui-header-panel

"Props:
  - className (string): Optionally provide a custom class to apply to the underlying <li> node  
  - expanded (bool): Specify whether the panel is expanded  
"
  (h/factory-apply HeaderPanel))