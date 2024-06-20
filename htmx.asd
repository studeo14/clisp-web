(defsystem "htmx"
  :version "0.0.1"
  :author ""
  :license ""
  :depends-on ("snooze" "clack" "djula")
  :components ((:module "src"
                :components
                ((:file "main"))))
  :description ""
  :in-order-to ((test-op (test-op "htmx/tests"))))

(defsystem "htmx/tests"
  :author ""
  :license ""
  :depends-on ("htmx"
               "rove")
  :components ((:module "tests"
                :components
                ((:file "main"))))
  :description "Test system for htmx"
  :perform (test-op (op c) (symbol-call :rove :run c)))
