package com.automation.Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Encapsulation_TestCase {

	public WebDriver driver;
	
	@Test
	public void validCredentials() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		// hiding our webelement for the my account dropdown
		Encapsulation_WebElement_Homepage homepage = new Encapsulation_WebElement_Homepage(driver);
		homepage.clickOnMyAccountDropdown();
		homepage.clickOnLogin();
		
		Thread.sleep(2000);
		Encapsulation_Webelement_LoginPage loginPage = new Encapsulation_Webelement_LoginPage(driver);
		loginPage.enterEmail("seleniumpanda@gmail.com");
		loginPage.enterPassword("Selenium@123");
		loginPage.clickOnLoginButton();
		
	}
}
