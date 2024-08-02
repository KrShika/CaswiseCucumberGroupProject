  @addIncome
  Feature: Add Income functionality


    Scenario: positive where user is able to add income
      Given user is on "https://cashwise.us/main"
      When user clicks on sign in button
      And user input the email "kris@gmail.com"
      And user input the password "kri1234"
      And user clicks on sign in two button
      And user clicks on reports button
      Then user clicks on add income button
      And user inputs title "Borrowing"
      And user clicks on category
      Then user selects category
      And user clicks on payment method
      Then user selects payment method
      And user clicks on to which check
      Then user selects to which check
      And user enters amount "223"
      And user clicks on accept button
      Then user verifies that the amount is "223 $"
      Then user verifies the color is "rgba(44, 168, 3, 1)"




