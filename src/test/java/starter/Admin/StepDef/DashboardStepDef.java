package starter.Admin.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Admin.Page.DashboardPage;
import starter.Admin.Page.LoginPage;

public class DashboardStepDef {

    LoginPage loginPage ;
    DashboardPage dashboardPage ;
    @Given("Already log in")
    public void alreadyLogIn() {
        loginPage.open();
        loginPage.InputEmail("axe@gmail.com");
        loginPage.InputPassword("axeaxeaxeaxe1");
        loginPage.clickButton();
    }

    @When("Click detail button")
    public void clickDetailButton() {
        dashboardPage.clickDetailButton();
    }

    @And("Input text in add service type {string}")
    public void inputTextInAddServiceType(String servicetype) {
//        dashboardPage.
    }

    @And("Input price in add price {string}")
    public void inputPriceInAddPricePrice() {
    }

    @And("Click submit button")
    public void clickSubmitButton() {

    }

    @And("Click change status field")
    public void clickChangeStatusField() {
        dashboardPage.ChangeStatus();
    }

    @Then("Back to dashboard page")
    public void backToDashboardPage() {
    }

}
