package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FEATURES/BackGround.feature",glue= {"tags"},
plugin= {"html:target/cucumber-reports/BG.html"})

public class BackGround_runner {

}
