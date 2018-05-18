package com.swichprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class sel40_merge {
	WebDriver driver;

	@Test
	public void fblogin() {
		driver.manage().window().maximize();
		System.out.println("Site has maximize");
		WebElement emailele = driver.findElement(By.id("email"));
		emailele.sendKeys("shraddha.bhange24@gmail.com");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("shraddha");
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.submit();

	}

	@Test
	public void fmaxiwin() {
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		System.out.println("Site has maximize");
	}

	@BeforeMethod
	public void beforeMethod() {
		String url = "https://www.facebook.com/";
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
