//package StepDefinition;
//
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//
//import com.POM.Homepage;
//import com.POM.QuickMeetingPage;
//import com.Utility.AccessUtilityFile;
//import com.Utility.Constants;
//import com.Utility.Keyword;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class GetTheQuickMeetingLinkStepDefinition {
//	QuickMeetingPage page;
//	
//	
//	public GetTheQuickMeetingLinkStepDefinition() {
//		super();
//		PageFactory.initElements(Constants.driver, this);
//	}
//	
//	;
//	@Given("The ijmeet application is launched using Chrome browser")
//	public void the_ijmeet_application_is_launched_using_Chrome_browser() {
//	    Keyword.launchBrowser(AccessUtilityFile.getProperty("Browser"));
//	    Keyword.launchUrl(AccessUtilityFile.getProperty("Application"));
//	}
//
//	@And("User uses gmail credentials to log in")
//	public  void user_uses_gmail_credentials_to_log_in() {
//	page = new QuickMeetingPage();
//	Keyword.clickOnElement(page.signInButton);
//	Keyword.clickOnElement(page.signInWithGoogle);
//	Keyword.enterText(page.emailIdTexbox, "govind.rudrawar@gmail.com");
//	Keyword.clickOnElement(page.nextButtonforGoogleEmail);
//	Keyword.enterText(page.enterPassword, "@password123");
//	Keyword.clickOnElement(page.nextButton);
//	}
//
//	@And("User lands on the dashboard page and clicks on quick meeting")
//	public void user_lands_on_the_dashboard_page_and_clicks_on_quick_meeting() {
//	page = new QuickMeetingPage();
//	Keyword.clickOnElement(page.quickMeetingButton);
//	}
//	@Then("The application is launched successfully") 
//	public void the_application_is_launched_successfully() {
//		String s=Keyword.getCurrentUrl();
//		boolean result=s.contains("conf");
//		Assert.assertTrue(result);
//	}
//	
//	@Then("The Modal Pop Up is displayed on which is given the link for the session created")
//	public void the_Modal_Pop_Up_is_displayed_on_which_is_given_the_link_for_the_session_created() {
//		Keyword.ifAlert();
//	}
//	
//	@And ("The user gets the link saves it and prints it")
//	public void the_user_gets_the_link_saves_it_and_prints_it() {
//		page = new QuickMeetingPage();
//		String s=Keyword.getWebElementText(page.meetingUrl);
//		System.out.println(s);
//	}
//	
//	@And("The user cancels the Modal Pop up by clicking on the cancel button on the Pop Up")
//	public void the_user_cancels_the_Modal_Pop_up_by_clicking_on_the_cancel_button_on_the_Pop_Up() {
//		page = new QuickMeetingPage();
//		Keyword.clickOnElement(page.popUpClosebutton);
//	}
//}
