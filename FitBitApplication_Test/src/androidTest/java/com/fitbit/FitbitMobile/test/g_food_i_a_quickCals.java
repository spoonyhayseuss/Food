package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class g_food_i_a_quickCals extends ActivityInstrumentationTestCase2 {
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
    public g_food_i_a_quickCals() throws ClassNotFoundException {
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

        assertTrue("FoodLoggingLandingActivity_ is not found!", solo.waitForActivity("FoodLoggingLandingActivity_"));

        solo.clickOnView(solo.getView("add_quick_calories"));
        solo.waitForActivity("QuickCalorieAddActivity_");
        solo.clickOnText("Quick Calorie Add");
        solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));



    }
}
