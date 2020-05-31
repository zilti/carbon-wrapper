(ns ch.lyrion.carbon.overflow-menu-item.ui-overflow-menu-item
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/OverflowMenuItem/OverflowMenuItem.js" :default OverflowMenuItem]))

(def ui-overflow-menu-item

"Props:
  - itemText (node): The text in the menu item. Default: 'Provide itemText' 
  - requireTitle (bool): `true` if this menu item has long text and requires a browser tooltip  
  - wrapperClassName (string): The CSS class name to be placed on the wrapper list item element  
  - primaryFocus (bool): `true` if this menu item should get focus when the menu gets open.  
  - disabled (bool): `true` to make this menu item disabled. Default: false 
  - closeMenu (func): A callback to tell the parent menu component that the menu should be closed.  
  - onMouseEnter (func):   
  - onMouseDown (func):   
  - onBlur (func): event handlers  
  - hasDivider (bool): `true` to make this menu item a divider. Default: false 
  - className (string): The CSS class name to be placed on the button element  
  - onKeyUp (func):   
  - isDelete (bool): `true` to make this menu item a \"danger button\". Default: false 
  - onMouseLeave (func):   
  - onKeyDown (func):  Default: () => {} 
  - onClick (func):  Default: () => {} 
  - href (string): If given, overflow item will render as a link with the given href  
  - onFocus (func):   
  - onMouseUp (func):   
"
  (h/factory-apply OverflowMenuItem))