Feature: Login
  Scenario: Login validation with my valid credentials
    Given I am on the "https://www.corridordigital.com/season/1"
    When I click on Login option
    And I enter valid user name as "jith.jaco@gmail.com"
    And I enter valid password as "jacoBpswd1$"
    And  I click on Login button
    Then I should be navigated to the corridordigital Dashboard page successfully