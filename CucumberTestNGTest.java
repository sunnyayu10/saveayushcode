package cucumber_test;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/features/EbayTagEx.feature", glue="stepDefinitions", plugin= {"pretty", "html:target/cucumber-reports.html"})


public class CucumberTestNGTest extends AbstractTestNGCucumberTests{
	
}
