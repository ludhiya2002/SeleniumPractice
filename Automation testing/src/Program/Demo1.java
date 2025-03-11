package Program;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait -> wait for a duration of 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.selenium.dev/");
		//String exceptedTitle = "Selenium";
		//driver.get(url); not having back(),forward(),refresh() unlike navigate()
		//String actualTitle = driver.getTitle();
		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("https://login.salesforce.com/");//type the word
		searchBox.sendKeys(Keys.ENTER);
		//System.out.println(actualTitle);
		
//		if(exceptedTitle.equals(actualTitle)) {
//			System.out.println("Title is matching. TC pass");
//		}
//		else
//			System.out.println("Title is not matching. TC fail");
		Thread.sleep(2000);
		
//		//click download
//		driver.findElement(By.linkText("Downloads")).click();
//		driver.close();

	}

}
