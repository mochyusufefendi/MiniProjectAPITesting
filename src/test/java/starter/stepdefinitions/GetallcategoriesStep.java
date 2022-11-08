package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Categories;

public class GetallcategoriesStep {
    @Steps
    Categories categories;

    @Given("I set valid Url")
    public void iSetValidUrl() {
        categories.getUrl();
    }

    @When("I request get categories")
    public void iRequestGetCategories() {
        categories.reqGetcategories();
    }

    @Then("I will get message 200")
    public void iWillGetMessage200() {
        categories.message200();
    }
}
