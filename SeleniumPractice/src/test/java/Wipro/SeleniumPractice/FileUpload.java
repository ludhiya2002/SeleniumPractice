package Wipro.SeleniumPractice;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\10657527\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe"); 
			  WebDriver driver = new ChromeDriver(); 
			  driver.manage().window().maximize(); 
			  driver.get("http://demo.guru99.com/test/upload/"); 
			 
			  String path="C:\\Users\\10657527\\Desktop\\Venkatraman.docx"; 
			   
			  driver.findElement(By.name("uploadfile_0")).click(); 
			  Thread.sleep(2000); 
			  Robot robot = new Robot(); 
			  robot.setAutoDelay(3000); 
			  StringSelection selection = new StringSelection( 
			    path); 
			  Toolkit.getDefaultToolkit().getSystemClipboard() .setContents(selection, null); 
			  // press ctrl+vsss 
			  robot.keyPress(KeyEvent.VK_CONTROL); 
			  robot.keyPress(KeyEvent.VK_V); 
			  robot.setAutoDelay(3000); 
			  // release ctrl+v 
			  robot.keyRelease(KeyEvent.VK_CONTROL); 
			  robot.keyRelease(KeyEvent.VK_V); 
			  // press enter 
			  robot.setAutoDelay(3000); 
			  robot.keyPress(KeyEvent.VK_ENTER); 
			  robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
