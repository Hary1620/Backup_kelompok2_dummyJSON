Feature: Delete todos from DummyJson
  Scenario: Delete todos with valid id
    Given Delete todos with id 1
    When Send request delete todos
    Then Status code should be 200
    And validate json schema "Delete_todos_json_schema.json"

    Scenario: Delete todos with special charcter id
      Given Delete todos with special id "%#"
      When Send request delete todos
      And Status code should be 404
      Then Response body should be "Todo with id '%#' not found"
      And validate json schema "Delete_todos_special_ID_json_schema.json"
