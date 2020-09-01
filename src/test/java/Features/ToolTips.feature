#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: To verify if the tooltips are displayed correctly over the various links and buttons available in the application
  I want to use this template for my feature file

  @tag1
  Scenario: To verify if the tooltip is displayed correctly for shareYourScreenButton
    Given The User has launched the application by using quick meeting option
    When The User hovers the mouse over  shareyourscreen button
    Then Correct message is displayed

  @tag2
  Scenario: To verify if the tooltip is displayed correctly for raiseYourHandButton
    Given The User has launched the application by using quick meeting option
    When The User hovers the mouse over  raiseYourHandButton
    Then Correct message is displayed
    
  @tag3
  Scenario: To verify if the tooltip is displayed correctly for openCloseChat
    Given The User has launched the application by using quick meeting option
    When The User hovers the mouse over  openCloseChatButton
    Then Correct message is displayed
   
  @tag4
  Scenario: To verify if the tooltip is displayed correctly for muteUnmuteButton
    Given The User has launched the application by using quick meeting option
    When The User hovers the mouse over  muteUnmuteButton
    Then Correct message is displayed
   
   @tag5
  Scenario: To verify if the tooltip is displayed correctly for leaveCallButton
    Given The User has launched the application by using quick meeting option
    When The User hovers the mouse over  leaveCallButton
    Then Correct message is displayed
   
   @tag6
  Scenario: To verify if the tooltip is displayed correctly for muteVideoButton
    Given The User has launched the application by using quick meeting option
    When The User hovers the mouse over  muteVideoButton
    Then Correct message is displayed
   
   @tag7
  Scenario: To verify if the tooltip is displayed correctly for toggleViewButton
    Given The User has launched the application by using quick meeting option
    When The User hovers the mouse over  toggleViewButton
    Then Correct message is displayed
   
   @tag8
  Scenario: To verify if the tooltip is displayed correctly for securityOptionsButton
    Given The User has launched the application by using quick meeting option
    When The User hovers the mouse over securityOptionsButton
    Then Correct message is displayed
    
    @tag9
  Scenario: To verify if the tooltip is displayed correctly for moreActionsLink
    Given The User has launched the application by using quick meeting option
    When The User hovers the mouse over  moreActionsLink
    Then Correct message is displayed