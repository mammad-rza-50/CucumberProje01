package Pages;

import Utilites.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    public WebElement registerBtn;

    @FindBy(id = "customer.lastName")
    public WebElement lastname;

    @FindBy(id = "customer.firstName")
    public WebElement firstname;

    @FindBy(id = "customer.address.street")
    public WebElement address;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "customer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phone;

    @FindBy(id = "customer.ssn")
    public WebElement ssn;

    @FindBy(id = "customer.username")
    public WebElement username;

    @FindBy(id = "customer.password")
    public WebElement password;

    @FindBy(id = "repeatedPassword")
    public WebElement confirmPassword;

    @FindBy(css = "input[value='Register']")
    public WebElement registerBtn1;

    @FindBy(xpath = "//h1[contains(text(),'Welcome')]")
    public WebElement messajWelcome;

    @FindBy(xpath = "//b[contains(text(),'Welcome')]")
    public WebElement messajAccountWelcome;

    @FindBy(css = "input[name='username']")
    public WebElement loginUsername;

    @FindBy(css = "input[name='password']")
    public WebElement loginPassword;

    @FindBy(css = "input[value='Log In']")
    public WebElement loginBtn;

    @FindBy(linkText = "Log Out")
    public WebElement logoutBtn;

    @FindBy(xpath = "//h2[text()='Customer Login']")
    public WebElement messajCustomerLogin;

    @FindBy(xpath = "//p[text()='The username and password could not be verified.']")
    public WebElement invalidLoginMessage;

    @FindBy(linkText = "Bill Pay")
    public WebElement billPayBtn;

    @FindBy(css = "input[name='payee.name']")
    public WebElement payeeName;

    @FindBy(css = "[name='payee.address.street']")
    public WebElement payeeAddress;

    @FindBy(css = "input[name='payee.address.city']")
    public WebElement payeeCity;

    @FindBy(css = "input[name='payee.address.state']")
    public WebElement payeeState;

    @FindBy(css = "input[name='payee.address.zipCode']")
    public WebElement payeeZipCode;

    @FindBy(css = "input[name='payee.phoneNumber']")
    public WebElement payeePhone;

    @FindBy(css = "input[name='payee.accountNumber']")
    public WebElement payeeAccount;

    @FindBy(css = "input[name='verifyAccount']")
    public WebElement payeeVerifyAccount;

    @FindBy(css = "input[name='amount']")
    public WebElement payeeAmount;

    @FindBy(css = "input[value='Send Payment']")
    public WebElement sendPaymentBtn;

    @FindBy(xpath = "//h1[text()='Bill Payment Complete']")
    public WebElement messajBillPaymComplete;

    public WebElement getWebElement(String stringBtn) {

        switch (stringBtn) {

            case ("firstname"):
                return firstname;
            case ("lastname"):
                return lastname;
            case ("address"):
                return address;
            case ("city"):
                return city;
            case ("state"):
                return state;
            case ("zipCode"):
                return zipCode;
            case ("phone"):
                return phone;
            case ("ssn"):
                return ssn;
            case ("username"):
                return username;
            case ("password"):
                return password;
            case ("confirmPassword"):
                return confirmPassword;
            case ("loginUsername"):
                return loginUsername;
            case ("loginPassword"):
                return loginPassword;
            case ("loginBtn"):
                return loginBtn;
            case ("logoutBtn"):
                return logoutBtn;
            case ("billPayBtn"):
                return billPayBtn;
            case "payeeName":
                return payeeName;
            case "payeeAddress":
                return payeeAddress;
            case "payeeCity":
                return payeeCity;
            case "payeeState":
                return payeeState;
            case "payeeZipCode":
                return payeeZipCode;
            case "payeePhone":
                return payeePhone;
            case "payeeAccount":
                return payeeAccount;
            case "payeeVerifyAccount":
                return payeeVerifyAccount;
            case "payeeAmount":
                return payeeAmount;


        }

        return null;
    }

}
