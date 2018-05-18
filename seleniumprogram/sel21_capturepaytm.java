package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel21_capturepaytm {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sel20_chromecapture obj = new sel20_chromecapture();

		String url = "https://paytm.com/business/payments/sign-up/home";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.navigate().to("https://accounts.paytm.com/oauth2/authorize?response_type=code&client_id=merchant-golden-gate&scope=paytm&redirect_uri=https://paytm.com/business/payments/sign-up/token/default&theme=diy");

		//username text & label 
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("shraddha.bhange24@gmail.com");
		String usernamevalue = username.getAttribute("value");
		System.out.println(usernamevalue);

		WebElement usernamelabel = driver.findElement(By
				.xpath("//*[@id='login_form']/table/tbody/tr[1]/td[1]/label"));
		String usernamelabeltext = usernamelabel.getText();
		System.out.println(usernamelabeltext);
		obj.capture("imagex1");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("asdfdwe");
		
		String pwdvalue = pwd.getAttribute("value");
		System.out.println(pwdvalue);
		
		WebElement pwdlabel = driver.findElement(By
				.xpath("//*[@id='login_form']/table/tbody/tr[1]/td[2]/label"));
		String pwdlabeltext = pwdlabel.getText();
		System.out.println(pwdlabeltext);
		obj.capture("imagex2");

		WebElement login = driver.findElement(By.id("loginbutton"));
		login.isDisplayed();
		login.submit();
		obj.capture("imagex3");
		driver.close();

	}

}
