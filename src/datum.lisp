

(defpackage :htmx.datum
  (:use :cl)
  (:export #:gen-data
           #:simple-plot
           #:better-points))
(in-package :htmx.datum)

(defconstant two-pi (* 2 pi))

(defun gaussian (mu sigma)
  (let ((u1 (loop with a = (random 1.0) do (setq a (random 1.0)) when (> a 0.0) return a))
        (u2 (random 1.0)))
    (let* ((mag (* sigma (sqrt (* -2.0 (log u1)))))
           (z0 (+ mu (* mag (cos (* two-pi u2)))))
           (z1 (+ mu (* mag (sin (* two-pi u2))))))
      (list z0 z1))))

(defun gen-data (&optional (length 1024))
  (loop repeat (/ length 2)
        nconcing (gaussian 50.0 9.0)))

(defmacro with-enumerated-list ((list elem idx &key (first-index 0)) &body body)
  `(loop for ,elem in ,list and ,idx from ,first-index
         collect (progn ,@body)))

(defun enumerate (data)
  (with-enumerated-list (data elem idx)
    (cons idx elem)))

(defun better-points (data)
  (with-output-to-string (str)
    (write-string "M0 0 " str)
    (loop for (x . y) in (enumerate data) do (format str "L~d ~f " x y))))
