@activity2_4
Feature: Data driven test without Example

Scenario: Testing with Data from Scenario
    Given AUser is on Login page
    When AUser enters "admin" and "password"
    Then ARead the page title and confirmation message
    And AClose the Browser