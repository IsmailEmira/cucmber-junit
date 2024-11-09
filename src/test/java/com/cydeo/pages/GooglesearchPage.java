package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglesearchPage {

    //1- Create the constructor and initialize the driver with object
    public GooglesearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //2 use @FindBy instead of findElement
    @FindBy(name = "q")
  public WebElement searchBox;
}


