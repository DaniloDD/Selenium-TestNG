package com.automation.Xml_Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Xml_Parameters_Login {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	@Parameters({"url", "email", "password"})
	public void loginWithParameters(String url, String email, String password) {
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}

}