package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingSearchPage {

    // 1 - create the constructor and initialize the driver

    public BingSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // search for Bing search Box using @FindBy
   @FindBy(name = "q")
    public WebElement searchBoxBing;
}
