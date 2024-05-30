package com.automation.Scanner_Include_Exclude;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class Search {

	public WebDriver driver;
	public ChromeOptions options;
	
	
	@BeforeMethod
	public void setup() {
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-Maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
	}
	
	@Test
	public void validSearchTN() {
		System.out.println("Ciao");
	}
	
	@Test
	public void invalidSearchTN() {
		System.out.println("Ciao");
	}
	@Test
	public void emptySearchTN() {
		System.out.println("Ciao");
	}
	
	
	@AfterMethod
	public void tearDown() {
		
	}
}
