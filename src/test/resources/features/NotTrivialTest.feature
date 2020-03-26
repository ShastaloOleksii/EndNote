Feature: Checking not trivial scenarios

  In order to ensure that Functionality works,
  I want to run the cucumber test to verify it is working

  @Smoke @Regression
  Scenario: Check presents title All My References
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    When I click on the Hide Getting Started Guide if this tab opened
    Then Title All My References is present

  @Regression
  Scenario: Check opened My References tab after Format tab
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    When I am go to Format tab page
    And I am go to My References tab
    Then I am on My References tab

  @Smoke @Regression
  Scenario: Check Sign out
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    When I am go to logout panel
    And I go to login page
    Then I am at Login page

  @Regression
  Scenario: Check that logo worked on the options page
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    When I am go to Options tab page
    And I click to logo
    Then I see main page
