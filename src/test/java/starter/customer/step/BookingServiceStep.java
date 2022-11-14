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
        inputText(addressField, address);
    }
    @Step
    public void inputDate(int date){
        final By dateField = By.id("input-date");
        inputNumber(dateField, date);
    }
    @Step
    public void inputTime(String time){
        final By dateField = By.id("input-date");
        inputText(dateField, time);
    }
    @Step
    public void selectServiceLocation(String location){
        final By locationSelect = By.xpath("//*[@id=\"modal-booking\"]/div/div[1]/div[2]/div[1]/select");
        selectDropDown(locationSelect, location);
    }
    @Step
    public void selectVehicleType(String vehicle){
        final By vehicleSelect = By.id("select-vehicle");
        selectDropDown(vehicleSelect, vehicle);
    }
    @Step
    public void selectFirstServiceType(String service){
        final By serviceSelect = By.xpath("//*[@id=\"modal-booking\"]/div/div[1]/div[2]/div[3]/span/select");
        selectDropDown(serviceSelect, service);
    }
    @Step
    public void selectSecondServiceType(String service){
        final By serviceSelect = By.id("react-select-4-input");
        inputText(serviceSelect, service);
        enter(serviceSelect);
    }
    @Step
    public void selectThirdServiceType(String service){
        final By serviceSelect = By.id("react-select-4-input");
        inputText(serviceSelect, service);
        enter(serviceSelect);
    }
    @Step
    public void selectFourthServiceType(String service){
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
