Feature: Log in Admin

  #WBC_1
  Scenario: Log in with valid data
    Given user already on page
    When User input valid email "admin@bengcall.com"
    And User input valid password "adminbengcall123"
    And User click button
    Then User direct to dashboard page

  @demo #WBC_2
  Scenario Outline: Log in with invalid data
    Given user already on page
    When User input email "<email>"
    And User input password "<password>"
    And Click button
    Then User can't direct to dashboard page
    Examples:
      | email               | password          |
      | doom@gmail.com      | adminbengcall123  |
      | admin@bengcall.com  | woopwoop12        |