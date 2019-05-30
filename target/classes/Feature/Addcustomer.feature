Feature: Add customer details to telecom website

  Scenario: Customer adding to telecom
    Given The user is in telecom home page
    And The user click on add customer
    When User is filling all the fields
    And User click on submit button
    Then The user should be displayed the customer id
