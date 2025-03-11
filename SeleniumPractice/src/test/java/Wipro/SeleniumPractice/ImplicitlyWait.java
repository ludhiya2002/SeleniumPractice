package Wipro.SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitlyWait {
	private WebDriver driver;
	private String baseUrl;
	private WebElement element;

	public void setUp() throws Exception {
	driver = new FirefoxDriver();
	baseUrl = "http://www.google.com";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	public void testUntitled() throws Exception {
	driver.get(baseUrl);
	element = driver.findElement(By.id("lst-ib"));
	element.sendKeys("Selenium WebDriver Interview questions");
	element.sendKeys(Keys.RETURN);
	List<WebElement> list = driver.findElements(By.className("_Rm"));
	System.out.println(list.size());

	}


	public void tearDown() throws Exception {
	driver.quit();
	}
	}


