package com.automation_ChromeOptions;

import java.util.Arrays;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeOptionsLogin {

	public WebDriver driver;
	public ChromeOptions options;
	
	@Test
	public void loginTN() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		// options.addArguments("--headless"); 		--> to run without opening the window
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));		// tp disable the notice bar that chrome is runned by an automated way
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
		
	}
	
	@Test
	public void headlessMode() {
		options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
	}
}
