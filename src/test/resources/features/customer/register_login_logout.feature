Feature: Register and login for the app
  Background:
  User is going to use the service.
  So they have to register first and then login.

    Scenario: Register with valid information
      Given User is already on the login page
      When User click on SignUp Now! button
      And User is directed to register page
      And User input on Full Name field with "Test"
      And User input on Email field with "test-test@mail.com"
      And User input on Password field with "testpass1"
      And User click on sign up button
      Then User will get "Success create new user" alert message
      And User will be directed to login page

#    Scenario: Register with invalid password requirement
#      Given User is already on the login page
#      When User click on SignUp Now! button
#      And User is directed to register page
#      And User input on Full Name field with "test"
#      And User input on Email field with "test@mail.com"
#      And User input on Password field with "testpass"
#      And User click on sign up button
#      Then User will get "password must be contain number" alert message
#      # undefined

#    Scenario: Register with a field is empty
#      Given User is already on the login page
#      When User click on SignUp Now! button
#      And User is directed to register page
#      And User input on Full Name field with "Test"
#      And User input on Email field with "test@mail.com"
#      And User click on sign up button
#      Then User will get "page should not emptied" alert message
#      # undefined

    Scenario: Login with valid credentials
      Given User is already on the login page
      When User input on Email field with "test-test@mail.com"
      And User input on Password field with "testpass1"
      And User click on sign in button
      Then User will get "You're logged in" alert message
      Then User will be directed to Home Page

#    Scenario: Login with invalid credentials
#      Given User is already on the login page
#      When User input on Email field with "unregistered@mail.com"
#      And User input on Password field with "testpass1"
#      And User click on sign in button
#      Then User will get "login failed" alert message
#      # Error

#    Scenario: Login with one field is emptied
#      Given User is already on the login page
#      When User input on Email field with "test@mail.com"
#      And User click on sign in button
#      Then User will get "email or password should not be empty" alert message
#      # Error

    Scenario: Logout button should redirect user to Login page
      Given User is already on home page
      When User click on Logout
      Then User will get "You have been logged out" alert message
      Then User will be directed to login page

#    Scenario: Back button should not bring user to login page
#      Given User is already on the login page
#      When User input on Email field with "test@mail.com"
#      And User input on Password field with "testpass1"
#      And User click on sign in button
#      Then User will get "You're logged in" alert message
#      Then User will be directed to Home Page
#      Then User click on back button
#      Then User should not back to login page



