package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features/Salesforce.feature", glue="steps",monochrome=true,publish=true)
public class SalesforceRunnerClass extends AbstractTestNGCucumberTests{
	
}