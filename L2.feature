Feature: working on multiple browsers

  Scenario: user works on web application

  @SanityTests
  Scenario: Search Google for Chercher Tech
    Given There is opened "Chrome browser"
    Then I search "Chercher Tech" in searchbar

  @SanityTests @Regression
  Scenario: Search Bing for Chercher Tech
    Given There is opened "Chrome browser"
    Then I search "Chercher Tech" in searchbar
