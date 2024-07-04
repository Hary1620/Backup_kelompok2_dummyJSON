package starter.Todos.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Todos.Todos;
import starter.Todos.TodosResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class ResponsesSteps {
    @Steps
    Todos todos;

    @Then("Status code should be {int}")
    public void statusCodeShouldBe(int statusCode) {
        SerenityRest.then().statusCode(statusCode).log().all();
    }
    @Then("Response body should be {string}")
    public void responseBodyShouldBe(String error) {
        SerenityRest.then().body(TodosResponses.ERROR, equalTo(error));
    }

    @And("validate json schema {string}")
    public void validateJsonSchema(String fileName) {
        File jsonFile = new File(Constants.JSON_SCHEMA+fileName);
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(jsonFile));
    }



}
