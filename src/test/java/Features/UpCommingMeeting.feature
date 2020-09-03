##author:Priyanka
##Feature file for launching quick meeting in browser
Feature: Launching quick meeting in chrome browser and get the meeting invitation Meeting URL
  Scenario: Launching the IJMeet quick Meetings using valid credentials and get the meeting invitation details
    Given The application is launched in the Chrome Browser
    And The clicks on the SignIn button on the Home-page
    When The User Enter "<Username>" and "<Password>"
    Then The user should login
    And The Upcomming meeting is selected by default on ijmeet application dashboard
    When the user enters search value
    And The user select the date from to to date from calender on dashboard
    Then The user click on search meeting