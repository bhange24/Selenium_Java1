package com.swichprogram;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class sel45_logger {

	static org.apache.logging.log4j.Logger logger= org.apache.logging.log4j.LogManager.getLogger(firefoxlogin.class.getName());
	
	
	static WebDriver driver;
	public static void main(String[] args) 
	
	{
		//DOMConfigurator.configure("log4j2.xml");
		// TODO Auto-generated method stub
		firefoxlogin ws=new firefoxlogin();
		String projectpath = System.getProperty("user.dir");
		System.out.println("Project path is:" + projectpath);
		String driverpath = projectpath + "//config//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		logger.info("Facebook webpage found");
		driver.manage().window().maximize();
		logger.info("Maximised window");
		
		//to check the value insert
		WebElement usernameele=driver.findElement(By.xpath("//*[@id='email']"));
		usernameele.sendKeys("lanjewarajay84@gmail.com");
		logger.info("entered username");
		
		WebElement pwdele=driver.findElement(By.xpath("//*[@id='pass']"));
		pwdele.sendKeys("Skumar1120#");
		logger.info("entered password");
		
		
		WebElement submitele = driver.findElement(By.xpath("//*[@id='loginbutton']"));
		submitele.click();
		logger.info("submit button click");

	}

}
