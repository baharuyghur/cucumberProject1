package runners;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.Constants;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin= {"pretty","json:target/cucumber-reports/Cucumber.json","html:target/cucumber-report.html"},
		features=Constants.feature_path,
		glue="stepDefinitions",
		dryRun=false,
		tags="@searchBox"
		
		)

public class CukeRunners {
	
	

}
