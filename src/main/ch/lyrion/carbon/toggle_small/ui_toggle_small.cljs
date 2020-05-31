(ns ch.lyrion.carbon.toggle-small.ui-toggle-small
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ToggleSmall/ToggleSmall.js" :default ToggleSmall]))

(def ui-toggle-small

"Props:
  - toggled (bool): `true` to make it toggled on  
  - className (string): The CSS class for the toggle  
  - labelB (string): Specify the label for the \"on\" position Default: 'On' 
  - id (string) (required): The `id` attribute for the toggle  
  - onToggle (func): The event handler for the `onChange` event. Default: () => {} 
  - labelA (string): Specify the label for the \"off\" position Default: 'Off' 
  - defaultToggled (bool): `true` to make it toggled on by default. Default: false 
  - aria-label (string) (required):   
  - labelText (string): The `aria-label` attribute for the toggle  
"
  (h/factory-apply ToggleSmall))