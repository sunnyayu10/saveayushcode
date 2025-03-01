Feature: Search Functionality in Amazon
Background:
	Given The user is on amazon Home Page
	
Scenario: Verify if the Search icon is displayed on the home page
	When The User searches for any search key term
	Then Verify if the search icon is displayed
	
Scenario: Verify if the Search results page is displayed on entering any search term
	When The User searches for any search key term
	Then Verify if the search icon is displayed
	Then Click on Search icon
	And Check if the user is in Search Results page
	
Scenario: Verify if the home page is displayed on giving empty search
	Then Verify if the search icon is displayed
	Then Click on Search icon
	Then Verify if the home page is displayed
