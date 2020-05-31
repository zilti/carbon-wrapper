(ns ch.lyrion.carbon.ui-shell.ui-side-nav-item
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/SideNavItem.js" :default SideNavItem]))

(def ui-side-nav-item

"Props:
  - large (bool): Specify if this is a large variation of the SideNavItem Default: false 
  - className (string): Provide an optional class to be applied to the containing node  
  - children (node) (required): Provide a single icon as the child to `SideNavIcon` to render in the
container  
"
  (h/factory-apply SideNavItem))