(ns ch.lyrion.carbon.ui-shell.ui-header-container
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/HeaderContainer.js" :default HeaderContainer]))

(def ui-header-container

"Props:
  - isSideNavExpanded (bool): Optionally provide a custom class name that is applied to the underlying <header> Default: false 
"
  (h/factory-apply HeaderContainer))