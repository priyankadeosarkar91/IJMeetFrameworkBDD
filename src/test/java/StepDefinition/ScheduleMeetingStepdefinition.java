package StepDefinition;

import com.POM.DashboardPage;
import com.Utility.Keyword;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScheduleMeetingStepdefinition {
	DashboardPage dpage;

	@When("The user Clicks on the  Schedule Meeting button")
	public void the_user_Clicks_on_the_Schedule_Meeting_button() {
		Keyword.clickOnElement(dpage.scheduleMeetingButton);
	}

	@Then("The application is launched successfully and the meeting schedule form is displayed")
	public void the_application_is_launched_successfully_and_the_meeting_schedule_form_is_displayed() {
		if((Keyword.getWebElement(dpage.newMeetFormTitle).getText()).equalsIgnoreCase(" Schedule Meeting ")) {
			System.out.println("SCHEDULE MEET--- LAUNCHING SUCCESSFUL");
		}
		else {
			System.out.println("SCHEDULE MEET--- LAUNCHING FAILED");
		}
	}

	@Then("The user enters {string} and {string} in the schedule meeting form")
	public void the_user_enters_and_in_the_schedule_meeting_form(String string, String string2) {
		Keyword.getWebElement(dpage.topicTextBox).sendKeys("Test Schedule Meet");
		Keyword.getWebElement(dpage.descriptionTextBox).sendKeys("Here i want to test scenario by scheduling a new meet with automation");

	}

	@Then("The user enters {string}")
	public void the_user_enters(String string) {
		Keyword.getWebElement(dpage.meetingInviteesTextBox).sendKeys("govind.rudrawar@gmail.com"+",");
	}

	//***Note:DTDT = Date,Time,Duration,Timezone
	@Then("The user select date,time in hr and mm, duration of meet and timezone from drop down")
	public void the_user_select_date_time_in_hr_and_mm_duration_of_meet_and_timezone_from_drop_down() {
		
			Keyword.selectFromDropDown(dpage.dateTextBox, "SelectByValue","5");
			Keyword.selectFromDropDown(dpage.monthSelect, "SelectByValue","Sep");
			Keyword.selectFromDropDown(dpage.yearSelect, "SelectByValue","2020");
			Keyword.selectFromDropDown(dpage.startHour, "SelectByValue","01");
			Keyword.selectFromDropDown(dpage.startMinute, "SelectByValue","30");
			Keyword.selectFromDropDown(dpage.selectAmPm, "SelectByValue","PM");
			Keyword.selectFromDropDown(dpage.durationHour, "SelectByValue","01");
			Keyword.selectFromDropDown(dpage.durationMinute, "SelectByValue","30");
			Keyword.selectFromDropDown(dpage.timeZone, "SelectByValue","(GMT+05:30) Asia/Kolkata");
	}

	//***Note:VCRM=Video,Conference,RecurringMeeting
	@Then("The user select video, conference mode, recurring meeting with slider panel")
	public void the_user_select_video_conference_mode_recurring_meeting_with_slider_panel() {
		Keyword.clickOnElement(dpage.videoHostToggleButton);		
		Keyword.clickOnElement(dpage.videoParticipantsToggleButton);		
		Keyword.clickOnElement(dpage.isRecurringToggleButton);		
	}

	@Then("The user enters intervals of meeting in given text box")
	public void the_user_enters_intervals_of_meeting_in_given_text_box() {
		Keyword.getWebElement(dpage.intervalTextBox).sendKeys("4");
	}

	@Then("The user should click on save changes")
	public void the_user_should_click_on_save_changes() {
		Keyword.clickOnElement(dpage.saveChangesButton);
	}

	@Then("The User enters invalid meeting schedule input error popup window is displayed")
	public void the_User_enters_invalid_meeting_schedule_input_error_popup_window_is_displayed() {
		System.out.println("The User enters invalid meeting schedule input errr popup window is displayed");
	}

//	@Given("The application is launched in the chrome Browser")
//	public void launchApplication() {
//		//Launch application is declared in @before hook 
//	}
//
//	@And("The click on the SignIn button on the Home-page")
//	public void clickOnSignInButton() {
//		Keyword.getWebElement(AccessUtilityFile.getLocator1("HompepageSignin")[0], AccessUtilityFile.getLocator1("HompepageSignin")[1]).click();
//	}
//
//	@When("The user Enter {string} and {string}")
//	public void the_User_Enter_and(String string, String string2) {
//		WebElement element=Keyword.getWebElement(AccessUtilityFile.getLocator1("Username")[0], AccessUtilityFile.getLocator1("Username")[1]);
//		Keyword.enterText(element,"priyadeosarkar91@gmail.com");
//		WebElement element1=Keyword.getWebElement(AccessUtilityFile.getLocator1("Password")[0], AccessUtilityFile.getLocator1("Password")[1]);
//		Keyword.enterText(element1,"Priyanka$1113");
//	}
//	
//	@Then("The user should login successfully")
//	public void clickOnSignin() {
//		
//		Keyword.getWebElement(AccessUtilityFile.getLocator1("LoginButton")[0], AccessUtilityFile.getLocator1("LoginButton")[1]).click();
//		if(Constants.driver.getCurrentUrl().equalsIgnoreCase(AccessUtilityFile.getProperty("DashboardURL"))) {
//			System.out.println("LOGIN SUCCESSFUL");
//		}
//		else {
//			String failMSG=Keyword.getWebElement(AccessUtilityFile.getLocator1("Failmsg")[0], AccessUtilityFile.getLocator1("Failmsg")[1]).getText();
//			System.out.println("LOGIN FAILED"+ failMSG);
//		}
//	}
//
//	@And("The Clicks on the  Schedule Meeting button")
//	public void clickOnScheduleMeetingButton() {
//		Keyword.clickOnElement(dpage.scheduleMeetingButton);
//	}
//
//	@Then("Then The application is launched successfully and the meeting schedule form is displayed")
//	public void isNewMeetLaunched() {
//		if((Keyword.getWebElement(spage.newMeetFormTitle).getText()).equalsIgnoreCase(" Schedule Meeting ")) {
//			System.out.println("SCHEDULE MEET--- LAUNCHING SUCCESSFUL");
//		}
//		else {
//			System.out.println("SCHEDULE MEET--- LAUNCHING FAILED");
//		}
//	}
//
//	@When("When The user enters {String} and {String} in the schedule meeting form")
//	public void enterMeetTopicAndDescription(String topicname, String description) {
//		Keyword.getWebElement(spage.topicTextBox).sendKeys("Test Schedule Meet");
//		Keyword.getWebElement(spage.descriptionTextBox).sendKeys("Here i want to test scenario by scheduling a new meet with automation");
//	}
//
//	@And("The user enters {String}")
//	public void enterMeetingInvitees(String invite) {
//		Keyword.getWebElement(spage.meetingInviteesTextBox).sendKeys("govind.rudrawar@gmail.com"+",");
//	}
//
//	//***Note:DTDT = Date,Time,Duration,Timezone
//	@Then("The user select date,time in hr and mm, duration of meet and timezone from drop down")
//	public void selectDTDTusingDropdown() {
//		Keyword.selectFromDropDown(spage.dateTextBox, "SelectByValue","3");
//		Keyword.selectFromDropDown(spage.monthSelect, "SelectByValue","Sep");
//		Keyword.selectFromDropDown(spage.yearSelect, "SelectByValue","2020");
//		Keyword.selectFromDropDown(spage.startHour, "SelectByValue","01");
//		Keyword.selectFromDropDown(spage.startMinute, "SelectByValue","30");
//		Keyword.selectFromDropDown(spage.selectAmPm, "SelectByValue","PM");
//		Keyword.selectFromDropDown(spage.durationHour, "SelectByValue","01");
//		Keyword.selectFromDropDown(spage.durationMinute, "SelectByValue","30");
//		Keyword.selectFromDropDown(spage.timeZone, "SelectByValue","(GMT+05:30) Asia/Kolkata");
//	}
//
//	//***Note:VCRM=Video,Conference,RecurringMeeting
//	@And("The user select video, conference mode, recurring meeting with slider panel")
//	public void selectVCRMusingsliderpanel() {
//		Keyword.clickOnElement(spage.videoHostToggleButton);		
//		Keyword.clickOnElement(spage.videoParticipantsToggleButton);		
//		Keyword.clickOnElement(spage.isRecurringToggleButton);		
//	}
//
//	@And("the user enters intervals of meeting in given text box")
//	public void enterMeetingIntervals() {
//		Keyword.getWebElement(spage.intervalTextBox).sendKeys("4");
//	}
//	
//	@Then("The user should click on save changes")
//	public void clickOnSave() {
//		Keyword.clickOnElement(spage.saveChangesButton);
//	}
//	
//	@But("The User enters invalid meeting schedule input errr popup window is displayed")
//	public void the_Modal_Pop_up_is_closed_by_clicking_on_the_cancel_button() {
//		System.out.println("The User enters invalid meeting schedule input errr popup window is displayed");
//	}
//
}
