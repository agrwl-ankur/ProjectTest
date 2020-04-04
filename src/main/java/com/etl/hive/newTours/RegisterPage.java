package com.etl.hive.newTours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import www.etl.hive.utilities.CommonUtils;

public class RegisterPage extends CommonUtils{
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="firstName") WebElement fn;
	@FindBy(name="lastName") WebElement ln;
	@FindBy(name="country") WebElement countrydd;
	
	public boolean enterFirstName() {
		return(enterSafelyIn(fn, "Ankur"));
	}
	
	public boolean enterLastName() {
		return(enterSafelyIn(ln, "Agrawal"));
	}
	
	public boolean selectCountry(){
		return(selectFromDropdown(countrydd, "INDIA "));
		
	}
	
}
