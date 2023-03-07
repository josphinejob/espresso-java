package com.example.espresso_loginapp.ui.login.pages;

import com.example.espresso_loginapp.R;
import com.example.espresso_loginapp.ui.login.pages.helpers.ConfigReaderPage;

import java.io.IOException;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isNotEnabled;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class LoginPage {
    ConfigReaderPage configPage = new ConfigReaderPage();
    private static final String loginPageTitle = "Espresso-LoginApp";
    private static final String validEmail = "user" + System.currentTimeMillis() + "@test.com";
    int loginButtonId = R.id.login;
    int passwordId = R.id.password;
    int userNameId = R.id.username;

    public LoginPage verifyLoginPageTitleDisplayed() {
        onView(withText(loginPageTitle)).check(matches(isDisplayed()));
        return this;
    }

    public LoginPage verifyUserNameFieldDisplayed() {
        onView(withId(userNameId)).check(matches(isDisplayed()));
        return this;
    }

    public LoginPage verifyPasswordFieldDisplayed() {
        onView(withId(passwordId)).check(matches(isDisplayed()));
        onView(withId(loginButtonId)).check(matches(isDisplayed()));
        return this;
    }

    public LoginPage verifyLoginButtonDisplayed() {
        onView(withId(loginButtonId)).check(matches(isDisplayed()));
        return this;
    }

    public void typeValidEmail() {
        onView(withId(userNameId)).perform(typeText(validEmail));
    }

    public void typePassword() {
        onView(withId(R.id.password)).perform(typeText("password"), closeSoftKeyboard());
    }

    public void tapLoginButton() {
        onView(withId(loginButtonId)).perform(click());
    }

    public void verifyLoginButtonNotEnabled() {
        onView(withId(loginButtonId)).check(matches(isNotEnabled()));
    }

    public void inputPassword(String configItemName) throws IOException {
        onView(withId(passwordId)).perform(typeText(configPage.getPropertyFromConfigFile(configItemName)), closeSoftKeyboard());
    }

    public void inputEmail(String configItemName) throws IOException {
        onView(withId(userNameId)).perform(typeText(configPage.getPropertyFromConfigFile(configItemName)), closeSoftKeyboard());
    }
}
