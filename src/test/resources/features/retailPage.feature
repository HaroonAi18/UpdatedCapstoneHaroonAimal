Feature: retail Pagefeature


Background:
Given User is on Retail website login 
And User click  on MyAccount retail
When  User click on Login retial
And User enter username ‘userName’ and password 'password’
And User click on Login button retail feature
Then User should be logged in to MyAccount dashboard

@FirstRetail
Scenario: Register as an Affiliate user with Cheque Payment Method.
When User click on ‘Register for an Affiliate Account’ link 
And User fill affiliate form with below information
And User check on About us check box 
And User click on Continue button retail first
Then User should see a success message retail

@secondScenarioRetail
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on ‘Edit your affiliate informationlink 
And user click on Bank Transfer radio button
And User fill Bank information with below information retail page
And User click on Continue button retail page third scene
Then User should see a success message retail third

@thirdScenarioRetail
Scenario: Edit your account Information
When User click on ‘Edit your account information’ link
And User modify below information thrid scenario retail
And User click on continue button reail featreu
Then User should see a message ‘Success: Your account has been successfully updated.’
