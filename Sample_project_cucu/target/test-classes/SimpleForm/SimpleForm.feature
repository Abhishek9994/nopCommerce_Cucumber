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
Feature: Simple Form


  @tag1
  Scenario:To validate First Name,Last Name,Email,Contact Number and Message functionality
  
    Given Open the browser and Enter the URl
    And Make sure URL is correct
    When Enter your First Name
    And Enter your Last Name
    And Enter your Email
    And Enter your Contact Number
    And Enter your Message
    And Click on submit
    Then user should be successfully submit the form
    And pupup should be displayed to user

 

   # Examples: 
    #  | name  | value | status  |
    #  | name1 |     5 | success |
     # | name2 |     7 | Fail    |
