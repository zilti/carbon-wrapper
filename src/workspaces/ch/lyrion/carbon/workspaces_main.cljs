(ns ch.lyrion.carbon.workspaces-main
  (:require [nubank.workspaces.core :as ws]
            [ch.lyrion.carbon.workspaces.button]))

(defonce init (ws/mount))
