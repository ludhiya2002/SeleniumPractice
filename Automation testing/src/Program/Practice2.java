package Program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
    public static void main(String[] args) throws InterruptedException {
 
    	
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       
        driver.get("https://book.spicejet.com/");
        Thread.sleep(2000);  

        //Departure City
        WebElement from = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT"));
        from.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@text='Hyderabad (HYD)']")).click();

        //Arrival City 
        WebElement to = driver.findElement(By.name("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT"));
        to.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]")).click();
        Thread.sleep(2000);
        //driver.findElement(By.linkText("3")).click();
      
     // Click on the Calendar
        WebElement calendar = driver.findElement(By.id("custom_date_picker_id_1"));
        calendar.click();
        Thread.sleep(2000);

        //depart date and return date
        while (true) {
            // Get the current displayed month & year
            WebElement monthElement = driver.findElement(By.className("ui-datepicker-title"));
            String currentMonth = monthElement.getText();
            //month selection
            if (currentMonth.contains("June")) {
                System.out.println("June is displayed!");
                break;
            }

            // click on "Next" button to move to the next month
            WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
            nextButton.click();
            Thread.sleep(2000);
        }

        //date select
        String day = "3";
        List<WebElement> dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));

        for (WebElement date : dates) {
            if (date.getText().equals(day)) {
                date.click();
                System.out.println("Date Selected: " + day);
                break;
            }
        }
        }
        //Passengers
        public static void selectedPassengers(WebDriver driver, int adult, int children, int infant) throws InterruptedException {
        WebElement passenger = driver.findElement(By.id("divpaxinfo"));
        passenger.click();
        Thread.sleep(2000);
        
        WebElement adults = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
		for(int i = 1; i < adult; i++) {
        	adults.click();
        	Thread.sleep(2000);
        	
        }
		
		 WebElement childrens = driver.findElement(By.id("int adults = driver.findElements(By.id("));
			for(int i = 1; i < children; i++) {
	        	childrens.click();
	        	Thread.sleep(2000);
			}
			
			 WebElement infants = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT"));
				for(int i = 1; i < infant; i++) {
		        	infants.click();
		        	Thread.sleep(2000);
				}
				System.out.println("Passengers Selected:"+adults+"Adults,"+children+"Children,"+infants+"Infants");
		
    }
   
    
}

