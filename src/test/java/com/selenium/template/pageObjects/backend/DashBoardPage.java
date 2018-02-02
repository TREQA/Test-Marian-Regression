package com.selenium.template.pageObjects.backend;

import com.selenium.template.automationFramework.CommonTasks;
import com.selenium.template.automationFramework.Waiting;
import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends PageBase {

    public DashBoardPage(WebDriver passedDriver) {
        super(passedDriver);
    }

    //Locators

    @FindBy(css = "#navbar > ul:nth-child(1) > li:nth-child(5) > a")
    private WebElement modulesMenu;

    @FindBy (css = "#navbar > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(1) > a > span")
    private WebElement toursSubMenu;

    @FindBy (css = "#Tours > li:nth-child(2) > a")
    private WebElement addNewTourSubMenu;

    //Methods

    public void goToAddTour(){
        Waiting.elementToBeClickable(driver, modulesMenu, "modulesMenu");
        CommonTasks.clickElement(driver, modulesMenu, "modulesMenu");
        Waiting.elementToBeClickable(driver, toursSubMenu, "toursSubMenu");
        CommonTasks.clickElement(driver, toursSubMenu, "toursSubMenu");
        Waiting.elementToBeClickable(driver, addNewTourSubMenu, "addNewTourSubMenu");
        CommonTasks.clickElement(driver, addNewTourSubMenu, "addNewTourSubMenu");
    }
}
