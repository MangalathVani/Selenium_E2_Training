@EndtoEndTest
Feature: Google Page Test

Scenario: Search Java Text
Given User search Java text
@SmokeTest
Scenario: Search Selenium Text
Given User search Selenium text
Then should display Selenium search page
@RegressionTest
Scenario: Search Cucumber Text
Given User search Cucumber text