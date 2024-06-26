package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MainCalculatorPage extends BasePage {
    public MainCalculatorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#sk1")
    private WebElement firstNumber;

    @FindBy(css = "#sk2")
    private WebElement secondNumber;

    @FindBy(css = "select[name='zenklas']")
    private WebElement divideNumbers;

    @FindBy(css = "input[value='skaičiuoti']")
    private WebElement calculateResult;

    @FindBy(css = "body h3")
    private WebElement calculatorMessage;

    @FindBy (css = "body h4")
    private WebElement doneOperations;

    public void clearFirstNumber(){
        firstNumber.clear();
    }
    public void enterFirstNumber(String txt) {
        firstNumber.sendKeys(txt);
    }
    public void clearSecondNumber(){
       secondNumber.clear();
    }
    public void enterSecondNumber(String txt) {
        secondNumber.sendKeys(txt);
    }

    public void selectDividingFunction(int i) {
        Select selectFunction = new Select(divideNumbers);
        selectFunction.selectByIndex(2);
    }

    public void clickCalculateResult() {
        calculateResult.click();
    }

    public void setCalculatorMessage() {
        calculatorMessage.getText();

    }
    public String setDoneOperations () {
      return  doneOperations.getText();
    }
}