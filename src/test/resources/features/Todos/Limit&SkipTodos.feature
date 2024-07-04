Feature: Get Limit & skip todos from DummyJson
  Scenario Outline:Get Limit & skip todos with valid parameters
    Given Get Limit <limit> & Skip <skip> todos with valid parameters
    When  Send request get Limit & skip todos
    Then Status code should be 200
    And validate json schema "LimitSkip_todos_json_schema.json"

    Examples:
    | limit | skip |
    | 3     | 10   |
    | 5     | 2    |