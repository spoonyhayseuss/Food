package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class g_food_i_g_quickCals_deleteQuickCals extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity_";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public g_food_i_g_quickCals_deleteQuickCals() throws ClassNotFoundException {
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

        solo.sleep(2000);

        solo.clickLongOnText("Quick Calories");

        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.clickLongOnText("Quick Calories");

        solo.clickOnView(solo.getView(android.R.id.button1));





    }
}