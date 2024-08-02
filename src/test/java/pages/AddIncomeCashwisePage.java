package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddIncomeCashwisePage {


    WebDriver driver;

    public AddIncomeCashwisePage(){
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//li[text()=\"Reports\"]")
    public WebElement reportsButton;

    @FindBy(xpath = "//button[text()=\"Add income\"]")
    public WebElement addIncomeButton;

    @FindBy(xpath = "//input[@placeholder=\"File title\"]")
    public WebElement fileTitleInput;

    @FindBy(xpath = "//span[text()=\"Select file\"]")
    public WebElement selectFileInput;

    @FindBy(xpath = "//input[@placeholder=\"Title\"]")
    public WebElement titleInput;

    @FindBy(id = "mui-component-select-category_id")
    public WebElement categoryInput;

    @FindBy(xpath = "//li[text()=\"Finance\"]")
    public WebElement selectCategory;

    @FindBy(id = "mui-component-select-type_of_pay")
    public WebElement paymentMethod;

    @FindBy(xpath = "//li[text()=\"Bank\"]")
    public WebElement selectPaymentMethod;

    @FindBy(id = "mui-component-select-bank_account")
    public WebElement toWhichCheckInput;

    @FindBy(xpath = "//li[text()=\"BankBank\"]")
    public WebElement selectToWhichCheck;

    @FindBy(id = "amount_of_money_input_text")
    public WebElement sumInput;

    @FindBy(xpath = "//button[text()=\"Accept\"]")
    public WebElement acceptButton;

    @FindBy(xpath = "//table/tbody/tr[1]/td[5]")
    public WebElement verifyAmount;

    @FindBy(xpath = "//p[@class=\"css-10nd6or\"]")
    public WebElement verifyColor;










}
