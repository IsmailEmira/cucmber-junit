package com.cydeo.step_definitions;

import com.cydeo.pages.EbaySearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ebay_stepDefinition {
EbaySearchPage ebaySearchPage = new EbaySearchPage();
    @Given("user is on ebay")
    public void user_is_on_ebay() {
        Driver.getDriver().get("https://www.ebay.com/");
    }


    @Then("user see title {string}")
    public void user_see_title(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();

        BrowserUtils.verifyTitleContains(expectedTitle);

    }



    @Then("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
       ebaySearchPage.searchBox.sendKeys("Wooden Spoon");
    }
    @Then("user clicks on search button")
    public void user_clicks_on_search_button() {
      ebaySearchPage.clickBtn.click();
    }
    @Then("user should see Wooden Spoon in the title")
    public void user_should_see_wooden_spoon_in_the_title() {
        BrowserUtils.verifyTitleContains("Wooden Spoon");
    }

    @Then("user types {string} in the search box")
    public void user_types_in_the_search_box(String search) {
        ebaySearchPage.searchBox.sendKeys(search);
    }
    @Then("user should see {string} is in the title")
    public void user_should_see_is_in_the_title(String expectedTitle) {
      BrowserUtils.verifyTitleContains(expectedTitle);
    }





}
