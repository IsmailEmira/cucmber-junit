package com.cydeo.step_definitions;

import com.cydeo.pages.GooglesearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_stepDefinitions {

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle);

    }

    GooglesearchPage googlesearchPage = new GooglesearchPage();


    @When("user search for {word}")
    public void userSearchForApple(String word) {
        googlesearchPage.searchBox.sendKeys(word+Keys.ENTER);
    }

    @Then("user should see {word} in the title")
    public void userShouldSeeAppleInTheTitle(String word) {
        BrowserUtils.verifyTitleContains("apple - Google Search");
    }
}
