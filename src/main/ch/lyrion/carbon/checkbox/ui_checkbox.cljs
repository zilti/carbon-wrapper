(ns ch.lyrion.carbon.checkbox.ui-checkbox
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Checkbox/Checkbox.js" :default Checkbox]))

(def ui-checkbox

"Props:
  - wrapperClassName (string): The CSS class name to be placed on the wrapping element  
  - disabled (bool): Specify whether the Checkbox should be disabled  
  - className (string): Specify an optional className to be applied to the <label> node  
  - title (string): Specify a title for the <label> node for the Checkbox Default: '' 
  - indeterminate (bool): Specify whether the Checkbox is in an indeterminate state Default: false 
  - defaultChecked (bool): Specify whether the underlying input should be checked by default  
  - hideLabel (bool): Specify whether the label should be hidden, or not  
  - id (string) (required): Provide an `id` to uniquely identify the Checkbox input  
  - checked (bool): Specify whether the underlying input should be checked  
  - onChange (func): Receives three arguments: true/false, the checkbox's id, and the dom event.
`(value, id, event) => console.log({value, id, event})` Default: () => {} 
  - labelText (node) (required): Provide a label to provide a description of the Checkbox input that you are
exposing to the user  
"
  (h/wrapped-factory-apply Checkbox))