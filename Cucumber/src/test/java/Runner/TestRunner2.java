package Runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="C:/Users/sampa/eclipse-workspace/Cucumber/src/test/java/feature/tester.feature",
glue="StepDef",plugin= {"pretty"},monochrome=true)

public class TestRunner2 extends AbstractTestNGCucumberTests{

}
