package step_definitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AddProductPage;
import pages.HomePage;
import pages.SellerPage;
import utilities.Driver;

import java.util.Random;


//
//import com.github.javafaker.Faker;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import pages.AddProductPage;
//import pages.HomePage;
//import utilities.Driver;
//
public class AddProductSteps {
//

    WebDriver driver = Driver.getDriver();
    Faker faker = new Faker();
    HomePage homePage = new HomePage();
    SellerPage sellerPage = new SellerPage();
    AddProductPage addProductPage =new AddProductPage();



    @Given("user is on  {string}")
    public void user_is_on(String string) {
    driver.get(string);
    }
    @When("user clicks on Sign in button")
    public void user_clicks_on_sign_in_button() {

        addProductPage.signInButton1.click();
    }
    @When("the user inputs {string} in the e-mail field")
    public void the_user_inputs_in_the_e_mail_field(String string) {
        addProductPage.usernameInp.sendKeys(string);
    }
    @When("the user inputs {string} in the password field")
    public void the_user_inputs_in_the_password_field(String string) {
        addProductPage.passwordInp.sendKeys(string);

    }

    @When("user clicks again on Sign in button")
    public void user_clicks_again_on_sign_in_button() {

        addProductPage.signInButton2.click();
    }
    @When("user clicks on Products and Services button")
    public void user_clicks_on_products_and_services_button() throws InterruptedException {
        Thread.sleep(2000);
        addProductPage.expenses.click();
    }
    @Then("user clicks on Add products and services button")
    public void user_clicks_on_add_products_and_services_button() {
        addProductPage.products.click();
        addProductPage.addProdButton.click();
    }
    @Then("user inputs {string} in the name field")
    public void user_inputs_in_the_name_field(String string) {
        Random random = new Random();

        addProductPage.nameInput.sendKeys(string+(char)random.nextInt(64,180));
    }
    @Then("user inputs {string} in the Price field")
    public void user_inputs_in_the_price_field(String string) {
        addProductPage.priceInput.sendKeys(string);
    }
    @Then("user chooses Product from Service Type")
    public void user_chooses_product_from_service_type() {
        addProductPage.serviceInp.click();
        addProductPage.productOption.click();
    }
    @Then("user chooses IT from Category field")
    public void user_chooses_it_from_category_field() {
       addProductPage.category.click();
       addProductPage.selectCategory.click();
    }
    @Then("user inputs {string} in the Description field")
    public void user_inputs_in_the_description_field(String string) {
        addProductPage.description.sendKeys(string);
    }
    @Then("user enters {string} in the date of pay field")
    public void user_enters_in_the_date_of_pay_field(String string) {
      addProductPage.dateOfPay.sendKeys(string);
    }
    @Then("user clicks on Save button")
    public void user_clicks_on_save_button() {
        addProductPage.saveButton.click();
    }


}
