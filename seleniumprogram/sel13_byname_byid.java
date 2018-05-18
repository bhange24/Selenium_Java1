package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sel13_byname_byid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://paytm.com/paytmwallet";
		System.setProperty("webdriver.gecko.driver",
				"E://selenium//workspace//seleniumtuts//Driver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.navigate()
				.to("https://www.amazon.in/ap/register?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_custrec_newcust");
		//driver.navigate().back();
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.name("email"));
		name.sendKeys("7720051221");

		//driver.close();

	}

}
