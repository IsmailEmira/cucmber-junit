Feature: Cucumber Data Tables implementation practices


  Scenario: List of fruits and vegetables I Like
    Then user should see below list
      | orange     |
      | apple      |
      | Kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |


   #Create a new scenario where we list the type of pets we love
  # print out all the strings in the list

  Scenario: List of pets types I love
    Then I will share my favorites
      | cat   |
      | puppy |
      | goats |
      | Horse |
      | Fish  |

  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | jane         |
      | surname | Doe          |
      | age     | 29           |
      | address | somewhere    |
      | state   | CA           |
      | zipcode | 99999        |
      | phone   | 111-1111-111 |

  @dataTable
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January |
      | February |
      | March |
      | April |
      | May |
      | June |
      | July |
      | August |
      | September |
      | October |
      | November |
      | December |