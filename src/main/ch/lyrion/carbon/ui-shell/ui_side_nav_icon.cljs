(ns ch.lyrion.carbon.ui-shell.ui-side-nav-icon
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/SideNavIcon.js" :default SideNavIcon]))

(def ui-side-nav-icon

"Props:
  - small (bool): Specify whether the icon should be placed in a smaller bounding box Default: false 
  - className (string): Provide an optional class to be applied to the containing node  
  - children (node) (required): Provide a single icon as the child to `SideNavIcon` to render in the
container  
"
  (h/factory-apply SideNavIcon))