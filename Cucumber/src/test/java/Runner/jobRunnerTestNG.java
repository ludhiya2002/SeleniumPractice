package Runner;



import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sampa\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature\\job.feature",
glue="StepDef",plugin= {"pretty","html:target/Tester_Reports.html"},monochrome=true)

public class jobRunnerTestNG extends AbstractTestNGCucumberTests{

}
