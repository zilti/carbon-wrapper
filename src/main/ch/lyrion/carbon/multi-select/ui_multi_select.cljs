(ns ch.lyrion.carbon.multi-select.ui-multi-select
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/MultiSelect/MultiSelect.js" :default MultiSelect]))

(def ui-multi-select

"Props:
  - useTitleInItem (bool): Specify title to show title on hover  
  - open (bool): Initialize the component with an open(`true`)/closed(`false`) menu. Default: false 
  - invalidText (string): If invalid, what is the error?  
  - disabled (bool): Disable the control Default: false 
  - translateWithId (func): Callback function for translating ListBoxMenuIcon SVG title  
  - locale (string): Specify the locale of the control. Used for the default `compareItems`
used for sorting the list of items in the control. Default: 'en' 
  - type (enum): Specify 'inline' to create an inline multi-select. Default: 'default' 
  - invalid (bool): Is the current selection invalid?  
  - size (custom): Specify the size of the ListBox. Currently supports either `sm`, `lg` or `xl` as an option.  
  - title (null): null Default: false 
  - initialSelectedItems (array): Allow users to pass in arbitrary items from their collection that are
pre-selected Default: [] 
  - selectionFeedback (enum): Specify feedback (mode) of the selection.
`top`: selected item jumps to top
`fixed`: selected item stays at it's position
`top-after-reopen`: selected item jump to top after reopen dropdown Default: 'top-after-reopen' 
  - downshiftProps (shape): Additional props passed to Downshift  
  - label (node) (required): Generic `label` that will be used as the textual representation of what
this field is for  
  - id (string) (required): Specify a custom `id`  
  - itemToString (func): Helper function passed to downshift that allows the library to render a
given item to a string label. By default, it extracts the `label` field
from a given item to serve as the item label in the list. Default: defaultItemToString 
  - sortItems (null): null Default: defaultSortItems 
  - items (array) (required): We try to stay as generic as possible here to allow individuals to pass
in a collection of whatever kind of data structure they prefer  
  - compareItems (null): null Default: defaultCompareItems 
  - onChange (func): `onChange` is a utility for this controlled component to communicate to a
consuming component what kind of internal state changes are occuring.  
  - light (bool): `true` to use the light version. Default: false 
  - direction (enum): Specify the direction of the multiselect dropdown. Can be either top or bottom. Default: 'bottom' 
"
  (h/factory-apply MultiSelect))