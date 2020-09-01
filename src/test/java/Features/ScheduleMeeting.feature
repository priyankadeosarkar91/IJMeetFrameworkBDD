##Feature file for launching quick meeting in browser
Feature: Launching quick meeting in chrome browser and get the meeting invitation Meeting URL
  Scenario: Launching the IJMeet quick Meetings using valid credentials and get the meeting invitation details
    Given The application is launched in the Chrome Browser
    And The clicks on the SignIn button on the Home-page
    When The User Enter "<Username>" and "<Password>"
    Then The user should login
    And The Clicks on the  Schedule Meeting button
    Then The application is launched successfully
    And The meeting schedule form is displayed by default
    When The user enters "<MeetingTopicName>" and "<MeetingDescription>" in the schedule meeting form
    And The user enters "<MeetingInvities>"
    And The user select date,time in hr and mm, duration of meet and timezone from drop down
    And The user select video, conference mode, recurring meeting with slider panel
    And the user enters intervals of meeting in given text box
    Then The user should click on save changes
    But The User enters invalid meeting schedule input errr popup window is displayed
    Examples:
    	|MeetingInvities|
    	|XYZ|
    	|ABC|