package com.swichprogram;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel46_loggerprog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger objlog = LogManager.getLogger(sel46_loggerprog2.class.getName());
		String url = "https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fyour-account%3Fref_%3Dnav_signin&switch_account=";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		objlog.info("Amazon site is opened properly");

		WebElement email = driver.findElement(By
				.xpath("//input[contains(@id,'ap_email')]"));
		email.sendKeys("shraddha.bhange24@gmail.com");
		objlog.info("Email has entered");

		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("sdddd");
		objlog.info("Password has entered");

		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.submit();
		objlog.info("Login details submited");

		driver.quit();
	}

}
