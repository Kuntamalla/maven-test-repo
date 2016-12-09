package com.dexmedia.pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	protected final WebDriver driver;

	public Login_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub		
		this.driver = driver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
		
	
	@FindBy(id="username") //@FindBy(name="pw") - shorthand
	private WebElement Login_Name;
	@FindBy(id="password") 
	private WebElement password;
	
	public homepage navigatetoapplication(String url){
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		return new homepage(driver);
		
	}

}
