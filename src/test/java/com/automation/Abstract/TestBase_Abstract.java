package com.automation.Abstract;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestBase_Abstract {

	public WebDriver driver;
	public ChromeOptions options;
	
	public WebDriver initializeBrowserAndOpenApplication(String browserName) {
		if(browserName.equals("chrome")) {
			options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
		}
		else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		else if (browserName.equals("safari")) {
			driver = new SafariDriver();
		}
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
}
