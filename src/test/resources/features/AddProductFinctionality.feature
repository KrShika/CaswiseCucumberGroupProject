Feature: Add Product Functionality

  Background:
    Given user is on  "https://cashwise.us/"
    When user clicks on Sign in button

  @addProduct
  Scenario: User was able to successfully sign in
    And the user inputs "ajgerasydykova2@gmail.com" in the e-mail field
    And the user inputs "Kaspersky1230" in the password field
    And user clicks again on Sign in button
    And user clicks on  Expenses  button
    And user clicks on Products and Services button
    Then user clicks on Add products and services button
    And user inputs "Aigera" in the name field
    And user inputs "1000" in the Price field
    And user chooses Product from Service Type
    And user chooses IT from Category field
    And user inputs "Tech" in the Description field
#    And user enters "08/10/2024" in the date of pay field
    Then user clicks on Save button
