Feature: Login to Test Application

Background:
	Given The user launches the application

#Postive test case
Scenario: Check if the user is able to login with Valid Credentials

When Enters the valid "tomsmith" and "SuperSecretPassword!"
Then Clicks on Submit button
Then Check if the user is in Home Page
And Check the Home Page Title
And Close the browser

#Negative Test case
Scenario: Check if the user is shown with Error message on giving empty userID

When Enters the Empty userid and "SuperSecretPassword!"
Then Clicks on Submit button
Then Check if the Error message is displayed
And Close the browser
