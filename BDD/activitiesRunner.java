package ActivitiesRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ="src/test/java/Features",
		glue ={"stepDefinations"},
		tags = "@activity2_5",
		dryRun= false,
		plugin = { "pretty", "html:target/cucumber-reports/reports"},
		monochrome = true
		
		
		)


public class activitiesRunner {

}
