##Feature file for launching quick meeting in browser
Feature: Launching quick meeting in chrome browser and get the meeting invitation Meeting URL
  Scenario: Launching the IJMeet quick Meetings using valid credentials and get the meeting invitation details
    Given The application is launched in the Chrome Browser
    And The clicks on the SignIn button on the Home-page
    When The User Enter "<Username>" and "<Password>"
    Then The user should login
    And The Clicks on the  Quick Meeting button
    Then The application is launched successfully
  #  And The alert is appeared on screen asking to allow microphone and camera
  #  Then Handle alert successsfully
    When The Modal Pop Up is displayed and session link is provided on it
    Then The copy the meeting URL for the session  created by clicking on the copy button
    Then The Message is displayed on model pop up as invitation link copied successfully.
    And The Modal Pop up is closed by clicking on the cancel button