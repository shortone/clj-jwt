(defproject clj-jwt "0.0.11"
  :description  "Clojure library for JSON Web Token(JWT)"
  :url          "https://github.com/liquidz/clj-jwt"
  :license      {:name "Eclipse Public License"
                 :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/data.json "0.2.5"]
                 [org.clojure/data.codec "0.1.0"]
                 [org.bouncycastle/bcprov-jdk15 "1.46"]
                 [crypto-equality "1.0.0"]
                 [clj-time "0.8.0"]]

  :profiles {:dev {:dependencies [[midje "1.6.3"  :exclusions [org.clojure/clojure]]]}}
  :plugins  [[lein-midje "3.1.3"]])
