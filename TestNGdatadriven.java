package TestNGPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdatadriven {
	WebDriver driverobj;
	WebDriverWait wait;
	Workbook workbook;
	Sheet sheet;
	Row row;

	// Cell cell;
	String Filename = "Testdata.xlsx";
	String entertext;
	File src = new File("E://Selenium_Oxygen//workspace//seleniumtuts//src//objrepository//Testdata.xlsx");
	File src1 = new File("E://Selenium_Oxygen//workspace//seleniumtuts//src//objrepository//Testdatawrite.xlsx");

	@BeforeTest
	public void loginFlipkart() {
		System.out.println("Enter the text to search");
		Scanner sc = new Scanner(System.in);
		entertext = sc.next();

		String URL = "https://www.amazon.in/";
		System.setProperty("Webdriver.chrome.driver",
				"E://Selenium_Oxygen//workspace//seleniumtuts//Driver//chromedriver.exe");
		driverobj = new ChromeDriver();
		driverobj.get(URL);
		driverobj.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverobj.manage().window().maximize();

	}

	@Test(priority = 0)
	public void signInClick() throws IOException {

		Actions act = new Actions(driverobj);
		WebElement Signin = driverobj.findElement(By.xpath(
				"//a[@href='https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&openid.pape.max_auth_age=0']//*[contains(text(),'Hello. Sign in')]"));
		// login.submit();
		act.moveToElement(Signin).click().perform();
		// Signin.sendKeys(Keys.ENTER);

	}

	@Test(priority = 1)
	public void readExcelData() throws IOException {
		// Import excel sheet.
		FileInputStream finput = new FileInputStream(src);
		// Load the workbook.

		String fileExtensionName = Filename.substring(Filename.indexOf("."));
		if (fileExtensionName.equals(".xlsx")) {
			// If it is xlsx file then create object of XSSFWorkbook class
			workbook = new XSSFWorkbook(finput);
		}
		// Check condition if the file is xls file
		else if (fileExtensionName.equals(".xls")) {
			// If it is xls file then create object of XSSFWorkbook class
			workbook = new HSSFWorkbook(finput);
		}

		// Load the sheet in which data is stored.
		sheet = workbook.getSheetAt(0);

		// Create a loop over all the rows of excel file to read it
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {

			// Import data for Email.
			Cell Usercell = sheet.getRow(i).getCell(1);
			String cellusernamevalue = Usercell.getStringCellValue();
			WebElement Username = driverobj.findElement(By.xpath("//*[@id='ap_email']"));
			Username.sendKeys(cellusernamevalue);

			WebElement continuebtn = driverobj.findElement(By.xpath("//*[@id='continue' and @class='a-button-input']"));
			continuebtn.sendKeys(Keys.ENTER);
			// Import data for password.

			Cell Pwdcell = sheet.getRow(i).getCell(2);
			String cellpassvalue = Pwdcell.getStringCellValue();
			WebElement Password = driverobj.findElement(By.xpath("//*[@id='ap_password']"));
			Password.sendKeys(cellpassvalue);

		}
	}

	@Test(priority = 2)
	public void login() throws IOException {
		WebElement login = driverobj.findElement(By.xpath("//*[@id='signInSubmit' and @class='a-button-input']"));
		// login.submit();
		login.sendKeys(Keys.ENTER);
	}

	@Test(priority = 3)
	public void autoSerch() throws IOException {
		Actions act1 = new Actions(driverobj);
		for (String handle : driverobj.getWindowHandles()) {
			driverobj.switchTo().window(handle);
		}
		WebElement searchtext = driverobj.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		act1.moveToElement(searchtext).click().perform();
		searchtext.sendKeys(entertext);
		searchtext.sendKeys(Keys.ENTER);

	}

	@Test(priority = 4)
	public void sorting() throws IOException {

		WebElement sort = driverobj.findElement(By.xpath("//select[@id='sort']"));
		Select toele = new Select(sort);
		toele.selectByIndex(2);
		driverobj.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test(priority = 5)
	public void getELEList() throws IOException {

		try {
			Thread.sleep(5000);
			List<WebElement> suggetion = driverobj.findElements(By.xpath("//ul[@id='s-results-list-atf']//li"));

			ArrayList<String> al = new ArrayList<String>();

			for (WebElement sugg : suggetion) {

				System.out.println(sugg.getText());
				al.add(sugg.getText());
			}

			for (int i = 0; i < al.size(); i++) {
				FileOutputStream fileOutput = new FileOutputStream(src1);
				// sheet.getRow(2).createCell(0).setCellValue(al.get(1));
				// Specify the file in which data needs to be written.
				row = sheet.createRow(i);
				row.createCell(0).setCellValue(al.get(i));

				// finally write content
				workbook.write(fileOutput);
				// close the file
				fileOutput.close();
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterTest
	public void terminateBrowser() {
		// driverobj.close();
	}
}
