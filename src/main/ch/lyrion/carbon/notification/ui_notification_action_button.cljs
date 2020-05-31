(ns ch.lyrion.carbon.notification.ui-notification-action-button
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Notification/Notification.js" :default NotificationActionButton]))

(def ui-notification-action-button

"Props:
  - className (string): Specify an optional className to be applied to the notification action button  
  - children (node): Specify the content of the notification action button.  
  - onClick (func): Optionally specify a click handler for the notification action button.  
"
  (h/factory-apply NotificationActionButton))