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
Feature: nopCommerce Register

  @tag1
  Scenario: To validate Gender, First name, Last name, Email, Company name, Password, Confirm password functionality 
    Given Open the chrome browser and Enter the URL
    And Make sure URL is vaild 
    When Click on your gender 
    And Enter your First name
    And Enter your Last name
    And Enter your company Email
    And Enter your Company name
    And Enter your Password 
    And Enter Your  Confirm password
    And Click on Register
    Then User should be successfully register
    And confirmation message should be displayed  

 # @tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
     # | name2 |     7 | Fail    |
