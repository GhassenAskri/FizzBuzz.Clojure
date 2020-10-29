(ns fizzbuzz-outsidein.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz-outsidein.core :refer :all]))

(deftest fizzbuzzAnArrayMultipleNumbersInAnArray
  (testing "When i fizzbuzz [1 15 9 4 5 10 0] i get a string equal to 1 fizzbuzz fizz 4 buzz buzz fizzbuzz"
    (is (= (fizzbuzzAnArrayOfNumbers [1 15 9 4 5 10 0]) "1 fizzbuzz fizz 4 buzz buzz fizzbuzz"))))


(deftest fizzbuzzAnumberThatIsMultipleOfThree
  (testing "When I fizzbuzz 3 I get true"
    (is (= (fizz? 3) true)))
  (testing "When I fizzbuzz 9 I get true"
    (is (= (fizz? 9) true))))

(deftest fizzbuzzAnumberThatIsMulipleOfFive
  (testing "When I fizzbuzz 5 I get true"
    (is(= (buzz? 5) true))))

(deftest fizzbuzzAnumberThatIsMulipleOfFiveAndThree
  (testing "When I fizzbuzz 15 I get true"
    (is(= (fizzBuzz? 15 )true))))

(deftest fizzBuzzAnumber
  (testing "When I fizzbuzz 15 I get buzz")
  (is(= (fizzBuzzOneNumber 15) "fizzbuzz"))
  (testing "When I fizzbuzz 5 I get buzz")
  (is(= (fizzBuzzOneNumber 5) "buzz"))
  (testing "When I fizzbuzz 0 I get buzz")
  (is(= (fizzBuzzOneNumber 0) "fizzbuzz")))

