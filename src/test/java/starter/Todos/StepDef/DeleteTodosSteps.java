package starter.Todos.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Todos.Todos;

public class DeleteTodosSteps {
    @Steps
    Todos todos;
    @Given("Delete todos with id {int}")
    public void deleteTodosWithId(int id) {
        todos.DeleteTodos(id);
    }

    @When("Send request delete todos")
    public void sendRequestDeleteTodos() {
        SerenityRest.when().delete(Todos.SINGLE_TODOS);
    }

    @Given("Delete todos with special id {string}")
    public void deleteTodosWithSpecialId(String special) {
        todos.DeleteTodosSpecialId(special);
    }
}
