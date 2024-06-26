package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobjects.RegistrationPage;
import utils.RandomGenerator;

public class RegistrationTest extends BaseTest {

    RegistrationPage registrationPage;

    @Test
    void userCanRegisterWithValidCredentials() {
        registrationPage = new RegistrationPage(driver);
        registrationPage.clickRegisterButton();

        String name = RandomGenerator.generateRandomUserName();
        registrationPage.setEnterUsername(name);
//registrationPage.setEnterUsername("Karina999");
        String pass = RandomGenerator.generateRandomPass();
        registrationPage.setEnterPassword(pass);
//registrationPage.setEnterPassword("Daugtaskis");
        registrationPage.setRepeatPassword(pass);
//registrationPage.setRepeatPassword("Daugtaskis");
        registrationPage.clickSubmitButton();

        String expectedMessage = "Skaičiuotuvas jautrus neigiamiems skaičiams ;)";
        String actualMessage = registrationPage.setDashboardElement();

        Assertions.assertEquals(expectedMessage, actualMessage);
        System.out.println("Jūs sėkmingai užsiregistravote");


    }

    @Test
    void userCannotRegisterWithInvalidCredentials() {
        registrationPage = new RegistrationPage(driver);
        registrationPage.clickRegisterButton();
        registrationPage.setEnterUsername("Ka");
        registrationPage.setEnterPassword("Da");
        registrationPage.setRepeatPassword("Da");
        registrationPage.clickSubmitButton();

        String expectedMessage = "Privaloma įvesti nuo 3 iki 32 simbolių";
        String actualMessage = registrationPage.setIncorrectLoginElement();

        Assertions.assertEquals(expectedMessage, actualMessage);
        System.out.println("Registracija nesėkminga");

    }


}
