package nopCommerceRunner;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = {"src/test/resources/Register/Register.feature"}
,glue = "nopCommerceStepDefinition"
,plugin = {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml","json:testoutput/cucumberjason.xml"})
 





public class RegisterRunner {
	

}
