package StepDefinition;



import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

//plugin = {"pretty","json:target/jsonReports.json"}

//plugin = {"pretty","junit:target/XmlReports/xmlreport.xml"}

//to run by filtering with tags tags="@Smoke" like we use
@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefinition"},monochrome = true,plugin = {"pretty","html:target/Reports"})
public class TestRunner {

}
