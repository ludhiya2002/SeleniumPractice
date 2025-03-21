package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class HRMSDemo extends BaseClass{
	String name,password,url,browser;
	@BeforeTest
	public void readData() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\sampa\\eclipse-workspace\\SeleniumPractice\\src\\test\\java\\data\\data.properties");
		Properties pro = new Properties();
		pro.load(fis);
	    name = pro.getProperty("username");
		password = pro.getProperty("password");
		url = pro.getProperty("url");
		browser = pro.getProperty("browser");
				
	}
	
	@Test
	public void data() {
		System.out.println(name);
		System.out.println(password);
		System.out.println(url);
		System.out.println(browser);
	}
	
	@Test (enabled = true)
	@Parameters({"browser"})
	public void login(String browser) throws IOException, InterruptedException
	{
		invokeBrowser(browser);
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(url);
		Thread.sleep(3000);
		screenshot();
		//enter the user-id and password and enter through parameters
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//logout through parameters
		closeBrowser();
		

}
}
