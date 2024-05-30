package com.automation.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Looping_Dropdown {
	public WebDriver driver;

	@Test
	public void easeMyTrip() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easemytrip.com");

		// PreSelection = 1 traveler
		// PostSelection = n travelers and n cannot be greater than 9

		String preSelection = driver.findElement(By.id("spnDrpNo")).getText();
		System.out.println("Total travelers before selection is : " + preSelection);
		driver.findElement(By.id("iDownArr")).click();

		Thread.sleep(2000);

		int Adults = 1;
		while (Adults < 5) {
			driver.findElement(By.xpath("//button[@id = 'add' and @class = 'add plus_box1']")).click();
			Adults++;
		}
		
		Thread.sleep(2000);

		int Children = 0;
		while (Children < 2) {
			driver.findElement(By.xpath("//button[@id = 'add' and @class = 'add plus_boxChd']")).click();
			Children++;
		}
		
		Thread.sleep(2000);
		
		int infants = 0;
		while (infants < 2) {
			driver.findElement(By.xpath("//button[@id = 'add' and @class = 'add plus_box1Inf']")).click();
			infants++;
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("traveLer")).click();
		
		String postSelection = driver.findElement(By.id("spnDrpNo")).getText();
		System.out.println("Total travelers after selection is : " + postSelection);
	}
}
