package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.junit.Assert;

public class WebSite {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
	}
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
		
	    
	}

	@When("user opens URL {string}")
	public void user_opens_URL(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String password) {
	   lp.setUserName(email);
	   lp.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
		lp.clickLogin();
	   
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String expectedTitle) {
		
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);
	}

	@When("User click on Log out link")
	public void User_click_on_Log_out_link() throws InterruptedException {
		
		lp.clickLogout();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Login"));
		
	    
	}

	@Then("close browser")
	public void close_browser() {
	   driver.close();
	}




}
