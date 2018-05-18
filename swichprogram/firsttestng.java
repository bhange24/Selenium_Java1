package com.swichprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class firsttestng {
	WebDriver driver;

	@Test
	public void fmaxiwin() {
		driver.manage().window().maximize();
		System.out.println("Site has maximize");
	}

	@BeforeMethod
	public void beforeMethod() {

		String url = "https://www.naukri.com";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
