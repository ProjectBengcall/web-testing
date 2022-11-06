package starter.customer.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.customer.ExpectedCustomerResponses;
import starter.customer.base.BasePageObject;
import starter.customer.pages.HomePage;
import starter.customer.step.BookingServiceStep;
import starter.customer.step.LoginStep;
import static org.junit.Assert.*;

public class BookingServiceStepDefinition extends BasePageObject {
    HomePage home;
    LoginStep loginStep;
    BookingServiceStep bookingServiceStep;
    @Given("User already on home page")
    public void user_already_on_home_page() {
//        loginStep.fullLogin();
        home.open();

    }
    @When("User click on Service Now button")
    public void user_click_on_service_now_button() {
        bookingServiceStep.clickServiceNow();
    }
    @When("Service Now form will be appeared")
    public void service_now_form_will_be_appeared() {
        assertEquals(ExpectedCustomerResponses.SERVICE_NOW_MODAL, getUrl());
    }
    @When("User input {string} on phone field")
    public void user_input_on_phone_field(String phone) {
        bookingServiceStep.inputPhone(phone);
    }
    @When("User input {string} on address field")
    public void user_input_on_address_field(String address) {
        bookingServiceStep.inputAddress(address);
    }
    @When("User input date {int} on booking date")
    public void user_input_date_on_booking_date(Integer date) {
        bookingServiceStep.inputDate(date);
    }
    @When("User input month {int} on booking date")
    public void user_input_month_on_booking_date(Integer month) {
        bookingServiceStep.inputDate(month);
    }
    @When("User input year {int} on booking date")
    public void user_input_year_on_booking_date(Integer year) {
        bookingServiceStep.inputDate(year);
    }
    @When("User select {string} on service location field")
    public void user_select_on_service_location_field(String location) {
        bookingServiceStep.selectServiceLocation(location);
    }
    @When("User select {string} on vehicle type")
    public void user_select_on_vehicle_type(String vehicle) {
        bookingServiceStep.selectVehicleType(vehicle);
    }
    @When("User select {string}  on service type field")
    public void user_select_on_service_type_field(String service) {
        bookingServiceStep.selectServiceType(service);
    }
    @When("User input {string} on other request field")
    public void user_input_on_other_request_field(String request) {
        bookingServiceStep.inputOtherRequest(request);
    }
    @When("User click on submit button")
    public void user_click_on_submit_button() {
        bookingServiceStep.clickSubmit();
    }
    @Then("Date service will be shown")
    public void date_service_will_be_shown() {

    }
    @Then("There is dot on service icon")
    public void there_is_dot_on_service_icon() {

    }
}
