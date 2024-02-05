package SimpleFormRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/SimpleForm/SimpleForm.feature"}
,glue = "SimpleFormDefinition"
,plugin = {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml","json:testoutput/cucumberjason.xml"})
 



public class FormRunner {

}
