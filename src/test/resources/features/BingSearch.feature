Feature: Bing search functionality
  Agile story: As a user, when I am on the Bing search page
  I should be able to search anything and see relevant results


Scenario: Bing Search Title Verification
Given user is on the Bing search page
When user search for orange in Bing search box
Then user should see orange in the title
  @wip_ismail
  Scenario: Bing Search Title Verification
    Given user is on the Bing search page
    When user enter for "orange" in Bing search box
    Then user should see "orange - Search" in the title

