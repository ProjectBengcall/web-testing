package starter.customer.step;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.customer.base.BasePageObject;

public class BookingServiceStep extends BasePageObject {
    @Step
    public void clickServiceNow(){
        final By serviceNow = By.id("button-book-service");
        click(serviceNow);
    }
    @Step
    public void inputPhone(String phone){
        final By phoneField = By.id("input-phone");
        inputText(phoneField, phone);
    }
    @Step
    public void inputAddress(String address){
        final By addressField = By.id("input-address");
    }
    @Step
    public void inputDate(int date){
        final By dateField = By.id("input-date");
        inputNumber(dateField, date);
    }
    @Step
    public void selectServiceLocation(String location){
        final By locationSelect = By.id("react-select-2-input");
        inputText(locationSelect, location);
        enter(locationSelect);
    }
    @Step
    public void selectVehicleType(String vehicle){
        final By vehicleSelect = By.id("react-select-3-input");
        inputText(vehicleSelect, vehicle);
        enter(vehicleSelect);
    }
    @Step
    public void selectServiceType(String service){
        final By serviceSelect = By.id("react-select-4-input");
        inputText(serviceSelect, service);
        enter(serviceSelect);
    }
    @Step
    public void inputOtherRequest(String request){
        final By requestField = By.id("input-request");
        inputText(requestField, request);
    }
    @Step
    public void clickSubmit(){
        final By submit = By.id("button-submit");
        click(submit);
    }
}
