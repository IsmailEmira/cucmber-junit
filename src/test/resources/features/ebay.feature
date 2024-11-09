
@ebay
Feature: ebay search functionality title verification


  Agile Story : User Should be able to type any keyword and see relevant information


  Scenario:  Ebay Title Verification
    Given user is on ebay
    Then user see title "Electronics, Cars, Fashion, Collectibles & More | eBay"


  Scenario: Ebay Search Functionality Title Verification (without parameterization)

    Given user is on ebay
    Then user types Wooden Spoon in the search box
    And user clicks on search button
    Then user should see Wooden Spoon in the title

    Scenario: Ebay Search Functionality Title Verification (with parameterization)
      Given user is on ebay
      Then user types "Wooden Spoon" in the search box
      And user clicks on search button
      Then user should see "Wooden Spoon" is in the title




