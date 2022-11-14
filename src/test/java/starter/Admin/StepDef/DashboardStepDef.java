package starter.Admin.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.ui.Select;
import org.openqa.selenium.WebDriver;
import starter.Admin.Page.DashboardPage;
import starter.Admin.Page.LoginPage;

import java.util.concurrent.TimeUnit;

import static java.sql.DriverManager.getDriver;
import static org.junit.Assert.assertEquals;

public class DashboardStepDef extends PageObject {

    WebDriver driver = getDriver();

    LoginPage loginPage ;
    DashboardPage dashboardPage ;

    @Given("Already log in")
    public void alreadyLogIn() {
        loginPage.open();
        loginPage.InputEmail("admin@bengcall.com");
        loginPage.InputPassword("adminbengcall123");
        loginPage.clickButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.NotifBanner();
    }

    @And("Click detail button")
    public void clickDetailButton() {
        dashboardPage.clickDetailButton();
        assertEquals(DashboardPage.DASHBOARD_URL,driver.getCurrentUrl());
    }

    @And("Input text in add service type {string}")
    public void inputTextInAddServiceType(String servicetype) {
        dashboardPage.AddServiceType(servicetype);
    }

    @And("Input price in add price {string}")
    public void inputPriceInAddPricePrice(String Price) {
        dashboardPage.AddPrice(Price);
    }

    @And("Click detail submit button")
    public void clickSubmitButton() {
        dashboardPage.ClickDetailSubmitButton();
    }

    @When("Click change status field")
    public void clickChangeStatusField() {
        dashboardPage.ChangeStatus();
        dashboardPage.clickButtonChangeStatus();
    }

    @Then("Redirect to dashboard page")
    public void redirectToDashboardPage() {
        assertEquals("https://bengcall.vercel.app/detailadmin/1", loginPage.getUrl());
    }


    @Then("Can't redirect to dashboard page")
    public void canTRedirectToDashboardPage() {
        assertEquals("https://bengcall.vercel.app/detailadmin/105",loginPage.getUrl());
    }
}
