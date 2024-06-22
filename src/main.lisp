(defpackage :htmx
  (:use :cl)
  (:local-nicknames (:dj :djula)
                    (:sn :snooze))
  (:export #:start-server
           #:stop-server))
(in-package :htmx)

;; djula setup
(dj:add-template-directory (asdf:system-relative-pathname "htmx" "templates/"))

(defparameter +index.html+ (dj:compile-template* "index.html"))
(defparameter +data.html+ (dj:compile-template* "data.html"))

(defvar *listener-thread* nil)

(dj:def-filter :scale-and-round (value &optional (scale 100000))
  (round (* value (parse-integer scale))))

(sn:defroute #:test (:get :text/plain)
  (format nil "The test suceeds 2"))

(sn:defroute #:home (:get :text/html)
  (dj:render-template* +index.html+ nil :title "Rendered title"))

(sn:defroute #:data (:get :text/html)
  (dj:render-template* +data.html+ nil :width 1024 :height 100 :points (htmx.datum:better-points (htmx.datum:gen-data))))

(defun start-server ()
  (cond ((eq nil *listener-thread*)
         (setf (symbol-value '*listener-thread*)
               (clack:clackup (sn:make-clack-app)
                              :port 8000)))
        (t (format t "Server already running"))))

(defun stop-server ()
  (clack:stop *listener-thread*)
  (setf (symbol-value '*listener-thread*) nil))
