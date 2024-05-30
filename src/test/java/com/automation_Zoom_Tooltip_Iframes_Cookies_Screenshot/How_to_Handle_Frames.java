package com.automation_Zoom_Tooltip_Iframes_Cookies_Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class How_to_Handle_Frames {
	
	//frame - html elements
	
	//html page is embedded within another html page
	
	//you might have to locate a WebElement which is present inside the [inner embedded html]
	
	//Example: Polo T Shirt inside a shirt. And your phone is in the chest pocket of that polo T shirt
	
	//saucedemo - which one is the outside shirt
	//            which one is the inner polo ?
	
	public WebDriver driver;
	
	@Test
	public void handlingFrames() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame"); //original webpage
		
		//iframes are mostly identified by
		//1. index
		//2. name or id
		//3. WebElement
		
		driver.switchTo().frame("globalSqa");
		driver.findElement(By.id("mobile_menu_toggler")).click();
		
	}
	
	

}
