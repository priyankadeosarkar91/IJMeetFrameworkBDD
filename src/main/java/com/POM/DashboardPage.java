package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Constants;

public class DashboardPage {
	
	public DashboardPage() {
		super();
		PageFactory.initElements(Constants.driver, this);
	}
	@FindBy(xpath=" //span[text()=' Home ']")
	WebElement homeLink;
	
	@FindBy(xpath=" //span[text()=' My Account ']")
	WebElement myAccountLink;
	
	@FindBy(xpath=" //span[text()='  Meetings ']")
	WebElement meetingsLink;
	
	@FindBy(xpath=" //span[text()='  Application ']")
	WebElement applicationLink;
	
	@FindBy(css="span.pro-icons-width>img")
	WebElement userdetailsImage;
	
	@FindBy(xpath="//button[text()=' Schedule Meeting '] ")
	WebElement scheduleMeetingButton;
	
	@FindBy(xpath=" //button[text()='  Join meeting '] ")
	WebElement joinMeetingButton;
	
	@FindBy(xpath=" //button[text()=' Quick meeting '] ")
	WebElement quickMeetingButton;
	

	@FindBy (css=".col-lg-9.col-xl-6>input#edit_topic")
	WebElement topicTextBox;
	
	@FindBy (css=".col-lg-9.col-xl-6>#edit_description_1")
	WebElement descriptionTextBox;
	
	@FindBy (css=".multiple_emails-container")
	WebElement meetingInviteesTextBox;
	
	@FindBy (css="input#edit_start_end_date")
	WebElement dateTextBox;
	
	@FindBy (css="div.drp-calendar.left.single>div.calendar-table>table.table-condensed>thead>tr>th.month>select.monthselect")
	WebElement monthSelect;
	
	@FindBy (css="div.drp-calendar.left.single>div.calendar-table>table.table-condensed>thead>tr>th.month>select.yearselect")
	WebElement yearSelect;
	
	@FindBy(css="div.drp-calendar.left.single>div.calendar-table>table.table-condensed>thead>tr>th.next.available")
	WebElement nextAvaialbleMonth;
	
	@FindBy (css="div.drp-calendar.left.single>div.calendar-table>table.table-condensed>thead>tr>th.prev.available")
	WebElement prevAvailableMonth;
	
	@FindBy (css="div>#edit_start_hour")
	WebElement startHour;
	
	@FindBy(css="div>#edit_start_minute")
	WebElement startMinute;
	
	@FindBy (css="div>#start_time_zn")
	WebElement selectAmPm;
	
	@FindBy (css="div>#edit_hour")
	WebElement durationHour;
	
	@FindBy (css="div>#edit_minute")
	WebElement durationMinute;
	
	@FindBy (css="div>#edit_timezone")
	WebElement timeZone;
	
	@FindBy (css="div>#submitmeeting")
	WebElement saveChangesButton;
	
	@FindBy (css="#m_interval")
	WebElement intervalTextBox;
	
	
	
	
}
	


