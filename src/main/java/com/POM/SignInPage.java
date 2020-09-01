package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Constants;

public class SignInPage extends Homepage {
	
	public SignInPage() {
		super();
		PageFactory.initElements(Constants.driver, this);
	}
	
	@FindBy(css="#email")
	WebElement emailTextBox;
	
	@FindBy(css="#password")
	WebElement passwordTextBox;
	
	@FindBy(id="remember")
	WebElement rememberMeRadioButton;
	
	@FindBy(css=".auth-link.text-black")
	WebElement forgotYourPasswordLink;
	
	@FindBy(css="sign-up-accounthave")
	WebElement signUpLink;

	@FindBy(xpath="//button[text()='  Sign In ']")
	WebElement signInbutton;
	
	@FindBy(css=".social-login-button.social-login-button-google")
	WebElement signInWithGoogle;
	
	@FindBy(css=".social-login-button.social-login-button-facebook")
	WebElement signInWithFacebook;
}
