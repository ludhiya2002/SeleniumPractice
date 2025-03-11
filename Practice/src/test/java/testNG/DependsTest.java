package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsTest {
	
	WebDriver driver;
	@Test (dependsOnMethods = {"openBrowser"})//(priority = 1)
	public void AsignIn() {
		System.out.println("Sign in page...");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test//(priority = 0)
	public void openBrowser() {
		System.out.println("Open browser will execute first");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test (dependsOnMethods = {"AsignIn"})
	public void viewDashBoard() {
		System.out.println("View your dashboard");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
//	@AfterTest
//	public void closeBrowser() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.close();
//	}

}
