Feature: check feature cart functionality

  Scenario: Check that user is able to remove his selected product from the cart without logging in
    When user select a product
    And add it into his shopping cart
    Then before checking out user should be able to remove the product which he has added.


  Scenario: Check that user is able to add and remove multiple in his cart
    When user select his products
    And add it into his shopping cart
    Then before checking out user should be able to remove multiple product which he has added.

  Scenario Outline: check that user should be able tp remove his selected product from the cart when he was logged in into the application
    Given When user launch the mobile application
    And User tries to enter his correct "<username>" and correct "<password>"
    And user select a product
    And add it into his shopping cart
    Then before checking out user should be able to remove the product which he has added.

    Examples:
      | username        | password |
      | bob@example.com | 10203040 |
