package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class g_food_f_a_logSearchedToday extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public g_food_f_a_logSearchedToday() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation());
        getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }

    public void testRun() {

        solo.waitForActivity("LandingActivity_", 500);

        solo.clickOnText("out");

        solo.waitForActivity("FoodLoggingLandingActivity_");

        solo.clickOnView(solo.getView("add_item"));
        solo.clickOnView(solo.getView("search"));


        solo.enterText(0, "cof");
        solo.clickOnText("Coffee");
        solo.waitForActivity("LogFoodActivity_");

        solo.clearEditText(0);
        solo.enterText(0, "150");


        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("oz");
        solo.clickOnText("85 cals.");

        solo.clickOnView(solo.getView("breakfast_btn"));

        solo.clickOnView(solo.getView("log_this_btn"));


















    }
}
