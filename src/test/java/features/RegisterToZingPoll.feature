Feature: Register to ZingPoll
  I want to registered successfull

  @register_empty
  Scenario: Register with empty data
    Given I am on ZingPoll website "chrome"
    And I click the SignIn button
    Then The SignIn form should be shown
    When I enter email "" and password ""
    And I click Login button
    Then I verify the failure message "Please enter your email."
    Then I verify the failure message "Please enter your password."

  @Register_with_empty_all_fields
  Scenario: Register with empty new user
    Given I am on ZingPoll website "chrome"
    And I click the SignIn button
    Then The SignIn form should be shown
    And Choose task new user radio button
    Then The SignUp form should be shown
    When I click Register button
    Then I verify the failure message "Please enter your name."
    And I verify the failure message "Please enter your email."
    And I verify the failure message "Please enter your password."
    And I verify the failure message "The re-type password is required and cannot be empty"
    And I verify the failure message "Please agree with the term!"
  
  @without_keyword
  Scenario: Login with email not signed - without keyword
  Given I am on ZingPoll website chrome
  And I open "SignIn" page
  And I click the 
  
  
    
  @Register_with_email_invalid
  Scenario: Register with email invalid
    Given I am on ZingPoll website "chrome"
    And I click the SignIn button
    Then The SignIn form should be shown
    And Choose task new user radio button
    Then The SignUp form should be shown
    When Input full name
    And Input email
    And Input password
    And Input re-password
    And I click Register button
    Then I verify the failure message "Please enter a valid email address."  
