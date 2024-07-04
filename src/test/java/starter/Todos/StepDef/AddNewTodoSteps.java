package starter.Todos.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Todos.Todos;
import starter.utils.Constants;

import java.io.File;

public class AddNewTodoSteps {
    @Steps
    Todos todos;

    @Given("Add new todos with valid json {string}")
    public void addNewTodosWithValidJson(String fileName) {
        File fileJson = new File(Constants.REQ_BODY+fileName);
       todos.postAddNewTodo(fileJson);
    }

    @When("Send request post add new todos")
    public void sendRequestPostAddNewTodos() {
        SerenityRest.when().post(Todos.ADD_NEW_TODOS);
    }
}
