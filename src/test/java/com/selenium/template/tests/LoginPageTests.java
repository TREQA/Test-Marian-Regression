package com.selenium.template.tests;

import com.selenium.template.DriverBase;
import com.selenium.template.automationFramework.Log4Test;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.pageObjects.backend.AddTourPage;
import com.selenium.template.pageObjects.backend.DashBoardPage;
import com.selenium.template.pageObjects.backend.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTests extends DriverBase {

    @Test(groups = "Test")
    public void LoginPageTests_01() throws Exception {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        setup("LoginPage_01", TestData.BACKEND_URL);

        //WebDriver driver = getDriver();

        //Page Objects
        LoginPage loginPage = new LoginPage(driver);
        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        AddTourPage addTourPage = new AddTourPage(driver);

        loginPage.loginTest();

        /*dashBoardPage.goToAddTour();
        addTourPage.setStatus("Disabled");
        addTourPage.setTourName();
        addTourPage.enableChildOption();
        addTourPage.enableInfantOption();
        */
    }


    /*
    @Test(groups = "Test")
    public void LoginPageTests_02() throws Exception {
        Log4Test.info("ASTA ESTE TESTUL NOSTRU RULAT PERIN REMOTE");

    }

    */

}
