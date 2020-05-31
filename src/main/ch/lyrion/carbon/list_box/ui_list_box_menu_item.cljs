(ns ch.lyrion.carbon.list-box.ui-list-box-menu-item
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ListBox/ListBoxMenuItem.js" :default ListBoxMenuItem]))

(def ui-list-box-menu-item

"`ListBoxMenuItem` is a helper component for managing the container class
name, alongside any classes for any corresponding states, for a generic list
box menu item.
Props:
  - isActive (bool): Specify whether the current menu item is \"active\". Default: false 
  - isHighlighted (bool): Specify whether the current menu item is \"highlighed\". Default: false 
  - children (node): Specify any children nodes that hsould be rendered inside of the ListBox
Menu Item  
"
  (h/factory-apply ListBoxMenuItem))