package com.seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class sel02_openIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL = "https://www.slideshare.net/apoorvams/java-29871881";
		System.setProperty("webdriver.ie.driver",
				"E://selenium//workspace//seleniumtuts//Driver//IEDriverServer.exe");
		WebDriver ieobj = new InternetExplorerDriver();
		ieobj.get(URL);
		ieobj.manage().window().maximize();
	}

}
