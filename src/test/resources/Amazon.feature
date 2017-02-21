Feature: Order a watch in Amazon
In Order to buy a Watch
As a Customer 
Need to open Amazon
@mytest
Scenario: Ordering a watch from Amazon 
Given Search for "Fossil Watches" on amazon
When Select "Best Watch"
Then Click on "Add to Cart" after selecting product
Then Click on "Buy" within cart
And Click "Submit" button
