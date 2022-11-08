Feature: Index
  As a user
  I want to check
  So i can check hello list

  Scenario: Get user index hello
    Given I set url hello
    When I request get index hello
    Then I get message200