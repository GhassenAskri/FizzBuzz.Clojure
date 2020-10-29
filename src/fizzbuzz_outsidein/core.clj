(ns fizzbuzz-outsidein.core
(:require [clojure.string :as string])
(:gen-class))

(defn fizz?
"fizz? return true if a number is multiple of 3"
[number?]
(= (mod number? 3) 0))

(defn buzz?
"buzz? return true if a number is multiple of 3"
[number?]
(= (mod number? 5) 0))

(defn fizzBuzz?
"fizzBuzz? return true if a number is multiple of 3 and 5"
[number?]
(= (mod number? 15) 0))

(defn fizzBuzzOneNumber
"fizzbuzzOneNumber return the fizz, buzz, fizzbuzz and a number as string for multiple of three, five, three and five and a number which is not multiple of three nor five respectively"
[number?]
(cond
(fizzBuzz? number?) (str "fizzbuzz")
(fizz? number?) (str "fizz")
(buzz? number?)(str "buzz")
 :else (str number?)))

(defn fizzbuzzAnArrayOfNumbers
"fizzbuzzAnArrayOfNumbers return a fizzbuzz string from an array of numbers"
[arrayOfNumbers]
(string/join " " (map fizzBuzzOneNumber arrayOfNumbers)))
; I can't do add an space between strings so i used join


 
