package starter.customer.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import starter.customer.base.BasePageObject;

@DefaultUrl("https://bengcall.vercel.app/")
public class LoginPage extends BasePageObject {
    public String getSuccessLoginAlertMessage(){
        return getAlertText();
    }
    public String getSignInButtonText(){
        final By getButtonText = By.id("button-submit");
        return getText(getButtonText);
    }

}
