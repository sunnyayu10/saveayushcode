Feature: Login to Test Application

Scenario Outline: Test the login page with Invalid Data

	Given The user launches the applications
	When The user enters the userid as "<userid>" and password as "<password>"
	Then Check the error message
	
	Examples:
	|userid		|password		|
	|Priya		|test       |
	|					|Anatha@1		|
	|Durga		|						|

