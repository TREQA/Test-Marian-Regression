package com.selenium.template.tests;

import com.selenium.template.DriverBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class TestTheTest extends DriverBase {

    @Test(groups = "Test")
    public void Test_01() throws Exception {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //WebDriver driver = getDriver();
        driver.get("https://www.google.ro/");

        Assert.assertTrue(true);
    }

}




