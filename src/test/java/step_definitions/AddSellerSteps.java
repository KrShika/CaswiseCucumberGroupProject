package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SellerPage;
import utilities.Driver;

public class AddSellerSteps {

    private static final Logger logger =
            LogManager.getLogger(AddSellerSteps.class);


    WebDriver driver = Driver.getDriver();
    Faker faker = new Faker();
    HomePage homePage = new HomePage();
    SellerPage sellerPage = new SellerPage();


    @Given("user is on {string}")
    public void user_is_on(String url) {
        logger.info("user is going to "+url);
        driver.get(url);
        logger.info("User successfully landed on the page: "+driver.getTitle());

    }
    @When("user log in")
    public void user_log_in() {
        homePage.Login("Admin@gmail.com", "admin1234");


    }
    @And("user clicks on  Expenses  button")
    public void user_clicks_on_expenses_button() {
        sellerPage.expenses.click();

    }
    @And("user clicks on add seller  button")
    public void user_clicks_on_add_seller_button() {
        sellerPage.buttonAddSeller.click();

    }
    @And("user inputs title in the title field")
    public void user_inputs_title_in_the_title_field() {
        sellerPage.titleInput.sendKeys(faker.name().title());

    }
    @And("user inputs full name in the full name field")
    public void user_inputs_full_name_in_the_full_name_field() {
        sellerPage.fullNameInput.sendKeys(faker.name().fullName());

    }
    @And("user inputs email in the email field")
    public void user_inputs_email_in_the_email_field() {
        sellerPage.emailInput.sendKeys(faker.name().username()+"@gmail.com");

    }
    @And("user inputs phone number in the phone number field")
    public void user_inputs_phone_number_in_the_phone_number_field() {
        sellerPage.phoneNumberInput.sendKeys(faker.phoneNumber().phoneNumber());

    }
    @And("user inputs address in the address field")
    public void user_inputs_address_in_the_address_field() {
        sellerPage.addressInput.sendKeys(faker.address().fullAddress());

    }
    @And("click on save button")
    public void clickOnSaveButton() {
        sellerPage.saveButton.click();
    }
    @Then("user successfully added seller")
    public void userSuccessfullyAddedSeller() {
        String actual = driver.getCurrentUrl();
        String expected = "https://cashwise.us/dashboard/costs/sellers/active?isCreate=false";
        Assert.assertFalse(actual.equals(expected));
        logger.info("User successfully added seller");
    }
    @When("user inputs invalid email in the email field")
    public void user_inputs_invalid_email_in_the_email_field() {
        sellerPage.emailInput.sendKeys(faker.name().username());

    }
    @Then("user gets error message {string}")
    public void user_gets_error_message(String message) {
       Assert.assertTrue(message.equals(sellerPage.invalidEmail.getText()));
       logger.info("User was not able to add seller");

    }

    @Then("user closes browser")
    public void userClosesBrowser() {
        Driver.close();
    }
}




