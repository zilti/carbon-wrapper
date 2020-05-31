(ns ch.lyrion.carbon.time-picker-select.ui-time-picker-select
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/TimePickerSelect/TimePickerSelect.js" :default TimePickerSelect]))

(def ui-time-picker-select

"Props:
  - children (node): Provide the contents of your TimePickerSelect  
  - disabled (bool): Specify whether the control is disabled Default: false 
  - className (string): Specify an optional className to be applied to the node containing the label and the select box  
  - hideLabel (custom): Specify whether the label should be hidden, or not Default: true 
  - id (string) (required): Specify a custom `id` for the `<select>`  
  - defaultValue (any): Optionally provide the default value of the `<select>`  
  - labelText (node) (required): Provide label text to be read by screen readers when interacting with the
control  
  - iconDescription (string): Provide a description for the twistie icon that can be read by screen readers Default: 'open list of options' 
  - inline (bool): Specify whether you want the inline version of this control Default: true 
"
  (h/factory-apply TimePickerSelect))