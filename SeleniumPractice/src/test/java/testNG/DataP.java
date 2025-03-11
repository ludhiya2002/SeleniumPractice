package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataP {
	
	@DataProvider (name="data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{"Wipro"}, {"Infosys"}};
	}
	
	@Test (dataProvider = "data-provider")
	public void myTest (String val) {
		System.out.println("Passed Parameter Is:"+val);
	}
	

}
