package com.fb.verification;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazonrepository {
	WebDriver driver;

	@Test
	public void f() {
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		Properties objpro = new Properties();
		try {
			FileInputStream objfileinput = new FileInputStream(
					"E:\\selenium\\workspace\\seleniumtuts\\src\\objrepository\\amazon.properties");

			objpro.load(objfileinput);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.get(objpro.getProperty("amazonurl"));

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys(objpro.getProperty("amazonemail"));
		WebElement pwd = driver.findElement(By.id("ap_password"));
		pwd.sendKeys(objpro.getProperty("amazonpassword"));
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
