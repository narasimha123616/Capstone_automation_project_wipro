Feature: check user is able to login with valid credetials in the Ebay
Scenario: successful login process 
Given  Ebay login should be open in the default browser
When click on username button and enter valid email
And add the password
And click on ok button
Then login successfully and open home page in the ebay website