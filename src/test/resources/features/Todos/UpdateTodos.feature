Feature: Put Update Todos from DummyJson
  Scenario: Put update todos with valid json
    Given Update todos with parameter id 1 and valid json "update_todo.json"
    When Send Request put update todos
    Then Status code should be 200
    And validate json schema "Update_todos_json_schema.json"

    Scenario: Put update todos with Special Character parameter id
      Given Update todos with invalid parameter id "%$" and valid json "update_todo.json"
      When Send Request put update todos
      Then Status code should be 404



