package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Constants;

public class Homepage {
	public Homepage() {
		super();
		PageFactory.initElements(Constants.driver, this);
	}
	@FindBy(css="a.navbar-brand.font-weight-bold.d-block>img ")
	WebElement ijmeetLogo;
	
	@FindBy(xpath="//a[text()=' Join meeting ']")
	WebElement joinMeetingLink;
	
	@FindBy(xpath="//a[text()=' Host meeting ']")
	WebElement hostMeetingLink;
	
	@FindBy (xpath="//a[text()='  Contact sales ']")
	WebElement contactSalesLink;
	
	@FindBy(css=".nav-link.nav-right-cutom-bg.font-weight-bold")
	WebElement signInButton;
	
	@FindBy(xpath="//a[text()=' Sign up ']")
	WebElement signUpButton;

}
