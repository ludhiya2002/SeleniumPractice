package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
				features = "C:\\Users\\sampa\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature\\WebSite.feature",
				glue="StepDef",
				dryRun=false,
				monochrome = true,
				plugin= {"pretty","html:target/cucumber-reports"}
				
		
		)

public class WebSiteRunner {

}
