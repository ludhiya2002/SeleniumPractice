package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class github{
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Ftopics%2Flogin");
		Thread.sleep(3000);
		driver.findElement(By.id("login_field"));
		Thread.sleep(3000);
		driver.findElement(By.name("password"));
		Thread.sleep(3000);
		driver.findElement(By.className("header-logo"));
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot password?"));
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Create"));
		Thread.sleep(3000);
		driver.findElement(By.tagName("h1"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Username or emai address')]"));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='commit']"));
		Thread.sleep(3000);
	}

}
