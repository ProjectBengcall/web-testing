package starter.Admin.Page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@DefaultUrl("https://bengcall.vercel.app/")
public class LoginPage extends PageObject {
    @Managed
    WebDriver driver =getDriver();

    private final By fieldEmail = By.id("email");
    private final By fieldPassword = By.id("password");
    private final By signinButton = By.id("button-submit");

    private final By logOutButton = By.id("btn-logout");
    private final By NotifBanner = By.className("swal-text");
    private final By ClickNotifBanner = By.xpath("/html/body/div[2]/div/div[2]/div/button");


    public String getNotificationTitle(){
        return driver.findElement(NotifBanner).getText();
    }
    public void InputEmail(String Email){
        driver.findElement(fieldEmail).sendKeys(Email);
    }

    public void InputPassword(String Password){
        driver.findElement(fieldPassword).sendKeys(Password);
    }

    public void clickButton(){
        driver.findElement(signinButton).click();
    }

    public String getUrl(){
        return driver.getCurrentUrl();}

    public void clickLogOutButton(){
        driver.findElement(logOutButton).click();
    }

    public void NotifBanner () { driver.findElement(ClickNotifBanner).click();}

}
