(ns ch.lyrion.carbon.file-uploader.ui-file-uploader-drop-container
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/FileUploader/FileUploaderDropContainer.js" :default FileUploaderDropContainer]))

(def ui-file-uploader-drop-container

"Props:
  - role (string): Provide an accessibility role for the <FileUploaderButton>  
  - tabIndex (number): Provide a custom tabIndex value for the <FileUploaderButton> Default: 0 
  - disabled (bool): Specify whether file input is disabled  
  - name (string): Provide a name for the underlying <input> node  
  - multiple (bool): Specify if the component should accept multiple files to upload Default: false 
  - className (string): Provide a custom className to be applied to the container node  
  - id (string): Provide a unique id for the underlying <input> node  
  - onAddFiles (func): Event handler that is called after files are added to the uploader
The event handler signature looks like `onAddFiles(evt, { addedFiles })` Default: () => {} 
  - labelText (string): Provide the label text to be read by screen readers when interacting with
this control Default: 'Add file' 
  - accept (arrayOf): Specify the types of files that this input should be able to receive Default: [] 
"
  (h/factory-apply FileUploaderDropContainer))