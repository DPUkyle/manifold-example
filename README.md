Invoke with `$ ./gradlew clean check`

Note that the `compileJava` and `compileTestJava` tasks will complete successfully.

The `test` task will hang on startup though without producing any ST or logging.

I believe the root cause is the test worker process being created with the 'manifoldclass://' URI scheme we inject into the system classloader.  Gradle then uses that URL to create a new File instance, which will cause the worker to throw.

Please see more detail here: https://github.com/gradle/gradle/pull/3224
