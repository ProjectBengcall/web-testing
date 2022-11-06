package starter.customer.step;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.customer.base.BasePageObject;
import starter.customer.pages.LoginPage;

public class RegisterStep extends BasePageObject {
    LoginPage login;
    @Step
    public void openLoginPage(){
        login.open();
    }
    @Step
    public void clickSignUpNow(){
        final By signupNow = By.id("register");
        click(signupNow);
    }
    @Step
    public void inputFullName(String name){
        final By nameField = By.id("fullname");
        inputText(nameField, name);
    }
    @Step
    public void inputEmail(String email){
        final By emailField = By.id("email");
        inputText(emailField, email);
    }
    @Step
    public void inputPassword(String password){
        final By passwordField = By.id("password");
        inputText(passwordField, password);
    }
}
