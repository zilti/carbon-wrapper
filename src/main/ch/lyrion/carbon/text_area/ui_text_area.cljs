(ns ch.lyrion.carbon.text-area.ui-text-area
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/TextArea/TextArea.js" :default TextArea]))

(def ui-text-area

"Props:
  - helperText (node): Provide text that is used alongside the control label for additional help Default: '' 
  - invalidText (string): Provide the text that is displayed when the control is in an invalid state Default: '' 
  - placeholder (string): Specify the placeholder attribute for the <textarea> Default: '' 
  - disabled (bool): Specify whether the control is disabled Default: false 
  - value (union): Provide the current value of the <textarea>  
  - invalid (bool): Specify whether the control is currently invalid Default: false 
  - className (string): Provide a custom className that is applied directly to the underlying
<textarea> node  
  - rows (number): Specify the rows attribute for the <textarea> Default: 4 
  - cols (number): Specify the `cols` attribute for the underlying <textarea> node Default: 50 
  - hideLabel (bool): Specify whether you want the underlying label to be visually hidden  
  - id (string): Provide a unique identifier for the control  
  - defaultValue (union): Optionally provide the default value of the <textarea>  
  - onChange (func): Optionally provide an `onChange` handler that is called whenever <textarea>
is updated Default: () => {} 
  - light (bool): Specify whether you want the light version of this control Default: false 
  - labelText (node) (required): Provide the text that will be read by a screen reader when visiting this
control  
  - onClick (func): Optionally provide an `onClick` handler that is called whenever the
<textarea> is clicked Default: () => {} 
"
  (h/wrapped-factory-apply TextArea))