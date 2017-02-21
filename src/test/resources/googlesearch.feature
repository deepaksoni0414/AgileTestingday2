Feature: Google Search
Scenario: Name Search to see result count 
Given I have entered "Deepak Soni" in google
And Google is open in FireFox browser
And URL for Google is "https://www.google.co.in/"
When I click on google "Search"
Then Google Should display count below