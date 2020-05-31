(ns ch.lyrion.carbon.ui-shell.ui-side-nav-items
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/SideNavItems.js" :default SideNavItems]))

(def ui-side-nav-items

"Props:
  - className (string): Provide an optional class to be applied to the containing node  
  - children (node) (required): Provide a single icon as the child to `SideNavIcon` to render in the
container  
  - isSideNavExpanded (bool): Property to indicate if the side nav container is open (or not). Use to
keep local state and styling in step with the SideNav expansion state.  
"
  (h/factory-apply SideNavItems))