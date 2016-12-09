package com.dexmedia.seleniumtest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
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
		File file = new File("src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver = new ChromeDriver();
		File propertyfile = new File(
				"src/test/resources/Execution_Parameters.properties");

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
		homepage HomePage=loginpage.navigatetoapplication(prop.getProperty("URL"));
		PasswordPage passwordpage=HomePage.EnterUserNameEmail(prop.getProperty("User_Name"));
		MailBoxPage mailboxpage=passwordpage.EnterPassword(prop.getProperty("Password"));

		// driver.quit();
	}
}
