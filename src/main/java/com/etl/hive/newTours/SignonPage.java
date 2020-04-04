package com.etl.hive.newTours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import www.etl.hive.utilities.CommonUtils;

public class SignonPage extends CommonUtils{
	WebDriver driver;
	public SignonPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Find elements on SignonPage 
	@FindBy(name ="userName") WebElement userName;
	@FindBy(name ="password") WebElement password;
	@FindBy(name ="login") WebElement submit;
	
	public boolean enterUsername() {
		return(enterSafelyIn(userName,"ankureuthenics0789@gmail.com"));
	}
	
	public boolean enterPassword() {
		return(enterSafelyIn(password,"acbdefg"));
	}
	
	public boolean signon_submit() {
		return(clickSafelyOn(submit));
	}
}
