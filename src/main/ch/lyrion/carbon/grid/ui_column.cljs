(ns ch.lyrion.carbon.grid.ui-column
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Grid/Column.js" :default Column]))

(def ui-column

"Props:
  - as (union): Provide a custom element to render instead of the default <div> Default: 'div' 
  - sm (custom): Specify column span for the `sm` breakpoint (Default breakpoint up to 672px)
This breakpoint supports 4 columns by default.

@see https://www.carbondesignsystem.com/guidelines/layout#breakpoints  
  - md (custom): Specify column span for the `md` breakpoint (Default breakpoint up to 1056px)
This breakpoint supports 8 columns by default.

@see https://www.carbondesignsystem.com/guidelines/layout#breakpoints  
  - lg (custom): Specify column span for the `lg` breakpoint (Default breakpoint up to 1312px)
This breakpoint supports 16 columns by default.

@see https://www.carbondesignsystem.com/guidelines/layout#breakpoints  
  - xlg (custom): Specify column span for the `xlg` breakpoint (Default breakpoint up to
1584px) This breakpoint supports 16 columns by default.

@see https://www.carbondesignsystem.com/guidelines/layout#breakpoints  
  - max (custom): Specify column span for the `max` breakpoint. This breakpoint supports 16
columns by default.

@see https://www.carbondesignsystem.com/guidelines/layout#breakpoints  
  - className (string): Specify a custom className to be applied to the `Column`  
  - children (node): Pass in content that will be rendered within the `Column`  
"
  (h/factory-apply Column))