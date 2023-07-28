Feature: follow us functionality

  @facebookLink
  Scenario: facebook link is available
    When user click on facebook button
    Then user navigate into facebook

  @twitterLink
  Scenario: twitter link is available
    When user click on twitter button
    Then user navigate into twitter


  @rssLink
  Scenario: rss link is available
    When user click on rss button
    Then user navigate into rss


  @youtubeLink
  Scenario: youtube link is available
    When user click on youtube button
    Then user navigate into youtube