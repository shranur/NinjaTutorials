package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featurefile",
								glue = {"stepDefinitions","hooks"},
								plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "junit:target/cucumber.xml"} )
public class ProjectRunner {

}
