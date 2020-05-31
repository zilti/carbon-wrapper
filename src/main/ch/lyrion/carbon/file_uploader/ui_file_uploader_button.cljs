(ns ch.lyrion.carbon.file-uploader.ui-file-uploader-button
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/FileUploader/FileUploaderButton.js" :default FileUploaderButton]))

(def ui-file-uploader-button

"Props:
  - role (string): Provide an accessibility role for the <FileUploaderButton> Default: 'button' 
  - tabIndex (number): Provide a custom tabIndex value for the <FileUploaderButton> Default: 0 
  - listFiles (bool): Specify whether you want the component to list the files that have been
submitted to be uploaded  
  - disabled (bool): Specify whether file input is disabled Default: false 
  - name (string): Provide a name for the underlying <input> node  
  - buttonKind (enum): Specify the type of underlying button Default: 'primary' 
  - multiple (bool): Specify if the component should accept multiple files to upload Default: false 
  - className (string): Provide a custom className to be applied to the container node  
  - size (enum): Specify the size of the button, from a list of available sizes.
For `default` buttons, this prop can remain unspecified.  
  - id (string): Provide a unique id for the underlying <input> node  
  - onChange (func): Provide an optional `onChange` hook that is called each time the <input>
value changes Default: function noop() {} 
  - labelText (node): Provide the label text to be read by screen readers when interacting with
this control Default: 'Add file' 
  - disableLabelChanges (bool): Specify whether you want to disable any updates to the FileUploaderButton
label Default: false 
  - onClick (func): Provide an optional `onClick` hook that is called each time the button is
clicked  
  - accept (arrayOf): Specify the types of files that this input should be able to receive  
"
  (h/factory-apply FileUploaderButton))