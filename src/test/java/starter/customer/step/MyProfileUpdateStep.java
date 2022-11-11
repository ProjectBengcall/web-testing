package starter.customer.step;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.customer.base.BasePageObject;

public class MyProfileUpdateStep extends BasePageObject {
    LoginStep loginStep;

    @Step
    public void goToMyProfile(){
        final By userIcon = By.xpath("//*[@id=\"navbar-user\"]/div/div[3]/div/label");
        final By myProfileMenu = By.xpath("//*[@id=\"navbar-user\"]/div/div[3]/div/ul/li[1]");
        loginStep.fullLogin();
        click(userIcon);
        click(myProfileMenu);
    }
    @Step
    public void toMyProfile(){
        final By userIcon = By.xpath("//*[@id=\"navbar-user\"]/div/div[3]/div/label");
        final By myProfileMenu = By.xpath("//*[@id=\"navbar-user\"]/div/div[3]/div/ul/li[1]");
        click(userIcon);
        click(myProfileMenu);
    }
    @Step
    public void inputUpdateName(String nameUpdate) {
        final By nameUpdateField = By.id("fullname");
        inputText(nameUpdateField, nameUpdate);
    }
    @Step
    public void inputUpdateEmail(String emailUpdate) {
        final By emailUpdateField = By.id("email");
        inputText(emailUpdateField, emailUpdate);
    }
    @Step
    public void inputUpdatePassword(String passwordUpdate) {
        final By passwordUpdateField = By.id("password");
        inputText(passwordUpdateField, passwordUpdate);
    }
    @Step
    public void clickUpdateButton() {
        final By submitButton = By.id("button-submit");
        click(submitButton);
    }
    @Step
    public void clickDeactivate() {
        final By deactivateButton = By.id("deactivate");
    }
}
