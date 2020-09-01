package StepDefinition;

import org.openqa.selenium.WebElement;

import com.Utility.AccessUtilityFile;
import com.Utility.Constants;
import com.Utility.Keyword;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateQuickMeetingStepdefinition {
	@Given("The application is launched in the Chrome Browser")
	public void launchApplication() {
		//Launch application is declared in @before hook 
	}

	@And("The clicks on the SignIn button on the Home-page")
	public void clickOnSignInButton() {
		Keyword.getWebElement(AccessUtilityFile.getLocator("HompepageSignin")[0], AccessUtilityFile.getLocator("HompepageSignin")[1]).click();
	}

	@When("The User Enter {string} and {string}")
	public void the_User_Enter_and(String string, String string2) {
		WebElement element=Keyword.getWebElement(AccessUtilityFile.getLocator("Username")[0], AccessUtilityFile.getLocator("Username")[1]);
		Keyword.enterText(element,"priyadeosarkar91@gmail.com");
		WebElement element1=Keyword.getWebElement(AccessUtilityFile.getLocator("Password")[0], AccessUtilityFile.getLocator("Password")[1]);
		Keyword.enterText(element1,"Priyanka$1113");
	}
	
	@Then("The user should login")
	public void clickOnSignin() {
		
		Keyword.getWebElement(AccessUtilityFile.getLocator("LoginButton")[0], AccessUtilityFile.getLocator("LoginButton")[1]).click();
		if(Constants.driver.getCurrentUrl().equalsIgnoreCase(AccessUtilityFile.getProperty("DashboardURL"))) {
			System.out.println("LOGIN SUCCESSFUL");
		}
		else {
			String failMSG=Keyword.getWebElement(AccessUtilityFile.getLocator("Failmsg")[0], AccessUtilityFile.getLocator("Failmsg")[1]).getText();
			System.out.println("LOGIN FAILED"+ failMSG);
		}
		

	}


	@And("The Clicks on the  Quick Meeting button")
	public void clickOnQuickMeetingButton() {
		Keyword.getWebElement(AccessUtilityFile.getLocator("QuickmeetingButton")[0], AccessUtilityFile.getLocator("QuickmeetingButton")[1]).click();

	}

	@Then("The application is launched successfully")
	public void the_application_is_launched_successfully() {
		if(Constants.driver.getCurrentUrl().equalsIgnoreCase(AccessUtilityFile.getProperty("QuickLaunchURL"))) {
			System.out.println("APPLICATION LAUNCHING SUCCESSFUL");
		}
		else {
			System.out.println("APPLICATION LAUNCHING FAILED");
		}
		
	}

//	@Then("The alert is appeared on screen asking to allow microphone and camera")
//	public void the_alert_is_appeared_on_screen_asking_to_allow_microphone_and_camera() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Handle alert successsfully")
//	public void handle_alert_successsfully() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("The Modal Pop Up is displayed and session link is provided on it")
	public void isPopupDisplayed() {
		boolean isPopupContent=Keyword.getWebElement(AccessUtilityFile.getLocator("ModelPopupContent")[0], AccessUtilityFile.getLocator("ModelPopupContent")[1]).isDisplayed();
		System.out.println("The model Popup is Displayed : " +isPopupContent);
		WebElement meetname=Keyword.getWebElement(AccessUtilityFile.getLocator("ModelPopupMeetName")[0], AccessUtilityFile.getLocator("ModelPopupMeetName")[1]);
		WebElement meeturl=Keyword.getWebElement(AccessUtilityFile.getLocator("ModelPopupMeetUrl")[0], AccessUtilityFile.getLocator("ModelPopupMeetUrl")[1]);
		System.out.println("POPUP contains meet name and meet url : "+ meetname.isDisplayed()+meeturl.isDisplayed());
		System.out.println("Meet Id is : "+meeturl.getText());
	}

	@Then("The copy the meeting URL for the session  created by clicking on the copy button")
	public void the_copy_the_meeting_URL_for_the_session_created_by_clicking_on_the_copy_button() {
		WebElement modelPopupcopyButton=Keyword.getWebElement(AccessUtilityFile.getLocator("ModelPopupCopyButton")[0], AccessUtilityFile.getLocator("ModelPopupCopyButton")[1]);
		modelPopupcopyButton.isEnabled();
		modelPopupcopyButton.click();
		
	}
	
	@Then("The Message is displayed on model pop up as invitation link copied successfully.")
	public void isMsgDisplayedforMeetingLinkCopiedSuccessFully() {
		WebElement modelPopupcopyButton=Keyword.getWebElement(AccessUtilityFile.getLocator("MsgLinkCopiedSuccessfully")[0], AccessUtilityFile.getLocator("MsgLinkCopiedSuccessfully")[1]);
		modelPopupcopyButton.isDisplayed();
		modelPopupcopyButton.getText();
		
	}
	
	@And("The Modal Pop up is closed by clicking on the cancel button")
	public void the_Modal_Pop_up_is_closed_by_clicking_on_the_cancel_button() {
		Keyword.getWebElement(AccessUtilityFile.getLocator("CloseModelPopup")[0], AccessUtilityFile.getLocator("CloseModelPopup")[1]);
	}

}
