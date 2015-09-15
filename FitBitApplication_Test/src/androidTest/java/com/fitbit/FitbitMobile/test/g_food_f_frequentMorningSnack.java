package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class g_food_f_frequentMorningSnack extends ActivityInstrumentationTestCase2 {
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
    public g_food_f_frequentMorningSnack() throws ClassNotFoundException {
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
		solo.waitForActivity("LandingActivity_", 2000);
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
        //sleep - shot
        solo.sleep(2000);
        solo.takeScreenshot("f_frequentMorningSnack_a_dash");
        solo.clickOnText(java.util.regex.Pattern.quote("out"));
        solo.takeScreenshot("f_frequentMorningSnack_b_tapTile");
        //Wait for activity: 'com.fitbit.food.ui.landing.FoodLoggingLandingActivity_'
		assertTrue("FoodLoggingLandingActivity_ is not found!", solo.waitForActivity("FoodLoggingLandingActivity_"));
        //sleep - shot
        solo.sleep(2000);
        solo.takeScreenshot("f_frequentMorningSnack_c_food");
        //Click on +
		solo.clickOnView(solo.getView("add_item"));
        //Wait for activity: 'com.fitbit.ui.choose.food.ChooseFoodActivity_'
		assertTrue("ChooseFoodActivity_ is not found!", solo.waitForActivity("ChooseFoodActivity_"));
        //sleep - shot
        solo.sleep(2000);
        solo.takeScreenshot("f_frequentMorningSnack_d_logFood");

        //Click on top tile
		solo.clickInList(1, 0);
        solo.takeScreenshot("f_frequentMorningSnack_e_tap1onList");
        //Wait for activity: 'com.fitbit.food.ui.logging.LogFoodActivity_'
		assertTrue("LogFoodActivity_ is not found!", solo.waitForActivity("LogFoodActivity_"));
        //sleep - shot
        solo.sleep(2000);
        solo.takeScreenshot("f_frequentMorningSnack_f_addFood");
        //Click on MORNING SNACK
		solo.clickOnView(solo.getView("morning_snack_btn"));
        //sleep - shot
        solo.sleep(2000);
        solo.takeScreenshot("f_frequentMorningSnack_g_morningSnack");
        //Click on LOG THIS
		solo.clickOnView(solo.getView("log_this_btn"));
        //sleep - shot
        solo.sleep(2000);
        solo.takeScreenshot("f_frequentMorningSnack_h_backToFood");


        //Click on ImageView
        solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for x milliseconds
        solo.sleep(2000);
        solo.takeScreenshot("f_frequentMorningSnack_i_backToDash");
	}
}
