package starter.customer.step;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.customer.DataInput;
import starter.customer.base.BasePageObject;
import starter.customer.pages.LoginPage;

public class LoginStep extends BasePageObject {
    RegisterStep registerStep;
    LoginPage login;

    @Step
    public void clickSignIn(){
        final By signin = By.id("button-submit");
        click(signin);
    }
    @Step
    public void fullLogin(){
        login.open();
        registerStep.inputEmail(DataInput.email);
        registerStep.inputPassword(DataInput.password);
        clickSignIn();
    }
}
