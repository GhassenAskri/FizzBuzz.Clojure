(ns fizzbuzz-outsidein.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz-outsidein.core :refer :all]))

(deftest fizzbuzzAnArrayOfIntegers
  (testing "When i fizzbuzz [1 15 9 4 5 10 0] i get a string equal to 1 fizzbuzz fizz 4 buzz buzz fizzbuzz"
    (is (= (fizzbuzz-outsidein.core/fizzbuzz [1 15 9 4 5 10 0]) "1 fizzbuzz fizz 4 buzz buzz fizzbuzz "))))

(deftest fizzbuzzAnumberThatIsNotMultipleOfThreeOrFive
  (testing "When i fizzbuzz 1 i get 1 as string "
    (is (= (fizzbuzz-outsidein.core/isNotFizzAndNotBuzz 1) true)))
  (testing "When i fizzbuzz 2 i get 2 as string "
    (is (= (fizzbuzz-outsidein.core/isNotFizzAndNotBuzz 2) true)))
  (testing "When i fizzbuzz 4 i get 4 as string "
    (is (= (fizzbuzz-outsidein.core/isNotFizzAndNotBuzz 4) true))))

(deftest fizzbuzzAnumberThatIsMultipleOfThree
  (testing "When I fizzbuzz 3 I get fizz"
    (is (= (fizzbuzz-outsidein.core/isFizz 3) true)))
  (testing "When I fizzbuzz 9 I get fizz"
    (is (= (fizzbuzz-outsidein.core/isFizz 9) true)))
  (testing "When I fizzbuzz 9 I get fizz"
    (is (= (fizzbuzz-outsidein.core/isFizz 10) false))))

(deftest fizzbuzzAnumberThatIsMulipleOfFive
  (testing "When I fizzbuzz 5 I get buzz")
  (is(= (fizzbuzz-outsidein.core/isBuzz 5) true)))


(deftest fizzbuzzAnumberThatIsMulipleOfFiveAndThree
  (testing "When I fizzbuzz 5 I get buzz")
  (is(= (fizzbuzz-outsidein.core/isFizzAndBuzz 15) true)))

(deftest fizzBuzzArandomNumber
  (testing "When I fizzbuzz 5 I get buzz")
  (is(= (fizzbuzz-outsidein.core/fizzBuzzOneNumber 15) "fizzbuzz "))
  (testing "When I fizzbuzz 5 I get buzz")
  (is(= (fizzbuzz-outsidein.core/fizzBuzzOneNumber 1) "1 "))
  (testing "When I fizzbuzz 5 I get buzz")
  (is(= (fizzbuzz-outsidein.core/fizzBuzzOneNumber 0) "fizzbuzz ")))

