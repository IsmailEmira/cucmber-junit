@cydeo
  Feature: Cydeo Web table app Login Functionality

    Agile :  As a user, I should be able to login with correct credentials


    Scenario: Positive login scenario
      Given user is on Web Table app login page
     When user enters correct username
     And user enter correct password
     And user clicks to login button
     Then user should see url orders


    Scenario: Positive login scenario
      Given user is on Web Table app login page
      When user enters "Test" username
      And user enter "Tester" password
      And user clicks to login button
      Then user should see url orders

    Scenario: Positive login scenario
      Given user is on Web Table app login page
      When user enters below correct credentials
      |username|Test|
      |password|Tester|
      And user clicks to login button
      Then user should see url orders



