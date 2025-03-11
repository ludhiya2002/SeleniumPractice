package Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googledemo extends BaseClass{
		//String browserName="firefox";
		//static WebDriver driver=null;
	 
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	 
			System.out.println("Hello");
			/*
			 * if(browserName.equals("chrome")) { driver= new ChromeDriver(); } else
			 * if(browserName.equals("firefox")) { driver= new FirefoxDriver(); } else
			 * if(browserName.equals("edge")) { driver= new EdgeDriver(); } else
			 * System.out.println("Browser is not matching");
			 */
			invokeBrowser("firefox");
	 
			driver.manage().window().maximize();//maximize the window size
			//implicit wait -> wait for a duration of 10 seconds
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.navigate().to("https://www.selenium.dev/");// navigate method will call get method
			String expectedTitle="Selenium";
			//driver.get(URL);//not having back(),forward(),refresh() unlike navigate()
	 
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
	 
			//Validation
			if(expectedTitle.equals(actualTitle))
			{
				System.out.println("Title is matching. TC pass");
			}
			else
				System.out.println("Title is not matching. TC fail");
			Thread.sleep(2000);
	 
			//click download -> IDentify the object and perform the action
			driver.findElement(By.linkText("Downloads")).click();
			//write logic
	 
			//driver.close();
	 
		}
	 
		//user defined method
		public static void invokeBrowser(String browser)
		{
			if(browser.equals("chrome"))
			{
				driver= new ChromeDriver();
			}
			else if(browser.equals("firefox"))
			{
				driver= new FirefoxDriver();
			}
			else if(browser.equals("edge"))
			{
				driver= new EdgeDriver();
			}
			else
				System.out.println("Browser is not matching");
		}

			}


