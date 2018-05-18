package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sel37_explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebDriverWait waitobj = new WebDriverWait(driver, 10);
		WebElement email = waitobj.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("email")));
		email.sendKeys("shraddha.bhange24@gmail.com");

		WebElement pwd = waitobj.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("pass")));
		pwd.sendKeys("adfds");

		WebElement login = driver.findElement(By.id("loginbutton"));
		login.submit();
		driver.close();

	}

}
