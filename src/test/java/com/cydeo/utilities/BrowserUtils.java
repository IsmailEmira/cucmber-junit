package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class BrowserUtils {


    /*
This class will be storing only the utility methods that are defined across the project

    /*
    This method will accept int (int seconds)
    and execute Thread.sleep method
     */

        public static void sleep(int second) {
            second *= 1000;
            try {
                Thread.sleep(second);
            } catch (InterruptedException e) {

            }
        }


        //When method is called, it should switch window and verify title.
        //Method info:
        //• Name: switchWindowAndVerify
        public static void switchWindowAndVerify( String expectedInUrl, String expectedTitle) {
            Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

            for (String each : allWindowHandles) {
                Driver.getDriver().switchTo().window(each);
                System.out.println("Current URl : " + Driver.getDriver().getCurrentUrl());

                if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                    break;
                }
            }
            String actualTitle = Driver.getDriver().getTitle();
            Assert.assertTrue(actualTitle.contains(expectedTitle));
        }


        //Create a method to make title verification logic re-usable
        //When method is called, it should simply verify expected title with actual
        //title
        //Method info:
        //• Name: verifyTitle()
        public static void verifyTitle( String expectedTitle) {

            Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
        }


        public static void verifyTitleContains( String expectedTitle) {

            Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
        }

    /**
     * This method accepts a dropdown element and returns a List<String> thta contains all options values as string.
     * @param dropdownwebElement
     * @return actualMonth_as_STRING.add(each.getText());
     */

    public static List<String> dropDownOptions_as_STRING(WebElement dropdownwebElement) {
            Select month = new Select(dropdownwebElement);
            // storing all the Actual options into a list of WebElements

            List<WebElement> actualMonth_WebElement = month.getOptions();
            // create empty list
            List<String> actualMonth_as_STRING = new ArrayList<>();
            // Looping through the List<WebElements>, getting all options texts, and storing them into List<String>
            for (WebElement each : actualMonth_WebElement) {

                actualMonth_as_STRING.add(each.getText());
            }
            return actualMonth_as_STRING;
        }


    public static void verifyUrlContains (String expectedUrl){
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expected =expectedUrl ;

        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }

    public static void clickRadioButton(List<WebElement> radioButtons,String attributeValue){
        for (WebElement each: radioButtons){
            if (each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }

    }

    /**
     * Moves the mouse to given element
     *
     *
     * @param element on which to hover
     */

    public static void hover(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    /**
     * return a list of string from a list of elements
     *
     * @param list of Webelements
     * @return list of string
     */
    public static List<String> getElementsText(List<WebElement>list){
        List<String> elemText = new ArrayList<>();
        for (WebElement el : list){
            elemText.add(el.getText());
        }
        return elemText;
    }

    /**
     * Verifies whether the element is displayed on page
     *
     * @param element
     * @throws AssertionError if the element is not found or not displayed
     */

    public static void verifyElementDisplayed(WebElement element){
        try {
            Assert.assertTrue("Element not visible:" + element, element.isDisplayed());
        }catch (NoSuchElementException e){
            e.printStackTrace();
            Assert.fail("Element not found:" + element);
        }
    }

    /**
     *
     * @param locator
     * @param time
     * @return
     */

    public static WebElement waitForVisibility(By locator,int time){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
