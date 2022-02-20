Feature: HomePage

Background:
Given User is on Retail website home feature



@hoemfirst
Scenario: User verify currency values change
When User click on Currency 
And User Chose Euro from dropdown 
Then currency value should change to Euro

@homeSecond
Scenario: User empty Shopping cart message displays
When User click on shopping cart home page 
Then “Your shopping cart is empty!” message should display
