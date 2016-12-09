package com.dexmedia.seleniumtest;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;



import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.dexmedia.pages.Login_Page;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Logintest {
	private WebDriver driver;       
	//public Properties prop;
	Properties prop = new Properties();
  
	  @BeforeClass  
	  public void setUp() throws Exception {    
//		  File file = new File("src/test/resources/IEDriverServer.exe");
//		  System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
//	  
//	   // DesiredCapabilities caps = DesiredCapabilities.internetExplorer();    
//	   // caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);    
//	    driver = new InternetExplorerDriver();
		  
		  driver = new WebDriverFactory().getDriver();

	    
		  File propertyfile = new File("src/test/resources/Execution_Parameters.properties");
		  
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(propertyfile);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
			
			//load properties file
			try {
				prop.load(fileInput);
				System.out.println("test");
			} catch (IOException e) {
				e.printStackTrace();
			}
			

	  }
	  
	  @Test     
	 // @Parameters("Environment")
	  public void testbookie() throws Exception {    
		    //prop.load(Logintest.class.getResourceAsStream("/"+"Execution_Parameters"));
		  Login_Page loginpage= new Login_Page(driver);
		  System.out.println(prop.getProperty("Name"));
		  //loginpage.navigatetoapplication(prop.getProperty("Name"), prop.getProperty("Password"));
		
	  //  driver.quit();
	 }
}
