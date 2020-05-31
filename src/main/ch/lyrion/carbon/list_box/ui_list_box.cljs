(ns ch.lyrion.carbon.list-box.ui-list-box
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ListBox/ListBox.js" :default ListBox]))

(def ui-list-box

"`ListBox` is a generic container component that handles creating the
container class name in response to certain props.
Props:
  - disabled (bool): Specify whether the ListBox is currently disabled Default: false 
  - type (custom): Specify the \"type\" of the ListBox. Currently supports either `default` or
`inline` as an option. Default: 'default' 
  - children (node): Provide the contents of your ListBox  
  - className (string): Specify a class name to be applied on the containing list box node  
  - size (custom): Specify the size of the ListBox. Currently supports either `sm` or `xl` as an option.  
"
  (h/factory-apply ListBox))