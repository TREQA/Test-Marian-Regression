package com.selenium.template.pageObjects.backend;

import com.selenium.template.automationFramework.CommonTasks;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.automationFramework.Waiting;
import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddTourPage extends PageBase {

    public AddTourPage (WebDriver passedDriver) {
        super(passedDriver);
    }

    //Locators

    @FindBy(css = "#GENERAL > div:nth-child(2) > div > select")
    private WebElement statusDropdown;

    @FindBy ( css = "#GENERAL > div:nth-child(3) > div > input")
    private WebElement TourName;

    @FindBy (css = "#childbtn")
    private WebElement childOption;

    @FindBy (css = "#infantbtn")
    private WebElement infantOption;


    //Methods

    public void setStatus(String status){
        Waiting.elementToBeClickable(driver, statusDropdown, "statusDropdown");
        CommonTasks.selectDropDownOption(driver, statusDropdown, status, "statusDropdown");
    }

    public void setTourName (){
        Waiting.elementToBeClickable(driver, TourName, "TourName");
        CommonTasks.sendKeys(driver, TourName, TestData.TOUR_NAME, "TourName");
    }

    public void enableChildOption() {
        Waiting.elementToBeClickable(driver, childOption, "childOption");
        CommonTasks.clickElement(driver, childOption, "childOption");
    }

    public void enableInfantOption(){
        Waiting.elementToBeClickable(driver, infantOption, "infantOption");
        CommonTasks.clickElement(driver, infantOption, "infantOption");
    }

}
