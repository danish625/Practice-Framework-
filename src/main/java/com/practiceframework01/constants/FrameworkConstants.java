package com.practiceframework01.constants;

public final class FrameworkConstants {
    
	// Made Private  to Prevent from Object Creation
	private FrameworkConstants() {}
	
	private static final String PROJECT_PATH = System.getProperty("user-dir");
	
	public static final String CONFIG_FILE_PATH = PROJECT_PATH +"src/main/resources/config.properties";
	
	public static final String LOG4J_CONFIG_PATH = PROJECT_PATH + "src/main/resources/log";
	
	public static final String DRIVER_FOLDER = PROJECT_PATH + "/driver/";
	
	public static final String REPORT_FOLDER = PROJECT_PATH +"/reports/";
	
	public static final String SCREENSHOT_FOLDER = PROJECT_PATH +"/screenshots/";
	
	public static final String TEST_DATA_FOLDER = PROJECT_PATH +"/testdata/";
	
}
	
