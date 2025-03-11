package Wipro.SeleniumPractice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.navigate().to("https://demo.guru99.com/test/web-table-element.php");
		//Logic to capture the total no of columns in the above table
		List<WebElement> headers = driver.findElements(By.xpath("//table[@class='dataTable']//thead/tr/th"));
		System.out.println("Total no of headers/columns: "+headers.size());//5
		
		//Print all the header values
		System.out.println("Table Headers:");
        for (WebElement header : headers) {
            System.out.println(header.getText());
        }
		
		
		//Find the total no of rows(tbody) in the table & print the values
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr"));
        System.out.println("Total number of rows: " + rows.size());
      
        
        //Print all rows
        System.out.println("Table Data:");
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + "  ");
            }
            System.out.println();
            
        }

		
		//find any one cell within the table and print the value
        WebElement specificCell = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr[1]/td[2]"));
        System.out.println("Value of first row, second column: " + specificCell.getText());
        Thread.sleep(3000);

        driver.quit();

	}
}


