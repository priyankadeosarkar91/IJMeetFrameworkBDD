package StepDefinition;

import org.testng.Assert;

import com.POM.QuickMeetingPage;
import com.POM.SignInWithFacebookPage;
import com.Utility.AccessUtilityFile;
import com.Utility.Keyword;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInFunctionalityStepDefinition {
	QuickMeetingPage page;
	SignInWithFacebookPage fbpage;
	
	@Given("The user has launched the Browser and the application ijmeet")
	public void the_user_has_launched_the_Browser_and_the_application_ijmeet() {
		Keyword.launchBrowser(AccessUtilityFile.getProperty("Browser"));
	    Keyword.launchUrl(AccessUtilityFile.getProperty("Application"));
	}

	@When("The user clicks on the Sign-In button on the Homepage")
	public void the_user_clicks_on_the_Sign_In_button_on_the_Homepage() {
		page = new QuickMeetingPage();
		Keyword.clickOnElement(page.signInButton);
	 }

	@Then("The user lands on the Log-In Page")
	public void the_user_lands_on_the_Log_In_Page() {
		String url =Keyword.getCurrentUrl();
	    boolean result=url.contains("login");
	    Assert.assertTrue(result);
	}

	@Given ("The User chooses to use Google credentials for signing into ijmeet application")
	public void the_User_chooses_to_use_Google_credentials_for_signing_into_ijmeet_application() {
		page = new QuickMeetingPage();
		Keyword.clickOnElement(page.signInWithGoogle);
	}
	@When("The User uses valid Google Credentials to Log-In and clicks on next button")
	public void the_user_uses_valid_Google_Credentials_First_the_emailID_and_clicks_on_next_button() {
		Keyword.enterText(page.emailIdTexbox, "govind.rudrawar@gmail.com");
		Keyword.clickOnElement(page.nextButtonforGoogleEmail);
		Keyword.enterText(page.enterPassword, "@password123");
		Keyword.clickOnElement(page.nextButton); 
	}

	@Then("The User lands on the Dashboard Page")
	public void the_User_lands_on_the_Dashboard_Page() {
		String url=Keyword.getCurrentUrl();
		boolean result=url.contains("dashboard");
	    Assert.assertTrue(result);
	}

	@When("The user clicks on the Quick Meeting button")
	public void the_user_clicks_on_the_Quick_Meeting_button() {
		page = new QuickMeetingPage();
		Keyword.clickOnElement(page.quickMeetingButton);
	}

	@Then("The Quick Meeting is launched successfully")
	public void the_Quick_Meeting_is_launched_successfully() {
		String s=Keyword.getCurrentUrl();
		boolean result=s.contains("conf");
		Assert.assertTrue(result);
	}


	@When("The User chooses to use Facebook for Signing-in to the ijmeet application")
	public void the_User_uses_valid_Facebook_credentials_Firstly_the_emailID_registered_with_FB_Account() {
		page = new QuickMeetingPage();
		Keyword.clickOnElement(page.signInWithFacebook);
	}

	@When("The User uses valid Facebook credentials to LogIn and then clicks on Log-In button")
	public void the_User_uses_valid_Facebook_credentials_to_LogIn_and_then_clicks_on_Log_In_button() {
		fbpage = new SignInWithFacebookPage();
		Keyword.enterText(fbpage.emailIdTextBox, "govind.rudrawar@gmail.com");
		Keyword.enterText(fbpage.passwordTextBox, "password123");
		Keyword.clickOnElement(fbpage.logInButton);
		//Keyword.clickOnElement(fbpage.confirmButton);
	}
	@When("The User uses valid Custom Credentials to Log-in into the ijmeet application and clicks on SignIn button")
	public void the_User_uses_valid_Custom_Credentials_to_Log_in_into_the_ijmeet_application_and_clicks_on_SignIn_button() {
	    page = new QuickMeetingPage();
	    Keyword.enterText(page.emailTextBox, "govind.rudrawar@gmail.com");
	    Keyword.enterText(page.passwordTextBox, "password123");
	    Keyword.clickOnElement(page.signInbutton);
	    
}
}