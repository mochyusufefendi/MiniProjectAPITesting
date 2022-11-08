Feature: Get user information
  As a user
  I want view user information
  So i can view detail user

  Scenario: Get user information with valid url
    Given I set valid url
    When I request get user information
    Then I will get message 401