package com.automation.Multiple_WebElements_ResponseCode;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercise_Flipkart {

	public WebDriver driver;

	@Test
	public void mensTShirts() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/mens-tshirts/pr?sid=clo,ash,ank,edy&fm=neo%2Fmerchandising&iid=M_eeba98a8-669e-4c2b-a7cf-68aa3cc63cca_1_372UD5BXDFYS_MC.IF56C41VGEYS&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear~Men%2527s%2BT-Shirts_IF56C41VGEYS&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&cid=IF56C41VGEYS");

		//name
		//description
		//price
		//discount
		
		List<WebElement> name = driver.findElements(By.className("syl9yP"));
		List<WebElement> discount = driver.findElements(By.className("UkUFwK"));
		List<WebElement> price = driver.findElements(By.className("Nx9bqj"));
		
		for(int i=0 ; i<name.size() ; i++) {
			System.out.println(name.get(i).getText() + "---" + discount.get(i).getText() +"----- " + price.get(i).getText());
		}
	}

}
