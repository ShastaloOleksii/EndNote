Feature: Organize Tab Functionality Feature

  In order to ensure Organize Tab Functionality works,
  I want to run the cucumber test to verify it is working

  @Smoke @Regression
  Scenario: Check transfer to Organize Tab
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    When I am go to Organize tab page
    Then I am on the Organize tab
