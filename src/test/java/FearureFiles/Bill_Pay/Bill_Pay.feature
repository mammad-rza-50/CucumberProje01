Feature: Bill Pay Functionality

  Background:

    Given Navigate to Para Bank

    When Enter valid username as "blackmamed241" and valid password as "12141214"

    And Click on the element in Dialog

  Scenario Outline: Testing Bill Pay page

    When Enter payee information

      | payeeName          | <payeeName>          |
      | payeeAddress       | <payeeAddress>       |
      | payeeCity          | <payeeCity>          |
      | payeeState         | <payeeState>         |
      | payeeZipCode       | <payeeZipCode>       |
      | payeePhone         | <payeePhone>         |
      | payeeAccount       | <payeeAccount>       |
      | payeeVerifyAccount | <payeeVerifyAccount> |
      | payeeAmount        | <payeeAmount>        |

    And Verify payee information

    Examples:
      | payeeName     | payeeAddress    | payeeCity | payeeState | payeeZipCode | payeePhone | payeeAccount | payeeVerifyAccount | payeeAmount |
      | Electric Bill | Sulh Mehelle 12 | Saray     | Absheron   | 0121         | 2234567    | 17215         | 17215               | 85$         |
      | Water Bill    | Sulh Mehelle 12 | Saray     | Absheron   | 0121         | 2234567    | 17216         | 17216               | 45$         |
      | Natural Qaz   | Sulh Mehelle 12 | Saray     | Absheron   | 0121         | 2234567    | 17217         | 17217               | 12$         |



