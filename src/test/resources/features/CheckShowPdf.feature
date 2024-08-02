  @showPdf
  Feature: Show PDF feature

    Background:
      Given  user is on "https://cashwise.us/main"
      When  user log in
      And user clicks on  Expenses  button

@showPdfPositive
    Scenario:positive scenario where user can see check in pdf file
      When user clicks on Check button
      And user clicks on three dot button
      And user click on show pdf button
      Then user can see check in PDF file
