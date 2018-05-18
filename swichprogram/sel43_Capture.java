package com.swichprogram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class sel43_Capture {
	static WebDriver driver;
 
	
	@Test
  public void testgoogle() {
	  driver.manage().window().maximize();
	  screencapture("abc");
  }
  @BeforeMethod
  public void beforeMethod() {
	  String url="https://www.google.co.in/";
	  System.setProperty("webdriver.chrome.driver", "E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(url);
	  
	  
  }
  
  public void screencapture(String imagename) {
		File srcfile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(srcfile, new File("E://selenium//Screenshots//"+imagename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

  @AfterMethod
  public void afterMethod() {
  driver.quit();
  }

}
