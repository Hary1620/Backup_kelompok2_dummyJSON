@add
Feature: Add New Todos from DummyJson
 Scenario Outline: Add new todos with valid json
    Given Add new todos with valid json "<fileName>"
    When Send request post add new todos
    Then Status code should be 201
   And validate json schema "Add_new_todos_json_schema.json"


   Examples:
   | fileName |
   | add_new_todo1.json|
   | add_new_todo2.json|