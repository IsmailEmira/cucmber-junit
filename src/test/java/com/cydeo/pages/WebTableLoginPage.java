package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {


    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
     @FindBy(name = "username")
     public WebElement InputUsername;
    @FindBy(name = "password")
    public WebElement InputPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement LoginBtn;

    /**
     * This method will log in with below credentials
     * @username : Test
     * @password : Tester
     */
    public void login(){
        this.InputUsername.sendKeys("Test");
        this.InputPassword.sendKeys("Tester");
        this.LoginBtn.click();
    }

    public void login(String username, String password){
        this.InputUsername.sendKeys(username);
        this.InputPassword.sendKeys(password);
        this.LoginBtn.click();
    }
}
