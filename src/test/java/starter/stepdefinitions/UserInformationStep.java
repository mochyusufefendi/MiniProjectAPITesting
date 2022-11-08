package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Getuserinformation;

public class UserInformationStep {

    @Steps
    Getuserinformation getuserinformation;

    @Given("I set valid url")
    public void iSetValidUrl() {
        getuserinformation.setValidUrl();
    }

    @When("I request get user information")
    public void iRequestGetUserInformation() {
        getuserinformation.requestGetuserinformation();
    }

    @Then("I will get message 401")
    public void iWillGetMessage401() {
        getuserinformation.statusCodemessage401();
    }
}
