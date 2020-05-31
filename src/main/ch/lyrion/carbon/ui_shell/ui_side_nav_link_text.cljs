(ns ch.lyrion.carbon.ui-shell.ui-side-nav-link-text
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/SideNavLinkText.js" :default SideNavLinkText]))

(def ui-side-nav-link-text

"Props:
  - children (node) (required): Provide the content for the link text  
  - className (string): Provide an optional class to be applied to the containing node  
"
  (h/factory-apply SideNavLinkText))