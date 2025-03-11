package Wipro.SeleniumPractice;

public class FluentWait {
	//Declare and initialise a fluent wait
	FluentWait wait = new FluentWait(driver);
	//Specify the timout of the wait
	wait.withTimeout(5000, TimeUnit.MILLISECONDS);
	//Sepcify polling time
	wait.pollingEvery(250, TimeUnit.MILLISECONDS);
	//Specify what exceptions to ignore
	wait.ignoring(NoSuchElementException.class)

	//This is how we specify the condition to wait on.
	//This is what we will explore more in this chapter
	wait.until(ExpectedConditions.alertIsPresent());
}
