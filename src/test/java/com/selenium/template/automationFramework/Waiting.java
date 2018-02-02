package com.selenium.template.automationFramework;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Waiting {


    // --------------------------------------- Explicit Waits

    /**
     *
     * @param driver - driver instance
     * @param element - locator (WebElement)
     * @param elementName - element name
     */
    public static void elementToBeClickable(WebDriver driver, WebElement element, String elementName) {
        try {
            Log4Test.info("- waiting for element : " + elementName + " : to be clickable");
            new WebDriverWait(driver, TestData.SHORT_WAIT).until(ExpectedConditions.elementToBeClickable(element));
        } catch (TimeoutException toe) {
            Log4Test.error("Element is not clickable within : " + TestData.SHORT_WAIT + " seconds" );
        } catch (NoSuchElementException e) {
        Assert.fail(Log4Test.error("Element is not found : " + elementName));
        }
    }

}
