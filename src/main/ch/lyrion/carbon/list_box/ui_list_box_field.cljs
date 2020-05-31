(ns ch.lyrion.carbon.list-box.ui-list-box-field
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ListBox/ListBoxField.js" :default ListBoxField]))

(def ui-list-box-field

"`ListBoxField` is responsible for creating the containing node for valid
elements inside of a field. It also provides a11y-related attributes like
`role` to make sure a user can focus the given field.
Props:
  - children (node): Provide the contents of your ListBoxField  
  - id (string) (required): Specify a custom `id`  
  - disabled (bool): Specify if the parent <ListBox> is disabled  
  - tabIndex (union): Optional prop to specify the tabIndex of the <ListBox> trigger button  
"
  (h/factory-apply ListBoxField))