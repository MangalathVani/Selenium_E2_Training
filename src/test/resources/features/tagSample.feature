@FunctionalTest
Feature: Free CRM Application

#@SmokeTest @RegressionTest
#Scenario: Valid login
#Given User is on login page

Background: Valid login
Given User is on login page

Scenario: Invalid login
Given User is on login page
When User enters invalid cred
@SmokeTest
Scenario: Create a task
Given User is on Task Page
@SmokeTest
Scenario: Create a deal
Given User is on deal Page
@RegressionTest
Scenario: Create a contacts
Given User is on contacts Page

Scenario: Create a companies
Given User is on companies Page

@SmokeTest @RegressionTest
Scenario: User logout
Given User  click logout
