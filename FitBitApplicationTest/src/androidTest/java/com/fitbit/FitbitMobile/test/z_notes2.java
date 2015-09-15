package com.fitbit.FitbitMobile.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class z_notes2 extends ActivityInstrumentationTestCase2 {
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
    public z_notes2() throws ClassNotFoundException {
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
        //Sleep for 14519 milliseconds
		solo.sleep(14519);
        //Scroll to 1,587 calories left Start a Food plan GET STARTED
		android.widget.ListView listView0 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
		solo.scrollListToLine(listView0, 4);
        //Click on 1,587 calories left Start a Food plan GET STARTED
		solo.clickOnView(solo.getView("tile_content", 6));
        //Wait for activity: 'com.fitbit.food.ui.landing.FoodLoggingLandingActivity_'
		assertTrue("FoodLoggingLandingActivity_ is not found!", solo.waitForActivity("FoodLoggingLandingActivity_"));
        //Sleep for 1928 milliseconds
		solo.sleep(1928);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("add_item"));
        //Wait for activity: 'com.fitbit.ui.choose.food.ChooseFoodActivity_'
		assertTrue("ChooseFoodActivity_ is not found!", solo.waitForActivity("ChooseFoodActivity_"));
        //Sleep for 6433 milliseconds
		solo.sleep(6433);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("search"));
        //Sleep for 5988 milliseconds
		solo.sleep(5988);
        //Enter the text: 'cof'
		solo.clearEditText((android.widget.EditText) solo.getView("search_src_text"));
		solo.enterText((android.widget.EditText) solo.getView("search_src_text"), "cof");
        //Sleep for 1599 milliseconds
		solo.sleep(1599);
        //Click on Coffee 100 grams, 2 calories
		solo.clickInList(1, 0);
        //Wait for activity: 'com.fitbit.food.ui.logging.LogFoodActivity_'
		assertTrue("LogFoodActivity_ is not found!", solo.waitForActivity("LogFoodActivity_"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 2454 milliseconds
		solo.sleep(2454);
        //Click on grams
		solo.clickOnView(solo.getView("serving_size_spinner"));
        //Sleep for 825 milliseconds
		solo.sleep(825);
        //Click on grams
		solo.clickOnView(solo.getView("serving_size_spinner"));
        //Sleep for 1642 milliseconds
		solo.sleep(1642);
        //Click on kg
		solo.clickOnView(solo.getView(android.R.id.text1, 1));
        //Sleep for 3398 milliseconds
		solo.sleep(3398);
        //Click on ANYTIME
		solo.clickOnView(solo.getView("anytime_btn"));
        //Sleep for 935 milliseconds
		solo.sleep(935);
        //Click on AFTERNOON SNACK
		solo.clickOnView(solo.getView("afternoon_snack_btn"));
        //Sleep for 1653 milliseconds
		solo.sleep(1653);
        //Click on DINNER
		solo.clickOnView(solo.getView("dinner_btn"));
        //Sleep for 1835 milliseconds
		solo.sleep(1835);
        //Click on Aug 27, 2015
		solo.clickOnView(solo.getView("txt_date"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 3032 milliseconds
		solo.sleep(3032);
        //Click on OK
		solo.clickOnView(solo.getView(android.R.id.button1));
        //Sleep for 10065 milliseconds
		solo.sleep(10065);
        //Click on LOG & ADD MORE
		solo.clickOnView(solo.getView("log_and_add_more_btn"));
        //Wait for activity: 'com.fitbit.ui.choose.food.ChooseFoodActivity_'
		assertTrue("ChooseFoodActivity_ is not found!", solo.waitForActivity("ChooseFoodActivity_"));
        //Sleep for 1146 milliseconds
		solo.sleep(1146);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 1937 milliseconds
		solo.sleep(1937);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
	}
}
