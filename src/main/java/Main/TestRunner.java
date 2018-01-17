package Main;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="Feature/Cucumber.feature", glue= "StepDef")

public class TestRunner {

}
