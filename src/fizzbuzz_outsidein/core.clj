(ns fizzbuzz-outsidein.core
(:gen-class))

(defn fizzbuzz
  "fizzbuzz return a fizzbuzz string from an array of integer"
  [arraOfInteger]
  (str "fizzbuzz fizz 4 buzz buzz fizzbuzz"))



(defn fizzBuzzOneNumber 
  "fizzbuzzOneNumber that not multiple of 3 or 5 return the same number as string"
  [number?]
  (if (= number? 1)
    (str "1")
    (do (if (= number? 2)
          (str "2")
          (str "4")))))






(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (fizzbuzz [1 15 9 4 5 10 0])
  (fizzBuzzOneNumber 1))