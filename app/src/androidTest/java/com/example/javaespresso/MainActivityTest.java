package com.example.javaespresso;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;
// Created by Arif Ikhsanudin on 9/3/2019.

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void listGoesOverTheFold() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void buttonIsTouched() {
        onView(withId(R.id.btn_touch)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_touch)).check(matches(isClickable()));
        onView(withId(R.id.btn_touch)).perform(click());
    }

    @Test
    public void testEditText() {
        onView(withId(R.id.et_hello)).perform(typeText("Hello world"));
    }
}