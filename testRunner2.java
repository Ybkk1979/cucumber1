package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FEATURES/L1.feature",glue={"tt1"},tags = "@smoke", plugin = { "json:target/cucumber.json", 
		"pretty","html:target/cucumber/test.html" })

public class testRunner2 {
	

}
