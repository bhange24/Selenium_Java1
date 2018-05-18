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

public class sel19_screencapture_ff {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sel19_screencapture_ff obj = new sel19_screencapture_ff();

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

		obj.Screenshots("image1");

		WebElement login = driver.findElement(By.id("loginbutton"));
		login.submit();
		obj.Screenshots("image2");

	}

	public void Screenshots(String screenname) {
		File srcfilename = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfilename, new File(
					"E://selenium//Screenshots//" + screenname + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
