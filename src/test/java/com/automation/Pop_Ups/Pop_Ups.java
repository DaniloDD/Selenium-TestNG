package com.automation.Pop_Ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pop_Ups {

	public WebDriver driver;
	
	@Test
	public void handlingPopUps() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		// pass from the control to the alert window
		// we have to use the interface alert and get it from our driver wioth this method
		Alert alert = driver.switchTo().alert();
		System.out.println("--------- " + alert.getText() + " ---------");
		alert.accept();			// click on ok
		// alert.dismiss();		--> used if there is a close button (x)
		
	}
}
