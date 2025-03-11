package Program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
//		WebElement course = driver.findElement(By.id("course"));
//		//object create
//		Select courseNameDropdown = new Select(course);
//		// to print all dropdowns in console
//		List<WebElement> courseNameDropdownOption = courseNameDropdown.getOptions();
//		for(WebElement option : courseNameDropdownOption) {
//			System.out.println(option.getText());
//			
//		}
//		//method call
//		courseNameDropdown.selectByIndex(1); //Java
//		Thread.sleep(2000);
//		courseNameDropdown.selectByValue("net");//Dot net
//		Thread.sleep(2000);
//		courseNameDropdown.selectByVisibleText("Javascript"); // Javascript
//		// it will give default select option 
//		String selectedText = courseNameDropdown.getFirstSelectedOption().getText();
//		System.out.println("Selected visible text :"+selectedText);
//		
		
		// Multiselection dropdown
		WebElement ide = driver.findElement(By.id("ide"));
		//object create
		Select ideDropdown = new Select(ide);
		// to print all dropdowns in console
		List<WebElement> ideDropdownOptions = ideDropdown.getOptions();
		for(WebElement option : ideDropdownOptions) {
			System.out.println(option.getText());
			
		}
		//method call
		ideDropdown.selectByIndex(0); //Eclipse
		Thread.sleep(2000);
		ideDropdown.selectByValue("ij");//IntelliJ IDEA
		Thread.sleep(2000);
		ideDropdown.selectByVisibleText("NetBeans"); // NetBeans
		Thread.sleep(2000);
		ideDropdown.deselectByVisibleText("IntelliJ IDEA");
		
		// it will give default select option 
		List<WebElement> selectedOptions = ideDropdown.getAllSelectedOptions();
		for(WebElement selectedOption : selectedOptions) {
		System.out.println("Selected visible text :"+selectedOption.getText());
		
	}

	}
}
