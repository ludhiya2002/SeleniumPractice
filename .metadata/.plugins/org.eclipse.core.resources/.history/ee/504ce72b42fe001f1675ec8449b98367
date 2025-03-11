package StepDef;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.Before;

public class Chromedriversetup {
	
	@Before
	public void setup1() {
		WebDriverManager.chromedriver().setup();
	}
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
	}

}
