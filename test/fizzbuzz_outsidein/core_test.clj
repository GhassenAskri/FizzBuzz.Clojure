(ns fizzbuzz-outsidein.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz-outsidein.core :refer :all]))

(deftest fizzbuzzAnArrayOfIntegers
  (testing "When i fizzbuzz [1 15 9 4 5 10 0] i get a string equal to 1 fizzbuzz fizz 4 buzz buzz fizzbuzz"
    (is (= (fizzbuzz-outsidein.core/fizzbuzz [1 15 9 4 5 10 0]) "fizzbuzz fizz 4 buzz buzz fizzbuzz"))))

(deftest fizzbuzzAnumberThatIsNotMultipleOfThreeOrFive
  (testing "When i fizzbuzz 1 i get 1 as string "
    (is (= (fizzbuzz-outsidein.core/fizzBuzzOneNumber 1) "1"))))