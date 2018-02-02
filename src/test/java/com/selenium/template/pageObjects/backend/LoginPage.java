package com.selenium.template.pageObjects.backend;

import com.selenium.template.automationFramework.CommonTasks;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver passedDriver) {
        super(passedDriver);
    }

    //Locators
    @FindBy(css = "body > div:nth-child(1) > form.form-signin.form-horizontal.wow.fadeIn.animated.animated > div:nth-child(1) > input:nth-child(2)")
    private WebElement emailField;

    @FindBy (css = "body > div:nth-child(1) > form.form-signin.form-horizontal.wow.fadeIn.animated.animated > div:nth-child(1) > input:nth-child(3)")
    private WebElement passwordField;

    @FindBy (css = "body > div:nth-child(1) > form.form-signin.form-horizontal.wow.fadeIn.animated.animated > button")
    private WebElement loginButton;

    //Methods

    public void sendEmail(){
        CommonTasks.sendKeys(driver, emailField, TestData.BACKEND_EMAIL, "emailField");
    }

    public void sendPassword(){
        CommonTasks.sendKeys(driver, passwordField, TestData.BACKEND_PASSWORD, "passwordField");
    }

    public void clickLoginButton(){
        CommonTasks.clickElement(driver, loginButton, "loginButton");
    }

    public void loginTest(){
        sendEmail();
        sendPassword();
        clickLoginButton();
    }

}
