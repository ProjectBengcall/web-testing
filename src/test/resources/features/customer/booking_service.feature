Feature: Booking a Service
  Background:
  User already have an account and want to book a service.
  They have to fill the form to get a service

    @SanityTesting
    Scenario Outline: Book a service with all field is filled
      Given User already on home page
      When User click on Service Now button
      And Service Now form will be appeared
      And User input "<phone>" on phone field
      And User input "<address>" on address field
      And User input date <date> on booking date
      And User input month <month> on booking date
      And User input year <year> on booking date
      And User select "<location>" on service location field
      And User select "<vehicle>" on vehicle type
      And User select first service "<service1>" on service type field
      And User input "<other>" on other request field
      And User click on submit button
      Then Date service will be shown
      And There is dot on service icon

      Examples:
      |phone     |address                    |date|month|year|location    |vehicle      |service1         |other                |
      |0816764095|Jalan Merdeka no 7 Surabaya|21  |11   |2022|Home Service|150cc - Vario|Complete Service|Please check the lamp|

  Scenario Outline: Book a service with all required field is filled
    Given User already on home page
    When User click on Service Now button
    And Service Now form will be appeared
    And User input "<phone>" on phone field
    And User input "<address>" on address field
    And User input date <date> on booking date
    And User input month <month> on booking date
    And User input year <year> on booking date
    And User select "<location>" on service location field
    And User select "<vehicle>" on vehicle type
    And User select first service "<service1>" on service type field
    And User click on submit button
    Then Date service will be shown
    And There is dot on service icon

    Examples:
      |phone     |address                    |date|month|year|location    |vehicle      |service1         |
      |0816764095|Jalan Merdeka no 7 Surabaya|21  |11   |2022|Home Service|150cc - Vario|Complete Service|

  Scenario Outline: Book a service with an empty required field
    Given User already on home page
    When User click on Service Now button
    And Service Now form will be appeared
    And User input "<address>" on address field
    And User input date <date> on booking date
    And User input month <month> on booking date
    And User input year <year> on booking date
    And User select "<location>" on service location field
    And User select "<vehicle>" on vehicle type
    And User select first service "<service1>" on service type field
    And User click on submit button
    Then User will get "all required field should not empty" message

    Examples:
      |address                    |date|month|year|location    |vehicle      |service1         |
      |Jalan Merdeka no 7 Surabaya|21  |11   |2022|Home Service|150cc - Vario|Complete Service|

  Scenario Outline: Book a service with all service is selected
    Given User already on home page
    When User click on Service Now button
    And Service Now form will be appeared
    And User input "<phone>" on phone field
    And User input "<address>" on address field
    And User input date <date> on booking date
    And User input month <month> on booking date
    And User input year <year> on booking date
    And User select "<location>" on service location field
    And User select "<vehicle>" on vehicle type
    And User select first service "<service1>" on service type field
    And User select second service "<service2>" on service type field
    And User select third service "<service3>" on service type field
    And User select fourth service "<service4>" on service type field
    And User input "<other>" on other request field
    And User click on submit button
    Then Date service will be shown
    And There is dot on service icon

    Examples:
      |phone     |address                    |date|month|year|location    |vehicle      |service1        |service2|service3|service4|other                |
      |0816764095|Jalan Merdeka no 7 Surabaya|21  |11   |2022|Home Service|150cc - Vario|Complete Service|Change Gear Set        |Change Brake        |Tune Up        |Please check the lamp|

  Scenario : Validate that service location field only accept one location
    Given User already on home page
    When User click on Service Now button
    And Service Now form will be appeared
    And User select "xxxxx" on service location field
    Then Drop down will still appear after enter

  Scenario : Validate that service location only accept one location
    Given User already on home page
    When User click on Service Now button
    And Service Now form will be appeared
    And User select "xxxxx" on vehicle type
    Then Drop down will still appear after enter

  Scenario : Validate that service location only accept one location
    Given User already on home page
    When User click on Service Now button
    And Service Now form will be appeared
    And User select first service "Complete Service" on service type field
    And User select second service "Change Gear Set" on service type field
    And User select third service "xxxxx" on service type field
    Then Drop down will still appear after enter
