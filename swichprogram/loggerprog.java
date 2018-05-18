package com.swichprogram;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loggerprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger objloger = LogManager.getLogger(loggerprog.class.getName());

		String url = "https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		objloger.info("Chrome browser opened");
		driver.get(url);
		
		

	}

}
