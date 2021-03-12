@activity2_5
Feature: Data driven test with Example

Scenario Outline: Testing with Data from Scenario
    Given BUser is on Login page
    When BUser enters "<Usernames>" and "<Passwords>"
    Then BRead the page title and confirmation message
    And BClose the Browser
    
Examples:
    | Usernames | Passwords |
    | admin     | password  |
    | adminUser | Password  |