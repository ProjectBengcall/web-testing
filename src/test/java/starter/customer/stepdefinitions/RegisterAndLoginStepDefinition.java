package starter.customer.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.customer.ExpectedCustomerResponses;
import starter.customer.base.BasePageObject;
import starter.customer.pages.HomePage;
import starter.customer.pages.LoginPage;
import starter.customer.step.LoginStep;
import starter.customer.step.RegisterStep;
import static org.junit.Assert.*;

public class RegisterAndLoginStepDefinition extends BasePageObject {
    LoginPage login;
    HomePage home;
    RegisterStep registerStep;
    LoginStep loginStep;

    @Given("User is already on the login page")
    public void user_is_already_on_the_login_page() {
        login.open();
    }
    @When("User click on SignUp Now! button")
    public void user_click_on_sign_up_now_button() {
        registerStep.clickSignUpNow();
    }
    @When("User is directed to register page")
    public void user_is_directed_to_register_page() {;
        assertEquals(ExpectedCustomerResponses.REGISTER_URL, getUrl());
    }
    @When("User input on Full Name field with {string}")
    public void user_input_on_full_name_field_with(String name) {
        registerStep.inputFullName(name);
    }
    @When("User input on Email field with {string}")
    public void user_input_on_email_field_with(String email) {
        registerStep.inputEmail(email);
    }
    @When("User input on Password field with {string}")
    public void user_input_on_password_field_with(String password) {
        registerStep.inputPassword(password);
    }
    @When("User click on sign up button")
    public void user_click_on_sign_up_button() {
        registerStep.clickSignUpButton();
    }
    @Then("User will get {string} alert message")
    public void userWillGetAlertMessage(String message) {
        assertEquals(message, getAlertText());
        clickAcceptAlert();
    }
    @And("User will be directed to login page")
    public void userWillBeDirectedToLoginPage() {
        assertEquals(ExpectedCustomerResponses.BASE_URL, getUrl());
    }
    @And("User click on sign in button")
    public void userClickOnSignInButton() {
        loginStep.clickSignIn();
    }
    @Then("User will be directed to Home Page")
    public void user_will_be_directed_to_home_page() {
        assertEquals(ExpectedCustomerResponses.HOME_URL, getUrl());
        assertNotNull(home.getServiceNowText());
    }

    @Given("User is already on home page")
    public void userIsAlreadyOnHomePage() {
        loginStep.fullLogin();
    }
    @When("User click on Logout")
    public void userClickOnLogout() {
        loginStep.clickLogout();
    }

    @Then("User click on back button")
    public void userClickOnBackButton() {
        clickBackButton();
    }
    @Then("User should not back to login page")
    public void userShouldNotBackToLoginPage() {
        assertNull(login.getSignInButtonText());
    }
}
