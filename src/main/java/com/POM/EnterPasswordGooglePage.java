package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Constants;

public class EnterPasswordGooglePage extends SignInWithGooglePage{
	
	public EnterPasswordGooglePage() {
		PageFactory.initElements(Constants.driver, this);
	}
	@FindBy(xpath="//input[@aria-label='Enter your password']")
	public WebElement enterPassword;
	
	@FindBy(xpath="//span[text()='Forgot password?']")
	public WebElement forgotPassword;
	
	@FindBy(xpath="//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']")
	public WebElement nextButton;
	
}
