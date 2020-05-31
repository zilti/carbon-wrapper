(ns ch.lyrion.carbon.breadcrumb.ui-breadcrumb-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Breadcrumb/Breadcrumb.Skeleton.js" :default BreadcrumbSkeleton]))

(def ui-breadcrumb-skeleton

"Props:
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply BreadcrumbSkeleton))