(ns ch.lyrion.carbon.ui-shell.ui-side-nav-menu-item
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/SideNavMenuItem.js" :default SideNavMenuItem]))

(def ui-side-nav-menu-item

"Props:
  - children (node): Specify the childrento be rendered inside of the `SideNavMenuItem`  
  - className (string): Provide an optional class to be applied to the containing node  
  - isActive (bool): Optionally specify whether the link is \"active\". An active link is one that
has an href that is the same as the current page. Can also pass in
`aria-current=\"page\"`, as well.  
"
  (h/factory-apply SideNavMenuItem))