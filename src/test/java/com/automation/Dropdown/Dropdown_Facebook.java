package com.automation.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dropdown_Facebook {

	public WebDriver driver;
	public ChromeOptions options;
	public Select select;
	
	@BeforeMethod
	public void setup() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
	}
	
	
	@Test
	public void facebookDropdown() {
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Dani");
		driver.findElement(By.name("lastname")).sendKeys("Dei");
		driver.findElement(By.name("reg_email__")).sendKeys("54335434");
		driver.findElement(By.name("reg_passwd__")).sendKeys("ciao");
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jan");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByValue("2");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1990");
		
		
		
		
		
		
		
	}
	
}
