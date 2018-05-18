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

public class sel20_chromecapture {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sel20_chromecapture obj = new sel20_chromecapture();

		String url = "https://www.facebook.com/pages/Login-facebok/129737810401846";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("email"));
		Boolean evalue = username.isDisplayed();
		WebElement usernamelabel = driver.findElement(By
				.xpath("//*[@id='login_form']/table/tbody/tr[1]/td[1]/label"));

		WebElement pwd = driver.findElement(By.id("pass"));
		Boolean pvalue = pwd.isDisplayed();
		WebElement pwdlabel = driver.findElement(By
				.xpath("//*[@id='login_form']/table/tbody/tr[1]/td[2]/label"));

		if (evalue && pvalue) {
			username.sendKeys("shraddha.bhange24@gmail.com");
			String usernamevalue = username.getAttribute("value");

			pwd.sendKeys("asdfdwe");
			String pwdvalue = pwd.getAttribute("value");

			String usernamelabeltext = usernamelabel.getText();
			String pwdlabeltext = pwdlabel.getText();

			System.out.println(usernamevalue);
			System.out.println(pwdvalue);
			System.out.println(usernamelabeltext);
			System.out.println(pwdlabeltext);
			obj.capture("imagex2");
			
			WebElement login = driver.findElement(By.id("loginbutton"));
			login.isDisplayed();
			login.submit();
			obj.capture("imagex3");
			driver.close();
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
