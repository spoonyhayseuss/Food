package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class g_food_j_c_logCustomPast extends ActivityInstrumentationTestCase2 {
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
    public g_food_j_c_logCustomPast() throws ClassNotFoundException {
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
        //Wait for activity: 'com.fitbit.onboarding.landing.LandingActivity_'
        solo.waitForActivity("LandingActivity_", 500);

        solo.clickOnText("out");
        //Wait for activity: 'com.fitbit.food.ui.landing.FoodLoggingLandingActivity_'
        solo.waitForActivity("FoodLoggingLandingActivity_");

        solo.clickOnView(solo.getView("add_item"));
        solo.clickOnText("CUSTOM");


        solo.sleep(1000);
        solo.clickInList(2, 1);

        //solo.clickOnText("Super Duper");


        solo.clickOnView(solo.getView("lunch_btn"));

        solo.clickOnView(solo.getView("txt_date"));

        solo.setDatePicker(0, 2015, 7, 17);
        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.clickOnView(solo.getView("log_this_btn"));



    }
}
