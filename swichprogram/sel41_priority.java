package com.swichprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class sel41_priority {
	WebDriver driver;

	@Test(priority=0,enabled=false)
	public void fblogin() {
		driver.manage().window().maximize();
		System.out.println("Site has maximize");
		WebElement emailele = driver.findElement(By.id("email"));
		emailele.sendKeys("shraddha.bhange24@gmail.com");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("shraddha");
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.submit();
		System.out.println("1st @Test executed");

	}

	@Test(priority=1)
	public void amazonmaxiwin() {
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		System.out.println("Site has maximize");
		System.out.println("2nd @Test executed");
	}

	@Test(priority=2)
	public void Googlewin() {
		driver.navigate()
				.to("https://www.google.co.in/?gfe_rd=cr&ei=T1OiWYP6ONiDoAOa3Y2wCg");
		driver.manage().window().maximize();
		System.out.println("Site has maximize");
		System.out.println("3rd @Test executed");
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
