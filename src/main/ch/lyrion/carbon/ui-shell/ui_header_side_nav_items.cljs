(ns ch.lyrion.carbon.ui-shell.ui-header-side-nav-items
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/HeaderSideNavItems.js" :default HeaderSideNavItems]))

(def ui-header-side-nav-items

"Props:
  - hasDivider (bool): Optionally specify if container will have a bottom divider to differentiate
between original sidenav items and header menu items. False by default. Default: false 
  - className (string): Optionally provide a custom class name that is applied to the underlying
button  
"
  (h/factory-apply HeaderSideNavItems))