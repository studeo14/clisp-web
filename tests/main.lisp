(defpackage htmx/tests/main
  (:use :cl
        :htmx
        :rove))
(in-package :htmx/tests/main)

;; NOTE: To run this test file, execute `(asdf:test-system :htmx)' in your Lisp.

(deftest test-target-1
  (testing "should (= 1 1) to be true"
    (ok (= 1 1))))
