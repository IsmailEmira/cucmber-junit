package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wt_BasePage {

    public Wt_BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[.='Order']")
   public WebElement Link;

    @FindBy(xpath = "//button[.='View all orders']")
    public WebElement ViewAllOrders;

    @FindBy(xpath = "//button[.='View all products']")
    public WebElement ViewAllProducts;

    @FindBy(xpath = "//button[.='Logout']")
    public WebElement LogoutLink;
}
