package com.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbloginpagewithparameter {

	// TODO Auto-generated method stub
	WebDriver driver;
	By username = By.xpath("//input[contains(@id,'email')]");
	By password = By.xpath("//input[contains(@id,'pass')]");
	By login = By.xpath("//*[@id='loginbutton']");

	public fbloginpagewithparameter(WebDriver driver) {
		this.driver = driver;

	}

	public void typeusename(String user) {
		driver.findElement(username).sendKeys("user");
	}

	public void typepassword(String pass) {
		driver.findElement(password).sendKeys("pass");
	}

	public void login() {
		driver.findElement(login).click();
	}
}
