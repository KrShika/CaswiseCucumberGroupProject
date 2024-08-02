package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CheckShowPdfPage;

public class CheckShowPdfSteps {

    CheckShowPdfPage checkShowPdfPage = new CheckShowPdfPage();


    @When("user clicks on Check button")
    public void user_clicks_on_check_button() {
        checkShowPdfPage.checkButton.click();

    }
    @And("user clicks on three dot button")
    public void user_clicks_on_three_dot_button() {
        checkShowPdfPage.threeDotsButton.click();

    }
    @And("user click on show pdf button")
    public void user_click_on_show_pdf_button() {
        checkShowPdfPage.showPdfButton.click();

    }
    @Then("user can see check in PDF file")
    public void user_can_see_check_in_pdf_file() {
       Assert.assertTrue(checkShowPdfPage.downloadPdfButton.getText().equals("Download PDF"));

    }



}
