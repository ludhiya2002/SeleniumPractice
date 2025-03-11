package Program;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Opening Web Browser");
		System.out.println("Enter a URL");
		String url = s.nextLine().trim();
		s.close();
		if(url.isEmpty()) {
			System.out.println("Chrome will not open");
			return;
		}
		else {
			 WebDriver driver = new ChromeDriver();
			 driver.get(url);
			 
			 System.out.println("Chrome has been opened successfully");
			
		}
	
		
		
	}

}
