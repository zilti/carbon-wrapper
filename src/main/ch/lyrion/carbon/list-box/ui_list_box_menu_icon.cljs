(ns ch.lyrion.carbon.list-box.ui-list-box-menu-icon
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ListBox/ListBoxMenuIcon.js" :default ListBoxMenuIcon]))

(def ui-list-box-menu-icon

"`ListBoxMenuIcon` is used to orient the icon up or down depending on the
state of the menu for a given `ListBox`
Props:
  - translateWithId (func): i18n hook used to provide the appropriate description for the given menu
icon. This function takes in an id defined in `translationIds` and should
return a string message for that given message id. Default: id => defaultTranslations[id] 
  - isOpen (bool) (required): Specify whether the menu is currently open, which will influence the
direction of the menu icon  
"
  (h/factory-apply ListBoxMenuIcon))