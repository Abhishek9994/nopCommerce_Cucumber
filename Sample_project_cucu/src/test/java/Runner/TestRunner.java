package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/test/resources/Login/Login.feature"}
,glue ="StepDefinition")

public class TestRunner  extends AbstractTestNGCucumberTests {
	

}
