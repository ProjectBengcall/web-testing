package starter.Admin.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import starter.Admin.Page.DashboardPage;
import starter.Admin.Page.LoginPage;

import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertEquals;

public class LogOutStepDef {

    WebDriver driver = getDriver();
    LoginPage loginPage ;
    DashboardPage dashboardPage ;

    @Given("User already on dashboard page")
    public void userAlreadyOnDashboardPage() {
        loginPage.open();
        loginPage.InputEmail("admin@bengcall.com");
        loginPage.InputPassword("adminbengcall123");
        loginPage.clickButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.NotifBanner();
    }

    @And("User click log out button")
    public void userClickLogOutButton() {
        loginPage.clickLogOutButton();
        driver.switchTo().alert().accept();
    }

    @Then("User redirect to login page")
    public void userRedirectToLoginPage() {
        assertEquals("https://bengcall.vercel.app/", loginPage.getUrl());
    }
}
