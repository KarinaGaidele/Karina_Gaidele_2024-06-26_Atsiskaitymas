package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobjects.LoginPage;
import pageobjects.MainCalculatorPage;

public class MainCalculatorTest extends BaseTest {

    MainCalculatorPage mainCalculatorPage;
    LoginPage loginPage;

    @Test
    void calculatorCanGivePositiveResult() throws InterruptedException {
        mainCalculatorPage = new MainCalculatorPage(driver);


        loginPage = new LoginPage(driver);
        loginPage.setEnterUsername1("karinag");
        loginPage.setEnterPassword1("karinag");
        loginPage.setClickLogin();

        mainCalculatorPage.clearFirstNumber();
        mainCalculatorPage.enterFirstNumber("3");
        mainCalculatorPage.clearSecondNumber();
        mainCalculatorPage.enterSecondNumber("4");
        mainCalculatorPage.selectDividingFunction(2);
        mainCalculatorPage.clickCalculateResult();

        String expectedMessage = "3 * 4 = 12";
        String actualMessage = mainCalculatorPage.setDoneOperations();

        Assertions.assertEquals(expectedMessage, actualMessage);
        System.out.println("Answer is 12");
    }

    @Test
    void calculatorGivesIncorrectResult() throws InterruptedException {
        mainCalculatorPage = new MainCalculatorPage(driver);
        loginPage = new LoginPage(driver);
        loginPage.setEnterUsername1("karinag");
        loginPage.setEnterPassword1("karinag");
        loginPage.setClickLogin();
        mainCalculatorPage.enterFirstNumber("..//");
        mainCalculatorPage.enterSecondNumber("---");
        mainCalculatorPage.selectDividingFunction(3);
        mainCalculatorPage.clickCalculateResult();


    }
}
