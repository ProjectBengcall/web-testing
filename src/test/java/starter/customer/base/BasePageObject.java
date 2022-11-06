package starter.customer.base;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

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
        singleElement(by).clear();
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
}
