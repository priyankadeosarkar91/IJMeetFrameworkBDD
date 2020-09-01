package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Constants;

public class QuickMeetingPage extends DashboardPage{
	
	public QuickMeetingPage() {
		super();
		PageFactory.initElements(Constants.driver, this);
	}

	@FindBy(xpath="//div[@aria-label='Toggle screenshare']")
	WebElement shareYourScreen;
	
	@FindBy(xpath="//div[@aria-label='Toggle raise hand']")
	WebElement raiseYourHand;
	
	@FindBy(xpath="//div[@aria-label='Toggle chat window']")
	WebElement opencloseChat;
	
	@FindBy(xpath="//div[@aria-label='Toggle mute audio']")
	WebElement muteUnmuteAudio;
	
	@FindBy (xpath="//div[@aria-label='Leave the call']")
	WebElement leaveCall;
	
	@FindBy(xpath="//div[@aria-label='Toggle mute video']")
	WebElement muteVideo;
	
	@FindBy(xpath="//div[@aria-label='Toggle tile view']")
	WebElement toggleView;
	
	@FindBy(xpath="//div[@aria-label='Security options']")
	WebElement securityOptions;
	
	@FindBy(xpath="//div[@aria-label='Toggle more actions menu']")
	WebElement moreActions;
	
	@FindBy(css="#close")
	WebElement modalClosebutton;
	
	@FindBy(css="span.meeting-id-common-pic>img")
	WebElement copyLink;
	
	@FindBy(css=".Handle-n2edb7-0.hzRJjY")
	WebElement enableparticipantslider;
	
	
	
	
}
