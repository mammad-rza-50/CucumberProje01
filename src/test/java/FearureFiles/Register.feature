Feature: Register Functionality

  Scenario: Create new register

    Given Navigate to Para Bank
    When Register valid datas
      | firstname       | Memmed        |
      | lastname        | Rzayev        |
      | address         | Sulh Mehelle  |
      | city            | Absheron      |
      | state           | Saray         |
      | zipCode         | 0121          |
      | phone           | 2460406       |
      | ssn             | 1214          |
      | username        | blackmamed241 |
      | password        | 12141214      |
      | confirmPassword | 12141214      |
    Then User should register successfully

