
#Feature file for launching the app using gmail credentials 
@tag
Feature: Launching the IJMeet Application on the Chrome Browser and print the link for the session created on the console
 				 I want to use this template for my feature file  
  Scenario: Launching the IJMeet Online Meetings Application using gmail credentials and printing the link for the session created
    Given The Chrome Browser is opened and the application is launched
    And The user clicks on the SignIn button on the Home-page
    Then A new web-page will open
    When The user clicks on the SignInWithGoogle button on the newly opened page
    And The user enters valid credentials and clicks on enter
    And User Clicks on the button for Quick Meeting
    Then The application is launched successfully
    And The Modal Pop Up is displayed on which is given the link for the session created
    When The user copies the link for the session created by clicking on the copy link
    And The user cancels the Modal Pop up by clicking on the cancel button on the Pop Up