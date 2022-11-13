Feature: Register and login for the app
  Background:
  User is going to use the service.
  So they have to register first and then login.

    Scenario: Register with valid requirement
      Given User is already on the login page
      When User click on SignUp Now! button
      And User is directed to register page
      And User input on Full Name field with "Test"
      And User input on Email field with "test-test@mail.com"
      And User input on Password field with "testpass1"
      And User click on sign up button
      Then User will get "Success create new user" alert message
      And User will be directed to login page

    Scenario: Register with already registered email
      Given User is already on the login page
      When User click on SignUp Now! button
      And User is directed to register page
      And User input on Full Name field with "Test"
      And User input on Email field with "test-test@mail.com"
      And User input on Password field with "testpass1"
      And User click on sign up button
      #Then User will get "Password should contain atleast 8 characters & containing letters and atleast 1 number" alert modal message

    Scenario: Register with invalid password requirement
      Given User is already on the login page
      When User click on SignUp Now! button
      And User is directed to register page
      And User input on Full Name field with "test"
      And User input on Email field with "test@mail.com"
      And User input on Password field with "testpass"
      And User click on sign up button
      Then User will get "Password should contain atleast 8 characters & containing letters and atleast 1 number" alert modal message

    Scenario: Register with full name less than 3 character
      Given User is already on the login page
      When User click on SignUp Now! button
      And User is directed to register page
      And User input on Full Name field with "te"
      And User input on Email field with "test@mail.com"
      And User input on Password field with "testpass"
      And User click on sign up button
      Then User will get "Full Name should atleast be 3 letters" alert modal message

    Scenario Outline: Register with a field is empty
      Given User is already on the login page
      When User click on SignUp Now! button
      And User is directed to register page
      And User input on Full Name field with "<name>"
      And User input on Email field with "<email>"
      And User input on Password field with "<password>"
      And User click on sign up button
      Then User will get "Field(s) should not be empty" alert modal message
      Examples:
      |name     |email        |password         |
      |test     |test@mail.com|                 |
      |test     |             |testpass1        |
      |         |test@mail.com|testpass1        |
      |         |             |                 |

    Scenario: Login with valid credentials
      Given User is already on the login page
      When User input on Email field with "test-test@mail.com"
      And User input on Password field with "testpass1"
      And User click on sign in button
      Then User will be directed to Home Page
      Then User will get "You're logged in" alert modal message

    Scenario Outline: Login with invalid credentials
      Given User is already on the login page
      When User input on Email field with "<email>"
      And User input on Password field with "<password>"
      And User click on sign in button
      Then User will get "Wrong Email or Password" alert modal message
      Examples:
      |email                  |password           |
      |unregistered@mail.com  |testpass1          |
      |test-test@mail.com     |unregisteredpass1  |
      |unregistered@mail.com  |unregisteredpass1  |

    Scenario Outline: Login with email field is emptied
      Given User is already on the login page
      When User input on Email field with "<email>"
      And User input on Password field with "<password>"
      And User click on sign in button
      Then User will get "Email should not be empty" alert modal message
      Examples:
      |email             |password  |
      |                  |testpass1 |
      |                  |          |

    Scenario: Login with password field is emptied
      Given User is already on the login page
      When User input on Email field with "test-test@mail.com"
      And User click on sign in button
      Then User will get "Password should not be empty" alert modal message

    Scenario: Logout button should redirect user to Login page
      Given User is already on home page
      When User click on Logout
      Then User will be directed to login page
      Then User will get "You have been logged out" alert modal message

#    Scenario: Back button should not bring user to login page
#      Given User is already on the login page
#      When User input on Email field with "test@mail.com"
#      And User input on Password field with "testpass1"
#      And User click on sign in button
#      Then User will get "You're logged in" alert message
#      Then User will be directed to Home Page
#      Then User click on back button
#      Then User should not back to login page



