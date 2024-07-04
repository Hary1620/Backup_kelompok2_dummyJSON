package starter.Todos.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import starter.Todos.Todos;
import starter.Todos.TodosResponses;

public class SingleTodosSteps {
    @Steps
    Todos todos;

    @Given("Get single todos with valid id {int}")
    public void getSingleTodosWithValidIdId(int id) {
        todos.getSingleTodos(id);
    }

    @When("Send request get single todos")
    public void sendRequestGetSingleTodos() {
        SerenityRest.when().get(Todos.SINGLE_TODOS);
    }

    @And("Response Body id Should be {int}")
    public void responseBodyIdShouldBeId(int id) {
        SerenityRest.and().body(TodosResponses.ID, Matchers.equalTo(id));

    }

    @Given("Get single todos with invalid id {int}")
    public void getSingleTodosWithInvalidIdId(int id) {
        todos.getSingleTodos(id);
    }

    @Given("Get single todos with special character id {string}")
    public void getSingleTodosWithSpecialCharacterId(String special) {
        todos.getSingleTodosSpecialId(special);
    }
}
