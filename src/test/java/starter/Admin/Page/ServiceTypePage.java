package starter.Admin.Page;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ServiceTypePage {

    @Managed
    WebDriver driver =getDriver();

    private final By ServiceTypeButton = By.id("btn-service-type");


    public void clickServiceButton() {
        driver.findElement(ServiceTypeButton).click();
    }

}
