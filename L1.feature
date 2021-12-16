Feature: working on google page
	@smoke
		Scenario: searching a text from google page
    Given user is in "Chrome browser"
    When user is searching "Chercher Tech" from text box
    Then user clicks on search button
    And user navigated to next page and navigated back
    And user closed the browser

