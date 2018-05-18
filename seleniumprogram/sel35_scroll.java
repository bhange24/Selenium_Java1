package com.seleniumprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel35_scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://www.naukri.com/";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//((JavascriptExecutor) driver).executeScript("scroll(0,1500)");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

	}

}
