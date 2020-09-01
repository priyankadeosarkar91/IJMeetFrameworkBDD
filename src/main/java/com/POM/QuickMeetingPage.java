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
	public WebElement shareYourScreen;
	
	@FindBy(xpath="//div[@aria-label='Toggle raise hand']")
	public WebElement raiseYourHand;
	
	@FindBy(xpath="//div[@aria-label='Toggle chat window']")
	public WebElement opencloseChat;
	
	@FindBy(xpath="//div[@aria-label='Toggle mute audio']")
	public WebElement muteUnmuteAudio;
	
	@FindBy (xpath="//div[@aria-label='Leave the call']")
	public WebElement leaveCall;
	
	@FindBy(xpath="//div[@aria-label='Toggle mute video']")
	public WebElement muteVideo;
	
	@FindBy(xpath="//div[@aria-label='Toggle tile view']")
	public WebElement toggleView;
	
	@FindBy(xpath="//div[@aria-label='Security options']")
	public WebElement securityOptions;
	
	@FindBy(xpath="//div[@aria-label='Toggle more actions menu']")
	public WebElement moreActions;
	
	@FindBy(css="#close")
	public WebElement popUpClosebutton;
	
	@FindBy(css="span.meeting-id-common-pic>img")
	public WebElement copyLinkbutton;
	
	@FindBy(css=".Handle-n2edb7-0.hzRJjY")
	public WebElement enableparticipantslider;
	
	@FindBy(css="span#url")
	public WebElement meetingUrl;
	
	
	
}
