package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FEATURES/new.feature",glue={"tt1"},tags = "@smoke and @regression", plugin = { "json:target/cucumber.json", 
		"pretty","html:target/cucumber/test2.html" })


public class newrunner {

}
