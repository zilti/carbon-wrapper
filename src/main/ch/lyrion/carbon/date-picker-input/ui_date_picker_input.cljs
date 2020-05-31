(ns ch.lyrion.carbon.date-picker-input.ui-date-picker-input
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DatePickerInput/DatePickerInput.js" :default DatePickerInput]))

(def ui-date-picker-input

"Props:
  - disabled (bool): Specify whether or not the input should be disabled Default: false 
  - type (string): Specify the type of the <input> Default: 'text' 
  - invalid (bool): Specify whether or not the input should be invalid Default: false 
  - size (enum): Specify the size of the Date Picker Input. Currently supports either `sm` or `xl` as an option.  
  - id (string) (required): Specify an id that unique identifies the <input>  
  - onChange (func): Specify an `onChange` handler that is called whenever a change in the
input field has occurred Default: () => {} 
  - labelText (node) (required): Provide the text that will be read by a screen reader when visiting this
control  
  - iconDescription (string): The description of the calendar icon.  
  - onClick (func): Provide a function to be called when the input field is clicked Default: () => {} 
  - pattern (custom): Provide a regular expression that the input value must match Default: '\\d{1,2}\\/\\d{1,2}\\/\\d{4}' 
"
  (h/factory-apply DatePickerInput))