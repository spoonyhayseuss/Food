package com.fitbit.FitbitMobile.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class z_notes extends ActivityInstrumentationTestCase2 {
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
    public z_notes() throws ClassNotFoundException {
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
        //Sleep for 5779 milliseconds
		solo.sleep(5779);
        //Scroll to 1,617 calories left Start a Food plan GET STARTED
		android.widget.ListView listView0 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
		solo.scrollListToLine(listView0, 4);
        //Click on 1,617 calories left Start a Food plan GET STARTED
		solo.clickOnView(solo.getView("tile_content", 6));
        //Wait for activity: 'com.fitbit.food.ui.landing.FoodLoggingLandingActivity_'
		assertTrue("FoodLoggingLandingActivity_ is not found!", solo.waitForActivity("FoodLoggingLandingActivity_"));
        //Sleep for 18351 milliseconds
		solo.sleep(18351);
        //Click on UNDER BUDGET 0 cals. in   1,305 cals. out 1,617 calories left in your budget
		solo.clickOnText(java.util.regex.Pattern.quote("UNDER BUDGET"));
        //Sleep for 5401 milliseconds
		solo.sleep(5401);
        //Click on UNDER BUDGET 0 cals. in   1,305 cals. out 1,617 calories left in your budget
		solo.clickOnText(java.util.regex.Pattern.quote("UNDER BUDGET"));
        //Sleep for 947 milliseconds
		solo.sleep(947);
        //Click on UNDER BUDGET 0 cals. in   1,305 cals. out 1,617 calories left in your budget
		solo.clickOnText(java.util.regex.Pattern.quote("UNDER BUDGET"));
        //Sleep for 4192 milliseconds
		solo.sleep(4192);
        //Click on Today, Aug. 27
		solo.clickOnText(java.util.regex.Pattern.quote("Today, Aug. 27"));
        //Sleep for 5989 milliseconds
		solo.sleep(5989);
        //Click on In Zone
		solo.clickOnView(solo.getView("title"));
        //Sleep for 2474 milliseconds
		solo.sleep(2474);
        //Click on Under
		solo.clickOnView(solo.getView("title", 1));
	}
}
