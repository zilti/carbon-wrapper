(ns ch.lyrion.carbon.time-picker.ui-time-picker
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/TimePicker/TimePicker.js" :default TimePicker]))

(def ui-time-picker

"Props:
  - children (node): Pass in the children that will be rendered next to the form control  
  - invalidText (string): Provide the text that is displayed when the control is in an invalid state Default: 'Invalid time format.' 
  - placeholder (string): Specify the placeholder attribute for the <input> Default: 'hh:mm' 
  - disabled (bool): Specify whether the <input> should be disabled Default: false 
  - value (string): Specify the value of the <input>  
  - type (string): Specify the type of the <input> Default: 'text' 
  - invalid (bool): Specify whether the control is currently invalid Default: false 
  - onBlur (func): Optionally provide an `onBlur` handler that is called whenever the
<input> loses focus Default: () => {} 
  - className (string): Specify an optional className to be applied to the container node  
  - hideLabel (bool): Specify whether you want the underlying label to be visually hidden  
  - id (string) (required): Specify a custom `id` for the <input>  
  - maxLength (number): Specify the maximum length of the time string in <input> Default: 5 
  - onChange (func): Optionally provide an `onChange` handler that is called whenever <input>
is updated Default: () => {} 
  - light (bool): `true` to use the light version. Default: false 
  - labelText (node): Provide the text that will be read by a screen reader when visiting this
control  
  - onClick (func): Optionally provide an `onClick` handler that is called whenever the
<input> is clicked Default: () => {} 
  - pattern (string): Specify the regular expression working as the pattern of the time string in <input> Default: '(1[012]|[1-9]):[0-5][0-9](\\s)?' 
"
  (h/factory-apply TimePicker))