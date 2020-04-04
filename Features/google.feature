Feature: Testing Google Homepage
Scenario: Testing Search Functionality of Google Homepage
Given User opens "https://www.google.com" url
When User enters "Selenium" in the search box
And User selects first option
Then Result page should appear