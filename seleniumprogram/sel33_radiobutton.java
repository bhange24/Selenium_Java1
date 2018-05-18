package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel33_radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement fgender = driver.findElement(By.xpath("//*[@id='u_0_4']"));
		if (!fgender.isSelected()) 
		{
			fgender.click();
		}
		else
		{
			
			
		}
		

		// WebElement mgender =
		// driver.findElement(By.xpath("//*[@id='u_0_7']"));
		// mgender.click();
	}

}
