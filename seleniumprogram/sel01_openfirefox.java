package com.seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sel01_openfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL = "https://mail.google.com/mail/u/0/";
		System.setProperty("webdriver.gecko.driver",
				"E://selenium//workspace//seleniumtuts//Driver//geckodriver.exe");
		WebDriver geckobj = new FirefoxDriver();
		geckobj.get(URL);

	}

}
