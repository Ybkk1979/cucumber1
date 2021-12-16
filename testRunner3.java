package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FEATURES/yahoo.feature",glue= {"tags"}, plugin = { "json:target/cucumber1.json", "pretty",
"html:target/cucumber/test1.html" })

public class testRunner3 {

}
