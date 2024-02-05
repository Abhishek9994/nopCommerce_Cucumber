package AdnavedRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/AdvancedForm/AdvancedForm.feature"
,glue = "AdvancedFormDefinition"
,plugin = {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml","json:testoutput/cucumberjason.xml"})



public class AdvancedFormRunner {
	
	

}
