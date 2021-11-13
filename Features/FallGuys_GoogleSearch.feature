 @googlesearch @smokeTest
 Feature: Google Search
 
 Scenario Outline: Simple Search
 
 Given I am on the Google Homepage
 When I enter search "<term>"
 And I click on the Google search button
 Then I receive related test result
 
 
 Examples:
 |term				|
 |quality assurance |
 |software testing	|
 