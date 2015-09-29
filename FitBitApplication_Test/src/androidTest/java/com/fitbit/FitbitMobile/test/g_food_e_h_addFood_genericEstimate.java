package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class g_food_e_h_addFood_genericEstimate extends ActivityInstrumentationTestCase2 {
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
    public g_food_e_h_addFood_genericEstimate() throws ClassNotFoundException {
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


        solo.enterText(0, "lasag");
        solo.clickOnText("Lasagna Entree");
        solo.waitForActivity("LogFoodActivity_");

        solo.clickOnText("Low cal");
        solo.clickOnText("Most common");
        solo.clickOnText("High cal");

        solo.setProgressBar((android.widget.ProgressBar) solo.getView("seek_bar"), 27116);

        //Set progress on SeekBar
        solo.setProgressBar((android.widget.ProgressBar) solo.getView("seek_bar"), 13471);

        //Set progress on SeekBar
        solo.setProgressBar((android.widget.ProgressBar) solo.getView("seek_bar"), 2354);

        //Set progress on SeekBar
        solo.setProgressBar((android.widget.ProgressBar) solo.getView("seek_bar"), 15030);

        //Set progress on SeekBar
        solo.setProgressBar((android.widget.ProgressBar) solo.getView("seek_bar"), 24311);
















    }
}
