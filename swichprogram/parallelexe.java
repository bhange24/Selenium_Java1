package com.swichprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelexe {
	@Test
	public void f() {
		driver.manage().window().maximize();
		WebElement emailele = driver.findElement(By.id("email"));
		emailele.sendKeys("shraddha.bhange24@gmail.com");
		WebElement passele = driver.findElement(By.id("pass"));
		passele.sendKeys("asdff");
	}

	WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		String projecturl = "https://www.facebook.com/";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
			driver = new ChromeDriver();

		} 
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"E://selenium//workspace//seleniumtuts//Driver//geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.get(projecturl);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
