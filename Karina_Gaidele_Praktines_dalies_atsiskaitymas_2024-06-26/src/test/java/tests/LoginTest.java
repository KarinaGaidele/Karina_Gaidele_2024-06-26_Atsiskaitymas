package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobjects.LoginPage;
import utils.RandomGenerator;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @Test
    void userCanLoginWithValidCredentials() {
        loginPage = new LoginPage(driver);

        //String name = RandomGenerator.generateRandomUserName();
        loginPage.setEnterUsername1("karinag");

        //String pass = RandomGenerator.generateRandomPass();
        loginPage.setEnterPassword1("karinag");
        loginPage.setClickLogin();

        String expectedMessage = "Skaičiuotuvas";
        String actualMessage = loginPage.setCalculatorBrand();

        Assertions.assertEquals(expectedMessage, actualMessage);
        System.out.println("Jūs prisijungėte prie savo aplinkos");

    }

    @Test
    void userCannotLoginWithInvalidCredentials() {
        loginPage = new LoginPage(driver);

        loginPage.setEnterUsername1("karinagg");
        loginPage.setEnterPassword1("karinagg");
        loginPage.setClickLogin();
        loginPage.setIncorrectLoginMessage();

        String expectedMessage = "Internetinis skaičiuotuvas skirtas testavimui (c) 2021";
        String actualMessage = loginPage.setIncorrectLoginMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
        System.out.println("Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi");

//        String actualMessage = "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi";


    }
}
