# espresso-java
Android automation with native framework Espresso and Java

Espresso is the native testing framework for Android, means it is only for a single platform -Android- and does not provide cross platform support.

- The Espresso testing framework is an instrumentation API, meaning that the full Android environment, Android device, and Android OS are required to deploy and run tests.
- "AndroidJUnitRunner" is the test runner used to run test cases.

1. Java JDK version 8 or above - After downloading JDK, extract it to path `/Library/Java/JavaVirtualMachines` and set JAVA_HOME environment variable by adding `export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-11.0.7.jdk/Contents/Home`into ~/.bash_profile.
2. Gradle - `brew install gradle`
3. Android Studio

Android application:
This project contains a sample loginActivity app

Tests path:
- Under src/androidTest, package com.example.espresso_loginapp.ui.login.tests

Test suites path:
- Under src/androidTest, package com.example.espresso_loginapp.ui.login.suites

Run tests:
- Open the project in Android Studio. 
- Run tests by clicking the green icon on IDE
- Test path : espresso-java/app/src/androidTest/java/com.example.espresso_loginapp.ui.login/LoginPageTest

Run tests from commandline to view html report: 
- ./gradlew connectedAndroidTest  - : Installs and runs instrumentation tests for all flavors on connected devices.
- Report html is availabe in path "app/build/reports/androidTests/connected/flavors/debugAndroidTest/index.html"

Run tests with tags:

There are 3 tags used: small, medium, large

- **[Small tests](https://developer.android.com/reference/androidx/test/filters/SmallTest) don’t do any I/O at all**, and should run less than 200ms.
- **[Medium tests](https://developer.android.com/reference/androidx/test/filters/MediumTest) can use local files and databases, but not networking**, and should run less than 1000ms.
- **[Large tests](https://developer.android.com/reference/androidx/test/filters/LargeTest) can use everything, including local and remote data**, to test full app integration.

To run with a tag:
- ./gradlew connectedDebugAndroidTest -Pandroid.testInstrumentationRunnerArguments.size=small

To run a test suite:
- ./gradlew connectedDebugAndroidTest -Pandroid.testInstrumentationRunnerArguments.class=com.example.espresso_loginapp.ui.login.suites.sanity  (or the test suite name)


