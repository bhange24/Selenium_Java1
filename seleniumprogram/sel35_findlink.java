package com.seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel35_findlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://www.amazon.in/";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		List<WebElement> linkele = driver.findElements(By.tagName("a"));
		System.out.println("web ele list is" + linkele.size());
		for (WebElement linktextele : linkele) {
			System.out.println("URL text is" + linktextele.getText());
			System.out.println("url is" + linktextele.getAttribute("href"));

		}

		driver.close();

	}

}
