package com.dexmedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	protected final WebDriver driver;

	public homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='gmail-sign-in']")
	// @FindBy(name="pw") - shorthand
	private WebElement Sigin_Link;
	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "Email")
	private WebElement UserName;

	@FindBy(id = "next")
	private WebElement Next_Button;

	public signinpage gmailsigninlinkclick() {

		try {
			Sigin_Link.click();
		}

		catch (Exception e) {
			System.out.println(e);
		}

		return new signinpage(driver);

	}

	public PasswordPage EnterUserNameEmail(String User_Name) {

		try {
			UserName.sendKeys(User_Name);
			Next_Button.click();

		} catch (Exception e) {

		}

		return new PasswordPage(driver);
	}

}
