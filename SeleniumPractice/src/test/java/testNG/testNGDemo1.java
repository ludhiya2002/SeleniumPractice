package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNGDemo1 {
	
//	@Test
//	public void welcome()
//	{
//		System.out.println("Welcome to testNG framework");
//		}
	@Test (enabled = false,priority=1,groups={"regression"}) //main method
	public void TC1() {
	System.out.println("Welcome to TestNG framewok");
	String name = "Wipro";
	Assert.assertEquals(name, "Wipro");
	System.out.println("Both are equal");
	
	}
	
	@Test(enabled = true,priority=0,groups= {"smoke","crazy"})// main method
	public void TC2() {
		System.out.println("Bye to TestNG framwork");
		Assert.assertEquals(5>6,false);//pass
		Assert.assertTrue(4<5); //false
	}
	
//	public void TC1()
//	{
//		System.out.println("Welcome to TestNG framework");	}
//	
//	@Test (priority=0)
//	
//	public void TC2()
//	{
//		System.out.println("Bye to TestNG framework");
//	}
//	
}
