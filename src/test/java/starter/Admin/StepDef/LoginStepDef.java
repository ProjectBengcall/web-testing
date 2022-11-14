package starter.Admin.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import starter.Admin.Page.DashboardPage;
import starter.Admin.Page.LoginPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LoginStepDef {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Given("user already on page")
    public void userAlreadyOnPage() {
        loginPage.open();
    }

    @When("User input valid email {string}")
    public void userInputValidEmail(String Email) {
        loginPage.InputEmail(Email);
    }

    @And("User input valid password {string}")
    public void userInputValidPassword(String Password) {
        loginPage.InputPassword(Password);
    }

    @And("User click button")
    public void userClickButton() {
        loginPage.clickButton();
    }

    @Then("User direct to dashboard page")
    public void userDirectToDashboardPage() {
        assertEquals("You're logged in",loginPage.getNotificationTitle());
    }

    @When("User input email {string}")
    public void userInputEmailEmail(String Email) {
        loginPage.InputEmail(Email);
    }

    @And("User input password {string}")
    public void userInputPasswordPassword(String Password) {
        loginPage.InputPassword(Password);
    }

    @And("Click button")
    public void clickButton() {
        loginPage.clickButton();
    }
    @Then("User can't direct to dashboard page")
    public void userCanTDirectToDashboardPage() {
        assertEquals("https://bengcall.vercel.app/", loginPage.getUrl());
    }

}
