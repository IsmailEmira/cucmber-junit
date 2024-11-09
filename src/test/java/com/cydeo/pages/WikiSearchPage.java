package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {

    //1- create the constructor and initialize the driver

    public WikiSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // search for wiki search Box using @FindBy

    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement searchBoxWiki;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchBTn;


}
