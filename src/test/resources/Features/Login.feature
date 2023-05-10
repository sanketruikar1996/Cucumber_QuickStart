
Feature: Want to test login functionality
 

  @tag1
  Scenario: Login Test
    Given User is on login page
    When user enters username and password
    And user click on login button
    Then user gets navigated to home page

