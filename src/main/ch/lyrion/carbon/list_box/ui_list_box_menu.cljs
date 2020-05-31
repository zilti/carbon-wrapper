(ns ch.lyrion.carbon.list-box.ui-list-box-menu
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ListBox/ListBoxMenu.js" :default ListBoxMenu]))

(def ui-list-box-menu

"`ListBoxMenu` is a simple container node that isolates the `list-box__menu`
class into a single component. It is also being used to validate given
`children` components.
Props:
  - children (custom): Provide the contents of your ListBoxMenu  
  - id (string) (required): Specify a custom `id`  
"
  (h/factory-apply ListBoxMenu))