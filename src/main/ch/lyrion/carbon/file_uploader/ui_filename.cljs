(ns ch.lyrion.carbon.file-uploader.ui-filename
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/FileUploader/Filename.js" :default Filename]))

(def ui-filename

"Props:
  - iconDescription (string): Provide a description of the SVG icon to denote file upload status Default: 'Uploading file' 
  - status (enum): Status of the file upload Default: 'uploading' 
  - tabIndex (string): Provide a custom tabIndex value for the <Filename> Default: '0' 
"
  (h/factory-apply Filename))