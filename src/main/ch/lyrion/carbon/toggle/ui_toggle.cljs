(ns ch.lyrion.carbon.toggle.ui-toggle
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Toggle/Toggle.js" :default Toggle]))

(def ui-toggle

"Props:
  - toggled (bool): Specify whether the control is toggled  
  - className (string): Specify a custom className to apply to the form-item node  
  - labelB (string): Specify the label for the \"on\" position Default: 'On' 
  - id (string) (required): Provide an id that unique represents the underlying <input>  
  - onToggle (func): Provide an optional hook that is called when the control is toggled Default: () => {} 
  - labelA (string): Specify the label for the \"off\" position Default: 'Off' 
  - defaultToggled (bool): Specify whether the toggle should be on by default Default: false 
  - aria-label (string):  Default: 'Toggle' 
  - labelText (string): Provide the text that will be read by a screen reader when visiting this
control
`aria-label` is always required but will be null if `labelText` is also
provided  
"
  (h/factory-apply Toggle))