@FormatTabTest
Feature: Format Tab Functionality Feature

In order to ensure Format Tab Functionality works,
I want to run the cucumber test to verify it is working

@Smoke @Regression
Scenario: Check transfer to Format Tab
Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
When I am go to Format tab page
Then I am on format tab

@Regression
Scenario: Check opened Select Favorites table
Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
When I am go to Format tab page
And I am opened Select Favorites table
Then The Select Favorites table is opened

@CloseDriver
Scenario: Close driver
Then Close driver