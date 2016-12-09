package com.dexmedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage {
	protected final WebDriver driver;
	public PasswordPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="Passwd")
	private WebElement Password;
	@FindBy(id="signIn")
	private WebElement Sign_In;
	
	
	public MailBoxPage EnterPassword(String password){		
		Password.sendKeys(password);
		Sign_In.click();
		return new MailBoxPage(driver);
	}
	
	
	
}
