package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Bing_stepDefinition {
    BingSearchPage bingSearchPage = new BingSearchPage();

    @Given("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {
        Driver.getDriver().get("https://www.bing.com/");
    }

    @When("user search for orange in Bing search box")
    public void user_search_for_orange_in_bing_search_box() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(bingSearchPage.searchBoxBing));

        bingSearchPage.searchBoxBing.sendKeys("orange"+Keys.ENTER);

    }

    @When("user enter for {string} in Bing search box")
    public void userEnterForInBingSearchBox(String searchKey) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOf(bingSearchPage.searchBoxBing));

        bingSearchPage.searchBoxBing.sendKeys(searchKey);

        bingSearchPage.searchBoxBing.sendKeys(Keys.ENTER);
    }


    @Then("user should see orange in the title")
    public void user_should_see_orange_in_the_title() {

        BrowserUtils.verifyTitle("orange - Search");

    }


    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String expectedTitle) {
        BrowserUtils.verifyTitle(expectedTitle);
    }
}

