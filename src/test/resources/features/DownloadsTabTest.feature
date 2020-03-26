Feature: Downloads Tab Functionality Feature

  In order to ensure Download Tab Functionality works,
  I want to run the cucumber test to verify it is working

  @Smoke @Regression
  Scenario: Check transfer to Downloads Tab
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    When I am go to Downloads tab page
    Then I am on Downloads tab

  @Regression
  Scenario: Check opened Capture Reference
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    When I am go to Downloads tab page
    And I am opened Capture Reference
    Then The Capture Reference is opened
