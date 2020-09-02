package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Constants;

public class SignInWithFacebookPage extends SignInPage{
	
	public SignInWithFacebookPage() {
		super();
		PageFactory.initElements(Constants.driver, this);
	}
	@FindBy(css="#email")
	public WebElement emailIdTextBox;
	
	@FindBy(css="#pass")
	public WebElement passwordTextBox;
	
	@FindBy(id="loginbutton")
	public WebElement logInButton;
	
	@FindBy(xpath="//button[@name='__CONFIRM__']")
	public WebElement confirmButton;
}
