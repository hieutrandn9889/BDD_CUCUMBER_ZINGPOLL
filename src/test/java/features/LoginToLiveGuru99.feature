Feature: Title your feature
  I want to user this template for my feature

  @Login
  Scenario Outline: Login to Liveguru99
    Given I open MyAccount page
    When I input user <username> and <password>
    Then I close browser

    Examples: 
      | username               | password |
      | hieutrandn01@gmail.com |   123456 |
      | hieutrandn02@gmail.com |   123456 |