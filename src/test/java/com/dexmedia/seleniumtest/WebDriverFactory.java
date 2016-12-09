package com.dexmedia.seleniumtest;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
	
	private WebDriver driver;       


	public WebDriverFactory() {	

		
	}
	
	
	public WebDriver getDriver() {
		
		  File file = new File("src/test/resources/IEDriverServer.exe");
		  System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
	  
	   // DesiredCapabilities caps = DesiredCapabilities.internetExplorer();    
	   // caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);    
	    return driver = new InternetExplorerDriver();
		
	}

}
