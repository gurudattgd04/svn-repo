Feature: Integration point ID generation for course to integrate with eCollege

Scenario1: Associate Course to the General Product By Selecting eCollege Delivery Preference by Cs Admin
When I search the "MySpanishLabMaster" course in coursespace
Then I should be able to see the searched "MySpanishLabMaster" course in the left frame
When I select course in left frame
And I select product type "HedCoreGeneral" in right frame
When I associate the course to product by selecting "eCollege" delivery preference
Then I should see the successfull message "Approved courses programmed successfully."
When I "Sign out" from the "HedCsAdmin"
Then I should see the successfull message "You have been signed out of the application."