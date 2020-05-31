(ns ch.lyrion.carbon.select.ui-select
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Select/Select.js" :default Select]))

(def ui-select

"Props:
  - helperText (node): Provide text that is used alongside the control label for additional help Default: '' 
  - children (node): Provide the contents of your Select  
  - invalidText (string): Message which is displayed if the value is invalid. Default: '' 
  - disabled (bool): Specify whether the control is disabled Default: false 
  - noLabel (bool): Reserved for use with <Pagination> component. Will not render a label for the
select since Pagination renders one for us.  
  - invalid (bool): Specify if the currently value is invalid. Default: false 
  - className (string): Specify an optional className to be applied to the node containing the label and the select box  
  - size (enum): Specify the size of the Select Input. Currently supports either `sm` or `xl` as an option.  
  - hideLabel (bool): Specify whether the label should be hidden, or not  
  - id (string) (required): Specify a custom `id` for the `<select>`  
  - defaultValue (any): Optionally provide the default value of the `<select>`  
  - onChange (func): Provide an optional `onChange` hook that is called each time the value of
the underlying <input> changes  
  - light (bool): Specify whether you want the light version of this control Default: false 
  - labelText (node): Provide label text to be read by screen readers when interacting with the
control Default: 'Select' 
  - iconDescription (custom): Provide a description for the twistie icon that can be read by screen readers  
  - inline (bool): Specify whether you want the inline version of this control Default: false 
"
  (h/factory-apply Select))