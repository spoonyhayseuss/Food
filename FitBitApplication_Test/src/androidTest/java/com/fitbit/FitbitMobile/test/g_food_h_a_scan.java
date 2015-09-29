package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class g_food_h_a_scan extends ActivityInstrumentationTestCase2 {
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
    public g_food_h_a_scan() throws ClassNotFoundException {
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

		solo.waitForActivity("LandingActivity_", 2000);



        solo.clickOnText(java.util.regex.Pattern.quote("out"));

		assertTrue("FoodLoggingLandingActivity_ is not found!", solo.waitForActivity("FoodLoggingLandingActivity_"));

		solo.clickOnView(solo.getView("start_barcode_scanner"));
        solo.waitForActivity("BarcodeScannerActivity_");

        solo.sleep(1000);


        solo.goBack();


	}
}
