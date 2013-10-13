Feature: launching of etext by teacher

Background:
Given instructor is logged into application
When user access course
Then Course Home page should display

@etext
Scenario: To Add eTextLink in course material tab by ECollege Teacher
When I navigate to the Course Materials tab
Then I should be on the Course Materials page
When I click on the Add Course Materials option
And I click on the Add eText Link activity type
And I create eText link 
Then I should see the successfull message eText link saved successfully