package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel17_isdisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://www.amazon.in/ap/signin/258-3718087-1973319?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%2F258-3718087-1973319%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dsignout%26signIn%3D1%26useRedirectOnSuccess%3D1";

		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement emailtext = driver.findElement(By.id("ap_email"));
		boolean emailvalue = emailtext.isDisplayed();

		WebElement pwd = driver.findElement(By.id("ap_password"));
		boolean pwdvalue = pwd.isDisplayed();

		if (emailvalue && pwdvalue) {

			emailtext.sendKeys("shraddha.bhange56@gmail.com");
			pwd.sendKeys("asdf123");

			WebElement login = driver.findElement(By.id("signInSubmit"));
			// login.click();
			// login.submit();
			login.sendKeys(Keys.ENTER);

		}

		// emailtext.sendKeys("shraddha.bhange24@gmail.com");
		// WebElement pwd = driver.findElement(By.id("pass"));
		// pwd.sendKeys("asdf123");
		// emailtext.clear();
		// pwd.clear();
		// emailtext.sendKeys("shraddha.bhange56@gmail.com");
		// pwd.sendKeys("asdf123");
		// WebElement login = driver.findElement(By.id("loginbutton"));
		// // login.click();
		// // login.submit();
		// login.sendKeys(Keys.ENTER);
		//
		// WebElement signup = driver.findElement(By
		// .xpath("//*[@id='globalContainer']/div[3]/div/div/div/a"));
		// signup.click();

	}

}
