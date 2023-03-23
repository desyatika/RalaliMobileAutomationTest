@tag
Feature: Sign up Ralali on mobile app

  Scenario Outline: Sign up Ralali with valid credential
    Given user navigates to Sign up page on mobile apps
    When user clicks on Create Account label
    And user inputs <name> in name field
    And user inputs <email> in email field
    And user inputs <password> in password field
    And user inputs <confirm_password> in confirm password field
    And user clicks on Register button
    Then an account is successfully created

    Examples: 
      | name				| email  										| password 		| confirm_password	|
      | Test Desy10	| testdesy10@mailinator.com	| Ralali@123 	| Ralali@123				|