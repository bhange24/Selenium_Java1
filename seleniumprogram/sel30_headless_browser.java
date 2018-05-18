package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class sel30_headless_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin";
		WebDriver driver = new HtmlUnitDriver();
		driver.get(url);
		System.out.println("amazon opened");
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("shraddha.bhange24@gmail.com");
		WebElement pwd = driver.findElement(By.id("ap_password"));
		pwd.sendKeys("abc");
		System.out.println("Email and pwd entered");
		WebElement login = driver.findElement(By.xpath("//span[conations(text(),'Login')]"));
		login.click();
		System.out.println("Login");
		
	}

}
