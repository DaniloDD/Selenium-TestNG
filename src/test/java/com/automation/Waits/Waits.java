package com.automation.Waits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Waits {

	public WebDriverWait wait;
	public WebDriver driver;
	public SoftAssert softassert;
	public ChromeOptions options;
	

	@BeforeMethod
	public void setup() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
		
	}
	
	// with implicit wait
		@Test
		public void loginWithValidCredentials() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // timeouts().pageLoadTimeout(Duration.ofSeconds(10))
																				// timeouts().scriptTimeout(Duration.ofSeconds(100))
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		}

		// with explicit wait: there are 2 types
		@Test
		public void loginWithValidCredentials2() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(5000);			// 1. it is the most powerful wait but it should be used only when required specifically
			driver.findElement(By.linkText("My Account")).click();
			// 2. more used than the precedent
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Login")))).click();
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-email")))).sendKeys("seleniumpanda@gmail.com");
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-password")))).sendKeys("Selenium@123");
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("input.btn.btn-primary")))).click();
			Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		}
}
