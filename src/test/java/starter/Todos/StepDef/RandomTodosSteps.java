package starter.Todos.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Todos.Todos;

public class RandomTodosSteps {
    @Steps
    Todos todos;
    @Given("Get random todos with valid json")
    public void getRandomTodosWithValidJson() {
    }

    @When("Send request get random todos")
    public void sendRequestGetRandomTodos() {
        SerenityRest.when().get(Todos.RANDOM_TODOS);
    }

    @Given("request to get {int} random todos")
    public void requestToGetResultRandomTodos(int req) {
        todos.getRandomreqTodos(req);
    }

    @When("Send request get request result of random todos")
    public void sendRequestGetRequestResultOfRandomTodos() {
        SerenityRest.when().get(Todos.RANDOM_TODOS_REQ_RESULT);
    }
}
