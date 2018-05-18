package com.seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel34_total_link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://www.amazon.com/";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total number of links: "+links.size());
		for (WebElement linkval : links) {
	
			System.out.println("value for link is: "+linkval.getText());
			System.out.println("url of given text is: "+linkval.getAttribute("href"));
			
		}


	}

}
