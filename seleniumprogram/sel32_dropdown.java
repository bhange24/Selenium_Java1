package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sel32_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://www.vidarbhatravels.com/";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement toelement = driver
				.findElement(By.xpath("//*[@id='toCity']"));
		Select toele = new Select(toelement);
		//toele.selectByVisibleText("Amravati");
		toele.selectByIndex(2).click();
		//toele.selectByValue("209|Parli");
		//toele.deselectByValue("209|Parli");
	}

}
