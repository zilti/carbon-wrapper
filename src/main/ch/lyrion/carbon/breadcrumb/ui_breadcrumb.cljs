(ns ch.lyrion.carbon.breadcrumb.ui-breadcrumb
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Breadcrumb/Breadcrumb.js" :default Breadcrumb]))

(def ui-breadcrumb

"Props:
  - aria-label (string): Specify the label for the breadcrumb container  
  - children (node): Pass in the BreadcrumbItem's for your Breadcrumb  
  - className (string): Specify an optional className to be applied to the container node  
  - noTrailingSlash (bool): Optional prop to omit the trailing slash for the breadcrumbs  
"
  (h/factory-apply Breadcrumb))