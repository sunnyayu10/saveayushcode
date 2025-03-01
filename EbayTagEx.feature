Feature: Ebay Search Page

@SmokeSuite @RegressionSuite
Scenario: Check if the Ebay Home Page is displayed with Search Text box
Given The user is on Ebay Home Page
Then Verify If the Ebay Page Title is correct
And Verify The Ebay Page URL
And Check if The Search Text Box is displayed

@SmokeSuite @SearchPageCategoryValidations
Scenario: Check if the user is able to select any category from the Category drop down
Given The user is on Ebay Home Page
When The user select any Category
Then The selected category name should be selected

@RegressionSuite
Scenario: Check if the user is landed with the selected category page
Given The user is on Ebay Home Page
When The user select any Category
Then Click on the Search Icon
And Verify if the user is displayed with the Select category label on the Search page
