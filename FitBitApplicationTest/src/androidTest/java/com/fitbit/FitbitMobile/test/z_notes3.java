package com.fitbit.FitbitMobile.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class z_notes3 extends ActivityInstrumentationTestCase2 {
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
    public z_notes3() throws ClassNotFoundException {
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
        //Sleep for 4016 milliseconds
		solo.sleep(4016);
        //Scroll to 1,414 calories left Start a Food plan GET STARTED
		android.widget.ListView listView0 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
		solo.scrollListToLine(listView0, 4);
        //Click on 1,414 calories left Start a Food plan GET STARTED
		solo.clickOnView(solo.getView("tile_content", 6));
        //Wait for activity: 'com.fitbit.food.ui.landing.FoodLoggingLandingActivity_'
		assertTrue("FoodLoggingLandingActivity_ is not found!", solo.waitForActivity("FoodLoggingLandingActivity_"));
        //Sleep for 2882 milliseconds
		solo.sleep(2882);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("add_item"));
        //Wait for activity: 'com.fitbit.ui.choose.food.ChooseFoodActivity_'
		assertTrue("ChooseFoodActivity_ is not found!", solo.waitForActivity("ChooseFoodActivity_"));
        //Sleep for 1471 milliseconds
		solo.sleep(1471);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("search"));
        //Sleep for 2977 milliseconds
		solo.sleep(2977);
        //Enter the text: 'las'
		solo.clearEditText((android.widget.EditText) solo.getView("search_src_text"));
		solo.enterText((android.widget.EditText) solo.getView("search_src_text"), "las");
        //Sleep for 2937 milliseconds
		solo.sleep(2937);
        //Click on Lasagna Entree 1 serving, 320 calories
		solo.clickInList(1, 0);
        //Wait for activity: 'com.fitbit.food.ui.logging.LogFoodActivity_'
		assertTrue("LogFoodActivity_ is not found!", solo.waitForActivity("LogFoodActivity_"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 2045 milliseconds
		solo.sleep(2045);
        //Set progress on SeekBar
		solo.setProgressBar((android.widget.ProgressBar) solo.getView("seek_bar"), 27116);
        //Sleep for 871 milliseconds
		solo.sleep(871);
        //Set progress on SeekBar
		solo.setProgressBar((android.widget.ProgressBar) solo.getView("seek_bar"), 13471);
        //Sleep for 826 milliseconds
		solo.sleep(826);
        //Set progress on SeekBar
		solo.setProgressBar((android.widget.ProgressBar) solo.getView("seek_bar"), 2354);
        //Sleep for 924 milliseconds
		solo.sleep(924);
        //Set progress on SeekBar
		solo.setProgressBar((android.widget.ProgressBar) solo.getView("seek_bar"), 15030);
        //Sleep for 564 milliseconds
		solo.sleep(564);
        //Set progress on SeekBar
		solo.setProgressBar((android.widget.ProgressBar) solo.getView("seek_bar"), 24311);
	}
}
