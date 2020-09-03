#Feature file for launching the app using gmail credentials 

Feature: Launching the IJMeet Application on the Chrome Browser and get the link
 				 I want to use this template for my feature file  
  Scenario: Launching the IJMeet Online Meetings Application using gmail credentials and printing the link for the session created
    Given The ijmeet application is launched using Chrome browser 
    And User uses gmail credentials to log in
    And User lands on the dashboard page and clicks on quick meeting
    Then The application is launched successfully
    Then The Modal Pop Up is displayed on which is given the link for the session created
    And The user gets the link saves it and prints it
    And The user cancels the Modal Pop up by clicking on the cancel button on the Pop Up
    