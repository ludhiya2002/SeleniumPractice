package Program;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertBox extends BaseClass1{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		invokeBrowser("chrome");
		driver.get("https://demoqa.com/alerts");
		WebDriver driver = new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        // Scroll down by 300 pixels
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,300)");
	        
	        // Click the alert button
	        WebElement alertBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("alertButton")));
	        alertBtn.click();
	        wait.until(ExpectedConditions.alertIsPresent()).accept();
	        Thread.sleep(3000);
	        
	        // Click the confirm button and dismiss it
	        WebElement confirmBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmButton")));
	        confirmBtn.click();
	        wait.until(ExpectedConditions.alertIsPresent()).dismiss();
	        Thread.sleep(3000);
	        
	        // Click the prompt button, enter text, and accept it
	        WebElement promptBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("promtButton")));
	        promptBtn.click();
	        Alert promptAlert = wait.until(ExpectedConditions.alertIsPresent());
	        System.out.println(promptAlert.getText());
	        promptAlert.sendKeys("Tools");
	        promptAlert.accept();
	        Thread.sleep(3000);
	        
	        driver.quit();
	    }
	}

 



