package GRID;
import java.net.URL;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridtest {
	
	@Test
	public void GRIDTest() {
		ChromeOptions options = new ChromeOptions();
		
		//Connect to the selenium Grid Hub
		WebDriver driver = new RemoteWebDriver(new URL("https://localhost:4444/wd/hub"));
		
		driver.get("https://www.redfill.com/");
		System.out.println("Title:"+ driver.getTitle());
	}
}
