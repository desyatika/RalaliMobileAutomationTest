@tag
Feature: Signin Ralali on mobile app

  Scenario Outline: Signin Ralali with valid credential
    Given user navigates to Sign in page on mobile apps
    When user fills in <valid_email> in email field
    And user fills in <valid_password> in password field
    And user clicks on Login button
    Then the system will be redirected to the homepage

    Examples: 
      | valid_email  							| valid_password	|
      | testdesy10@mailinator.com	| Ralali@123 			|