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

public class sel22_expected_actual {
	static WebDriver driver;
	static String expectedusername = "shraddha.bhange24@gmail.com";
	static String expectedpasword = "asdfdwe";

	public static void main(String[] args) {

		sel22_expected_actual obj = new sel22_expected_actual();

		String url = "https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("email"));

		WebElement pwd = driver.findElement(By.name("password"));

		if (username.isDisplayed() && pwd.isDisplayed()) {
			
			username.sendKeys("shraddha.bhange24@gmail.com");
			pwd.sendKeys("asdfdwe");

			String actualuservame = username.getAttribute("value");
			String actualpassword = pwd.getAttribute("value");

			if (expectedusername.indexOf(actualuservame) >=0
					&& expectedpasword.indexOf(actualpassword) >= 0) {

				System.out.println("Test case passed");
				obj.capture("imagex2");
				driver.close();

			} else {
				System.out.println("Test case failed");
				obj.capture("imagex2");
				driver.close();
			}

		}

	}

	public void capture(String imagename) {
		File srcfilename = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfilename, new File(
					"E://selenium//Screenshots//" + imagename + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
