##author:Priyanka
##Feature file for launching quick meeting in browser
Feature: Launching quick meeting in chrome browser and get the meeting invitation Meeting URL
  Scenario: Launching the IJMeet quick Meetings using valid credentials and get the meeting invitation details
    Given The application is launched in the Chrome Browser
    And The clicks on the SignIn button on the Home-page
    When The User Enter "<Username>" and "<Password>"
    Then The user should login
    And The Clicks on the  Join Meeting button
    Then The application is launched successfully
    And The quick join meeting form is displayed by default
    When The user enters "<Name>" and "<MeetingId>" in the quick join meeting form
    Then The user should join the meeting
    But The User enters invalid meeting ID BootBox is appeared for undefined meeting ID