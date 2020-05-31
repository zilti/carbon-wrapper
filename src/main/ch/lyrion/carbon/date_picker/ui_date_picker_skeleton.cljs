(ns ch.lyrion.carbon.date-picker.ui-date-picker-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DatePicker/DatePicker.Skeleton.js" :default DatePickerSkeleton]))

(def ui-date-picker-skeleton

"Props:
  - range (bool): Specify whether the skeleton should be of range date picker.  
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply DatePickerSkeleton))