package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Java Selenium");
		WebDriver driver = new FirefoxDriver();//open firefox
		//WebDriver driver = new EdgeDriver();//open edge
		//WebDriver driver= new ChromeDriver();//open the chrome browser
		driver.get("https://www.google.com/");// enter the url
		String title = driver.getTitle(); // to capture the title 
		System.out.println(title);
		//identify object
		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("automation testing");//type the word
		searchBox.sendKeys(Keys.ENTER); // hit enter between
		Thread.sleep(2000);
		
		driver.close(); // (close the browser) driver.quti - it will close the current browser or multiple browser
	}

}
