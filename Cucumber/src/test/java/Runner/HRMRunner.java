package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/sampa/eclipse-workspace/Cucumber/src/test/java/feature/HRMLogin.feature",
		glue="StepDef",plugin= {"pretty"},monochrome=true)

public class HRMRunner {

}
