package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FEATURES/p2.feature",glue= {"tags"},plugin= {"html:target/cucumber-reports/a1.html"})




public class p2 {

}
