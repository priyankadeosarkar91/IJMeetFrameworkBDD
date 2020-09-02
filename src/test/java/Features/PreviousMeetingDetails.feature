#Author: Govind Rudrawar
Feature: To verify Logs for the Meeting Conducted previously are shown in the application
Background: The user has Signed-In in the application on the browser 
Scenario: To verify that the logs are created and displayed on the application previous meeting feature
    Given The user is on D
    And The User enters the valid date range i.e. from and to date in the text box
    When The User hits Search Button
    Then The applications shows logs for the chosen dates on the webpage

Scenario Outline: We want to verify if the application shows us the logs for Previous Meetings for different Dates
    Given I want to search Results or Logs for different combination of Dates for Quick Meeting in <Type of Meeting>
    When I check for the <fromDate> in step
    When I check for the <toDate> in step
    Then I verify the logs displayed in the web-page

    Examples: 
      |Type of Meeting| fromDate  | toDate   |
      | Quick Meeting |25-08-2020 |30-08-2020|
      | Quick Meeting |30-05-2020 |02-09-2020|
