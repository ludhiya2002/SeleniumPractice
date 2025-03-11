package Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleclickDemo extends BaseClass1{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.get("https://demoqa.com/buttons");
//		WebElement btnEl = driver.findElement(By.id("doubleClickBtn"));
//		
//		//Actions class
//		Actions a = new Actions(driver);
//		a.doubleClick(btnEl).perform();
//		System.out.println("Double click performed");
		
		//right click
//		WebElement btnE2 = driver.findElement(By.id("rightClickBtn"));
//		Actions a1  = new Actions(driver);
//		a1.contextClick(btnE2).perform();
//		System.out.println("Right Click is performed");
		
		//Double Click Button
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Actions actions = new Actions(driver);
        WebElement doubleClickBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("doubleClickBtn")));
        actions.doubleClick(doubleClickBtn).perform();
        System.out.println("Double Click Performed");

        //Right Click Button
        WebElement rightClickBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("rightClickBtn")));
        actions.contextClick(rightClickBtn).perform();
        System.out.println("Right Click Performed");

        //Click Button
        WebElement clickBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click Me']")));
        clickBtn.click();
        Thread.sleep(2000);
        System.out.println("Click Performed");

        //Get Text After Click
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicClickMessage")));
        System.out.println("Displayed Message: " + message.getText());
        Thread.sleep(2000);
        driver.quit();



		
		
	}
 

		



}
