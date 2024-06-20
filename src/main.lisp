(defpackage :htmx
  (:use :cl
        :snooze
        :djula)
  (:export #:start-server
           #:stop-server))
(in-package :htmx)

;; djula setup
(add-template-directory (asdf:system-relative-pathname "htmx" "templates/"))

(defparameter +index.html+ (compile-template* "index.html"))
(defparameter +data.html+ (compile-template* "data.html"))

(defvar *listener-thread* nil)

(def-filter :scale-and-round (value &optional (scale 100000))
  (round (* value (parse-integer scale))))

(defroute test (:get :text/plain)
  (format nil "The test suceeds 2"))

(defroute index (:get :text/html)
  (render-template* +index.html+ nil :title "Rendered title"))

(defroute data (:get :text/html)
  (render-template* +data.html+ nil :data (htmx.datum:gen-data) :width 102400 :height 102400000))

(defun start-server ()
  (cond ((eq nil *listener-thread*)
         (setf (symbol-value '*listener-thread*)
               (clack:clackup (snooze:make-clack-app)
                              :port 8000)))
        (t (format t "Server already running"))))

(defun stop-server ()
  (clack:stop *listener-thread*)
  (setf (symbol-value '*listener-thread*) nil))
