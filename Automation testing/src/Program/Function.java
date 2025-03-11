package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Function {
	public static WebDriver getdriver(String browserName) {
		WebDriver driver = null;
		System.out.println("Initializing browser:"+browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Browser is not matching");
		}
		return driver;
	}
	public static void searchbox(WebDriver driver, String title) throws InterruptedException {
		driver.get("https://www.google.com");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium.dev");
		searchBox.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello");
		
		WebDriver driver = getdriver("chrome");
		
		if(driver!=null) {
			searchbox(driver,"Selenium WebDriver");
			//driver.get("https://www.google.com");
			
		}
	}

}
