package com.seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel05_openchromewithout_get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://www.google.co.in/?gfe_rd=cr&ei=gCx8WbW-DfHn8Aerqa3gAw";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.close();

	}

}
