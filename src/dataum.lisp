

(defpackage :htmx.datum
  (:use :cl)
  (:export #:gen-data))
(in-package :htmx.datum)

(defconstant two-pi (* 2 pi))

(defun gaussian (mu sigma)
  (let ((u1 (loop with a = (random 1.0) do (setq a (random 1.0)) when (> a 0.0) return a))
        (u2 (random 1.0)))
    (let* ((mag (* sigma (sqrt (* -2.0 (log u1)))))
           (z0 (* mag (+ (cos (* two-pi u2)) mu)))
           (z1 (* mag (+ (sin (* two-pi u2)) mu))))
      (list z0 z1))))

(defun gen-data (&optional (length 1024))
  (loop repeat (/ length 2)
        nconcing (gaussian 50.0 0.01)))
