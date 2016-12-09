package com.dexmedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MailBoxPage {
	protected final WebDriver driver;
	
	public MailBoxPage(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

}
