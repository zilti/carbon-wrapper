(ns ch.lyrion.carbon.file-uploader.ui-file-uploader
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/FileUploader/FileUploader.js" :default FileUploader]))

(def ui-file-uploader

"Props:
  - labelTitle (string): Specify the title text of this <FileUploader>  
  - name (string): Provide a name for the underlying <input> node  
  - buttonKind (enum): Specify the type of the <FileUploaderButton> Default: 'primary' 
  - multiple (bool): Specify if the component should accept multiple files to upload Default: false 
  - filenameStatus (enum): Specify the status of the File Upload Default: 'uploading' 
  - labelDescription (string): Specify the description text of this <FileUploader>  
  - className (string): Provide a custom className to be applied to the container node  
  - size (enum): Specify the size of the FileUploaderButton, from a list of available
sizes. For `default` buttons, this prop can remain unspecified.  
  - onChange (func): Provide an optional `onChange` hook that is called each time the input is
changed  
  - onDelete (func): Provide an optional `onDelete` hook that is called when an uploaded item
is removed  
  - iconDescription (string): Provide a description for the complete/close icon that can be read by screen readers Default: 'Provide icon description' 
  - buttonLabel (string): Provide the label text to be read by screen readers when interacting with
the <FileUploaderButton> Default: '' 
  - onClick (func): Provide an optional `onClick` hook that is called each time the
FileUploader is clicked Default: () => {} 
  - accept (arrayOf): Specify the types of files that this input should be able to receive Default: [] 
"
  (h/factory-apply FileUploader))