Feature: Service Type flow

  #WBC_6
  Scenario: Add Vehicle with valid vehicle type
    Given Already log in
    And Click service type button
    And Click add vehicle button
    And Input vehicle type "150cc - ADV"
    And Click submit button
    Then Pop up closed

 #WBC_7
  Scenario Outline: Add Vehicle with invalid vehicle type
    Given Already log in
    And Click service type button
    And Click add vehicle button
    And Input vehicle type "<vehicletype>"
    And Click submit button
    Then Pop up closed
    Examples:
      | vehicletype  |
      | Samsung      |
      | LG           |
      | Nike         |

    #WBC_8
  Scenario: Add Vehicle Cancel Button
    Given Already log in
    And Click service type button
    And Click add vehicle button
    And Input vehicle type "150cc - ADV"
    And Click cancel button
    Then Pop up closed


    #WBC_9
  Scenario Outline: Edit Service Submit Button
    Given Already log in
    When Click service type button
    And Click edit service button
    And Input add service type "<servicetype>"
    And Input add price "<price>"
    And Click X logo on service type
    And Click edit submit button
    Then Pop up edit closed
    Examples:
    | servicetype      | price |
    | Complete Service | 45000 |
    | Change Gear Set  | 15000 |
    | Change Break     | 8000  |

    #WBC_10
  Scenario Outline: Edit Service Cancel Button
    Given Already log in
    When Click service type button
    And Click edit service button
    And Input add service type "<servicetype>"
    And Input add price "<price>"
    And Click X logo on service type
    And Click edit cancel button
    Then Pop up edit closed and back to servicetpe page
    Examples:
      | servicetype      | price |
      | Complete Service | 45000 |
      | Change Gear Set  | 15000 |
      | Change Break     | 8000  |

    #WBC_11
  Scenario: Delete Service in Service Type
    Given Already log in
    When Click service type button
    And Click delete button
    Then Vehicle clear
