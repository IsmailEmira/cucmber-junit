Feature: Some of the general functionality verification


  Scenario: Order place scenario
    Given user is already logged in to The Web table app
    When user is on the Order page
    Then user sees below options under product dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |


  Scenario: Payment options verifications
    Given user is already logged in to The Web table app
    When user is on the Order page
    Then user sees Visa as enabled payment option
    Then user sees MasterCard as enabled payment option
    Then user sees AmericanExpress as enabled payment option


  Scenario: Order place scenario
    Given user is already logged in to The Web table app
    When user is on the Order page
        # user enters appropriate test data
    When user enters product "MoneyCog"
    And user enters quantity"12"
    And user enetrs price per unit "100"
    And user enters discount "2"
    And user clicks to calculate Button
    And user enters customer name "Jane Doe"
    And user enters street "forest hills"
    And user enters city "Queens"
    And user enters the state "new york"
    And user enters zip "31111"
    Then user select payment option"American Express"
    And user enters card number "123423011111"
    And user enters expire date "08/25"
    Then user clicks to process order
    Then user should see new order in the table on view all orders page "Jane Doe"


  Scenario Outline: Order place scenario
    Given user is already logged in to The Web table app
    When user is on the Order page
        # user enters appropriate test data
    When user enters product "<product>"
    And user enters quantity"<quantity>"
    And user enetrs price per unit "<price>"
    And user enters discount "<discount>"
    And user clicks to calculate Button
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters the state "<state>"
    And user enters zip "<zip>"
    Then user select payment option"<cardType>"
    And user enters card number "<number>"
    And user enters expire date "<date>"
    Then user clicks to process order
    Then user should see new order in the table on view all orders page "<expectedName>"
    @cydeo
    Examples: search values we are going to be using in this scenario outlines
      | product   | quantity | price | discount | customerName | street | state | zip   | cardType         | number       | date  | expectedName |
      | MonkeyCog | 12       | 11    | 23       | Zane Doe     | 7th st | Ny    | 31111 | American express | 888888888888 | 09/26 | Zane Doe     |
      | MonkeyCog | 121      | 11    | 4        | jane Doe     | 7th st | Ny    | 31111 | visa             | 888888888885 | 09/26 | jane Doe     |
      | MonkeyCog | 14       | 11    | 5        | Lane Doe     | 7th st | Ny    | 31111 | American express | 888888888884 | 09/26 | Lane Doe     |
      | MonkeyCog | 1212     | 11    | 3        | Jake Doe     | 7th st | Ny    | 31111 | American express | 888888888882 | 09/26 | Jake Doe     |







