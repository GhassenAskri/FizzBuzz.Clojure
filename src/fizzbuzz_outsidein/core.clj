(ns fizzbuzz-outsidein.core
(:gen-class))


(defn isNotFizzAndNotBuzz 
"fizzbuzzOneNumber that not multiple of 3 or 5 return the same number as string"
[number?]
(not= (mod number? 15) 0))

(defn isFizz
  "fizzbuzzOneNumber that multiple of 3 return fizz"
[number?]
(= (mod number? 3) 0))

(defn isBuzz
"fizzbuzzOneNumber that multiple of five"
[number?]
(= (mod number? 5) 0))

(defn isFizzAndBuzz
"fizzbuzzOneNumber that multiple of both three and five"
[number?]
(= (mod number? 15) 0))

(defn fizzBuzzOneNumber
"fizzbuzz One number "
[number?]
(cond
(isFizzAndBuzz number?) (str "fizzbuzz ")
(isFizz number?) (str "fizz ")
(isBuzz number?)(str "buzz ")
(isNotFizzAndNotBuzz number?) (str number? " ")))

(defn fizzbuzz
"fizzbuzz return a fizzbuzz string from an array of integer"
[arraOfInteger]
(reduce str (map fizzBuzzOneNumber arraOfInteger))
)


 
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (fizzbuzz [1 15 9 4 5 10 0])
  (isNotFizzAndNotBuzz 1)
  (println "yoooo"))