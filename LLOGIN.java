package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FEATURES/HOOKS.feature",glue= {"tags"}, plugin = { "json:target/cucumber.json", "pretty",
        "html:target/cucumber1-reports.html" })
public class LLOGIN {

}
