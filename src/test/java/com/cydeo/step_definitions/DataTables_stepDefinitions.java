package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTables_stepDefinitions {



    @Then("user should see below list")
    public void user_should_see_below_list(List<String >fruitsAndVegetables) {

        for (String each : fruitsAndVegetables){
            System.out.println(each);
        }
    }

    @Then("I will share my favorites")
    public void iWillShareMyFavorites(List<String> pets) {

        System.out.println("pets = " + pets);
    }

    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String,String>driverInfo) {

        System.out.println("driverInfo = " + driverInfo);

        System.out.println("driverInfo.get(\"name\") = " + driverInfo.get("name"));

        System.out.println("driverInfo.get(\"address\") = " + driverInfo.get("address"));

        System.out.println(driverInfo.size());
    }



    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    DropdownPage dropdownPage = new DropdownPage();
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonth) {
        List<String> actualMonths = BrowserUtils.dropDownOptions_as_STRING(dropdownPage.monthDropDown);

        Assert.assertEquals(actualMonths,expectedMonth);
    }

}
