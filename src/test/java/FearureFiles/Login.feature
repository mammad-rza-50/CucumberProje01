Feature: Login Functionality

  Background:

    Given Navigate to Para Bank

  Scenario Outline: Enter valid information
    When Enter valid username as "<username>" and valid password as "<password>"
    And User should login successfully
    Then User should be log out

    Examples:
      | username   | password |
      | blackmamed241 | 12141214 |

  Scenario Outline: Enter invalid information
    When Enter invalid username as "<username>" and valid password as "<password>"
    Then Error message in displey

    Examples:
      | username    | password |
      | blackmamed1 | 123456   |
      | blackmamed3 | 223456   |
      | blackmamed5 | 323456   |


