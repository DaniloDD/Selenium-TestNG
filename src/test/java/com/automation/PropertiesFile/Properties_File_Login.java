package com.automation.PropertiesFile;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Properties_File_Login {

	//create a properties file '.properties':
	// right click --> new --> files --> give the name: chooseNameFile.properties

	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	public SoftAssert softassert;
	
	
	public Properties_File_Login() throws Exception {
		// create an object of the predefined class Properties
		prop = new Properties();
		// create the object of FileInputStream and pass the path of the properties file inside the constructor of this fileInputStream
		ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/com/automation/PropertiesFile/config_Login.properties");	
		prop.load(ip);
	}
	
	@Test
	public void loginTV() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();
	}
	
	@Test
	public void userDirectoryCheck() {
		System.out.println(System.getProperty("user.dir"));
	}


}
