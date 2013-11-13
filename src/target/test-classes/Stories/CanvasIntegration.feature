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