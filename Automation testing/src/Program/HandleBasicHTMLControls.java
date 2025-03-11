package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleBasicHTMLControls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindiChk = driver.findElement(By.id("hindichbx"));
		hindiChk.click(); //check
		Thread.sleep(3000);
		if(hindiChk.isSelected()) {
			hindiChk.click(); //uncheck
			Thread.sleep(3000);
			driver.findElement(By.id("registerbtn"));
			System.out.println(driver.findElement(By.id("msg")).getText());      // label oka text thechukovali anapudu get text vadtham return string		}
		    Thread.sleep(3000);
			driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		

	}

	}
}
