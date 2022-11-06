Feature: Booking a Service
  Background:
  User already have an account and want to book a service.
  They have to fill the form to get a service
    @SanityTesting
    Scenario Outline: User fill all required field
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
      And User select "<service>"  on service type field
      And User input "<other>" on other request field
      And User click on submit button
      Then Date service will be shown
      And There is dot on service icon

      Examples:
      |phone     |address                    |date|month|year|location    |vehicle      |service         |other                |
      |0816764095|Jalan Merdeka no 7 Surabaya|21  |11   |2022|Home Service|150cc - Vario|Complete Service|Please check the lamp|