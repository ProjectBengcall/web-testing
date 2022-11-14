package starter.customer.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.customer.DataInput;
import starter.customer.ExpectedCustomerResponses;
import starter.customer.base.BasePageObject;
import starter.customer.pages.MyProfilePage;
import starter.customer.step.MyProfileUpdateStep;
import static org.junit.Assert.*;

public class MyProfileUpdateStepDefinition extends BasePageObject {
    MyProfileUpdateStep myProfileStep;
    MyProfilePage myProfile;
    String tempName = "test";
    String tempEmail = "test";
    @Given("User already on my profile page")
    public void user_already_on_my_profile_page() {
        myProfileStep.goToMyProfileFull();
        assertEquals(ExpectedCustomerResponses.MY_PROFILE_PAGE, getUrl());
        tempName = myProfile.verifyUpdatedName();
        tempEmail = myProfile.verifyUpdatedEmail();
    }
    @When("User input {string} on input new full name field")
    public void user_input_on_input_new_full_name_field(String nameUpdate) {
        myProfileStep.inputUpdateName(nameUpdate);
    }
    @When("User input {string} on input new email field")
    public void user_input_on_input_new_email_field(String emailUpdate) {
        myProfileStep.inputUpdateEmail(emailUpdate);
    }
    @When("User input {string} on input new password")
    public void user_input_on_input_new_password(String passwordUpdate) {
        myProfileStep.inputUpdatePassword(passwordUpdate);
    }
    @Then("User will see new name as {string}")
    public void user_will_see_new_name_as(String name) {
        assertEquals(name, myProfile.verifyUpdatedName());
    }
    @Then("User will see new email as {string}")
    public void user_will_see_new_email_as(String email) {
        assertEquals(email, myProfile.verifyUpdatedEmail());
    }
    @Then("Email will not change")
    public void emailWillNotChange() {
        assertEquals(tempEmail, myProfile.verifyUpdatedEmail());
    }
    @Then("Full name will not change")
    public void fullNameWillNotChange() {
        assertEquals(tempName, myProfile.verifyUpdatedName());
    }
    @Then("Reset")
    public void reset() {
        myProfileStep.toMyProfile();
        myProfileStep.inputUpdateName(DataInput.name);
        myProfileStep.inputUpdateEmail(DataInput.email);
        myProfileStep.inputUpdatePassword(DataInput.password);
        myProfileStep.clickUpdateButton();
        clickOkConfirmation();
    }
    @When("User click on the deactivate button")
    public void userClickOnTheDeactivateButton() {
    }
    @Then("Home")
    public void home() {
        myProfileStep.clickLogo();
    }
}
