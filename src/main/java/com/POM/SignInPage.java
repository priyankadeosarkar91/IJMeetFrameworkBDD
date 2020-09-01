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
	public WebElement emailTextBox;
	
	@FindBy(css="#password")
	public WebElement passwordTextBox;
	
	@FindBy(id="remember")
	public WebElement rememberMeRadioButton;
	
	@FindBy(css=".auth-link.text-black")
	public WebElement forgotYourPasswordLink;
	
	@FindBy(css="sign-up-accounthave")
	public WebElement signUpLink;

	@FindBy(xpath="//button[text()='  Sign In ']")
	public WebElement signInbutton;
	
	@FindBy(css=".social-login-button.social-login-button-google")
	public WebElement signInWithGoogle;
	
	@FindBy(css=".social-login-button.social-login-button-facebook")
	public WebElement signInWithFacebook;
}
