(ns fizzbuzz-outsidein.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz-outsidein.core :refer :all]))

(deftest fizzbuzzAnArrayOfIntegers
  (testing "When i fizzbuzz [1 15 9 4 5 10 0] i get a string equal to 1 fizzbuzz fizz 4 buzz buzz fizzbuzz"
    (is (= (fizzbuzz-outsidein.core/fizzbuzz [1 15 9 4 5 10 0]) "fizzbuzz fizz 4 buzz buzz fizzbuzz"))))

(deftest fizzbuzzAnumberThatIsNotMultipleOfThreeOrFive
  (testing "When i fizzbuzz 1 i get 1 as string "
    (is (= (fizzbuzz-outsidein.core/fizzBuzzOneNumber 1) "1")))
  (testing "When i fizzbuzz 2 i get 2 as string "
    (is (= (fizzbuzz-outsidein.core/fizzBuzzOneNumber 2) "2")))
  (testing "When i fizzbuzz 4 i get 4 as string "
    (is (= (fizzbuzz-outsidein.core/fizzBuzzOneNumber 4) "4"))))

(deftest fizzbuzzAnumberThatIsMultipleOfThree
  (testing "When I fizzbuzz 3 I get fizz"
    (is (= (fizzbuzz-outsidein.core/fizzBuzzOneNumberMultipleOfThree 3) "fizz"))))