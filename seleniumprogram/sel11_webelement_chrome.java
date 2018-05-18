package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel11_webelement_chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		String url = "https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dgooginabkkenshoo-21%26ascsubtag%3D9ad1cafa-7596-4f2b-9112-b5285f0dd149%26ie%3DUTF8%26ref_%3Dnav_ya_signin";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement webeleemail = driver.findElement(By
				.xpath("//*[@id='ap_email']"));
		webeleemail.sendKeys("shraddha.bhange24@gmail.com");
		WebElement webelepwd = driver.findElement(By
				.xpath("//*[@id='ap_password']"));
		webelepwd.sendKeys("absdd");
		driver.quit();

		// driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("shraddha.bhange24@gmail.com");
		// driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("absdd");

	}

}
