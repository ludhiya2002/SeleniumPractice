package Program;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass1 {
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
	 
	}
	 
	 


