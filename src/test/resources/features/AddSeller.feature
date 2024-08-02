@addSeller
Feature: Add Seller Functionality

  Background:
    Given  user is on "https://cashwise.us/main"
    When  user log in


    @positive
    Scenario: positive scenario where user enters all required fields
      And user clicks on  Expenses  button
      And user clicks on add seller  button
      And user inputs title in the title field
      And user inputs full name in the full name field
      And user inputs email in the email field
      And user inputs phone number in the phone number field
      And user inputs address in the address field
      And click on save button
      Then user successfully added seller
      Then user closes browser

  @negative
  Scenario: negative scenario where user enters invalid email
    And user clicks on  Expenses  button
    And user clicks on add seller  button
    And user inputs title in the title field
    And user inputs full name in the full name field
    And user inputs invalid email in the email field
    And user inputs phone number in the phone number field
    And user inputs address in the address field
    And click on save button
    Then user gets error message "Please enter a valid email address"
    Then user closes browser

