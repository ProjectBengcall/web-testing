package starter.Admin.Page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ServiceTypePage extends PageObject {

    @Managed
    WebDriver driver =getDriver();

    private final By ServiceTypeButton = By.id("btn-service-type");

    private final By AddVehicleButton = By.id("btn-add-vehicle");

    private final By InputAddVehicleField = By.id("input-vehicle-type");

    private  final By SubmitButton = By.id("button-submit");

    private  final By CancelButton = By.id("button-submit");

    private final By EditButton = By.id("btn-setting");

    private final By DeleteButton = By.id("btn-trash");
    private final By InputServiceType = By.id("input-service-type");
    private final By InputPrice = By.id("input-price");
    private final By XDelete = By.id("btn-delete");
    private final By EditCancel = By.id("btn-cancel");
    private final By ButtonSubmitEdit = By.id("btn-submit");

    public static String SERVICETYPE_URL = "https://bengcall.vercel.app/service-type";
    public static String SERVICEMODAL_URL = "https://bengcall.vercel.app/service-type#my-modal-2";
    public static String SERVICEMODATEDIT_URL = "https://bengcall.vercel.app/service-type#my-modal-3";


    public void clickServiceButton() {
        driver.findElement(ServiceTypeButton).click();
    }

    public void clickAddVehicleButton() {
        driver.findElement(AddVehicleButton).click();
    }

    public void inputAVehiclType(String vehicletype) {
        driver.findElement(InputAddVehicleField).sendKeys(vehicletype);
    }

    public void clickSubmitButton() {
        driver.findElement(SubmitButton).click();
    }

    public void clickCancelButton() {
        driver.findElement(CancelButton).click();
    }
    public void clickEditButton() {
        driver.findElement(EditButton).click();
    }
    public void clickDeleteButton() {
        driver.findElement(DeleteButton).click();
    }
    public void inputService(String Service) {driver.findElement(InputServiceType).sendKeys(Service);}
    public void inputPrice(String Price) {driver.findElement(InputPrice).sendKeys(Price);}
    public void Delete() {driver.findElement(XDelete).click();}
    public void EditButtonSubmit() {driver.findElement(ButtonSubmitEdit).click();}
    public void EditCancelButton() {driver.findElement(EditCancel).click();}
}
