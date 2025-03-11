package testNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class BaseClass {
	static WebDriver driver=null;
	public static void invokeBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else 
			System.out.println("Browser name is not matching");
	}
	//Close Browser functionality
	public static void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	public static void screenshot() throws IOException {
		//To Take Screenshot
				File src=null;
				src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Files.copy(src, new File("./screenshots/"+"page-"+System.currentTimeMillis()+".png")); // ./ it refers to the current maven project and screenshot refers to the screenshotfolder
			}
	}
 

 
