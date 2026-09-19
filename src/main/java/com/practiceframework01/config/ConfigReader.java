package com.practiceframework01.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.practiceframework01.constants.FrameworkConstants;

public final class ConfigReader {
    private static ConfigReader instance;
    private final Properties properties;
    
    private ConfigReader() {
    	properties = new Properties();
    	
    	try (FileInputStream fis = new FileInputStream(FrameworkConstants.CONFIG_FILE_PATH)){
    		properties.load(fis);
    	}
    	catch(IOException e) {
    		throw new RuntimeException("Unable to Load Config.properties",e);
    	}
    	
    }
    
    public static ConfigReader getInstance() {
    	if(instance ==null) {
    		instance = new ConfigReader();
    	}
    	return instance;
    }
    
    public String getProperty(String key) {
    	return properties.getProperty(key);
    }
}
