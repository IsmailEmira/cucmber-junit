package com.cydeo.step_definitions;

import com.cydeo.pages.WikiResultPage;
import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Wiki_stepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("user is on wikipedia page")
    public void user_is_on_wikipedia_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }
    @When("user search for {string} in the wiki search box")
    public void user_search_for_in_the_wiki_search_box(String string) {
        BrowserUtils.sleep(2);
        wikiSearchPage.searchBoxWiki.sendKeys(string);

    }

    @And("user clicks on the search button")
    public void userClicksOnTheSearchButton() {
        wikiSearchPage.searchBTn.click();
    }

    @Then("user should see {string} in wiki title")
    public void user_should_see_in_wiki_title(String expectedInTitle) {
        BrowserUtils.verifyTitleContains(expectedInTitle);

    }

    WikiResultPage wikiResultPage = new WikiResultPage();
    @Then("user should see {string} in the main header")
    public void userShouldSeeInTheMainHeader(String expectedHeaderText) {
         String actualHeaderText = wikiResultPage.mainHeader.getText();

         Assert.assertEquals(actualHeaderText,expectedHeaderText);
    }


    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String expectedImageHeader) {
        Assert.assertEquals(wikiResultPage.imageHeader.getText(),expectedImageHeader);
    }
}
