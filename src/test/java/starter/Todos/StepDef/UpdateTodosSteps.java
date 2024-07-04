package starter.Todos.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Todos.Todos;
import starter.utils.Constants;

import java.io.File;

public class UpdateTodosSteps {
    @Steps
    Todos todos;

    @Given("Update todos with parameter id {int} and valid json {string}")
    public void updateTodosWithParameterIdAndValidJson(int id, String update) {
        File jsonFile = new File(Constants.REQ_BODY+update);
        todos.putUpdateTodo(id,jsonFile);
    }



    @When("Send Request put update todos")
    public void sendRequestPutUpdateTodos() {
        SerenityRest.when().put(Todos.UPDATE_TODOS);
    }


    @Given("Update todos with invalid parameter id {string} and valid json {string}")
    public void updateTodosWithInvalidParameterIdAndValidJson(String id, String update) {
        File jsonFile = new File(Constants.REQ_BODY+update);
        todos.putUpdateTodoSpecialcharaId(id,jsonFile);
    }
}
