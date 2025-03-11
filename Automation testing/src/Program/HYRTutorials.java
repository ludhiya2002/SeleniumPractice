package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYRTutorials {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("login_field"));
		// to check whether the text box displayed or not 
		if(username.isDisplayed()) {
			if(username.isEnabled()) {
				//sending text
				username.sendKeys("ludhiya");
				Thread.sleep(3000);
				// get string text directly
				String enteredText = username.getAttribute("value");
				System.out.println(enteredText);
				username.clear(); //to clear textbox
				username.sendKeys("tutorials"); // after clear it will execute
				
			}
			else {
				System.out.println("username textbox is not enabled");
			}
			
		}
		else {
			System.err.println("username textbox is not displayed");
		}
		
	}

}
