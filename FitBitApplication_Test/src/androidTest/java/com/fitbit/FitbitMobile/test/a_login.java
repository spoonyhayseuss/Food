package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class a_login extends ActivityInstrumentationTestCase2 {
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
    public a_login() throws ClassNotFoundException {
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

        //Click on Log in
		solo.clickOnView(solo.getView("btn_log_in"));
        //Wait for activity: 'com.fitbit.onboarding.login.LoginActivity'
		assertTrue("LoginActivity is not found!", solo.waitForActivity("LoginActivity"));


		solo.clearEditText(0);
		solo.enterText(0, "w");
		solo.enterText(0, "e");
		solo.enterText(0, "l");
		solo.enterText(0, "l");
		solo.enterText(0, "n");
		solo.enterText(0, "e");
		solo.enterText(0, "s");
		solo.enterText(0, "s");
		solo.enterText(0, "@");
		solo.enterText(0, "a");
		solo.enterText(0, "n");
		solo.enterText(0, "d");
		solo.enterText(0, "r");
		solo.enterText(0, "o");
		solo.enterText(0, "i");
		solo.enterText(0, "d");
		solo.enterText(0, ".");
		solo.enterText(0, "c");
		solo.enterText(0, "o");
		solo.enterText(0, "m");


		solo.enterText(1, "w");
		solo.enterText(1, "e");
		solo.enterText(1, "l");
		solo.enterText(1, "l");
		solo.enterText(1, "n");
		solo.enterText(1, "e");
		solo.enterText(1, "s");
		solo.enterText(1, "s");


		//Click on Log in
		solo.clickOnView(solo.getView("login_button"));
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));

	}
}
