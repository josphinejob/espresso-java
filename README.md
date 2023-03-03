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

Run tests:
- Open the project in Android Studio. 
- Run tests by clicking the green icon on IDE
- Test path : espresso-java/app/src/androidTest/java/com.example.espresso_loginapp.ui.login/LoginPageTest
