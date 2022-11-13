package starter.customer.pages;
import org.openqa.selenium.By;
import starter.customer.base.BasePageObject;

public class RegisterPage extends BasePageObject {
    public String getModalAlert(){
        final By modalText = By.className("swal-text");
        wait(modalText);
        return getText(modalText);
    }
}
