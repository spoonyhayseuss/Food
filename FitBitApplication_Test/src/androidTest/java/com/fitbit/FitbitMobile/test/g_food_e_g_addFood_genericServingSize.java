package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class g_food_e_g_addFood_genericServingSize extends ActivityInstrumentationTestCase2 {
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
    public g_food_e_g_addFood_genericServingSize() throws ClassNotFoundException {
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

        solo.clearEditText(0);
        solo.enterText(0, "1.5");


        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("entree");
        solo.clickOnText("375 cals.");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("grams");
        solo.clickOnText("2 cals.");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("kg");
        solo.clickOnText("2,343 cals.");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("lbs");
        solo.clickOnText("1,063 cals.");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("meals");
        solo.clickOnText("510 cals.");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("oz");
        solo.clickOnText("66 cals.");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("servings");
        solo.clickOnText("480 cals.");

















    }
}
