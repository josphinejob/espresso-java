// Tests using Page Object model
package com.example.espresso_loginapp.ui.login.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.filters.SmallTest;

import com.example.espresso_loginapp.ui.login.LoginActivity;
import com.example.espresso_loginapp.ui.login.pages.LoginPage;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;



@RunWith(AndroidJUnit4.class)
public class LoginPageTest {
    LoginPage loginPage = new LoginPage();

    @Rule
    public ActivityScenarioRule<LoginActivity> activityTestRule = new ActivityScenarioRule<>(LoginActivity.class);

    @Test
    @SmallTest
    public void verifyLoginPageUI() {
        loginPage.verifyLoginPageTitleDisplayed()
                .verifyUserNameFieldDisplayed()
                .verifyPasswordFieldDisplayed()
                .verifyLoginButtonDisplayed();
    }

    @Test
    @LargeTest
    public void verifyValidLogin() {
        loginPage.verifyLoginPageTitleDisplayed();
        loginPage.typeValidEmail();
        loginPage.typePassword();
        loginPage.tapLoginButton();
    }
}
