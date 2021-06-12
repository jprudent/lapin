# lapin

An hybrid project that can run both with JVM

    → lein test
    OpenJDK 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.
    {:say-captain Say what?}
    
    lein test lapin.core-test
    
    Ran 1 tests containing 1 assertions.
    0 failures, 0 errors.

and Babashka

    bb src/lapin/core.cljc
    {:say-captain Say what?}

You can start a Clojure repl, write tests that runs on JVM then run the script as Babashka

