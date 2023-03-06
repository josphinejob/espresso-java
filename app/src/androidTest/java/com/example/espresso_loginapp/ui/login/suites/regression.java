package com.example.espresso_loginapp.ui.login.suites;

import com.example.espresso_loginapp.ui.login.tests.LoginPageFieldValidation;
import com.example.espresso_loginapp.ui.login.tests.LoginPageTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginPageFieldValidation.class,
        LoginPageTest.class
})

public class regression {
}
