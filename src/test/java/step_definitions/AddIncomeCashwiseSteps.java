package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AddIncomeCashwisePage;
import pages.HomePage;

public class AddIncomeCashwiseSteps {


    AddIncomeCashwisePage addIncomePage = new AddIncomeCashwisePage();
    HomePage homePage = new HomePage();








    @And("user clicks on reports button")
    public void user_clicks_on_reports_button() {
        addIncomePage.reportsButton.click();

    }
    @Then("user clicks on add income button")
    public void user_clicks_on_add_income_button() {
        addIncomePage.addIncomeButton.click();

    }

    @And("user inputs title {string}")
    public void user_inputs_title(String title) {
        addIncomePage.titleInput.sendKeys(title);

    }
    @And("user clicks on category")
    public void user_clicks_on_category() {
        addIncomePage.categoryInput.click();

    }
    @Then("user selects category")
    public void user_selects_category() {
        addIncomePage.selectCategory.click();

    }
    @And("user clicks on payment method")
    public void user_clicks_on_payment_method() {
        addIncomePage.paymentMethod.click();

    }
    @Then("user selects payment method")
    public void user_selects_payment_method() {
        addIncomePage.selectPaymentMethod.click();

    }
    @And("user clicks on to which check")
    public void user_clicks_on_to_which_check() {
        addIncomePage.toWhichCheckInput.click();

    }
    @Then("user selects to which check")
    public void user_selects_to_which_check() {
        addIncomePage.selectToWhichCheck.click();

    }
    @And("user enters amount {string}")
    public void user_enters_amount(String amount) {
        addIncomePage.sumInput.sendKeys(amount);

    }
    @Then("user clicks on accept button")
    public void user_clicks_on_accept_button() {
        addIncomePage.acceptButton.click();

    }
    @Then("user verifies that the amount is {string}")
    public void user_verifies_that_the_amount_is(String verifyAmount) {
        Assert.assertEquals(verifyAmount,addIncomePage.verifyAmount.getText());
        System.out.println(addIncomePage.verifyColor.getCssValue("color"));

    }

    @Then("user verifies the color is {string}")
    public void userVerifiesTheColorIs(String verColor) {
        Assert.assertEquals(verColor,addIncomePage.verifyColor.getCssValue("color"));
    }


    @When("user clicks on sign in button")
    public void userClicksOnSignInButton() {
        homePage.signInButton.click();

    }

    @And("user input the email {string}")
    public void userInputTheEmail(String email) {
        homePage.usernameInput.sendKeys(email);

    }

    @And("user input the password {string}")
    public void userInputThePassword(String password) {
        homePage.passwordInput.sendKeys(password);

    }

    @And("user clicks on sign in two button")
    public void userClicksOnSignInTwoButton() {
        homePage.signInBtnInForm.click();
    }
}
