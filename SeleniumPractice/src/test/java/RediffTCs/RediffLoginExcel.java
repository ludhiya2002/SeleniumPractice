package RediffTCs;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Rediffpages.RediffHomePage;
import Rediffpages.RediffLoginPage;

public class RediffLoginExcel {
	
	FileInputStream fis;
	Properties prop;
	RediffLoginPage rlp;
	RediffHomePage rhp;
	WebDriver driver;

	/*
	 * public RediffLoginExcel(WebDriver driver) { this.driver=driver; }
	 */
	@BeforeTest
	public void openBrowser()
	{		
		driver = new ChromeDriver();	
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}
	@Test
	public void ReadDataExcel() throws IOException, InterruptedException
	{
		FileInputStream excel = new FileInputStream("C:\\Html\\ExcelRead.xlsx");
		//Identify the workbook in the excel
		XSSFWorkbook workbook = new XSSFWorkbook(excel);
		XSSFSheet sheet = workbook.getSheet("Selenium");//Selenium sheet
		//workbook.getSheetAt(0);//selenium sheet
		int rows=sheet.getPhysicalNumberOfRows();//identify the no of records having the data
		System.out.println("Total no of records/rows in Selenium sheet is: "+rows);

		//Logic to find the no of columns
		int columns = sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println("Total no of columns in Selenium sheet is: "+columns);

		rlp = new RediffLoginPage(driver);
		String username = sheet.getRow(1).getCell(0).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
		rlp.userName().sendKeys(username);
		Thread.sleep(2000);
		rlp.password().sendKeys(password);
	}
	
	@AfterTest
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}


}
