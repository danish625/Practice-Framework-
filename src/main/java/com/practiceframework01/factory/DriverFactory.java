package com.practiceframework01.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.practiceframework01.enums.Browser;

public final class DriverFactory {
  private DriverFactory() {  
  }
  
  public static WebDriver createDriver(Browser browser) {
	  switch(browser) {
	      case CHROME:
	    	  return new ChromeDriver();
	    	  
	      case FIREFOX:
	    	 return new FirefoxDriver(); 
	    	 
	      case EDGE:
	    	  return new EdgeDriver();
	    	    
	      default:
	    	  throw new IllegalArgumentException("UnSupported Browser:" + browser);
	  }
  }
}
