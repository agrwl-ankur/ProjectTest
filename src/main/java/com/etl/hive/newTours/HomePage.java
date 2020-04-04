package com.etl.hive.newTours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import www.etl.hive.utilities.CommonUtils;

public class HomePage extends CommonUtils {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "SIGN-ON")
	WebElement signon;
	@FindBy(linkText = "REGISTER")
	WebElement register;
	@FindBy(linkText = "SUPPORT")
	WebElement support;
	@FindBy(linkText = "CONTACT")
	WebElement contact;
	
	
	public boolean clickonRegister() {
		return (clickSafelyOn(register));

	}

	public boolean clickonSignOn() {
		return (clickSafelyOn(signon));

	}

	public void clickonSupport() {
		clickSafelyOn(support);

	}

	public void clickonContact() {
		clickSafelyOn(contact);

	}

}
