package com.automation.Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Encapsulation_WebElement_Homepage {

	public WebDriver driver;

	// i want to hide my WebElement

	@FindBy(linkText = "My Account")
	private WebElement myAccountDropdown; // i am hiding this webelement
	
	@FindBy(linkText = "Login")
	private WebElement loginDropdown;

	// we need the constructor to initialize our element - data setup
	public Encapsulation_WebElement_Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	// data get - perform an action
	public void clickOnMyAccountDropdown() {
		myAccountDropdown.click();
	}
	
	public void clickOnLogin() {
		loginDropdown.click();
	}

}
