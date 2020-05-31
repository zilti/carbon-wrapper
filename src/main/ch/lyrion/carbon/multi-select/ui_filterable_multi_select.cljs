(ns ch.lyrion.carbon.multi-select.ui-filterable-multi-select
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/MultiSelect/FilterableMultiSelect.js" :default FilterableMultiSelect]))

(def ui-filterable-multi-select

"Props:
  - useTitleInItem (bool): Specify title to show title on hover  
  - open (bool): Initialize the component with an open(`true`)/closed(`false`) menu. Default: false 
  - invalidText (string): If invalid, what is the error?  
  - placeholder (string) (required): Generic `placeholder` that will be used as the textual representation of
what this field is for  
  - disabled (bool): Disable the control Default: false 
  - translateWithId (func): Callback function for translating ListBoxMenuIcon SVG title  
  - locale (string): Specify the locale of the control. Used for the default `compareItems`
used for sorting the list of items in the control. Default: 'en' 
  - invalid (bool): Is the current selection invalid?  
  - size (custom): Specify the size of the ListBox. Currently supports either `sm`, `lg` or `xl` as an option.  
  - initialSelectedItems (array): Allow users to pass in arbitrary items from their collection that are
pre-selected Default: [] 
  - selectionFeedback (enum): Specify feedback (mode) of the selection.
`top`: selected item jumps to top
`fixed`: selected item stays at it's position
`top-after-reopen`: selected item jump to top after reopen dropdown Default: 'top-after-reopen' 
  - downshiftProps (shape): Additional props passed to Downshift  
  - id (string) (required): Specify a custom `id`  
  - itemToString (func): Helper function passed to downshift that allows the library to render a
given item to a string label. By default, it extracts the `label` field
from a given item to serve as the item label in the list. Default: defaultItemToString 
  - sortItems (null): null Default: defaultSortItems 
  - ariaLabel (string): 'aria-label' of the ListBox component. Default: 'Choose an item' 
  - items (array) (required): We try to stay as generic as possible here to allow individuals to pass
in a collection of whatever kind of data structure they prefer  
  - filterItems (null): null Default: defaultFilterItems 
  - compareItems (null): null Default: defaultCompareItems 
  - onChange (func): `onChange` is a utility for this controlled component to communicate to a
consuming component what kind of internal state changes are occuring.  
  - light (bool): `true` to use the light version. Default: false 
"
  (h/factory-apply FilterableMultiSelect))