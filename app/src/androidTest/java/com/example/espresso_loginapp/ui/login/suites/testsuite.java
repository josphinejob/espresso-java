package com.example.espresso_loginapp.ui.login.suites;
import com.example.espresso_loginapp.ui.login.LoginPageFieldValidation;
import com.example.espresso_loginapp.ui.login.LoginPageTest;

import org.junit.runner.*;
import org.junit.runners.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginPageFieldValidation.class,
        LoginPageTest.class
})

public class testsuite {
}
