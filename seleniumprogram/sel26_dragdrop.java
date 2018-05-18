package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sel26_dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="http://jqueryui.com/resources/demos/droppable/default.html";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement fromele = driver.findElement(By
				.xpath("//div[contains(@id,'draggable')]"));
		WebElement toele = driver.findElement(By
				.xpath("//div[contains(@id,'droppable')]"));
		Actions act = new Actions(driver).dragAndDrop(fromele, toele);
		act.build().perform();
		driver.close();

	}

}
