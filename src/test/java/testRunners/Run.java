package testRunners;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

			@RunWith(Cucumber.class)
			@CucumberOptions(
			features = "C:\\Users\\Mharo\\eclipse-workspaceVersion2\\AimalCapstone\\src\\test\\resources\\features\\desktopPage.feature",
			glue = "stepDefinitions",
			tags = "@FirstTry",
			dryRun = false,
			strict = true,
			monochrome = true,
			plugin = {
					"pretty",
					"html:target/site/cucumber-pretty",
					"json:target/cucumber.json"
			},
			publish = true
			)

public class Run {

}
