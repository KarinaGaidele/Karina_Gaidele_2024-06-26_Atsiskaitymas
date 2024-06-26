package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "input[placeholder='Prisijungimo vardas']")
    private WebElement enterUsername1;

    @FindBy (css = "input[placeholder='Slaptažodis']")
    private WebElement enterPassword1;

    @FindBy (css = "button[type='submit']")
    private WebElement clickLogin;

    @FindBy (css = "div[class='navbar navbar-fixed-bottom text-center py-3'] b")
    private WebElement incorrectLoginMessage;

    @FindBy (css = ".navbar-brand")
    private WebElement calculatorBrand;

    public void setEnterUsername1 (String txt) {
        enterUsername1.sendKeys(txt);
    }

    public void setEnterPassword1 (String txt) {
        enterPassword1.sendKeys(txt);
    }
public void setClickLogin () {
        clickLogin.click();
}
public String setIncorrectLoginMessage (){
      return  incorrectLoginMessage.getText();
}
public String setCalculatorBrand () {
     return calculatorBrand.getText();
}
}
