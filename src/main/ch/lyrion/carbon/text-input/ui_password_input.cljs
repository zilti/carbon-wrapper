(ns ch.lyrion.carbon.text-input.ui-password-input
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/TextInput/PasswordInput.js" :default PasswordInput]))

(def ui-password-input

"Props:
  - tooltipPosition (enum): Specify the direction of the tooltip for icon-only buttons.
Can be either top, right, bottom, or left. Default: 'bottom' 
  - helperText (node): Provide text that is used alongside the control label for additional help Default: '' 
  - invalidText (string): Provide the text that is displayed when the control is in an invalid state Default: '' 
  - tooltipAlignment (enum): Specify the alignment of the tooltip to the icon-only button.
Can be one of: start, center, or end. Default: 'center' 
  - placeholder (string): Specify the placeholder attribute for the <input>  
  - disabled (bool): Specify whether the control is disabled Default: false 
  - value (union): Provide the current value of the <input>  
  - hidePasswordLabel (string): \"Hide password\" tooltip text on password visibility toggle Default: 'Hide password' 
  - invalid (bool): Specify whether the control is currently invalid Default: false 
  - className (string): Provide a custom className that is applied directly to the underlying
<input> node Default: '${prefix}--text__input' 
  - size (string): Specify the size of the Text Input. Currently supports either `small` or `large` as an option. If omitted, defaults to standard size Default: '' 
  - hideLabel (bool): Specify whether or not the underlying label is visually hidden  
  - id (string) (required): Provide a unique identifier for the input field  
  - showPasswordLabel (string): \"Show password\" tooltip text on password visibility toggle Default: 'Show password' 
  - defaultValue (union): Optionally provide the default value of the <input>  
  - onChange (func): Optionally provide an `onChange` handler that is called whenever <input>
is updated Default: () => {} 
  - light (bool): Specify light version or default version of this control Default: false 
  - labelText (node) (required): Provide the text that will be read by a screen reader when visiting this
control  
  - onClick (func): Optionally provide an `onClick` handler that is called whenever the
<input> is clicked Default: () => {} 
"
  (h/factory-apply PasswordInput))