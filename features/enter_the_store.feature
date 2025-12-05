
Feature: Open the Store

@positiveCase1
Scenario: User enters into the Store
Given the user is in the Petstore application
When the user clicks enter the Store
Then the user enters the Home page

@negativeCase1
Scenario: User enters into the Login page
Given the user is in the Petstore application
When the user clicks enter the Store
Then the user enters the login page