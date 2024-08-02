package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SingUpPage {
    // WebDriver driver;

    public SingUpPage() {
        // this.driver = Driver.getDriver();
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='css-1riicrm']/button[.='Sign up']")
    public WebElement signUpButton;

    @FindBy(xpath = "//input[@id=\"email_input_text\"]")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id=\"password_input_text\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@id=\"repeat_password_input_text\"]")
    public WebElement repeatPassword;

    @FindBy(xpath = "//button[@form=\"register-form-1\"]")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@id=\"first_name_input_text\"]")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id=\"last_name_input_text\"]")
    public WebElement surnameInput;

    @FindBy(xpath = "//input[@id=\"company_name_input_text\"]")
    public WebElement businessName;

    @FindBy(xpath = "//div[@id=\"mui-component-select-business_area_id\"]")
    public WebElement businessArea;

    @FindBy(xpath = "//li[@data-value=\"1\"]")
    public WebElement businessOption;

    @FindBy(xpath = "//input[@id=\"address_input_text\"]")
    public WebElement addressInput;

    @FindBy(xpath = "//div[@id=\"mui-component-select-currency\"]")
    public WebElement currencyInput;

    @FindBy(xpath = "//div[@style=\"display: flex; align-items: center; gap: 5px;\"]")
    public WebElement currencySelect;

    @FindBy(xpath = "//button[@form=\"register-form-2\"]")
    public WebElement signUp;


}
