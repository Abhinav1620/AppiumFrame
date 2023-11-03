Feature: E2E testcase for checking out a product

  Scenario Outline: Check that user is able to order is product after filling his all delivery information
    Given When user launch the mobile application
    And User tries to enter his correct "<username>" and correct "<password>"
    Then User should be able to login into the application.
    And User should be able to order his product after filling his all delivery information
    Then User should be able to logout successfully

    Examples:
      | username        | password |
      | bob@example.com | 10203040 |


  Scenario Outline: Check that login should be mandatory for checkout
    When User adds his product into the cart
    Then User should be asked for login to proceed ahead with the checkout
    And after entering his correct "<username>" and correct "<password>"
    Then User should be able to logout after his checkout.

    Examples:
      | username        | password |
      | bob@example.com | 10203040 |