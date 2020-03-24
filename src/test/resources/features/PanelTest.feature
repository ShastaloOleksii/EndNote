@SearchPanel
Feature: Search panel Functionality Feature

  In order to ensure panel of search Functionality works,
  I want to run the cucumber test to verify it is working

  @Smoke @Regression
  Scenario: Check that search panel search is present
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    Then Panel search is present

  @Smoke @Regression
  Scenario: Check that search panel is hide
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    When I click on hide "search panel" button
    Then Panel search is hide

  @Smoke @Regression
  Scenario: Check that link Unfield is present
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    Then Link Unfield is present

  @CloseDriver
  Scenario: Close driver
    Then Close driver