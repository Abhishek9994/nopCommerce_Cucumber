#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Heroku Login

  @tag1
  Scenario: To validate username,password and login functionality
    Given Open the browser and enter the URL
    And make sure URL is correct
    When Enter your username
    And Enter your password
    And Click on login
    Then user should be successfully login
    And Home page should be displayed
#  Given I want to write a step with <name>
 #   When I check for the <value> in step
  #  Then I verify the <status> in step
#     | name  | value | status  |
 #     | name1 |     5 | success |
  #    | name2 |     7 | Fail    |
