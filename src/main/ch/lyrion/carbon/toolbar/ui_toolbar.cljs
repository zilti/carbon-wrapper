(ns ch.lyrion.carbon.toolbar.ui-toolbar
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Toolbar/Toolbar.js" :default Toolbar]))

(def ui-toolbar

"Props:
  - children (node): Specify a collection of ToolbarItem's that should render in the Toolbar  
  - className (string): Specify an optional className to be applied to the containing Toolbar node  
"
  (h/factory-apply Toolbar))