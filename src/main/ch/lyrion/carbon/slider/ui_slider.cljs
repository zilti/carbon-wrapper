(ns ch.lyrion.carbon.slider.ui-slider
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Slider/Slider.js" :default Slider]))

(def ui-slider

"Props:
  - min (number) (required): The minimum value.  
  - children (node): The child nodes.  
  - stepMultiplier (number): A value determining how much the value should increase/decrease by Shift+arrow keys,
which will be `(max - min) / stepMultiplier`. Default: 4 
  - disabled (bool): `true` to disable this slider. Default: false 
  - hideTextInput (bool): `true` to hide the number input box. Default: false 
  - formatLabel (func): The callback to format the label associated with the minimum/maximum value.  
  - name (string): The `name` attribute of the `<input>`.  
  - value (number) (required): The value.  
  - minLabel (string): The label associated with the minimum value. Default: '' 
  - maxLabel (string): The label associated with the maximum value. Default: '' 
  - className (string): The CSS class name for the slider.  
  - onRelease (func): The callback to get notified of value on handle release.  
  - ariaLabelInput (string): The `ariaLabel` for the `<input>`. Default: 'Slider number input' 
  - max (number) (required): The maximum value.  
  - id (string): The ID of the `<input>`.  
  - onChange (func): The callback to get notified of change in value.  
  - light (bool): `true` to use the light version. Default: false 
  - labelText (node): The label for the slider.  
  - inputType (string): The `type` attribute of the `<input>`. Default: 'number' 
  - step (number): A value determining how much the value should increase/decrease by moving the thumb by mouse. Default: 1 
  - stepMuliplier (custom): A value determining how much the value should increase/decrease by Shift+arrow keys,
which will be `(max - min) / stepMuliplier`.  
"
  (h/factory-apply Slider))