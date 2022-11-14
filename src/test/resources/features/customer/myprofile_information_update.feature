Feature: Update my profile information
  Background:
    User want to update their information stored on website
    So they need to update it.
    User also need to know whether their information is correctly changed
    So they login again.
    If they want to delete their account, they have to deactivate it

    Scenario Outline: Update information on profile
      Given User already on my profile page
      When User input "<name>" on input new full name field
      And User input "<email>" on input new email field
      And User input "<password>" on input new password
      And User click on submit button
      Then User will get "Success Change Profile" alert modal message
      And User will see new name as "<name>"
      And User will see new email as "<email>"

      Examples:
        |name       |email              |password       |
        |Test Update|testupdate1@mail.com|testpassupdate1|

    Scenario Outline: Login with updated profile
      Given User is already on the login page
      When User input on Email field with "<email>"
      And User input on Password field with "<password>"
      And User click on sign in button
      Then User will get "You're logged in" alert modal message
      Then User will be directed to Home Page
      # RESET TO BASE
      * Reset
      * Home
      # RESET TO BASE

      Examples:
        |email              |password       |
        |testupdate1@mail.com|testpassupdate1|

    Scenario: Update name should change name only
      Given User already on my profile page
      When User input "Test Update" on input new full name field
      And User click on submit button
      Then User will see new name as "Test Update"
      Then Email will not change
      # RESET TO BASE
      * Reset
      * Home
      # RESET TO BASE

    Scenario: Update email should change email only
      Given User already on my profile page
      When User input "testupdate@mail.com" on input new email field
      And User click on submit button
      Then User will see new email as "testupdate@mail.com"
      Then Full name will not change
      # RESET TO BASE
      * Reset
      * Home
      # RESET TO BASE

#    Scenario: Deactivate button should delete user account
#      Given User already on my profile page
#      When User click on the deactivate button
#      Then User will get "Account Deleted" alert message
#      Then User will be directed to login page
