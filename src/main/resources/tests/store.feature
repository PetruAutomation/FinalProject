Feature: Buy item

  Scenario: Buy bag in the store
    Given open application
    When user enter "standard_user" username
    And user enter "secret_sauce" password
    And user click to Login button
    And user add bag to the cart
    And navigate to cart
    Then bag should be in the cart