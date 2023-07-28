@Home
  Feature: home page funcionality
    Scenario: user can use euro as currency
      When user choose euro as currency"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F"
      Then all products has euro sign
