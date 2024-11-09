package com.cydeo.step_definitions;

import com.cydeo.pages.WT_OrderPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.pages.Wt_ViewAllOrdersPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class CydeoTable_stepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    @Given("user is on Web Table app login page")
    public void user_is_on_web_table_app_login_page() {
     Driver.getDriver().get(" https://web-table-2.cydeo.com/login");
    }
    @When("user enters correct username")
    public void user_enters_correct_username() {
      webTableLoginPage.InputUsername.sendKeys("Test");
    }
    @When("user enter correct password")
    public void user_enter_correct_password() {
      webTableLoginPage.InputPassword.sendKeys("Tester");
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginPage.LoginBtn.click();

    }
    @Then("user should see url orders")
    public void user_should_see_url_orders() {
        BrowserUtils.verifyUrlContains("orders");

    }


    @When("user enters {string} username")
    public void userEntersUsername(String username) {
        webTableLoginPage.InputUsername.sendKeys(username);
    }

    @And("user enter {string} password")
    public void userEnterPassword(String password) {
        webTableLoginPage.InputPassword.sendKeys(password);
    }

    @When("user enters below correct credentials")
    public void userEntersBelowCorrectCredentials(Map<String,String> credentials) {

        webTableLoginPage.InputUsername.sendKeys(credentials.get("username"));
        webTableLoginPage.InputPassword.sendKeys(credentials.get("password"));

    }

    @Given("user is already logged in to The Web table app")
    public void userIsAlreadyLoggedInToTheWebTableApp() {

        Driver.getDriver().get("https://web-table-2.cydeo.com/orders");
        webTableLoginPage.login();
    }
   WT_OrderPage orderPage = new WT_OrderPage();
    @When("user is on the Order page")
    public void userIsOnTheOrderPage() {

        orderPage.Link.click();

    }

    @Then("user sees below options under product dropdown")
    public void userSeesBelowOptionsUnderProductDropdown(List<String> expectedOption) {

       List<String> actualOptions = BrowserUtils.dropDownOptions_as_STRING(orderPage.productDropDown);

        Assert.assertEquals(actualOptions,expectedOption);

    }


    @Then("user sees MasterCard as enabled payment option")
    public void userSeesMasterCardAsEnabledPaymentOption() {
        orderPage.masterCardRadioBtn.isEnabled();
    }

    @Then("user sees AmericanExpress as enabled payment option")
    public void userSeesAmericanExpressAsEnabledPaymentOption() {
        orderPage.americanExpressRadioBtn.isEnabled();
    }

    @Then("user sees Visa as enabled payment option")
    public void userSeesVisaAsEnabledPaymentOption() {
        orderPage.visaRadioBtn.isEnabled();
    }


    @When("user enters product {string}")
    public void userEntersProduct(String expectedProduct) {

        BrowserUtils.dropDownOptions_as_STRING(orderPage.productDropDown);
    }

    @And("user enters quantity{string}")
    public void userEntersQuantity(String quantity) {
        orderPage.InputQuantity.clear();
        orderPage.InputQuantity.sendKeys(quantity);
    }

    @And("user enetrs price per unit {string}")
    public void userEnetrsPricePerUnit(String price) {
        orderPage.pricePerUnit.sendKeys(price);
    }

    @And("user enters discount {string}")
    public void userEntersDiscount(String discount) {
        orderPage.Discount.sendKeys(discount);
    }

    @And("user clicks to calculate Button")
    public void userClicksToCalculateButton() {
        orderPage.calculateBtn.click();
    }

    @And("user enters customer name {string}")
    public void userEntersCustomerName(String name) {
        orderPage.customerName.sendKeys(name);
    }

    @And("user enters street {string}")
    public void userEntersStreet(String street) {
        orderPage.street.sendKeys(street);
    }

    @And("user enters the state {string}")
    public void userEntersTheState(String state) {
        orderPage.state.sendKeys(state);
    }

    @And("user enters zip {string}")
    public void userEntersZip(String zip) {
        orderPage.zip.sendKeys(zip);
    }



    @And("user enters card number {string}")
    public void userEntersCardNumber(String number) {
        orderPage.cardNo.sendKeys(number);
    }

    @And("user enters expire date {string}")
    public void userEntersExpireDate(String date) {
        orderPage.cardExp.sendKeys(date);
    }

    @Then("user clicks to process order")
    public void userClicksToProcessOrder() {
        orderPage.processOrderBtn.click();
    }


    @And("user enters city {string}")
    public void userEntersCity(String city) {
        orderPage.city.sendKeys(city);
    }

    @Then("user select payment option{string}")
    public void userSelectPaymentOption(String expectedPayment) {
        BrowserUtils.clickRadioButton(orderPage.cardTypes,expectedPayment);
    }
    Wt_ViewAllOrdersPage allOrdersPage = new Wt_ViewAllOrdersPage();
    @Then("user should see new order in the table on view all orders page {string}")
    public void userShouldSeeNewOrderInTheTableOnViewAllOrdersPage(String expectedName) {

        String actualName = allOrdersPage.newCustomerCell.getText();

        Assert.assertEquals(actualName,expectedName);
    }
}
