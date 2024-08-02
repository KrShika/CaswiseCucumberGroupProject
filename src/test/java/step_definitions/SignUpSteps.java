package step_definitions;

import pages.SingUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;

public class SignUpSteps {
    //WebDriver driver = Driver.getDriver();
    SingUpPage signuppage = new SingUpPage();





    @Given("the user is on {string}")
    public void someone_is_on(String url) {
        Driver.getDriver().get(url);
    }

    @When("user clicks on sign up button")
    public void user_clicks_on_sign_up_button() {
        signuppage.signUpButton.click();
    }
    @Then("user types {string} on email field")
    public void user_types_on_email_field(String string) {
        signuppage.emailInput.sendKeys(string);
    }
    @Then("user types {string} on password field")
    public void user_types_on_password_field(String string) {
        signuppage.passwordInput.sendKeys(string);
    }
    @Then("user enters {string}  on confirm password field")
    public void user_enters_on_confirm_password_field(String string) {
        signuppage.repeatPassword.sendKeys(string);
    }
    @Then("user clicks on continue")
    public void user_clicks_on_continue() {
       signuppage.continueButton.click();
    }
    @Then("user enters {string} on name field")
    public void user_enters_on_name_field(String string) {
        signuppage.firstName.sendKeys(string);
    }
    @Then("user enters {string} on surname field")
    public void user_enters_on_surname_field(String string) {
        signuppage.surnameInput.sendKeys(string);
    }
    @Then("user enters {string} on business field")
    public void user_enters_on_business_field(String string) {
       signuppage.businessName.sendKeys(string);
    }
    @Then("user selects realty")
    public void user_selects_realty() {
        signuppage.businessArea.click();
        signuppage.businessOption.click();
    }
    @Then("user enters {string} on address field")
    public void user_enters_on_address_field(String string) {
        signuppage.addressInput.sendKeys(string);
    }
    @Then("user selects currency")
    public void user_selects_currency() {
        signuppage.currencyInput.click();
        signuppage.currencySelect.click();
    }
    @Then("user click on sign up")
    public void user_click_on_sign_up() {
        signuppage.signUp.click();
        Driver.getDriver().close();
    }

}
