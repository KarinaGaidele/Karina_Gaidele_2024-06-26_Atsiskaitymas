package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobjects.LoginPage;
import pageobjects.OperationsPage;

import java.util.concurrent.TimeUnit;

public class OperationsTest extends BaseTest {
    OperationsPage operationsPage;
    LoginPage loginPage;

    @Test
    void userCanSearchHisRecords() {
        operationsPage = new OperationsPage(driver);
        loginPage = new LoginPage(driver);


        loginPage = new LoginPage(driver);
        loginPage.setEnterUsername1("karinag");
        loginPage.setEnterPassword1("karinag");
        loginPage.setClickLogin();

        operationsPage.setClickOperations();


        String expectedMessage = "Atliktos operacijos";
        String actualMessage = operationsPage.setDoneOperations1();

        Assertions.assertEquals(expectedMessage, actualMessage);
        System.out.println("Jūsų operacijų sąrašas");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        operationsPage.setClickThirdOperation();

    }

    @Test
    void userCannotSearchHisOperations() {
        operationsPage = new OperationsPage(driver);
        loginPage = new LoginPage(driver);


        loginPage = new LoginPage(driver);
        loginPage.setEnterUsername1("karinag");
        loginPage.setEnterPassword1("karinag");
        loginPage.setClickLogin();
        operationsPage.setClickOperations();
        operationsPage.setClickNonExistingOperation();


    }
}


