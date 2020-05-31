(ns ch.lyrion.carbon.date-picker.ui-date-picker
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DatePicker/DatePicker.js" :default DatePicker]))

(def ui-date-picker

"Props:
  - children (node): The child nodes.  
  - short (bool): `true` to use the short version. Default: false 
  - appendTo (object): The DOM element the Flatpicker should be inserted into. `<body>` by default.  
  - datePickerType (enum): The type of the date picker:

* `simple` - Without calendar dropdown.
* `single` - With calendar dropdown and single date.
* `range` - With calendar dropdown and a date range.  
  - locale (enum): The language locale used to format the days of the week, months, and numbers.

* `ar` - Arabic
* `at` - Austria
* `be` - Belarusian
* `bg` - Bulgarian
* `bn` - Bangla
* `cat` - Catalan
* `cs` - Czech
* `cy` - Welsh
* `da` - Danish
* `de` - German
* `en` - English
* `eo` - Esperanto
* `es` - Spanish
* `et` - Estonian
* `fa` - Persian
* `fi` - Finnish
* `fr` - French
* `gr` - Greek
* `he` - Hebrew
* `hi` - Hindi
* `hr` - Croatian
* `hu` - Hungarian
* `id` - Indonesian
* `it` - Italian
* `ja` - Japanese
* `ko` - Korean
* `lt` - Lithuanian
* `lv` - Latvian
* `mk` - Macedonian
* `mn` - Mongolian
* `ms` - Malaysian
* `my` - Burmese
* `nl` - Dutch
* `no` - Norwegian
* `pa` - Punjabi
* `pl` - Polish
* `pt` - Portuguese
* `ro` - Romanian
* `si` - Sinhala
* `sk` - Slovak
* `sl` - Slovenian
* `sq` - Albanian
* `sr` - Serbian
* `sv` - Swedish
* `th` - Thai
* `tr` - Turkish
* `uk` - Ukrainian
* `vn` - Vietnamese
* `zh` - Mandarin Default: 'en' 
  - value (union): The value of the date value provided to flatpickr, could
be a date, a date number, a date string, an array of dates.  
  - onClose (func): The `close` event handler.  
  - maxDate (string): The maximum date that a user can pick to.  
  - className (string): The CSS class names.  
  - minDate (string): The minimum date that a user can start picking from.  
  - dateFormat (string): The date format. Default: 'm/d/Y' 
  - onChange (func): The `change` event handler.  
  - light (bool): `true` to use the light version. Default: false 
"
  (h/factory-apply DatePicker))