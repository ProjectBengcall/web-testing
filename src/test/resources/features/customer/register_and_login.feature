Feature: Register and login for the app
  Background:
  User is going to use the service.
  So they have to register first

    Scenario: Register with valid information
      Given User is already on the login page
      When User click on SignUp Now! button
      And User is directed to register page
      And User input on Full Name field with "Rahdian"
      And User input on Email field with "rahdianid@gmail.com"
      And User input on Password field with "Testbengcall123"
      And User click on sign up button
      Then User will directed to login page
      And User will get "successfully register" message

    Scenario: Register with invalid information
      Given User is already on the login page
      When User click on SignUp Now! button
      And User is directed to register page
      And User input on Full Name field with "Rahdian"
      And User input on Email field with "xxxxxxxxgmail.com"
      And User input on Password field with "Testbengcall123"
      And User click on sign up button
      Then User will get "register failed" message

    Scenario: Login with valid credentials
      Given User is already on the login page
      When User input on Email field with "rahdianid@gmail.com"
      And User input on Password field with "Testbengcall123"
      And User click on sign in button
      Then User will be directed to Home Page

    Scenario: Login with valid credentials
      Given User is already on the login page
      When User input on Email field with "xxxxxxx@gmail.com"
      And User input on Password field with "Testbengcall123"
      And User click on sign in button
      Then User will get "register failed" message
