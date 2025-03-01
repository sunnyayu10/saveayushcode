Feature: Login to Test Application

#Positive Test case
Scenario: Check if the user is able to login with Valid Credentials

Given The user launches the application
When Enters the valid  "tomsmith" and "SuperSecretPassword!"
Then Clicks on Submit button
Then Check if the user is in Home Page
And Check the Home Page Title
And Close the browser


#Negative Test case
Scenario: Check if the user is shown with Error message on giving empty userID

Given The user launches the application
When Enters the Empty userid and "SuperSecretPassword!"
Then Clicks on Submit button
Then Check if the Error message is displayed
And Close the browser