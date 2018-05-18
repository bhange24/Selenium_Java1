package com.seleniumprogram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel18_screencapturewithparameter_chrome {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		sel18_screencapturewithparameter_chrome obj1 = new sel18_screencapturewithparameter_chrome();

		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement emailtext = driver.findElement(By.id("email"));
		emailtext.isDisplayed();
		emailtext.sendKeys("shraddddaddadadad@gmail.com");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.isDisplayed();
		pwd.sendKeys("xxx");
		obj1.screencapture("imagewithinvalidusernaameandinvalidpaaasword");
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.submit();
		obj1.screencapture("imageafterloginbtnclick");

	}
	
	public void screencapture(String imagename) {
		File srcfile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(srcfile, new File("E://selenium//Screenshots//"+imagename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
