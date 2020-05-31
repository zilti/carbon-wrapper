(ns ch.lyrion.carbon.file-uploader.ui-file-uploader-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/FileUploader/FileUploader.Skeleton.js" :default FileUploaderSkeleton]))

(def ui-file-uploader-skeleton

"Props:
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply FileUploaderSkeleton))