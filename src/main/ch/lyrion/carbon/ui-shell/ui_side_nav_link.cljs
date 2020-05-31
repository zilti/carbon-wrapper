(ns ch.lyrion.carbon.ui-shell.ui-side-nav-link
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/SideNavLink.js" :default SideNavLink]))

(def ui-side-nav-link

"Props:
  - element (null): null Default: 'a' 
  - large (bool): Specify if this is a large variation of the SideNavLink Default: false 
  - className (string): Provide an optional class to be applied to the containing node  
  - renderIcon (union): Provide an icon to render in the side navigation link. Should be a React class.  
  - children (node) (required): Specify the text content for the link  
  - isSideNavExpanded (bool): Property to indicate if the side nav container is open (or not). Use to
keep local state and styling in step with the SideNav expansion state.  
"
  (h/factory-apply SideNavLink))