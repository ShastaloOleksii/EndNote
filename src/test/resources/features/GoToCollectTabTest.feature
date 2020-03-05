@CollectTabTests
Feature: Collect Tab Functionality Feature

  In order to ensure Collect Tab Functionality works,
  I want to run the cucumber test to verify it is working

  @CollectTabIsOpened
  Scenario: Check transfer to Collection Tab
    Given I am on main page
    When I click on Collect tab
    Then I am on Collect tab

  @OpenTable
  Scenario: The check table of favorite libraries is open
    Given I am on collect tab page
    When I click on the text Select Favorites
    Then I see the tables of favorite libraries


  @HideTable
  Scenario: The check table of favorite libreries is closed
    Given I am on collect tab and table is opened
    When I click on the Hide link
    Then I see the table is closed

