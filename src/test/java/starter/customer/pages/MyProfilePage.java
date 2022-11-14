package starter.customer.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import starter.customer.base.BasePageObject;

import java.time.Duration;

public class MyProfilePage extends BasePageObject {
    public String verifyUpdatedName(){
        final By displayName = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/h1");
        return getText(displayName);
    }
    public String verifyUpdatedEmail() {
        final By displayEmail = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/p");
        return getText(displayEmail);
    }
}
