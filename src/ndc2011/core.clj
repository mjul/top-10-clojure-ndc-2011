(ns ndc2011.core
  (:use [clojure.set]))


;; Code to abstractions

(defrecord Quote [bid ask])


(defn diff [old new]
  (let [changed (remove (fn [[k new-v]] (= new-v (k old))) (seq new))
	deleted (difference (set (keys old)) (set (keys new)))]
    {:changed changed, :deleted deleted}))

(defn patch [old df]
  (dissoc (merge old (:changed df)) (:deleted df)))


(defn print-diff [a b]
  (println "old:  " a)
  (println "new:  " b)
  (println "diff: " (diff a b)))

(print-diff {:name "Martin", :country :dk} {:name "Martin", :country :no})
(print-diff (Quote. 1 2) (Quote. 1 3))

(def q (Quote. 1 2))
(def qex (assoc q :exclusive true))

(def q->qex (diff q qex))
(patch q q->qex)







  
  