package com.automation.Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Encapsulation_Webelement_LoginPage {

	public WebDriver driver;
	
	// private elements
	@FindBy (id = "input-email")
	private WebElement myEmail;
	
	@FindBy (id = "input-password") 
	private WebElement myPassword;
	
	@FindBy (css = "input.btn.btn-primary")
	private WebElement loginButton;
	
	
	// data setup
	public Encapsulation_Webelement_LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);			// selenium class that initialize my data using the input and local drivers
	}
	
	public void enterEmail(String email) {
		myEmail.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		myPassword.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
}
