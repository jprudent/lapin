#?(:bb (do (require '[babashka.deps :as deps])
           (deps/add-deps '{:deps {cprop/cprop {:mvn/version "0.1.16"}}})))
(ns lapin.core
  (:require [cprop.core :as cprop]))

(def conf (cprop/load-config :file "conf/test.edn"))

(println conf)