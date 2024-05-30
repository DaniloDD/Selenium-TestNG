package com.automation.Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Upload {
	
	public WebDriver driver;
	
	@Test
	public void upload() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=42");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 600)");
		
		Thread.sleep(2000);
		driver.findElement(By.id("button-upload222")).sendKeys("/Users/danilodeiana/Desktop/Screenshot 2024-05-22 at 2.30.09 PM.png");
	}

}

