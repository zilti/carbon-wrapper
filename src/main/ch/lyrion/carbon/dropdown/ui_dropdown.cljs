(ns ch.lyrion.carbon.dropdown.ui-dropdown
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Dropdown/Dropdown.js" :default Dropdown]))

(def ui-dropdown

"Props:
  - helperText (union): Provide helper text that is used alongside the control label for
additional help Default: '' 
  - invalidText (string): Message which is displayed if the value is invalid.  
  - selectedItem (union): In the case you want to control the dropdown selection entirely.  
  - disabled (bool): Disable the control Default: false 
  - translateWithId (func): Callback function for translating ListBoxMenuIcon SVG title  
  - itemToElement (func): Function to render items as custom components instead of strings.
Defaults to null and is overriden by a getter Default: null 
  - type (custom): The dropdown type, `default` or `inline` Default: 'default' 
  - invalid (bool): Specify if the currently selected value is invalid.  
  - size (custom): Specify the size of the ListBox. Currently supports either `sm`, `lg` or `xl` as an option.  
  - initialSelectedItem (union): Allow users to pass in an arbitrary item or a string (in case their items are an array of strings)
from their collection that are pre-selected  
  - label (node) (required): Generic `label` that will be used as the textual representation of what
this field is for  
  - id (string) (required): Specify a custom `id`  
  - itemToString (func): Helper function passed to downshift that allows the library to render a
given item to a string label. By default, it extracts the `label` field
from a given item to serve as the item label in the list. Default: item => {
  if (typeof item === 'string') {
    return item;
  }

  return item ? item.label : '';
} 
  - ariaLabel (string): 'aria-label' of the ListBox component.  
  - titleText (union): Provide the title text that will be read by a screen reader when
visiting this control Default: '' 
  - items (array) (required): We try to stay as generic as possible here to allow individuals to pass
in a collection of whatever kind of data structure they prefer  
  - onChange (func): `onChange` is a utility for this controlled component to communicate to a
consuming component what kind of internal state changes are occuring.  
  - light (bool): `true` to use the light version. Default: false 
  - direction (enum): Specify the direction of the dropdown. Can be either top or bottom. Default: 'bottom' 
  - inline (bool): Specify whether you want the inline version of this control  
"
  (h/factory-apply Dropdown))