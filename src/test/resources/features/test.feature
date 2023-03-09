Feature: As a customer,
  @ddTech-1
  Scenario: The user should fill the form
    Given the user goes to the main page
    And the user is on the correct page
    And the user puts firstName
    And the user puts familyName
    And the user puts email
    And the user puts phoneNumber
    And the user puts password
    And the user puts the password again
    And the user clicks the Terms of Use and Agreement
    And the user clicks on signUp
    Then the user created account
