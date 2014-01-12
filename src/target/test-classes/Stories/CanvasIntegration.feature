@canvas
Feature: Canvas integration with pegasus

Scenario: Upon canvas instructor logs in he should see the home page
Given canvas user enter username and password
When clicks on sign in button
Then user should see home page
When user access the course
And Click on Settings Clicks
And Access Apps link
When instructor click on View installed apps button
And clicks on Add New App button
And Fill the External tool form with required data

@Scenario1
Scenario: Course creation by canvas teacher
Given user is on the global home page
When user click on Start a new course button
Then Start a new Course light box should display
When user enters course name
And Click on Create course button
Then Course should get created successfully