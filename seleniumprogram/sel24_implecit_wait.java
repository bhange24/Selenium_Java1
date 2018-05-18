package com.seleniumprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel24_implecit_wait {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		String url = "https://www.facebook.com/pages/Login-facebok/129737810401846";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("shraddha.bhange24@gmail.com");
		// /Thread.sleep(10000);

		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("asdfdwe");
		// Thread.sleep(5000);

		WebElement signin = driver.findElement(By.id("loginbutton"));
		signin.click();

	}

}
