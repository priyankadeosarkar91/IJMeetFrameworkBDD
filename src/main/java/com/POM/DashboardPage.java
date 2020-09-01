package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Constants;

public class DashboardPage extends EnterPasswordGooglePage {
	
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
	
	@FindBy(xpath="//button[text()=' Schedule Meeting '] ")
	public WebElement scheduleMeetingButton;
	
	@FindBy(xpath=" //button[text()='  Join meeting '] ")
	public WebElement joinMeetingButton;
	
	@FindBy(xpath=" //button[text()=' Quick meeting '] ")
	public WebElement quickMeetingButton;
	

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
	
	@FindBy (css="div>#submitmeeting")
	public WebElement saveChangesButton;
	
	@FindBy (css="#m_interval")
	public WebElement intervalTextBox;
	
	
	
	
}
	


