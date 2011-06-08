(ns ndc2011.islands)

;; A Clojure record is not an island
(defrecord Conference [name year])

(def ndc (Conference. "NDC" 2011))
(def cc (Conference. "Clojure Conj" 2011))
(def confs [ndc cc])

;; Records works with common functions
(filter #(= 2011 (:year %)) confs)
(assoc ndc :rating :great)

;; Conference fields have map semantics
(:year ndc)

;; A record is also a map of its properties
(seq ndc)

(doseq [[prop value] ndc]
  (println prop "->" value))



