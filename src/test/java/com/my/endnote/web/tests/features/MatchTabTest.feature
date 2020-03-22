@MatchTabTest
Feature: Match Tab Functionality Feature

In order to ensure Match Tab Functionality works,
I want to run the cucumber test to verify it is working

@Smoke @Regression
Scenario: Check transfer to Match Tab
Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
When I am go to Match tab page
Then I am on Match tab

@Regression
Scenario: Check opened page with Jornals
Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
When I am go to Match tab page
And I am entered title "animals"
And I am entered abstract "animals"
And I am clicking on the button Find Jornals
Then page with jornals is opened

@CloseDriver
Scenario: Close driver
Then Close driver