Feature: Service Type flow

  Scenario: Add Vehicle Submit Button
    Given Already log in
    And Click service type button
    And Click add vehicle button
    And Input new vehicle
    And Click submit button
    Then Pop up closed


  Scenario: Add Vehicle Cancel Button
    Given Already log in
    And Click service type button
    And Click add vehicle button
    And Input new vehicle
    And Click cancel button
    Then Pop up closed

  Scenario Outline: Edit Service Submit Button
    Given Already log in
    When Click service type button
    And Click edit service button
    And Click vehicle type
    And Input add service type "<servicetype>"
    And Input add price <price>
    And Click X logo on service type
    And Click submit button
    Then Pop up closed
    Examples:
    | servicetype      | price |
    | Complete Service | 45000 |
    | Change Gear Set  | 15000 |
    | Change Break     | 8000  |

  Scenario Outline: Edit Service Cancel Button
    Given Already log in
    When Click service type button
    And Click edit service button
    And Click vehicle type
    And Input add service type "<servicetype>"
    And Input add price <price>
    And Click X logo on service type
    And Click cancel button
    Then Pop up closed
    Examples:
      | servicetype      | price |
      | Complete Service | 45000 |
      | Change Gear Set  | 15000 |
      | Change Break     | 8000  |

  Scenario: Delete Service in Service Type
    Given Already log in
    When Click service type button
    And Already on service type page
    And Click delete button
    Then Vehicle clear
