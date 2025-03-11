package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMandatoryElement {
	
	//::first-line
	//::selection
	//::before
	//::after
	//::has

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> elements = driver.findElements(By.xpath("//form[@id='form-register']//label"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(WebElement element:elements) {
			String script = "return window.getComputedStyle(arguments[0],'::Before').getPropertyValue('content');";
			String content = js.executeScript(script, element).toString();
			//instead of getText() we need to have get *mark
			//System.out.println(content);
			if(content.contains("*")) {
				System.out.println(element.getText()+" Mandatory field");
			}
			else
				System.out.println(element.getText()+"Not Mandatory field");
				
		}
	}
	

}
