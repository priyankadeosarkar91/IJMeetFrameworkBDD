##author:Priyanka
##Feature file for launching Schedule meeting in browser
Feature: Launching schedule meeting in chrome browser and 
		 Create the new meeting by filling schedule meeting form
Background: Launching the IJMeet Application in browser and the user uses valid Custom Credentials 
			to Log-In the application
		Given The user has launched the Browser and the application ijmeet
	    And The user clicks on the Sign-In button on the Homepage
		Then The user lands on the Log-In Page
		When The User uses valid Custom Credentials to Log-in into the ijmeet application and clicks on SignIn button
		Then The User lands on the Dashboard Page		 
  Scenario: Verify Schedule Meeting launched in browser, Schedule a new meet using valid credentials and get the meeting invitation details
    When The user Clicks on the  Schedule Meeting button
    Then The application is launched successfully and the meeting schedule form is displayed
    And The user enters "<MeetingTopicName>" and "<MeetingDescription>" in the schedule meeting form
    And The user enters "<MeetingInvities>"
    Then The user select date,time in hr and mm, duration of meet and timezone from drop down
    And The user select video, conference mode, recurring meeting with slider panel
    And The user enters intervals of meeting in given text box
    Then The user should click on save changes
    But The User enters invalid meeting schedule input error popup window is displayed