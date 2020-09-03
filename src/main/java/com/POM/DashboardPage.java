package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Constants;

public class DashboardPage extends SignInWithGooglePage {
	
	public DashboardPage() {
		super();
		PageFactory.initElements(Constants.driver, this);
	}
	@FindBy(xpath=" //span[text()=' Home ']")
	public WebElement homeLink;
	
	@FindBy(xpath=" //span[text()=' My Account ']")
	public WebElement myAccountLink;
	
	@FindBy(xpath=" //span[text()='  Meetings ']")
	public WebElement meetingsLink;
	
	@FindBy(xpath=" //span[text()='  Application ']")
	public WebElement applicationLink;
	
	@FindBy(css="span.pro-icons-width>img")
	public WebElement userdetailsImage;
	
	@FindBy(css="button.btn.first-btn-warning.btn-rounded.btn-fw.schedule-new-meet-btn") //button[text()=' Schedule Meeting '] ")
	public WebElement scheduleMeetingButton;
	
	@FindBy(xpath="//a[@href='https://ijmeet.com/app']") // //button[text()='  Join meeting '] 
	public WebElement joinMeetingButton;
	
	@FindBy(xpath=" //button[text()=' Quick meeting '] ")
	public WebElement quickMeetingButton;
	
	@FindBy (css="input#upcoming_meeting_search_key")
	public WebElement enterSearchValueTextBox;
	
	@FindBy (css="div.col-sm-6.col-md-4.col-lg-3>input.form-control.start_date")
	public WebElement enterFromDateTextBox;
	
	@FindBy (css="input#upcoming_meeting_end_date")
	public WebElement enterToDateTextBox;
	
	@FindBy (css=".btn.btn-default.mbtn.search_value_upcoming_meeting")
	public WebElement searchMeetingsButton;
	
	@FindBy(xpath="//div[@id='ZGdPbExPS0lMRk1uamZJdldTeWowUT09']/descendant::div[@class='thomasedison-project px-3']")
	public WebElement firstLog;
	
	@FindBy (xpath="//div[@id='Qk9QV0hyQ3ZXSGtMaDRjODhoZlBxdz09']/descendant::div[@class='thomasedison-project px-3']")
	public WebElement secondLog;
	
	@FindBy (xpath="//div[@id='c2VEVGliRE1SSE5hSnZNS3VQYXdhUT09']/descendant::div[@class='thomasedison-project px-3']")
	public WebElement thirdLog; 
	//(Dash-board Page we get when we click on SignIn on Home-page
	
	//Locators after we click on Schedule Meeting on the Dash-board Page 
	
	@FindBy (css="div#meetings-scheule-create>div>ul>li")
	public WebElement newMeetFormTitle;
	
	@FindBy (css=".col-lg-9.col-xl-6>input#edit_topic")
	public WebElement topicTextBox;
	
	@FindBy (css=".col-lg-9.col-xl-6>#edit_description_1")
	public WebElement descriptionTextBox;
	
	@FindBy (css=".multiple_emails-container")
	public WebElement meetingInviteesTextBox;
	
	@FindBy (css="input#edit_start_end_date")
	public WebElement dateTextBox;
	
	@FindBy (css="div.drp-calendar.left.single>div.calendar-table>table.table-condensed>thead>tr>th.month>select.monthselect")
	public WebElement monthSelect;
	
	@FindBy (css="div.drp-calendar.left.single>div.calendar-table>table.table-condensed>thead>tr>th.month>select.yearselect")
	public WebElement yearSelect;
	
	@FindBy(css="div.drp-calendar.left.single>div.calendar-table>table.table-condensed>thead>tr>th.next.available")
	public WebElement nextAvaialbleMonth;
	
	@FindBy (css="div.drp-calendar.left.single>div.calendar-table>table.table-condensed>thead>tr>th.prev.available")
	public WebElement prevAvailableMonth;
	
	@FindBy (css="div>#edit_start_hour")
	public WebElement startHour;
	
	@FindBy(css="div>#edit_start_minute")
	public WebElement startMinute;
	
	@FindBy (css="div>#start_time_zn")
	public WebElement selectAmPm;
	
	@FindBy (css="div>#edit_hour")
	public WebElement durationHour;
	
	@FindBy (css="div>#edit_minute")
	public WebElement durationMinute;
	
	@FindBy (css="div>#edit_timezone")
	public WebElement timeZone;
	
	@FindBy (css="input#edit_host_video")
	public WebElement videoHostToggleButton;
	
	@FindBy (css="input#edit_participant_video")
	public WebElement videoParticipantsToggleButton;
	
	@FindBy (css="input#is_recurring")
	public WebElement isRecurringToggleButton;
	
	@FindBy (css="#m_interval")
	public WebElement intervalTextBox;
	
	@FindBy (css="div>#submitmeeting")
	public WebElement saveChangesButton;
	
//	@FindBy (css=".col-lg-9.col-xl-6>input#edit_topic")
//	public WebElement topicTextBox;
//	
//	@FindBy (css=".col-lg-9.col-xl-6>#edit_description_1")
//	public WebElement descriptionTextBox;
//	
//	@FindBy (css=".multiple_emails-container")
//	public WebElement meetingInviteesTextBox;
//	
//	@FindBy (css="input#edit_start_end_date")
//	public WebElement dateTextBox;
//	
//	@FindBy (css="div.drp-calendar.left.single>div.calendar-table>table.table-condensed>thead>tr>th.month>select.monthselect")
//	public WebElement monthSelect;
//	
//	@FindBy (css="div.drp-calendar.left.single>div.calendar-table>table.table-condensed>thead>tr>th.month>select.yearselect")
//	public WebElement yearSelect;
//	
//	@FindBy(css="div.drp-calendar.left.single>div.calendar-table>table.table-condensed>thead>tr>th.next.available")
//	public WebElement nextAvaialbleMonth;
//	
//	@FindBy (css="div.drp-calendar.left.single>div.calendar-table>table.table-condensed>thead>tr>th.prev.available")
//	public WebElement prevAvailableMonth;
//	
//	@FindBy (css="div>#edit_start_hour")
//	public WebElement startHour;
//	
//	@FindBy(css="div>#edit_start_minute")
//	public WebElement startMinute;
//	
//	@FindBy (css="div>#start_time_zn")
//	public WebElement selectAmPm;
//	
//	@FindBy (css="div>#edit_hour")
//	public WebElement durationHour;
//	
//	@FindBy (css="div>#edit_minute")
//	public WebElement durationMinute;
//	
//	@FindBy (css="div>#edit_timezone")
//	public WebElement timeZone;
//	
//	@FindBy (css="div>#submitmeeting")
//	public WebElement saveChangesButton;
//	
//	@FindBy (css="#m_interval")
//	public WebElement intervalTextBox;
//	
//	@FindBy (css="input#edit_host_video")
//	public WebElement hostVideoSlider; 
//	
//	@FindBy (css="input#edit_participant_video")
//	public WebElement participantVideoSlider; 
//	
//	@FindBy (css="input#is_recurring")
//	public WebElement recurringMeetingSlider; 
//	
	
	
	
	
	
}
	


