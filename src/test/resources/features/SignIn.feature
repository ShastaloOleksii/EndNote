@SignInScenarios
Feature: SignIn page test

  In order to ensure SignIn page works,
  I want to run the cucumber test to verify it is working

  @SignIn
  Scenario: Checking process Sign in
    Given The SignIn page is opened
    When I entered login
    And I entered password
    And I click on the button SignIn
    Then I see main page

  @RegistrationPage
  Scenario: Check transfer to Registration page
    Given The SignInRegPage page is opened
    When I click on the Registration button
    Then I see Registration page

  @MultipleSignIn @PositiveScenario
  Scenario Outline: Checking process multiple Sign in
    Given The SignIn page is opened multiple
    When I entered login <login> multiples
    And I entered <password> multiple
    And I click on the button SignIn multiple
    Then I see main page multiple
    Examples:
      | login                          | password |
      | larrekuppan-1516@yopmail.com   | A120386@ |
      | abunudonn-0963@yopmail.com     | A123456@ |
      | shastalo.aleksej@tech-stack.io | A120386@ |
