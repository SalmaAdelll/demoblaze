Feature: User Sign Up
  Scenario: Successful user signup

Scenario Outline:  Sign up test

    Given User navigate to Demoblaze website
    When user click on signup button
    And user Enter username address "<user>"
    And user Enter Password "<password>"
    And User clicks the Sign up button
    Then web will show Success signup website "<expectedMessage>"

  Examples:

  | user                 |  password         |         expectedMessage           |
  | Mahmoud2027          |  4555555          |        Sign up successful.        |
  | Mahmoud2025          |  4555555          |        This user already exist.   |

  @smo

  Scenario Outline: Verify that Two Products Are Purchased Successfully

    Given User navigate to Demoblaze website to login
    Given user can maximize page
    When user click on Login button
    And user enter username "<user>"
    And user enter Password "<password>"
    And User click Login button
    And user choose and open products page
    And user can choose first product
    And user can go back
    And user can Click Home
    And user can add first product to the cart
    And user can choose second product
    And user can add second product to the cart
    And user can open cart page
    Then user can check first product name "<ExpectedMessageforFirstProduct>"
    Then user can check Second product name "<ExpectedMessageforSecondProduct>"


    Examples:

      | user                 | password         |ExpectedMessageforFirstProduct   |  ExpectedMessageforSecondProduct         |
      | Mahmoud2025          | 4555555          | Sony vaio i7                    |  Sony vaio i5                                  |




