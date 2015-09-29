package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class g_food_d_f_logFood_actionSearchCreate_detailed extends ActivityInstrumentationTestCase2 {
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
    public g_food_d_f_logFood_actionSearchCreate_detailed() throws ClassNotFoundException {
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
        solo.clickOnView(solo.getView("search"));


        solo.enterText(0, "porky's pizza");
        solo.clickOnText("Create");
        //solo.waitForActivity("LogFoodActivity_");

        //searched shows as food name
        solo.clickOnText("porky's pizza");

        //edit Food Name
        solo.clearEditText(0);
        solo.enterText(0, "Pepperoni");

        //enter Brand
        solo.clearEditText(1);
        solo.enterText(1, "Porky's Pizza");

        //serving size - edit size
        solo.clearEditText(2);
        solo.enterText(2, "2");

        //serving type
        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("bar");


        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("bottle");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("box");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("can");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("container");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("cube");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("cup");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("fl oz");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("gram");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("jar");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("kg");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("large");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("lb");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("liter");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("medium");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("milligram");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("ml");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("oz");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("package");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("piece");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("pint");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("quart");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("scoop");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("serving");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("slice");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("small");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("stick");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("tblsp");

        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("tsp");


        solo.clickOnView(solo.getView("serving_size_spinner"));
        solo.clickOnText("slice");


        //edit calories
        solo.enterText(3, "459");

        //calories from fat
        solo.enterText(4, "98");

        //switch to detailed
        solo.clickOnText("Simplified View");

        //total fat
        solo.enterText(5, "25");

        //saturated fat
        solo.enterText(6, "17");

        //trans-fat
        solo.enterText(7, "15");

        //cholesterol
        solo.enterText(8, "45");

        //sodium
        solo.enterText(9, "76");

        //potassium
        solo.enterText(10, "98");


        solo.clickOnText("Protein");

        //total carbs
        solo.enterText(6, "35");

        //dietary fiber
        solo.enterText(7, "10");

        //sugars
        solo.enterText(8, "7");

        //protein
        solo.enterText(9, "87");

        solo.clickOnText("SAVE CUSTOM FOOD");


    }
}
