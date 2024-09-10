(defproject org.clojars.bigsy/elasticmq-clj "0.1.1"
  :description "elasticmq for clojure"
  :url "https://github.com/Bigsy/elasticmq-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.12.0"]
                 [integrant "0.11.0"]
                 [org.clojure/tools.logging "1.3.0"]
                 [org.clojure/tools.namespace "1.5.0"]
                 [org.slf4j/slf4j-jdk14 "2.0.16"]
                 [http-kit "2.8.0"]]

  :profiles {:dev {:dependencies [[com.amazonaws/aws-java-sdk-sqs "1.12.368"]
                                  [cheshire "5.13.0"]]}})

