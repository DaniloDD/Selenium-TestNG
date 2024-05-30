package com.automation_Zoom_Tooltip_Iframes_Cookies_Screenshot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZoomIn_ZoomOut {
	//casting in java- Homework
	//javascript

	public WebDriver driver;
	
	@Test
	public void zoominzoomoutExample() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom = '300%' ;");
		
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom = '50%' ;");
		
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom = '100%' ;");
	}
	
}
