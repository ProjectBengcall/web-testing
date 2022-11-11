package starter.customer.pages;

import org.openqa.selenium.By;
import starter.customer.base.BasePageObject;

public class BookingServiceModalPage extends BasePageObject {
    public String verifiedSelectedServiceLocation(String location){
        final By activeLocation = By.id("//*[@id=\"service-location\"]/div/div[1]/div[1]");
        return getText(activeLocation);
    }
}
