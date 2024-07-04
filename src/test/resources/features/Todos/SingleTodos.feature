Feature: Get Single Todos From DummyJSON
 Scenario Outline: Get single todos with valid id
   Given  Get single todos with valid id <id>
   When Send request get single todos
   Then Status code should be 200
   And Response Body id Should be <id>
   And validate json schema "Single_todos_json_schema.json"

   Examples:
   | id |
   | 1  |
   | 2  |

  Scenario Outline: get single todos with invalid id
    Given  Get single todos with invalid id <id>
    When Send request get single todos
    And Status code should be 404
    Then Response body should be "Todo with id '<id>' not found"
    And validate json schema "Single_invalidID_todos_json_schema.json"

    Examples:
      | id |
      | 255  |
      | 260  |


   Scenario Outline: Get single todos with special character id
     Given Get single todos with special character id "<id>"
     When Send request get single todos
     And Status code should be 404
     Then Response body should be "Todo with id '<id>' not found"
     And validate json schema "Single_special_ID_todos_json_schema.json"

     Examples:
     | id |
     | $#@ |
     | *7$ |
     | #%  |










