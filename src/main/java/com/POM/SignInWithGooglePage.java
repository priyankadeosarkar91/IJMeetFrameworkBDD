package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Constants;

public class SignInWithGooglePage extends SignInPage{
	
	public SignInWithGooglePage() {
	PageFactory.initElements(Constants.driver, this);
	}
	
	@FindBy(xpath="//input[@type='email']")
	WebElement emailIdTexbox;
	
	@FindBy(xpath="//button[text()='Forgot email?']")
	WebElement forgotEmailLink;
	
	@FindBy(xpath="//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']")
	WebElement nextButton;
	
	
}