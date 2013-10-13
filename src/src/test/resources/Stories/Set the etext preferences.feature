@etextpref
Feature: Set etext preferences

Scenario: Set the eText preference in Work Space
Given I am on the Global Home page
When I enter in the MySpanishLabMaster from the Global Home page as HedWsInstructor
And I navigate to the Preferences tab
Then I should be on the Preferences page
When I select LTI Tools sub tab
And I set the eText in enable state
Then I should see the successfull message Preferences updated successfully