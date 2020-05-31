(ns ch.lyrion.carbon.icon.ui-icon
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Icon/Icon.js" :default Icon]))

(def ui-icon

"Props:
  - role (string): The `role` attribute. Default: 'img' 
  - description (string) (required): The icon description.  
  - iconRef (func): The `ref` callback for the icon.  
  - fillRule (string): The `<svg>` `fillRule` attribute. Default: 'evenodd' 
  - fill (string): The `<svg>` `fill` attribute.  
  - width (string): The `<svg>` `width` attribute.  
  - icon (shape): The icon data.  
  - className (string): The CSS class name.  
  - style (object): The CSS styles.  
  - iconTitle (string): The icon title.  
  - viewBox (string): The `<svg>` `viewbox` attribute.  
  - height (string): The `<svg>` `height` attribute.  
"
  (h/factory-apply Icon))