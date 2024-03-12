Feature: Invalid Google Login

  @sanity
  Scenario: Extract all upcoming bike details under four lakhs
    Given user navigates to zigwheels website
    When user hover on New Bikes
    Then user clicks on Upcoming Bikes
    When user selects manufacturer name
    Then user display all upcoming bike details

  @sanity @regression
  Scenario: Extract all popular model of used cars in Chennai
    Given user navigates to zigwheels website
    When user hover on Used Cars
    Then user clicks on Chennai
    When user scroll to Popular Models
    Then user extracts all popular models name

  @sanity @regression
  Scenario: Google login with invalid account
    Given user navigates to zigwheels website
    When user clicks to signup button
    Then user clicks to the google option
    When user enter invalid account details
    Then user captures error message
