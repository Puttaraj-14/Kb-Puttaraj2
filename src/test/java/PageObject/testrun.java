package PageObject;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class testrun {
    @RunWith(Cucumber.class)
    @CucumberOptions(features="resources/features", glue="")
    public class TestRunner_GoogleHomepage {

    }

}
