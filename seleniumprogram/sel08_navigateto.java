package com.seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel08_navigateto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nav = "https://www.facebook.com/campaign/landing.php?campaign_id=445301152200271&keyword=facebook+log+in&placement=&creative=163275417342&extra_1=38240467-2094-4254-afdf-22074ae6fe70&partner_id=googlesem&extra_2=network%3Dg%26matchtype%3De%26target%3D%26source%3D%26adposition%3D1t1%26aceid%3D&gclid=Cj0KCQjwwevLBRCGARIsAKnAJvdH54hktaCjUBa_ebY4kFIksQ-yBtIbBFInW-is0Fy-6jWAp5PmzaYaAgIFEALw_wcB";
		System.setProperty("webdriver.chrome.driver",
				"E://selenium//workspace//seleniumtuts//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(nav);
		driver.manage().window().maximize();
		driver.navigate()
				.to("https://www.google.co.in/?gfe_rd=cr&ei=gCx8WbW-DfHn8Aerqa3gAw");
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
