package cucumber_test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/features/login.feature", glue="stepDefinitions"
                // tags="@SmokeSuite and @SearchPageCategoryValidations",
                //plugin= {"pretty", "html:target/cucumber-reports.html"}

		        )

public class TestRun {

}
