package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sel25_rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://swisnl.github.io/jQuery-contextMenu/demo.html";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement rightclick = driver.findElement(By
				.xpath("//span[contains(text(),'right click me')]"));
		Actions act = new Actions(driver).contextClick(rightclick);
		act.build().perform();
		driver.close();

	}

}
