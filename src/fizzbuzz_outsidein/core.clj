(ns fizzbuzz-outsidein.core
(:gen-class))

(defn fizzbuzz
  "fizzbuzz return a fizzbuzz string from an array of integer"
  [arraOfInteger]
  (str "fizzbuzz fizz 4 buzz buzz fizzbuzz"))

(defn isNotFizzAndNotBuzz 
  "fizzbuzzOneNumber that not multiple of 3 or 5 return the same number as string"
  [number?]
  (if (not= (mod number? 15) 0)
    (= true true )
    (= false true)))

(defn isFizz
  "fizzbuzzOneNumber that multiple of 3 return fizz"
  [number?]
  (if (= (mod number? 3) 0)
    (= true true)
    (= false true)))

(defn isBuzz
  "fizzbuzzOneNumber that multiple of five"
  [number?]
  (if (= (mod number? 5) 0)
    (= true true)
    (= false true)))

(defn isFizzAndBuzz
  "fizzbuzzOneNumber that multiple of both three and five"
  [number?]
  (if (= (mod number? 15) 0)
    (= true true)
    (= false true)))
 
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (fizzbuzz [1 15 9 4 5 10 0])
  (isNotFizzAndNotBuzz 1))