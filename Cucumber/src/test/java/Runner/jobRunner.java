package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sampa\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature\\job.feature",
glue="StepDef",plugin= {"pretty","html:target/Tester_Reports.html"},monochrome=true)
public class jobRunner {

}
