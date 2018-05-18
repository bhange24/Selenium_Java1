package com.seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel38_windowhandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://www.naukri.com";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		String parentwin = driver.getWindowHandle();
		System.out.println(parentwin);
		for (String childwin : driver.getWindowHandles()) {
			driver.switchTo().window(childwin);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.equalsIgnoreCase("Amazon")) {
				driver.switchTo().window(parentwin);
				System.out.println("Swiched to parrent window");

			}
		}
		driver.quit();

	}

}
