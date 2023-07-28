@Regression
Feature: Register Funcionality
#  Scenario Outline: Register with valid data
  Scenario: Register with valid data


    Given Navigate to website
    And user enter gender"male"
    When user enter firstname"automation"
    And user enter lastname"tester"
    And user enter date"7" "1" "1997"
    And user enter email"test@example.com"
    And user enter password"P@ssw0rd"
    And user enter confirm password"P@ssw0rd"
    And user click on register button
    Then success message is displayed

