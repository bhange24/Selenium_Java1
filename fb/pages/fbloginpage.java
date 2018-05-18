package com.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbloginpage {

	// TODO Auto-generated method stub
	WebDriver driver;
	By username = By.xpath("//input[contains(@id,'email')]");
	By password = By.xpath("//input[contains(@id,'pass')]");
	By login = By.xpath("//*[@id='loginbutton']");

	public fbloginpage(WebDriver driver) {
		this.driver = driver;

	}

	public void typeusename() {
		driver.findElement(username).sendKeys("shraddha.bhange24@gmail.com");
	}

	public void typepassword() {
		driver.findElement(password).sendKeys("pssdff");
	}

	public void login() {
		driver.findElement(login).click();
	}
}
