(ns ch.lyrion.carbon.ui-shell.ui-header-menu-item
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/HeaderMenuItem.js" :default HeaderMenuItem]))

(def ui-header-menu-item

"Props:
  - className (string): Optionally provide a custom class to apply to the underlying <li> node  
  - children (node) (required): Pass in children that are either a string or can be read as a string by
screen readers  
  - role (string): Optionally supply a role for the underlying <li> node. Useful for resetting
<ul> semantics for menus.  
  - isCurrentPage (bool): Applies selected styles to the item if a user sets this to true and aria-current !== 'page'.  
"
  (h/factory-apply HeaderMenuItem))