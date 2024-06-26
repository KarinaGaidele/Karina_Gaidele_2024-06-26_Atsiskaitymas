package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperationsPage extends BasePage {
    public OperationsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/skaiciai']")
    private WebElement clickOperations;

    @FindBy(css = "body > div > table > tbody > tr:nth-child(4) > td:nth-child(5) > a:nth-child(3)")
    private WebElement clickThirdOperation;

    @FindBy(css = "body > div > table > tbody > tr:nth-child(4) > td:nth-child(5) > a:nth-child(000)")
    private WebElement clickNonExistingOperation;

    @FindBy(css = "a[href='/skaiciai']")
    private WebElement doneOperations1;

    public void setClickOperations() {
        clickOperations.click();
    }

    public void setClickThirdOperation() {
        clickThirdOperation.click();
    }

    public void setClickNonExistingOperation() {
        clickNonExistingOperation.click();
    }

    public String setDoneOperations1() {
        return doneOperations1.getText();

    }

}
