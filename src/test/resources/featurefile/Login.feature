Feature: Login Functionality

Scenario: Login with valid credentials
Given User is on login page
When User enters valid emaail address "anuragshrivastava007@gmail.com"
And User enter valid password "Password#23"
And User clicks on Login Button
Then User should login successfully

Scenario: Login with invalid credentials
Given User is on login page
When User enters invalid emaail address "email"
And User enter invalid password "1234"
And User clicks on Login Button
Then User should  not login successfully and see an error message 