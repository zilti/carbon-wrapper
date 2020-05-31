(ns ch.lyrion.carbon.breadcrumb.ui-breadcrumb-item
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Breadcrumb/BreadcrumbItem.js" :default BreadcrumbItem]))

(def ui-breadcrumb-item

"Props:
  - children (node): Pass in content that will be inside of the BreadcrumbItem  
  - className (string): Specify an optional className to be applied to the container node  
  - href (string): Optional string representing the link location for the BreadcrumbItem  
  - isCurrentPage (bool): Provide if this breadcrumb item represents the current page  
"
  (h/factory-apply BreadcrumbItem))