package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilites.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterStep extends Parent {

    @Given("Navigate to Para Bank")
    public void navigateToParaBank() {

        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
        GWD.getDriver().manage().window().maximize();

    }

    DialogContent dc = new DialogContent();

    @When("Register valid username and password")
    public void registerValidUsernameAndPassword() {


        dc.sendKeysFunction(dc.firstname, "Memmed");
        dc.sendKeysFunction(dc.lastname, "Rzayev");
        dc.sendKeysFunction(dc.address, "Sulh Mehelle");
        dc.sendKeysFunction(dc.city, "Absheron");
        dc.sendKeysFunction(dc.state, "Saray");
        dc.sendKeysFunction(dc.zipCode, "0121");
        dc.sendKeysFunction(dc.phone, "2460406");
        dc.sendKeysFunction(dc.ssn, "1214");
        dc.sendKeysFunction(dc.username, "blackmamed");
        dc.sendKeysFunction(dc.password, "12141214");
        dc.sendKeysFunction(dc.confirmPassword, "12141214");


    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {

        dc.verifyContainsTextFunction(dc.messajWelcome, "Welcome");

    }

    @When("Register valid datas")
    public void registerValidDatas(DataTable table) {

        dc.clickFunction(dc.registerBtn);

        List<List<String>> lists = table.asLists(String.class);

        for (List<String> list : lists) {
            WebElement element = dc.getWebElement(list.get(0));

            dc.sendKeysFunction(element, list.get(1));

        }

        dc.clickFunction(dc.registerBtn1);
    }


    @And("User should login successfully")
    public void userShouldLoginSuccessfully() {

        dc.verifyContainsTextFunction(dc.messajAccountWelcome, "Welcome");
    }


    @When("Enter valid username as {string} and valid password as {string}")
    public void enterValidUsernameAsAndValidPasswordAs(String username, String password) {

        dc.sendKeysFunction(dc.loginUsername, username);
        dc.sendKeysFunction(dc.loginPassword, password);
        dc.clickFunction(dc.loginBtn);

    }

    @When("Enter invalid username as {string} and valid password as {string}")
    public void enterInvalidUsernameAsAndValidPasswordAs(String username, String password) {

        dc.sendKeysFunction(dc.loginUsername, username);
        dc.sendKeysFunction(dc.loginPassword, password);
        dc.clickFunction(dc.loginBtn);
    }

    @Then("User should be log out")
    public void userShouldBeLogOut() {

        dc.clickFunction(dc.logoutBtn);
        dc.verifyContainsTextFunction(dc.messajCustomerLogin, "Customer Login");

    }

    @Then("Error message in displey")
    public void errorMessageInDispley() {

        dc.verifyContainsTextFunction(dc.invalidLoginMessage,
                "could not");
    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog() {
        dc.clickFunction(dc.billPayBtn);
    }


    @When("Enter payee information")
    public void enterPayeeInformation(DataTable table) {

        List<List<String>> lists = table.asLists(String.class);
        for (List<String> list : lists) {
            WebElement element = dc.getWebElement(list.get(0));

            dc.sendKeysFunction(element, list.get(1));
        }
        dc.clickFunction(dc.sendPaymentBtn);
    }

    @And("Verify payee information")
    public void verifyPayeeInformation() {
        dc.verifyContainsTextFunction(dc.messajBillPaymComplete,"Bill Payment Complete");
    }
}
