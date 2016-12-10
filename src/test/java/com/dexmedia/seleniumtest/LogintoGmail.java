package com.dexmedia.seleniumtest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.dexmedia.pages.Login_Page;
import com.dexmedia.pages.MailBoxPage;
import com.dexmedia.pages.PasswordPage;
import com.dexmedia.pages.homepage;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class LogintoGmail {
	private WebDriver driver;
	// public Properties prop;
	Properties prop = new Properties();

	@BeforeClass
	public void setUp() throws Exception {
		System.out.println("Browser initiating");
		File file = new File("src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		System.out.println("After Browser initiating");
		
		driver = new ChromeDriver();
		System.out.println("Chrome Driver Called");
		
		Thread.sleep(5000);
		//driver = new FirefoxDriver();
		File propertyfile = new File(
				"src/test/resources/Execution_Parameters.properties");
		System.out.println("Property file called");

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(propertyfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// load properties file
		try {
			prop.load(fileInput);		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	// @Parameters("Environment")
	public void testbookie() throws Exception {
		// prop.load(Logintest.class.getResourceAsStream("/"+"Execution_Parameters"));
		Login_Page loginpage = new Login_Page(driver);
		//homepage HomePage=loginpage.navigatetoapplication(prop.getProperty("URL"));
		homepage HomePage=loginpage.navigatetoapplication("http://www.gmail.com");

		//PasswordPage passwordpage=HomePage.EnterUserNameEmail(prop.getProperty("User_Name"));
		PasswordPage passwordpage=HomePage.EnterUserNameEmail("shirishakuntamalla@gmail.com");
		//MailBoxPage mailboxpage=passwordpage.EnterPassword(prop.getProperty("Password"));
		MailBoxPage mailboxpage=passwordpage.EnterPassword("Jijastic@1");


		// driver.quit();
	}
}
