package com.selenium.template.automationFramework;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CommonTasks {

    public static void sendKeys(WebDriver driver, WebElement element, String text, String field) {
        try {
            Log4Test.info("- sending keys : '" + text + "' : to " + field);
            element.sendKeys(text);
        } catch (NoSuchElementException e) {
            Assert.fail(Log4Test.error("Element is not found" +field));
        }
    }

    public static void moveToElement(WebDriver driver, WebElement element, String elementName) {
        try {
            Actions action = new Actions(driver);
            Log4Test.info("- moving to element : " + elementName);
            action.moveToElement(element).build().perform();
        } catch (NoSuchElementException e) {
            Assert.fail(Log4Test.error("Element is not found : " + elementName));
        }
    }

    public static void clickElement(WebDriver driver, WebElement element, String elementName) {
        try {
            Waiting.elementToBeClickable(driver, element, elementName);
            moveToElement(driver, element, elementName);
            Log4Test.info("- clicking element : " + elementName);
            element.click();
        } catch (NoSuchElementException e) {
            Assert.fail(Log4Test.error("Element is not found: "+ elementName));
        }
    }

    public static void goToUrl(WebDriver driver, String url) {
        try {
            driver.get(url);
            Log4Test.info("Navigating to: " + url);
        } catch (WebDriverException e) {
            Assert.fail(Log4Test.error("The URL is incorrect: " + url));
        }
    }

    public static void selectDropDownOption(WebDriver driver, WebElement element, String text, String elementName) {
        try {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(text);
        } catch (NoSuchElementException e) {
            Assert.fail(Log4Test.error("Element is not found: "+ elementName));
        }
    }
}
