package RunnerUtility;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Here is the RunnerClass file to automate our feature file through Selenium
 * using TestNG.
 * 
 * @author Priyanka
 *
 */

@CucumberOptions(features = "src/test/java/Features", glue = "src/test/java/StepDefinition", tags = "", plugin = { "pretty",
		"com.cucumber.listener.ExtentCucumberFormatter:target/Reports/MyFirstExtentReport.html" })

public class RunnerClass extends AbstractTestNGCucumberTests {

}
