package starter.customer.base;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePageObject extends PageObject {
    WebDriver driver = getDriver();
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public WebElement singleElement(By by){
        return driver.findElement(by);
    }
    public List<WebElement> multiElements(By by){
        return driver.findElements(by);
    }
    public String getText(By by){
        return singleElement(by).getText();
    }
    public void click(By by){
        singleElement(by).click();
    }
    public void inputText(By by, String string){
        singleElement(by).sendKeys(string);
    }
    public void inputNumber(By by, int number){
        singleElement(by).sendKeys(Integer.toString(number));
    }
    public void selectDropDown(By by, String selectedBy){
        Select dropDown = new Select(singleElement(by));
        dropDown.selectByVisibleText(selectedBy);
    }
    public void enter(By by){
        singleElement(by).sendKeys(Keys.ENTER);
    }
    public List<String> getList(By by){
        List<String> getTextList = new ArrayList<>();
        List<WebElement> list = multiElements(by);
        for (WebElement element : list ){
            getTextList.add(element.getText());
        }
        return getTextList;
    }
    public String[] getStringList(By by){
        String[] array = new String[getList(by).size()];
        for (int i=0 ; i<getList(by).size() ; i++){
            array[i] = getList(by).get(i);
        }
        return array;
    }
    public String getAlertText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }
    public void clickAcceptAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void clickBackButton(){
        driver.navigate().back();
    }
    public void waitElementAppear(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public void waitImplicit(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void waitButtonClickAble(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public void waitOkButtonModalAlertClickable(){
        final By okButton = By.xpath("/html/body/div[2]/div/div[2]/div");
        waitButtonClickAble(okButton);
    }
    public void clickOkConfirmation(){
        waitOkButtonModalAlertClickable();
        final By okConfirmation = By.className("swal-button-container");
        click(okConfirmation);
    }
    public String getModalAlert(){
        waitOkButtonModalAlertClickable();
        final By modalText = By.className("swal-text");
        return getText(modalText);
    }
    public void waitSubmitBooking(){
        final By submitButton = By.id("button-submit");
        waitButtonClickAble(submitButton);
    }
}
