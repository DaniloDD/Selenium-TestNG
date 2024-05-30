package com.automation.Data_Provider;
import org.testng.annotations.DataProvider;

public class Data_Provider {
	
	@DataProvider (name = "LOGINTN")
	public Object[][] loginDataTN() {
		Object[][] loginData = {
				{"seleniumpanda1@gmail.com", "Selenium@123"},
				{"seleniumpanda2@gmail.com", "Selenium@123"},
				{"seleniumpanda3@gmail.com", "Selenium@123"},
				{"seleniumpanda4@gmail.com", "Selenium@123"},
				{"seleniumpanda5@gmail.com", "Selenium@123"},
				{"seleniumpanda6@gmail.com", "Selenium@123"},
				{"seleniumpanda7@gmail.com", "Selenium@123"},
				{"seleniumpanda8@gmail.com", "Selenium@123"},
				{"seleniumpanda9@gmail.com", "Selenium@123"},
				{"seleniumpanda10@gmail.com", "Selenium@123"},
				//{"seleniumpanda11@gmail.com", "Selenium@123"},
				//{"seleniumpanda12@gmail.com", "Selenium@123"},
				//{"seleniumpanda13@gmail.com", "Selenium@123"},
				//{"seleniumpanda14@gmail.com", "Selenium@123"},
				//{"seleniumpanda15@gmail.com", "Selenium@123"},
				//{"seleniumpanda16@gmail.com", "Selenium@123"},
				//{"seleniumpanda17@gmail.com", "Selenium@123"},
				//{"seleniumpanda18@gmail.com", "Selenium@123"},
				//{"seleniumpanda19@gmail.com", "Selenium@123"},
				//{"seleniumpanda20@gmail.com", "Selenium@123"},
				//{"seleniumpanda21@gmail.com", "Selenium@123"},
				//{"seleniumpanda22@gmail.com", "Selenium@123"},
				//{"seleniumpanda23@gmail.com", "Selenium@123"},
				//{"seleniumpanda24@gmail.com", "Selenium@123"},
				{"seleniumpanda25@gmail.com", "Selenium@123"}};
		return loginData;
	}
	
	
	@DataProvider (name = "REGISTERTN")
	public Object[][] registerDataTn() {
		Object[][] registerData = {
				{"Selenium", "Panda", "1233455", "Selenium@123", "Selenium@123"},
				{"Selenium", "Panda", "1233455", "Selenium@123", "Selenium@123"},
				{"Selenium", "Panda", "1233455", "Selenium@123", "Selenium@123"},
				{"Selenium", "Panda", "1233455", "Selenium@123", "Selenium@123"},
				{"Selenium", "Panda", "1233455", "Selenium@123", "Selenium@123"},
				};
		return registerData;
	}
	
}
