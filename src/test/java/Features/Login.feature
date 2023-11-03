Feature: Login functionality

  Scenario Outline: Check that user is should not be able to login with incorrect username and correct password in mobile application
    Given When user launch the mobile application
    And User tries to enter his correct "<username>" and correct "<password>"
    Then User should be able to get error.

    Examples:
      | username       | password |
      | bob@example.co | 10203040 |


  Scenario Outline: Check that user is should not be able to login with correct username and incorrect password in mobile application
    Given When user launch the mobile application
    And User tries to enter his correct "<username>" and correct "<password>"
    Then User should be able to get error.

    Examples:
      | username        | password |
      | bob@example.com | 1020304  |


  Scenario Outline: Check that user is should not be able to login with incorrect username and incorrect password in mobile application
    Given When user launch the mobile application
    And User tries to enter his correct "<username>" and correct "<password>"
    Then User should be able to get error.

    Examples:
      | username       | password |
      | bob@example.co | 1020304  |


  Scenario Outline: Check that user is able to login with correct username and correct password in mobile application
    Given When user launch the mobile application
    And User tries to enter his correct "<username>" and correct "<password>"
    Then User should be able to login into the application.

    Examples:
      | username        | password |
      | bob@example.com | 10203040 |
