Feature: Get A random todos from DummyJson
  Scenario: Get a random todos with valid json
    Given Get random todos with valid json
    When Send request get random todos
    Then  Status code should be 200
    And validate json schema "get_Random_todos_json_schema.json"

   Scenario Outline: Get Random todos by request match result by user
     Given request to get <result> random todos
     When Send request get request result of random todos
     Then  Status code should be 200
     And validate json schema "random_todos_json_schema.json"
     Examples:
     | result |
     | 1 |
     | 2 |
     |3 |
     |4 |

     


     

       