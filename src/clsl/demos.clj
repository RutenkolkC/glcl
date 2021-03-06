(ns clsl.demos
 (:require [clsl.basic-demos :as basic])
 (:require [clsl.textured-demos :as texture])
 (:require [clsl.obj-demo :as obj])
 (:require [clsl.obj-demo-fast :as obj-fast])
 (:gen-class))

(def demos
  [basic/demo1 basic/demo2 basic/demo3
   texture/demo (partial texture/demo2 3)
   obj/demo obj-fast/demo])

(defn all-demos! []
  (doall (map #(%) demos)))

(comment
  "Please call any of the demo-fns."
  ((nth demos 0))
  ((nth demos 1))
  ((nth demos 2))
  ...
  (texture/demo)
  (all-demos!)) 

(defn -main [& args]
  (all-demos!))
