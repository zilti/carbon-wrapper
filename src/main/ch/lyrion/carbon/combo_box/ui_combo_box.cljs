(ns ch.lyrion.carbon.combo-box.ui-combo-box
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ComboBox/ComboBox.js" :default ComboBox]))

(def ui-combo-box

"Props:
  - invalidText (string): Message which is displayed if the value is invalid.  
  - selectedItem (union): For full control of the selection  
  - placeholder (string) (required): Used to provide a placeholder text node before a user enters any input.
This is only present if the control has no items selected  
  - disabled (bool): Specify if the control should be disabled, or not Default: false 
  - translateWithId (func): Specify a custom translation function that takes in a message identifier
and returns the localized string for the message  
  - itemToElement (func): Optional function to render items as custom components instead of strings.
Defaults to null and is overriden by a getter Default: null 
  - type (custom): Currently supports either the default type, or an inline variant Default: 'default' 
  - invalid (bool): Specify if the currently selected value is invalid.  
  - className (string): An optional className to add to the container node  
  - size (custom): Specify the size of the ListBox. Currently supports either `sm`, `lg` or `xl` as an option.  
  - downshiftProps (shape): Additional props passed to Downshift  
  - initialSelectedItem (union): Allow users to pass in an arbitrary item or a string (in case their items are an array of strings)
from their collection that are pre-selected  
  - id (string) (required): Specify a custom `id` for the input  
  - itemToString (func): Helper function passed to downshift that allows the library to render a
given item to a string label. By default, it extracts the `label` field
from a given item to serve as the item label in the list Default: item => {
  if (typeof item === 'string') {
    return item;
  }

  return item && item.label;
} 
  - onInputChange (func): Callback function to notify consumer when the text input changes.
This provides support to change available items based on the text.
@param {string} inputText  
  - ariaLabel (string): 'aria-label' of the ListBox component. Default: 'Choose an item' 
  - items (array) (required): We try to stay as generic as possible here to allow individuals to pass
in a collection of whatever kind of data structure they prefer  
  - onChange (func) (required): `onChange` is a utility for this controlled component to communicate to a
consuming component when a specific dropdown item is selected.
@param {{ selectedItem }}  
  - light (bool): should use \"light theme\" (white background)? Default: false 
  - shouldFilterItem (func): Specify your own filtering logic by passing in a `shouldFilterItem`
function that takes in the current input and an item and passes back
whether or not the item should be filtered. Default: () => true 
  - direction (enum): Specify the direction of the combobox dropdown. Can be either top or bottom. Default: 'bottom' 
"
  (h/wrapped-factory-apply ComboBox))