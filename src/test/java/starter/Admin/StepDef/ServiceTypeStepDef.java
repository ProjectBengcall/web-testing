package starter.Admin.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import starter.Admin.Page.DashboardPage;
import starter.Admin.Page.LoginPage;
import starter.Admin.Page.ServiceTypePage;

import static org.junit.Assert.assertEquals;

public class ServiceTypeStepDef extends PageObject {

    WebDriver driver = getDriver();
    ServiceTypePage serviceTypePage ;
    LoginPage loginPage;

    @And("Click service type button")
    public void clickServiceTypeButton() {
        serviceTypePage.clickServiceButton();
        assertEquals(ServiceTypePage.SERVICETYPE_URL,driver.getCurrentUrl());
    }

    @And("Click add vehicle button")
    public void clickAddVehicleButton() {
        serviceTypePage.clickAddVehicleButton();
    }

    @And("Input vehicle type {string}")
    public void inputVehicleType(String vehicletype) {
        serviceTypePage.inputAVehiclType(vehicletype);
    }

    @Then("Pop up closed")
    public void popUpClosed() {
        assertEquals(ServiceTypePage.SERVICEMODAL_URL,driver.getCurrentUrl());
    }

    @And("Click cancel button")
    public void clickCancelButton() {
    }

    @And("Click edit service button")
    public void clickEditServiceButton() {
        serviceTypePage.clickEditButton();
        assertEquals(ServiceTypePage.SERVICEMODATEDIT_URL,driver.getCurrentUrl());
    }


    @And("Input add service type {string}")
    public void inputAddServiceTypeServicetype(String Service) {
        serviceTypePage.inputService(Service);
    }

    @And("Input add price {string}")
    public void inputAddPricePrice(String  Price) {
        serviceTypePage.inputPrice(Price);
    }

    @And("Click X logo on service type")
    public void clickXLogoOnServiceType() {
        serviceTypePage.Delete();
    }


    @And("Click delete button")
    public void clickDeleteButton() {
        serviceTypePage.clickDeleteButton();
    }

    @Then("Vehicle clear")
    public void vehicleClear() {
        assertEquals(ServiceTypePage.SERVICETYPE_URL,driver.getCurrentUrl());
    }

    @And("Click submit button")
    public void clickSubmitButton() {
        serviceTypePage.clickSubmitButton();
    }

    @And("Click edit submit button")
    public void clickEditSubmitButton() {
        serviceTypePage.EditButtonSubmit();
    }

    @And("Click edit cancel button")
    public void clickEditCancelButton() {
        serviceTypePage.EditCancelButton();
    }

    @Then("Pop up edit closed")
    public void popUpEditClosed() {
        assertEquals(ServiceTypePage.SERVICEMODATEDIT_URL,driver.getCurrentUrl());
    }

    @Then("Pop up edit closed and back to servicetpe page")
    public void popUpEditClosedAndBackToServicetpePage() {
        assertEquals("https://bengcall.vercel.app/service-type#",loginPage.getUrl());
    }
}
