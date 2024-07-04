Feature: Get All Todos From DummyJSON
  Scenario: Get all todos with valid json
    Given Get all todos with valid json
    When send request get all todos
    Then  Status code should be 200
    And validate json schema "All_todos_json_schema.json"

    Scenario Outline: Get All todos by user ID
      Given get all todos with user id <userId>
      When send request get all todos with user id
      Then  Status code should be 200
      And validate json schema "All_todos_byUserId_json_schema.json"
      Examples:
      |userId|
      | 1 |
      | 2 |
      
     Scenario Outline: Get All todos by invalid user ID
        Given get all todos with user id <userId>
        When send request get all todos with user id
        And Status code should be 404
        Then Response body should be "User with id '<userId>' not found"
       And validate json schema "All_todos_byInvalidUserId_json_schema.json"
       Examples:
       |userId|
       | 209  |
       | 210  |

 Scenario Outline: Get All todos using special character user ID
    Given get all todos with special character user ID "<userId>"
    When send request get all todos with user id
    And Status code should be 400
    Then Response body should be "Invalid user id '<userId>'"
   And validate json schema "All_todos_byInvalidUserId_json_schema.json"

   Examples:
   |userId|
   | %    |
   | &*   |
   |$%@   |
   | #*   |

