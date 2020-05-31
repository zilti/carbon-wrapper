(ns ch.lyrion.carbon.text-input.ui-text-input
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/TextInput/TextInput.js" :default TextInput]))

(def ui-text-input

"Props:
  - helperText (node): Provide text that is used alongside the control label for additional help Default: '' 
  - invalidText (string): Provide the text that is displayed when the control is in an invalid state Default: '' 
  - placeholder (string): Specify the placeholder attribute for the <input>  
  - disabled (bool): Specify whether the <input> should be disabled Default: false 
  - value (union): Specify the value of the <input>  
  - type (string): Specify the type of the <input> Default: 'text' 
  - invalid (bool): Specify whether the control is currently invalid Default: false 
  - className (string): Specify an optional className to be applied to the <input> node Default: `${prefix}--text__input` 
  - size (enum): Specify the size of the Text Input. Currently supports either `sm` or `xl` as an option.  
  - hideLabel (bool): Specify whether you want the underlying label to be visually hidden  
  - id (string) (required): Specify a custom `id` for the <input>  
  - defaultValue (union): Optionally provide the default value of the <input>  
  - onChange (func): Optionally provide an `onChange` handler that is called whenever <input>
is updated Default: () => {} 
  - light (bool): `true` to use the light version. Default: false 
  - labelText (node) (required): Provide the text that will be read by a screen reader when visiting this
control  
  - onClick (func): Optionally provide an `onClick` handler that is called whenever the
<input> is clicked Default: () => {} 
"
  (h/wrapped-factory-apply TextInput))