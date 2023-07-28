Feature: mouseHover functionality
  @mouseHover
  Scenario: user try to choose random option from categories
    When user hover on category
    And user hover on sub category
    And get sub category name
    And user click on sub category
    Then user navigate to sub category page
