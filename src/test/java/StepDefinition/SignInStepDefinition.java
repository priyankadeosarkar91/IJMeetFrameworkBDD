package StepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.AccessUtilityFile;
import com.Utility.Constants;
import com.Utility.Keyword;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Step Definition file created would be consisting of a code which defines the
 * steps for annotations created in feature file. 
 * Here, in this class Test Steps are defined for sign in functionality 
 * according to feature file
 * 
 * @author Priyanka
 *
 */

public class SignInStepDefinition {


	@Before
	public void setup() {

		Keyword.launchBrowser("Chrome");
//		Keyword.launchUrl("https://ijmeet.com");
		Keyword.launchUrl("https://ijmeet.com/login");
		
	}
//	@After
//	public void teardown() {
//		
//		Keyword.closeAllWindows();
//	}

	@When("User Enter {string} and {string}")
	public void enterUIDandPassword(String uname, String pass) {

		WebElement element=Keyword.getWebElement(AccessUtilityFile.getLocator("Username")[0], AccessUtilityFile.getLocator("Username")[1]);
		Keyword.enterText(element,uname );
		WebElement element1=Keyword.getWebElement(AccessUtilityFile.getLocator("Password")[0], AccessUtilityFile.getLocator("Password")[1]);
		Keyword.enterText(element1,pass );

	}

	@Then("Check user should login")
	public void check_user_should_login() {
		
		Keyword.getWebElement(AccessUtilityFile.getLocator("LoginButton")[0], AccessUtilityFile.getLocator("LoginButton")[1]).click();
		if(Constants.driver.getCurrentUrl().equalsIgnoreCase(AccessUtilityFile.getProperty("DashboardURL"))) {
			System.out.println("LOGIN SUCCESSFUL");
		}
		else {
			String failMSG=Keyword.getWebElement(AccessUtilityFile.getLocator("Failmsg")[0], AccessUtilityFile.getLocator("Failmsg")[1]).getText();
			System.out.println("LOGIN FAILED"+ failMSG);
		}
		

	}

}
