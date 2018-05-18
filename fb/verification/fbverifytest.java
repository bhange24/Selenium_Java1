package com.fb.verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.fb.pages.fbloginpage;

public class fbverifytest {
	WebDriver driver;

	@Test
	public void f() {
		fbloginpage objfb=new fbloginpage(driver);
		objfb.typeusename();
		objfb.typepassword();
		objfb.login();
	}

	@BeforeMethod
	public void beforeMethod() {
		String url = "https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
