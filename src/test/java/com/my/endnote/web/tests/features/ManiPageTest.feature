@MainPageTest
Feature: Format Tab Functionality Feature

  In order to ensure Format Tab Functionality works,
  I want to run the cucumber test to verify it is working

  @GoToMyReferencesTab
  Scenario: Check transfer to My References Tab
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    When I am go to My References tab
    Then I am on My References tab

  @MainTabsMenuIsPresent
  Scenario: Check opened main tabs menu is present on mane page
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    Then The main tabs menu is present on main page

  @LogoPresentOnMainPage
  Scenario: Check  logo is present on main page
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    Then The logo is present on main page

  @LocalizationPanelPresentOnMainPage
  Scenario: Check  localization panel is present on mane page
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    Then The localization panel is present on mane page

  @LearnAboutEndNote
  Scenario: Check attribute class is present in "Learn About EndNote" web element
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    Then The attribute "class" is present

  @ShowGettingStartedGuide
  Scenario: Check attribute "alt" is present in "Show Getting Started Giide" web element
    Given I am on main page "https://access.clarivate.com/login?app=endnote" "igavudu-5763@yopmail.com" "A123456@"
    Then The attribute "alt" is present

  @CloseDriver
  Scenario: Close driver
    Then Close driver