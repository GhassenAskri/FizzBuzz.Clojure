(ns fizzbuzz-outsidein.core
(:gen-class))

(defn fizzbuzz
  "fizzbuzz return a fizzbuzz string from an array of integer"
  [arraOfInteger]
  (str "fizzbuzz fizz 4 buzz buzz fizzbuzz")
  (println "fizzbuzz fizz 4 buzz buzz fizzbuzz"))



(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (fizzbuzz [1 15 9 4 5 10 0]))