package com.seleniumprogram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel31_alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String url =
		// "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";

		String url = "http://demo.guru99.com/selenium/delete_customer.php";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement submitele = driver.findElement(By
				.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]"));

		submitele.click();
		Alert newalert = driver.switchTo().alert();
		String aletitle = newalert.getText();
		System.out.println("alert title is" + " " + aletitle);
		if (aletitle.indexOf("really want to delete this Customer?") >= 0) {
			newalert.accept();

		} else {
			System.out.println("title is not matching");
			newalert.dismiss();
		}
		//driver.close();
	}

}
