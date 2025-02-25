Feature: Login Functionality & Creating a New Account in Salesforce Application

Scenario: Login with Valid Credentials

Given Launch the browser for Salesforce
And Load the 'https://login.salesforce.com/'
And Enter the username as 'vidyar@testleaf.com'
And Enter the password as 'Sales@123'
When Click on the login button
And Click on the toggle
And Click on the View All
And Click on Sales
And Click on Account
And Click on New button
And Enter your name as 'Danam'
And Select ownership as Public
And Click on Save
Then Verify Account Name