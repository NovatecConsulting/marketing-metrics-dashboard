(ns marketing-metrics-dashboard.core
  (:gen-class
   :name de.novatec.MarketingMetricsDashboard
   :methods [^:static [handler [] String]])
  (:require [clojure.java.io :as io]))

(defn -handler []
  (slurp (io/resource "index.html")))
