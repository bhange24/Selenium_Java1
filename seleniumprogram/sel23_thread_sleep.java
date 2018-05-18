package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel23_thread_sleep {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {


		String url = "https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("email"));

		WebElement pwd = driver.findElement(By.name("password"));

		username.sendKeys("shraddha.bhange24@gmail.com");
		Thread.sleep(10000);
		
		pwd.sendKeys("asdfdwe");

	}

}
