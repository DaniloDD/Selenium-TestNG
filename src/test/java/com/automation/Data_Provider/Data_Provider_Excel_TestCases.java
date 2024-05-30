package com.automation.Data_Provider;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Data_Provider_Excel_TestCases {
	
	public WebDriver driver;
	public Date date;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:tutorialsninja.com/demo");
	}
	
	@Test (priority = 2, dataProvider = "LOGINTN", dataProviderClass = Data_Provider_Excel.class)
	public void login(String email, String password) {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	
	@Test (priority = 1, dataProvider = "REGISTERTN", dataProviderClass = Data_Provider_Excel.class)
	public void registerTn(String firstname, String lastname, String telephone, String password, String confirm) {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(dateTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(confirm);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	public String dateTimeStamp() {
		date = new Date();
		String dateStamp =  date.toString().replace(" ", "_").replace(":", "_") ;
		return "seleniumpanda" + dateStamp + "@gmail.com";
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
