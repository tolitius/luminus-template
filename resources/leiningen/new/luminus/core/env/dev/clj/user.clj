(ns user
  (:require [<<project-ns>>.handler :refer [app init destroy]]
            [luminus.http-server :as http]
            [<<project-ns>>.config :refer [env]]))

(defn start []
  (http/start {:handler app
               :init    init
               :port    (:port env)}))

(defn stop []
  (http/stop destroy))

(defn restart []
  (stop)
  (start))


