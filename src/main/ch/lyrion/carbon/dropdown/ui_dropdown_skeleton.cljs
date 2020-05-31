(ns ch.lyrion.carbon.dropdown.ui-dropdown-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Dropdown/Dropdown.Skeleton.js" :default DropdownSkeleton]))

(def ui-dropdown-skeleton

"Props:
  - inline (bool): Specify whether you want the inline version of this control Default: false 
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply DropdownSkeleton))