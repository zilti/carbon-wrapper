(ns ch.lyrion.carbon.radio-button-group.ui-radio-button-group
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/RadioButtonGroup/RadioButtonGroup.js" :default RadioButtonGroup]))

(def ui-radio-button-group

"Props:
  - labelPosition (enum): Provide where label text should be placed Default: 'right' 
  - children (node): Provide a collection of <RadioButton> components to render in the group  
  - disabled (bool): Specify whether the group is disabled  
  - name (string) (required): Specify the name of the underlying <input> nodes  
  - orientation (enum): Provide where radio buttons should be placed Default: 'horizontal' 
  - className (string): Provide an optional className to be applied to the container node  
  - valueSelected (union): Specify the value that is currently selected in the group  
  - onChange (func): Provide an optional `onChange` hook that is called whenever the value of
the group changes Default: () => {} 
  - defaultSelected (union): Specify the <RadioButton> to be selected by default  
"
  (h/factory-apply RadioButtonGroup))