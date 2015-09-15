package com.fitbit.FitbitMobile.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class z_notes4 extends ActivityInstrumentationTestCase2 {
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
    public z_notes4() throws ClassNotFoundException {
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
        //Sleep for 4146 milliseconds
		solo.sleep(4146);
        //Scroll to No sleep logged 4 in / 1,009 out You are under budget
		android.widget.ListView listView0 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
		solo.scrollListToLine(listView0, 4);
        //Click on No sleep logged 4 in / 1,009 out You are under budget
		solo.clickOnView(solo.getView("tile_content", 5));
        //Wait for activity: 'com.fitbit.food.ui.landing.FoodLoggingLandingActivity_'
		assertTrue("FoodLoggingLandingActivity_ is not found!", solo.waitForActivity("FoodLoggingLandingActivity_"));
        //Sleep for 1378 milliseconds
		solo.sleep(1378);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("add_item"));
        //Wait for activity: 'com.fitbit.ui.choose.food.ChooseFoodActivity_'
		assertTrue("ChooseFoodActivity_ is not found!", solo.waitForActivity("ChooseFoodActivity_"));
        //Sleep for 1963 milliseconds
		solo.sleep(1963);
        //Click on RECENT
		solo.clickOnText(java.util.regex.Pattern.quote("RECENT"));
        //Sleep for 2871 milliseconds
		solo.sleep(2871);
        //Click on Coffee 100 grams, 2 cals
		solo.clickInList(2, 1);
        //Wait for activity: 'com.fitbit.food.ui.logging.LogFoodActivity_'
		assertTrue("LogFoodActivity_ is not found!", solo.waitForActivity("LogFoodActivity_"));
	}
}
