package com.automation_Zoom_Tooltip_Iframes_Cookies_Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteCookies {

	public WebDriver driver;
	
	@Test
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	}
}
