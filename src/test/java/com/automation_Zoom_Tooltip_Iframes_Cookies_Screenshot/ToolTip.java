package com.automation_Zoom_Tooltip_Iframes_Cookies_Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToolTip {
	
	public WebDriver driver;
	
	//determine the tool tip of these WebElements
	@Test
	public void extractingToolTipOfAWebElement() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		WebElement moneyLink = driver.findElement(By.linkText("Money"));
		String toolTip = moneyLink.getAttribute("title");
		System.out.println("The tool tip of money link is : " + toolTip);
		
		WebElement createAccountLink = driver.findElement(By.linkText("Create Account"));
		String toolTip1 = createAccountLink.getAttribute("title");
		System.out.println("The tool tip of Create Account link is : " + toolTip1);
	}

}
