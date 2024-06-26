package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    public RegistrationPage (WebDriver driver) {
        super(driver);
    }

@FindBy (css = "a[href='/registruoti']")
    private WebElement clickRegister;

    @FindBy (css = "#username")
    private WebElement enterUsername;

    @FindBy (css = "#password")
    private WebElement enterPassword;

    @FindBy (css = "#passwordConfirm")
    private WebElement repeatPassword;

    @FindBy (css = "button[type='submit']")
    private WebElement clickSubmit;

    @FindBy (css = "a[onclick=\"document.forms['logoutForm'].submit()\"]")
    private WebElement clickLogout;

    @FindBy (css = "body h3")
    private WebElement dashboardElement;

    @FindBy (css = "body > div:nth-child(4) > form:nth-child(1) > div:nth-child(2) > span:nth-child(2)")
    private WebElement incorrectLoginElement;

public void clickRegisterButton () {
    clickRegister.click();
}
public void setEnterUsername (String txt) {
    enterUsername.sendKeys(txt);
}
public void setEnterPassword (String txt) {
    enterPassword.sendKeys(txt);
}
public void setRepeatPassword (String txt) {
    repeatPassword.sendKeys(txt);
}
public void clickSubmitButton () {
    clickSubmit.click();
}
public void clickLogoutButton () {
    clickLogout.click();
}
public String setDashboardElement () {
  return  dashboardElement.getText();
}
public String setIncorrectLoginElement () {
  return  incorrectLoginElement.getText();
}
}