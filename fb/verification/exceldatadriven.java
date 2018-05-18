package com.fb.verification;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class exceldatadriven {
	WebDriver driver;

	@Test
	public void beforeMethod() {
		String url = "https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		try {
			FileInputStream fis = new FileInputStream(
					"E:\\selenium\\workspace\\seleniumtuts\\src\\objrepository\\fbtestdata.xls");
			POIFSFileSystem pfs = new POIFSFileSystem(fis);
			HSSFWorkbook wb = new HSSFWorkbook(pfs);
			HSSFSheet ws = wb.getSheetAt(0);
			for (int i = 1; i < ws.getLastRowNum() + 1; i++) {
				HSSFCell cellusername = ws.getRow(i).getCell(0);
				String cellusernamevalue = cellusername.getStringCellValue();
				WebElement email = driver.findElement(By.id("email"));
				email.sendKeys(cellusernamevalue);

				HSSFCell cellpass = ws.getRow(i).getCell(1);
				String cellpassvalue = cellpass.getStringCellValue();
				WebElement pwd = driver.findElement(By.id("pass"));
				pwd.sendKeys(cellpassvalue);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement login = driver.findElement(By.id("loginbutton"));
		login.submit();

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
