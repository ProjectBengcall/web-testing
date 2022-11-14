Feature: Log Out

  #WBC_3
  Scenario: Log out from dashboard page
    Given User already on dashboard page
    And User click log out button
    Then User redirect to login page