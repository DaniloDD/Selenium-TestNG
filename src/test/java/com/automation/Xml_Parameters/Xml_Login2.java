package com.automation.Xml_Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Xml_Login2 {

	public WebDriver driver;
	public ChromeOptions options;
	
	
	@BeforeMethod
	public void setup() {
	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	driver = new ChromeDriver(options);
	}
	
	
	@Test
	@Parameters ({"url", "email", "password"})
	public void login(String url, String email, String password) {
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary"));
	}
	
}
