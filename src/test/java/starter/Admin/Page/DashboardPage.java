package starter.Admin.Page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {

    @Managed
    WebDriver driver =getDriver();

    private final By fieldChangeStatus = By.className("css-qc6sy-singleValue");

    private final By DetailButton = By.id("btn-detail");



    public void ChangeStatus() {
        driver.findElement(fieldChangeStatus).click();
    }

    public void clickDetailButton() {
        driver.findElement(DetailButton).click();
    }

}
