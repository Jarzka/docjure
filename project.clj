(defproject dk.ative/docjure "1.14.0-SNAPSHOT"
  :description "Easily read and write Office documents from Clojure."
  :url "http://github.com/mjul/docjure"
  :license {:name "MIT License"
            :url "http://http://en.wikipedia.org/wiki/MIT_License"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.apache.poi/poi "3.17"]
                 [org.apache.poi/poi-ooxml "3.17"]]
  :plugins [[lein-difftest "2.0.0"]]
  :profiles {:1.5  {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.6  {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7  {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.8  {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :1.9  {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :test {:global-vars  {*warn-on-reflection* false}
                    :resource-paths ["test/dk/ative/docjure/testdata"]}}
  :aliases {"all" ["with-profile" "1.5:1.6:1.7:1.8:1.9"]}
  :global-vars {*warn-on-reflection* true})

