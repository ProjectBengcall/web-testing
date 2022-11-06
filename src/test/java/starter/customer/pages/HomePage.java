package starter.customer.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import starter.customer.base.BasePageObject;
@DefaultUrl("https://bengcall.vercel.app/home")
public class HomePage extends BasePageObject {
    public String getServiceNowText(){
        final By serviceNow = By.id("button-book-service");
        return getText(serviceNow);
    }
}
