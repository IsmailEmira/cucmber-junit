package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbaySearchPage {


    public EbaySearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='gh-ac']")
    public WebElement searchBox;


    @FindBy(xpath = "//input[@type='submit']")
    public WebElement clickBtn;

}
