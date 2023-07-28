Feature: normal search functionality
  @searchProduct
  Scenario Outline: search by product name
    When user enter product name"<product>"
    And user click on search button
    Then product reveals successfully
    And verify the search products
    And verify the name of product"<product>"

    Examples:
    |product|
    |book   |
    |laptop |
    |nike   |

    @searchSKU
    Scenario Outline: user could search for product using sku
      When user enter product SKU"<SKU>"
      And user click on search button
      Then verify the name of product"<SKU>"

      Examples:
      |SKU|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|

