(ns ch.lyrion.carbon.file-uploader.ui-file-uploader-item
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/FileUploader/FileUploaderItem.js" :default FileUploaderItem]))

(def ui-file-uploader-item

"Props:
  - status (enum): Status of the file upload Default: 'uploading' 
  - onDelete (func): Event handler that is called after removing a file from the file uploader
The event handler signature looks like `onDelete(evt, { uuid })` Default: () => {} 
  - uuid (string): Unique identifier for the file object  
  - name (string): Name of the uploaded file  
  - iconDescription (string): Description of status icon (displayed in native tooltip)  
  - invalid (bool): Specify if the currently uploaded file is invalid  
  - errorSubject (string): Error message subject for an invalid file upload  
  - errorBody (string): Error message body for an invalid file upload  
"
  (h/factory-apply FileUploaderItem))