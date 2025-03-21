package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindElement {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.booksbykilo.in/new-books");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Actions act = new Actions(driver);
//		js.executeScript("window, scrollBy(0,document.body.scrollHeight)");
//		List<WebElement> books = driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));	
//		System.out.println("Number of books:"+books.size());
		
		//logic
		int previousCount=0;
		int currentCount=0;
		
		while(true) {
			List<WebElement> books = driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
			currentCount = books.size();
			
			if(currentCount==previousCount) {
				break;
			}
			
			previousCount=currentCount;
			//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			//By Actions method
			act.sendKeys(Keys.END).perform();
			Thread.sleep(3000);
		}
		System.out.println("Total number of books:"+previousCount);
		
		
		
		
	}

}
