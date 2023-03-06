// simple tests without using Page Object Model
package com.example.espresso_loginapp.ui.login.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;

import com.example.espresso_loginapp.R;
import com.example.espresso_loginapp.ui.login.LoginActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isNotEnabled;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class LoginPageFieldValidation {
    private static final String validEmail = "user" + System.currentTimeMillis() + "@test.com";
    int loginButtonId = R.id.login;

    @Rule
    public ActivityScenarioRule<LoginActivity> activityTestRule = new ActivityScenarioRule<>(LoginActivity.class);

    @Test
    @MediumTest
    public void verifyLoginButtonDisabledWhenUsernameIsEmpty() {
        onView(withId(R.id.password)).perform(typeText("password"), closeSoftKeyboard());
        onView(withId(loginButtonId)).check(matches(isNotEnabled()));
    }

    @Test
    @MediumTest
    public void verifyLoginButtonDisabledWhenPasswordIsInvalid() {
        onView(withId(R.id.username)).perform(typeText(validEmail));
        onView(withId(R.id.password)).perform(typeText("pass"), closeSoftKeyboard());
        onView(withId(loginButtonId)).check(matches(isNotEnabled()));
    }
}
