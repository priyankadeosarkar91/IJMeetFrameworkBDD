	Feature: To verify if the three Scenarios for Sign-In i.e. 1)Google Sign-In and 2)Facebook Sign-In and 3)Custom Sign-In is available and functional
	Background: User has launched the Browser as well as the ijmeet application
		 Given The user has launched the Browser and the application ijmeet
		 And The user clicks on the Sign-In button on the Homepage
		 Then The user lands on the Log-In Page
		 
	Scenario: The User uses valid Google credentials to Log-In in the application	and Launch the Quick Meeting
		When The User chooses to use Google credentials for signing into ijmeet application
		And The User uses valid Google Credentials to Log-In and clicks on next button
		Then The User lands on the Dashboard Page
		When The User clicks on the Quick Meeting button 
		Then The Quick Meeting is launched successfully
		
	Scenario: The User uses valid Facebook credentials to Log-In the application and Launch the Quick Meeting
		When The User chooses to use Facebook for Signing-in to the ijmeet application
		And The User uses valid Facebook credentials to LogIn and then clicks on Log-In button 
		Then The User lands on the Dashboard Page
		When The user clicks on the Quick Meeting button
		Then The Quick Meeting is launched successfully 
	
	Scenario: The user uses valid Custom Credentials to Log-In the application and Launch Quick Meeting
		When The User uses valid Custom Credentials to Log-in into the ijmeet application and clicks on SignIn button
		Then The User lands on the Dashboard Page 
		When The User clicks on the Quick Meeting button 
		Then The Quick Meeting is launched successfully 
		
		 
		