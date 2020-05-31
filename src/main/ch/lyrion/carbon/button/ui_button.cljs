(ns ch.lyrion.carbon.button.ui-button
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Button/Button.js" :default Button]))

(def ui-button

"Props:
  - role (string): Optional prop to specify the role of the Button  
  - tooltipPosition (enum): Specify the direction of the tooltip for icon-only buttons.
Can be either top, right, bottom, or left.  
  - children (node): Specify the content of your Button  
  - tabIndex (number): Optional prop to specify the tabIndex of the Button Default: 0 
  - tooltipAlignment (enum): Specify the alignment of the tooltip to the icon-only button.
Can be one of: start, center, or end.  
  - disabled (bool): Specify whether the Button should be disabled, or not Default: false 
  - as (union): Specify how the button itself should be rendered.
Make sure to apply all props to the root node and render children appropriately  
  - type (enum): Optional prop to specify the type of the Button Default: 'button' 
  - className (string): Specify an optional className to be added to your Button  
  - renderIcon (union): Optional prop to allow overriding the icon rendering.
Can be a React component class  
  - size (enum): Specify the size of the button, from a list of available sizes.
For `default` buttons, this prop can remain unspecified.  
  - small (custom): Deprecated in v10 in favor of `size`.
Specify whether the Button should be a small variant  
  - kind (enum): Specify the kind of Button you want to create Default: 'primary' 
  - hasIconOnly (bool): Specify if the button is an icon-only button  
  - iconDescription (custom): If specifying the `renderIcon` prop, provide a description for that icon that can
be read by screen readers  
  - href (string): Optionally specify an href for your Button to become an <a> element  
"
  (h/factory-apply Button))