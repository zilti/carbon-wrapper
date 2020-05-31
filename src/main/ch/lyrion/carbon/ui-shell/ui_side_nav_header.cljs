(ns ch.lyrion.carbon.ui-shell.ui-side-nav-header
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/SideNavHeader.js" :default SideNavHeader]))

(def ui-side-nav-header

"Props:
  - className (string): Provide an optional class to be applied to the containing node  
  - renderIcon (union) (required): Provide an icon to render in the header of the side navigation. Should be
a React class.  
  - isSideNavExpanded (bool): Property to indicate if the side nav container is open (or not). Use to
keep local state and styling in step with the SideNav expansion state.  
"
  (h/factory-apply SideNavHeader))