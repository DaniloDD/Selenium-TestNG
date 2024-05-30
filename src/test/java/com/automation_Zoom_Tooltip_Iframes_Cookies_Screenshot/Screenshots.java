package com.automation_Zoom_Tooltip_Iframes_Cookies_Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshots {

	
	public WebDriver driver;
	
	@Test
	public void screenShotExample() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org");
		
		//Step1 : Identify the WebElement which you need to take the screenshot of
		WebElement logo = driver.findElement(By.cssSelector("div.section.where-to"));
		
		//Step2: Using the logo we will call a method known as getScreenshotAs
		File source = logo.getScreenshotAs(OutputType.FILE);
		
		//Step3: Where you want to store the screenshot
		File destination = new File(System.getProperty("user.dir") + "\\test-output\\Screenshots\\openweathermaplogo.png");
		
		//Step4: Copy the source into the destination
		FileHandler.copy(source, destination);
	}
	
	@Test
	public void exampleShaadi() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shaadi.com");
		
		//Step1 : Identify the WebElement which you need to take the screenshot of
		WebElement logo = driver.findElement(By.cssSelector("div.css-19oju5s"));
		
		//Step2: Using the logo we will call a method known as getScreenshotAs
		File source = logo.getScreenshotAs(OutputType.FILE);
		
		//Step3: Where you want to store the screenshot
		File destination = new File(System.getProperty("user.dir") + "\\test-output\\Screenshots\\shaadilogo.png");
		
		//Step4: Copy the source into the destination
		FileHandler.copy(source, destination);
	}

}
