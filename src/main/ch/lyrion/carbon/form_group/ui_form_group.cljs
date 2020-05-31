(ns ch.lyrion.carbon.form-group.ui-form-group
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/FormGroup/FormGroup.js" :default FormGroup]))

(def ui-form-group

"Props:
  - invalid (bool): Specify whether the <FormGroup> is invalid Default: false 
  - message (bool): Specify whether the message should be displayed in the <FormGroup> Default: false 
  - messageText (string): Provide the text for the message in the <FormGroup> Default: '' 
  - children (node): Provide the children form elements to be rendered inside of the <fieldset>  
  - legendText (string) (required): Provide the text to be rendered inside of the fieldset <legend>  
  - className (string): Provide a custom className to be applied to the containing <fieldset> node  
"
  (h/factory-apply FormGroup))