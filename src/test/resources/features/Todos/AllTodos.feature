Feature: Get All Todos From DummyJSON
  Scenario: Get all todos with valid json
    Given Get all todos with valid json
    When send request get all todos
    Then  Status code should be 200

    Scenario Outline: Get All todos by user ID
      Given get all todos with user id <userId>
      When send request get all todos with user id
      Then  Status code should be 200
      Examples:
      |userId|
      | 1 |
      | 2 |
      
      Scenario: Get All todos by invalid user ID
        Given get all todos with user id 209
        When send request get all todos with user id
        And Status code should be 404
        Then Response body should be "User with id '209' not found"

  Scenario: Get All todos using special character user ID
    Given get all todos with special character user ID "%"
    When send request get all todos with user id
    And Status code should be 400
    Then Response body should be "Invalid user id '%'"

