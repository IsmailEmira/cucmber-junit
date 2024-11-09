package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WT_OrderPage extends Wt_BasePage{


    public WT_OrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(name = "product")
    public WebElement productDropDown;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaRadioBtn;

    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement masterCardRadioBtn;

    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement americanExpressRadioBtn;

     @FindBy(name = "quantity")
    public WebElement InputQuantity;
     @FindBy(xpath = "//input[@value='100']")
    public WebElement pricePerUnit;
    @FindBy(xpath = "//input[@value='8']")
    public WebElement Discount;
    @FindBy(xpath = " //button[.='Calculate']")
    public WebElement calculateBtn;
    @FindBy(name = "name")
    public WebElement customerName;
    @FindBy(name = "street")
    public WebElement street ;
    @FindBy(name = "city")
    public WebElement city;
    @FindBy(name = "state")
    public WebElement state;
    @FindBy(name = "zip")
    public WebElement zip;
    @FindBy(name = "cardNo")
    public WebElement cardNo;
    @FindBy(name = "cardExp")
    public WebElement cardExp;
    @FindBy(xpath = " //button[.='Process Order']")
    public WebElement processOrderBtn;
    @FindBy(name = "card")
    public List<WebElement> cardTypes;





}
