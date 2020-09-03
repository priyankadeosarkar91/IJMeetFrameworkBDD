Feature: To verify if the tooltips are displayed correctly over the various links and buttons available in the application

Background: User has launched the Quick Meeting feature of ijmeet application on the browser
		Given The user has launched the browser and the application ijmeet
		When The user uses google credentials to login 
		And The user clicks on the quick meeting link on the dashboard page
		Then The Quick Meeting is launched
  
  
  Scenario: To verify if the tooltip is displayed correctly for shareYourScreenButton
    Given The User locates the shareYourScreenButton
    When The User hovers the mouse over shareYourScreenbutton
    Then Correct message is displayed

  Scenario: To verify if the tooltip is displayed correctly for raiseYourHandButton
    Given The User locates the raiseYourHandButton
    When The User hovers the mouse over raiseYourHandButton
    Then Correct message is displayed
    
  Scenario: To verify if the tooltip is displayed correctly for openCloseChat
    Given The User locates the openCloseChatButton
    When The User hovers the mouse over openCloseChatButton
    Then Correct message is displayed
   
  Scenario: To verify if the tooltip is displayed correctly for muteUnmuteAudioButton
    Given The User locates the muteUnmuteAudioButton
    When The User hovers the mouse over muteUnmuteAudioButton
    Then Correct message is displayed
   
  Scenario: To verify if the tooltip is displayed correctly for leaveCallButton
    Given The User locates the leaveCallButton
    When The User hovers the mouse over leaveCallButton
    Then Correct message is displayed
   
  Scenario: To verify if the tooltip is displayed correctly for muteVideoButton
    Given The User locates the muteVideoButton
    When The User hovers the mouse over muteVideoButton
    Then Correct message is displayed
   
  Scenario: To verify if the tooltip is displayed correctly for toggleViewButton
    Given The User locates the toggleViewButton
    When The User hovers the mouse over toggleViewButton
    Then Correct message is displayed
   
  Scenario: To verify if the tooltip is displayed correctly for securityOptionsButton
    Given The User locates the securityOptionsButton
    When The User hovers the mouse over securityOptionsButton
    Then Correct message is displayed
    
  Scenario: To verify if the tooltip is displayed correctly for moreActionsLink
    Given The User locates the moreActionsLink
    When The User hovers the mouse over moreActionsLink
    Then Correct message is displayed