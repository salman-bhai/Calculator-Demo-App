package com.example.salman.calculatordemoapp;

import android.support.test.rule.ActivityTestRule;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by salman on 18/7/17.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {

    private String inp1;
    private String inp2;
    private String output_add;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void init() {
        // Specify a valid string.
        inp1 = "8";
        inp2 = "4";
        output_add = "12.0";
    }

    @Test
    public void checkAddition() {
        // Type text and then press the button.
        onView(withId(R.id.input1))
                .perform(typeText(inp1), closeSoftKeyboard());
        onView(withId(R.id.input2))
                .perform(typeText(inp2), closeSoftKeyboard());

        onView(withId(R.id.add)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.result))
                .check(matches(withText(output_add)));
    }
}