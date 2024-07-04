package starter.Todos.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Todos.Todos;

public class LimitSkipSteps {
    @Steps
    Todos todos;

    @Given("Get Limit {int} & Skip {int} todos with valid parameters")
    public void getLimitLimitSkipSkipTodosWithValidParameters(int limit, int skip) {
        todos.getLimitSkipTodos(limit,skip);
    }

    @When("Send request get Limit & skip todos")
    public void sendRequestGetLimitSkipTodos() {
        SerenityRest.when().get(Todos.LIMIT_SKIP_TODOS);
    }
}
