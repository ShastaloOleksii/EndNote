@OptionsTabTests
Feature: Options Tab Functionality Feature

In order to ensure Options Tab Functionality works,
I want to run the cucumber test to verify it is working

  @OptionsTabIsOpened
  Scenario: Check transfer to Options Tab
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    When I am go to Options tab page
    Then I am on the Options tab

  @CloseDriver
  Scenario: Close driver
    Then Close driver