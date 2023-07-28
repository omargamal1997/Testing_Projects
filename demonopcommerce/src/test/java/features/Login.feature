
Feature: users could use login functionality to use their accounts
  @login1
  Scenario: user could login with valid email and password
    Given Navigate to login page
    When user login with valid "test@example.com" and "P@ssw0rd"
    And click on login button
    Then user logged in successfully

  @login2
  Scenario: user could login with invalid email and password
    Given Navigate to login page
    When user login with valid "wrong@example.com" and "P@ssw0rd"
    And click on login button
    Then user could not login to the system
