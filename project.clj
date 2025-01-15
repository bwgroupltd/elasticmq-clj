(defproject audiogum/elasticmq-clj "0.2.0-SNAPSHOT"
  :description "elasticmq for clojure"
  :url "https://github.com/bwgroupltd/elasticmq-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.12.0"]
                 [integrant "0.13.1"]
                 [org.clojure/tools.logging "1.3.0"]
                 [org.clojure/tools.namespace "1.5.0"]
                 [org.slf4j/slf4j-jdk14 "2.0.16"]
                 [http-kit "2.8.0"]]

  :profiles {:dev {:dependencies [[com.amazonaws/aws-java-sdk-sqs "1.12.368"]
                                  [cheshire "5.13.0"]]}}

  :release-tasks  [["vcs" "assert-committed"]
                   ["change" "version" "leiningen.release/bump-version" "release"]
                   ["vcs" "commit"]
                   ["vcs" "tag" "--no-sign"]
                   ["deploy" "releases"]
                   ["change" "version" "leiningen.release/bump-version" "patch"]
                   ["vcs" "commit"]
                   ["vcs" "push" "origin" "main"]]

  :plugins [[s3-wagon-private "1.3.4"]]

  :repositories {"releases" {:url           "s3p://repo.bowerswilkins.net/releases/"
                             :no-auth       true
                             :sign-releases false}})



