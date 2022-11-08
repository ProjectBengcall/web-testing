Feature: Log in Admin

  @Positive
  Scenario: Log in with valid data
    Given user already on page
    When User input valid email "admin@bengcall.com"
    And User input valid password "adminbengcall123"
    And User click button
    Then User direct to dashboard page

    @Negative
    Scenario Outline: Log in with invalid data
      Given user already on page
      When User input email "<email>"
      And User input password "<password>"
      And User click button
      Then User can't direct to dashboard page
      Examples:
      | email               | password          |
      | doom@gmail.com      | adminbengcall123  |
      | admin@bengcall.com  | woopwoop12        |