Feature: Booking functionality in the adaction application 

@SmokeTest
Scenario Outline: Verify the user is able to login the application 
	Given User launches the Application 
	When User enters the valid "<username>" in the username field 
	And User enters the valid "<password>" in the password field 
	And User clicks on the login button 
	Then User verifies weather the homepage navigates to the search hotel page 
	
	Examples:
	|username|password|
	|AAA|111|
	|BBB|222|
	|charanm3|helloworld|
	
Scenario: To verify if the user is able to Search Hotels 
	When User selects the Location of the hotel 
	And User selects Hotel Name 
	And User selects Room Type 
	And User selects Number of rooms 
	And User selects Check In Date 
	And User selects Check Out Date 
	And User selects Number of Adults 
	And User selects Number of Children 
	And User clicks on the Search button 
	Then User verifies weather the Search Hotel page navigates to Hotel Confirmation page 
	
Scenario: To verify if the user is able to Confirm Hotel selection 
	When User clicks on selected Hotel Information for Confirmation 
	And User clicks on Continue button 
	Then User verifies weather the Hotel Confirmation page navigates to Payment details page 
	
	
Scenario: To verify if user is able to fill in Billing Details 
	When User enters First Name in first name field 
	And User enters Last name in last name field 
	And User enters Billing Address in billing address field 
	And User enters Credit card number 
	And User select Credit Card type 
	And User selects Expiry Month 
	And User selects Expiry Year 
	And User enters CVV number 
	And User clicks on Book Now 
	Then User verifies weather the Booking is confirmed 
	
Scenario: Check booking details and logout 
	When User clicks on Logout 
	Then User verifies if the his account is logged out 