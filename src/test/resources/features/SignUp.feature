
Feature:
  @SignUp
  Scenario: positive when the user successfully signs up
    Given the user is on "https://cashwise.us/main"
    When user clicks on sign up button
    Then user types "fluf1f1ybear@gmail.com" on email field
    Then user types "password123" on password field
    Then user enters "password123"  on confirm password field
    Then user clicks on continue
    Then user enters "John" on name field
    Then user enters "Doe" on surname field
    Then user enters "Apple1. In1c1" on business field
    Then user selects realty
    Then user enters "999 Hill st" on address field
    Then user selects currency
    Then user click on sign up