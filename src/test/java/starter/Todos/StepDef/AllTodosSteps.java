package starter.Todos.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Todos.Todos;

public class AllTodosSteps {
    @Steps
    Todos todos;

    @Given("Get all todos with valid json")
    public void getAllTodosWithValidJson() {
    }

    @When("send request get all todos")
    public void sendRequestGetAllTodos() {
        SerenityRest.when().get(Todos.ALL_TODOS);
    }


    @Given("get all todos with user id {int}")
    public void getAllTodosWithUserIdUserId(int userId) {
        todos.getAllTodosByUserId(userId);
    }

    @When("send request get all todos with user id")
    public void sendRequestGetAllTodosWithUserId() {

        SerenityRest.when().get(Todos.ALL_TODOS_BY_USER_ID);
    }


    @Given("get all todos with special character user ID {string}")
    public void getAllTodosWithSpecialCharacterUserID(String userId) {
        todos.getAllTodosWithSpecialCharacterUserId(userId);
    }
}
