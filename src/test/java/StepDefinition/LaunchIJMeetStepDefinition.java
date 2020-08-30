package StepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Utility.AccessUtilityFile;
import com.Utility.Constants;
import com.Utility.Keyword;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaunchIJMeetStepDefinition {
	String homepageUrl=null;
	String loginPageUrl=null;
	
	@After
	public void closeResources() {
		Keyword.closeAllWindows();
	}
	
	@Given ("The Chrome Browser is opened and the application is launched")
	public void the_Chrome_Browser_is_opened_and_the_application_is_launched() {
		Keyword.launchBrowser("Chrome");
		Keyword.launchUrl("https://www.ijmeet.com");
		Keyword.maximizeWindow();
		homepageUrl=Keyword.getCurrentUrl();
		
		//throw new io.cucumber.java.PendingException();
	}
	@And ("The user clicks on the SignIn button on the Home-page")
	public void the_user_clicks_on_the_SignIn_button_on_the_Home_page() {
	    WebElement element=Keyword.getWebElement(AccessUtilityFile.getLocator("SignInButton")[0], AccessUtilityFile.getLocator("SignInButton")[1]);
		Keyword.clickOnElement(element);
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("A new web-page will open")
	public void a_new_web_page_will_open() {
	    loginPageUrl=Keyword.getCurrentUrl();
	    boolean result=loginPageUrl.equalsIgnoreCase(homepageUrl);
	    Assert.assertFalse(result);
	    //throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on the SignInWithGoogle button on the newly opened page")
	public void the_user_clicks_on_the_SignInWithGoogle_button_on_the_newly_opened_page() {
	   
		Keyword.clickOnElement(Keyword.getWebElement(AccessUtilityFile.getLocator("SignInWithGoogle")[0], AccessUtilityFile.getLocator("SignInWithGoogle")[1]));
	    //throw new io.cucumber.java.PendingException();
	}

	@And ("The user enters valid credentials and clicks on enter")
	public void the_user_enters_valid_credentials_and_clicks_on_enter() {
	    WebElement email=Keyword.getWebElement(AccessUtilityFile.getLocator("GoogleAccount")[0], AccessUtilityFile.getLocator("GoogleAccount")[1]);
	    email.sendKeys("govind.rudrawar@gmail.com");
	    WebElement password =Keyword.getWebElement(AccessUtilityFile.getLocator("Password")[0], AccessUtilityFile.getLocator("Password")[1]);
	    password.sendKeys("password123");
	    password.click();
	    //throw new io.cucumber.java.PendingException();
	}

	@And ("User Clicks on the button for Quick Meeting")
	public void user_Clicks_on_the_button_for_Quick_Meeting() {
	    Keyword.clickOnElement(Keyword.getWebElement(AccessUtilityFile.getLocator("QuickMeeting")[0], AccessUtilityFile.getLocator("QuickMeeting")[1]));
	    //throw new io.cucumber.java.PendingException();
	}
	@Then ("The application is launched successfully")
	public void the_application_is_launched_successfully() {
		Keyword.implicitWait(5);
		String currentUrl=Keyword.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://ijmeet.com/conf");
		//throw new io.cucumber.java.PendingException();
	}

	@And("The Modal Pop Up is displayed on which is given the link for the session created")
	public void the_Modal_Pop_Up_is_displayed_on_which_is_given_the_link_for_the_session_created() {
		Keyword.ifAlert();
		//throw new io.cucumber.java.PendingException();
	}

	@When("The user copies the link for the session created by clicking on the copy link")
	public void the_user_copies_the_link_for_the_session_created_by_clicking_on_the_copy_link() {
	    // Write code here that turns the phrase above into concrete actions
		Keyword.clickOnElement(Keyword.getWebElement(AccessUtilityFile.getLocator("CopyLink")[0], AccessUtilityFile.getLocator("CopyLink")[1]));
	    Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyRelease(KeyEvent.VK_V);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//throw new io.cucumber.java.PendingException();
	}
	@And ("The user cancels the Modal Pop up by clicking on the cancel button on the Pop Up")
	public void The_user_cancels_the_Modal_Pop_up_by_clicking_on_the_cancel_button_on_the_Pop_Up() {
		Keyword.clickOnElement(Keyword.getWebElement(AccessUtilityFile.getLocator("CancelModelPopUp")[0], AccessUtilityFile.getLocator("CancelModelPopUp")[1]));
		//throw new io.cucumber.java.PendingException();
	}
	

}
