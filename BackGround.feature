Feature: check home page functionality 

Background: user logged in 
Given user is in login page 
When user enters username and pwd 
Then user click on login button 
And user is Navigated to home page




Scenario: check logout functionality 

Given user is in login window 
When user checks in welcome link 
Then logout link is displayed 


Scenario: verify quick launch tool bar is present 

Given user is in login window 
When user click on dash board link 
Then quuck launch tool bar is displayed 
