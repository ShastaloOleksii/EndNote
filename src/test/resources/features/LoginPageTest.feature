Feature: SignIn page test

  In order to ensure SignIn page works,
  I want to run the cucumber test to verify it is working

  @Smoke @Regression
  Scenario: Checking process Sign in
    Given The SignIn page is opened "https://access.clarivate.com/login?app=endnote"
    When I entered login "igavudu-5763@yopmail.com" and password "A123456@"
    And I click on the button SignIn
    Then I see main page

  @Smoke @Regression
  Scenario: Check transfer to Registration page
    Given The SignIn page is opened "https://access.clarivate.com/login?app=endnote"
    When I click on the Registration button
    Then I see Registration page


  Scenario Outline: Checking process multiple Sign in
    Given The SignIn page is opened "https://access.clarivate.com/login?app=endnote"
    When I entered login <login> multiples
    And I entered <password> multiple
    And I click on the button SignIn
    Then I see main page
    Examples:
      | login                          | password |
      | larrekuppan-1516@yopmail.com   | A120386@ |
      | abunudonn-0963@yopmail.com     | A123456@ |
      | shastalo.aleksej@tech-stack.io | A120386@ |
      | aaattt-4855@yopmail.com        | A120386@ |
      | bbttt-4855@yopmail.com         | A120386@ |
