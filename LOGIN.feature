Feature:  working on facebook application

Scenario Outline: Hook Test

Given user navigates to Facebook

When I enter Username as "<username>" and Password as "<password>"

Then login should be unsuccessful

Examples: 

| username  | password  | 
| username1 | password1 |