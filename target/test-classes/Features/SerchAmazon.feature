Feature: Test the Search functionality 
  I want to use this template for my feature file


  Scenario: Search a product
    Given I have a search field on Amazon Page
    When I search for product with name "Apple MacBook Pro" and Price 1000
    Then Product with name "Apple MacBook Pro" should be displayed
    Then Order id is 2345 and username is "Naveen"