package starter.Admin.Page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.ui.Select;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage extends PageObject {

    @Managed
    WebDriver driver =getDriver();

    private final By fieldChangeStatus = By.id("option-status");

    private final By DetailButton = By.id("btn-detail");

    private final By fieldAddServiceType = By.id("service-type");
    private final By fieldAddPrice = By.id("add-price");
    private final By DetailSubmitButton = By.id("button-submit");
    private final By ButtonChangeStatus = By.id("btn-changeStatus");


    public static String DASHBOARD_URL = "https://bengcall.vercel.app/detailadmin/123";

    public void ChangeStatus() {
        driver.findElement(fieldChangeStatus).click();
    }

    public void clickDetailButton() {
        driver.findElement(DetailButton).click();
    }

    public void AddServiceType(String AddserviceType) { driver.findElement(fieldAddServiceType).sendKeys(AddserviceType);}

    public void AddPrice(String AddPrice) { driver.findElement(fieldAddPrice).sendKeys(AddPrice);}

    public void ClickDetailSubmitButton() {driver.findElement(DetailSubmitButton).click();}

    public void clickAcceptAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void clickButtonChangeStatus() { driver.findElement(ButtonChangeStatus).click();}

}
