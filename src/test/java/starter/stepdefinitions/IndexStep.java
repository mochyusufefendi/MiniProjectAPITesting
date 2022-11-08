package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.IndexPage;


public class IndexStep {
    @Steps
    IndexPage indexPage;
    @Given("I set url hello")
    public void iSetUrlHello() {
        indexPage.setUrl();
    }

    @When("I request get index hello")
    public void iRequestGetIndexHello() {
        indexPage.requestGetindex();
    }

    @Then("I get message200")
    public void iGetMessage200() {
        indexPage.getMessage200();
    }
}
