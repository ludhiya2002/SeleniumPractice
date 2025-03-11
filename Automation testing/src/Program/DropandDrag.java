package Program;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DropandDrag extends BaseClass1{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		invokeBrowser("chrome");
		driver.get("https://demoqa.com/droppable");
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform(); //important to perform the action
		
		//capture the text
		String txtMsg = target.getText();
		System.out.println(txtMsg);
		if(txtMsg.equals("Dropped!")) {
			System.out.println(txtMsg+"dropped successfully");
		}
		else {
			System.out.println(txtMsg+"dropped failed");
			
			closeBrowser();
		}
//		invokeBrowser("chrome");
//		driver.navigate().to("file:///D:/Automation/html/iframpage.html");
//		
//		//Find the elements
//		WebElement txtBox1 = driver.findElement(By.id("t1"));
//		txtBox1.sendKeys("Testing");
//		
//		//switching to frame (inside)
//		driver.switchTo().frame(0);
//		
//		driver.findElement(By.id("t2")).sendKeys("Automation");
//		driver.findElement(By.id("t3")).sendKeys("Selenium");
//		
//		//switch back to main window
//		driver.switchTo().defaultContent();
//		Thread.sleep(2000);
//		txtBox1.clear();
//		txtBox1.sendKeys("We are learning");
//		
//		closeBrowser();
// 
	}

	
 


	}


