package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sel16_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://en-gb.facebook.com/login/";
		System.setProperty("webdriver.gecko.driver",
				"E://selenium//workspace//seleniumtuts//Driver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement emailtext = driver.findElement(By.id("email"));
		emailtext.sendKeys("shraddha.bhange24@gmail.com");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("asdf123");
		emailtext.clear();
		pwd.clear();
		emailtext.sendKeys("shraddha.bhange56@gmail.com");
		pwd.sendKeys("asdf123");

		WebElement login = driver.findElement(By.id("loginbutton"));
		// login.click();
		// login.submit();
		login.sendKeys(Keys.ENTER);

		WebElement signup = driver.findElement(By
				.xpath("//*[@id='globalContainer']/div[3]/div/div/div/a"));
		signup.click();
	

	}

}
