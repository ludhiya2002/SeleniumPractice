package Program;

import org.openqa.selenium.By;

public class Practice3 extends BaseClass1{

	public static void main(String[] args) throws InterruptedException {

				// spice jet
				invokeBrowser("Chrome");
				driver.get("https://book.spicejet.com/");
				//Do the from and to city selection
				
				//click calendar
				//driver.findElement(By.id("custom_date_picker_id_1")).click();
				String month="August";
				while(!driver.findElement(By.cssSelector("span[class='ui-datepicker-month']")).getText().contains(month))
				{
					driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
				}	
				
				//Day count
				int count = driver.findElements(By.xpath("//a[@class='ui-state-default']")).size();
				System.out.println(count);//60
				
				//Day selection
				String day="25";
				for(int i=0;i<count;i++)
				{
					String text = driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).getText();
					if(text.equals(day)) //if (true)
					{
						//perform click
						System.out.println("We are inside the if condition");
						Thread.sleep(1000);
						driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click();
						break;
					}
				}
			}
		 

	}

