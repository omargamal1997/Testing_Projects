Feature: slider functionality
  @FirstProductSlider
  Scenario: first slider is clickable on home page
    When user click on first slider
    And user click on the product
    Then user navigate to product page



    @SecondProductSlider
    Scenario: second slider is clickable on home page
      When user click on second slider
      And user click on the product
      Then user navigate to second product page
