Feature: Test Twitter smoke scenario

  Scenario: Test login with valid credentials
    Given Open the chrome and start application
    When I enter valid username and valid password
    Then user should be able to login successfully
