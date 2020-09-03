//package StepDefinition;
//
//import org.testng.Assert;
//
//import com.POM.QuickMeetingPage;
//import com.Utility.AccessUtilityFile;
//import com.Utility.Keyword;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class ToolTipsStepDefinition {
//	QuickMeetingPage page;
//	@Given("The user has launched the browser and the application ijmeet")
//	public void the_user_has_launched_the_browser_and_the_application_ijmeet() {
//		Keyword.launchBrowser(AccessUtilityFile.getProperty("Browser"));
//	    Keyword.launchUrl(AccessUtilityFile.getProperty("Application"));
//	}
//
//	@When("The user uses google credentials to login")
//	public void the_user_uses_google_credentials_to_login() {
//		page = new QuickMeetingPage();
//		Keyword.clickOnElement(page.signInButton);
//		Keyword.clickOnElement(page.signInWithGoogle);
//		Keyword.enterText(page.emailIdTexbox, "govind.rudrawar@gmail.com");
//		Keyword.clickOnElement(page.nextButtonforGoogleEmail);
//		Keyword.enterText(page.enterPassword, "@password123");
//		Keyword.clickOnElement(page.nextButton);
//
//	}
//
//	@And("The user clicks on the quick meeting link on the dashboard page")
//	public void the_user_clicks_on_the_quick_meeting_link_on_the_dashboard_page() {
//		page = new QuickMeetingPage();
//		Keyword.clickOnElement(page.quickMeetingButton);
//	}
//
//	@Then("The Quick Meeting is launched")
//	public void the_Quick_Meeting_is_launched() {
//		String s=Keyword.getCurrentUrl();
//		boolean result=s.contains("conf");
//		Assert.assertTrue(result);
//	}
//
//	@Given("The User locates the shareYourScreenButton")
//	public void the_User_locates_the_shareYourScreenButton() {
//		page=new QuickMeetingPage();
//		Keyword.scrollByVisibleElement(page.shareYourScreen);
//	}
//
//	@When("The User hovers the mouse over  shareYourScreebutton")
//	public void the_User_hovers_the_mouse_over_shareYourScreebutton() {
//		page=new QuickMeetingPage();
//		Keyword.hoverMouseOnWebElement(page.shareYourScreen);
//	}
//
//	@Then("Correct message is displayed")
//	public void correct_message_is_displayed() {
//		page=new QuickMeetingPage();
//		String s=Keyword.getWebElementText(page.shareYourScreen);
//		System.out.println(s);
//	}
//
//	@Given("The User locates the raiseYourHandButton")
//	public void the_User_locates_the_raiseYourHandButton() {
//		page=new QuickMeetingPage();
//		Keyword.scrollByVisibleElement(page.raiseYourHand);
//
//	}
//
//	@When("The User hovers the mouse over  shareYourScreenutton")
//	public void the_User_hovers_the_mouse_over_raiseYourHandButton() {
//		page=new QuickMeetingPage();
//		Keyword.hoverMouseOnWebElement(page.raiseYourHand);
//		
//	}
//
//	@Then("Message displayed is as expected")
//	public void message_displayed_is_as_expected() {
//		page=new QuickMeetingPage();
//		String s=Keyword.getWebElementText(page.raiseYourHand);
//		System.out.println(s);
//	}
//
//	@Given("The User locates the openCloseChat")
//	public void the_User_locates_the_openCloseChat() {
//		page=new QuickMeetingPage();
//		Keyword.hoverMouseOnWebElement(page.opencloseChat);
//	}
//
//	@When("The User hovers the mouse over  openCloseChat")
//	public void the_User_hovers_the_mouse_over_openCloseChat() {
//		page=new QuickMeetingPage();
//		Keyword.hoverMouseOnWebElement(page.opencloseChat);
//	}
//
//	@Then("Message shown is correct")
//	public void message_shown_is_correct() {
//		page=new QuickMeetingPage();
//		String s =Keyword.getWebElementText(page.opencloseChat);
//		System.out.println(s);
//	}
//
//	@Given("The User locates the muteUnmuteAudioButton")
//	public void the_User_locates_the_muteUnmuteAudioButton() {
//		page=new QuickMeetingPage();
//		Keyword.scrollByVisibleElement(page.muteUnmuteAudio);
//	}
//
//	@When("The User hovers the mouse over  muteUnmuteAudioButton")
//	public void the_User_hovers_the_mouse_over_muteUnmuteAudioButton() {
//		page=new QuickMeetingPage();
//		Keyword.hoverMouseOnWebElement(page.muteUnmuteAudio);
//	}
//
//	@Then("Message shown is correctly displayed")
//	public void message_shown_is_correctly_displayed() {
//		page=new QuickMeetingPage();
//		String s=Keyword.getWebElementText(page.muteUnmuteAudio);
//	}
//
//	@Given("The User locates the leaveCallButton")
//	public void the_User_locates_the_leaveCallButton() {
//		page=new QuickMeetingPage();
//		Keyword.scrollByVisibleElement(page.leaveCall);
//	}
//
//	@When("The User hovers the mouse over  leaveCallButton")
//	public void the_User_hovers_the_mouse_over_leaveCallButton() {
//		page=new QuickMeetingPage();
//		Keyword.hoverMouseOnWebElement(page.leaveCall);
//	}
//
//	@Then("Message is shown correctly")
//	public void message_is_shown_correctly() {
//		page=new QuickMeetingPage();
//		String s=Keyword.getWebElementText(page.leaveCall);
//	}
//
//	@Given("The User locates the muteVideoButton")
//	public void the_User_locates_the_muteVideoButton() {
//		page=new QuickMeetingPage();
//		Keyword.scrollByVisibleElement(page.muteVideo);
//	}
//
//	@When("The User hovers the mouse over  muteVideoButton")
//	public void the_User_hovers_the_mouse_over_muteVideoButton() {
//		page=new QuickMeetingPage();
//		Keyword.hoverMouseOnWebElement(page.muteVideo);
//	}
//
//	@Then("Display of the tooltip message is correctly shown")
//	public void display_of_the_tooltip_message_is_correctly_shown() {
//		page=new QuickMeetingPage();
//		String s=Keyword.getWebElementText(page.muteVideo);
//		System.out.println(s);
//		
//	}
//
//	@Given("The User locates the toggleViewButton")
//	public void the_User_locates_the_toggleViewButton() {
//		page=new QuickMeetingPage();
//		Keyword.scrollByVisibleElement(page.toggleView);
//	}
//
//	@When("The User hovers the mouse over  toggleViewButton")
//	public void the_User_hovers_the_mouse_over_toggleViewButton() {
//		page=new QuickMeetingPage();
//		Keyword.hoverMouseOnWebElement(page.toggleView);
//	}
//
//	@Then("Display of the tooltip message is correct")
//	public void display_of_the_tooltip_message_is_correct() {
//		page=new QuickMeetingPage();
//		String s=Keyword.getWebElementText(page.toggleView);
//		System.out.println(s);
//	}
//
//	@Given("The User locates the securityOptionsButton")
//	public void the_User_locates_the_securityOptionsButton() {
//		page=new QuickMeetingPage();
//		Keyword.scrollByVisibleElement(page.securityOptions);
//	}
//
//	@When("The User hovers the mouse over  securityOptionsButton")
//	public void the_User_hovers_the_mouse_over_securityOptionsButton() {
//		page=new QuickMeetingPage();
//		Keyword.hoverMouseOnWebElement(page.securityOptions);
//	}
//
//	@Then("Tooltip message is shown correctly")
//	public void tooltip_message_is_shown_correctly() {
//		page=new QuickMeetingPage();
//		String s=Keyword.getWebElementText(page.securityOptions);
//		System.out.println(s);
//	}
//
//	@Given("The User locates the moreActionsLink")
//	public void the_User_locates_the_moreActionsLink() {
//		page=new QuickMeetingPage();
//		Keyword.scrollByVisibleElement(page.moreActions);
//
//	}
//
//	@When("The User hovers the mouse over  moreActionsLink")
//	public void the_User_hovers_the_mouse_over_moreActionsLink() {
//		page=new QuickMeetingPage();
//		Keyword.hoverMouseOnWebElement(page.moreActions);
//	}
//
//	@Then("Tooltip message is displayed correctly")
//	public void tooltip_message_is_displayed_correctly() {
//		page=new QuickMeetingPage();
//		String s=Keyword.getWebElementText(page.moreActions);
//		System.out.println(s);
//	}
//
//}
