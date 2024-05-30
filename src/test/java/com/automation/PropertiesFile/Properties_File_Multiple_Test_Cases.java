package com.automation.PropertiesFile;

import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Properties_File_Multiple_Test_Cases {

	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip1;
	public FileInputStream ip2;
	public SoftAssert softassert;
	public Date date;

	public Properties_File_Multiple_Test_Cases() throws Exception {
		prop = new Properties();
		ip1 = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/com/automation/PropertiesFile/config_Login.properties");	
		ip2 = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/com/automation/PropertiesFile/config_Register.properties");	
		prop.load(ip1);
		prop.load(ip2);
	}

	@Test (priority = 2)
	public void loginTV() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	
	public String dateStamp() {
		date = new Date();
		String dateStamp = date.toString().replace(" ", "_").replace(":", "_");
		return "seleniumpanda" + dateStamp + "@gmail.com";
	}
	
	@Test (priority = 1)
	public void registerTN() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.id("input-lastname")).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.id("input-email")).sendKeys(dateStamp());
		driver.findElement(By.id("input-telephone")).sendKeys(prop.getProperty("telephone"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(prop.getProperty("confirmPassword"));
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
}
