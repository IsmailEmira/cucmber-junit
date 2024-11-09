@wiki
Feature: Wikipedia Search Functionality Title verification


  user story : As  a user, when i am on wikipedia page , i have to search for steve Jobs
  I should able to search and see relevant information


  Scenario: Wikipedia Search Title Functionality
    Given user is on wikipedia page
    When user search for "steveJobs" in the wiki search box
    And user clicks on the search button
    Then user should see "Steve Jobs - Wikipedia" in wiki title


  Scenario: Wikipedia Search Functionality Header Verification
    Given user is on wikipedia page
    When user search for "steveJobs" in the wiki search box
    And user clicks on the search button
    Then user should see "Steve Jobs" in the main header

  Scenario:Wikipedia Search Functionality Image Header Verification
    Given user is on wikipedia page
    When user search for "steveJobs" in the wiki search box
    And user clicks on the search button
    Then User sees "Steve Jobs" is in the image header

  @scenarioOutlines
  Scenario Outline: Wikipedia Search functionality with Scenario Outline
    Given user is on wikipedia page
    When user search for "<searchValue>" in the wiki search box
    And user clicks on the search button
    Then user should see "<expectedTitle>" in wiki title
    Then user should see "<expectedMainHeader>" in the main header
    Then User sees "<expectedImageHeader>" is in the image header

    @ceos
    Examples: search values we are going to be using in this scenario outlines
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | Rosalind Brewer | Rosalind Brewer | Rosalind Brewer    | Rosalind Brewer     |
      | Sundar Pichai   | Sundar Pichai   | Sundar Pichai      | Sundar Pichai       |

    @scientists
    Examples:
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Marie Curie     | Marie Curie     | Marie Curie        | Marie Curie         |
      | Albert Einstein | Albert Einstein | Albert Einstein    | Albert Einstein     |







