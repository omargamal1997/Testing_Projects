Feature: wishList functionality
  @wishList1
  Scenario: add wishList is available
    When user click on wishList icon
    Then item added successfully

    @wishList2
    Scenario: verify wishList is active
      When user click on wishList icon
      Then item added in wishList successfully