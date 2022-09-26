Feature: Login 

Scenario Outline: Login with  credentials DDT

Given User Launch Chrome Browser
When User open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And User enters Email as "<email>" and Password as "<password>"
And Click on Remember Me check box
And Click on Login button
Then Page title should be "Dashboard / nopCommerce administration"
And LogOut

Examples:
|email|password|
|admin@yourstore.com|admin|
