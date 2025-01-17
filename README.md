# elasticmq-clj

Embedded sqs for clojure based on elasticmq, just packaged nicely to make it easy to use for mocking in clojure tests

## Usage

[audiogum/elasticmq-clj "0.2.0"]

### Development:

```clojure
(require 'elasticmq-clj.core)

;; Start a local elasticmq with default port:
(init-elasticmq)

;; another call will halt the previous system:
(init-elasticmq)

;; When you're done:
(halt-elasticmq!)
```

### Testing:

**NOTE**: these will halt running elasticmq instances

```clojure
(require 'clojure.test)

(use-fixtures :once with-elasticmq-fn)

(defn around-all
  [f]
  (with-elasticmq-fn "optional file path for custom.conf"
                    f))

(use-fixtures :once around-all)


; You can also wrap ad-hoc code in init/halt:
(with-elasticmq "optional file path for custom.conf"
  do-something) 
  ```
