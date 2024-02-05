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
Feature: Advanced form

  @tag1
  Scenario: To validate First Name,Last Name,Email,Gender,Contact Number,Date of Birth,Subjects,Hobbies,Picture
   and Current Address functionality
    Given Open the browser and Enter the URL
    And Make sure URl is correct or Not
    When Enter your first Name
    And Enter your last name
    And Enter your email 
    And Click on Gender
    And Enter your contact number
   # And Enter your Date of Birth
    And Enter your Subjects 
    And Click on Hobbies
    And Upload your picture 
    And Enter your Current Address
    
    Then User should be successfully submit the form
    And User should able to see thank you message

 
 #   Examples: 
  #    | name  | value | status  |
   #   | name1 |     5 | success |
    #  | name2 |     7 | Fail    |
