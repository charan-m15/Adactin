$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking functionality in the adaction application",
  "description": "",
  "id": "booking-functionality-in-the-adaction-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify the user is able to login the application",
  "description": "",
  "id": "booking-functionality-in-the-adaction-application;verify-the-user-is-able-to-login-the-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launches the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters the valid \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters the valid \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User verifies weather the homepage navigates to the search hotel page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "booking-functionality-in-the-adaction-application;verify-the-user-is-able-to-login-the-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "booking-functionality-in-the-adaction-application;verify-the-user-is-able-to-login-the-application;;1"
    },
    {
      "cells": [
        "AAA",
        "111"
      ],
      "line": 13,
      "id": "booking-functionality-in-the-adaction-application;verify-the-user-is-able-to-login-the-application;;2"
    },
    {
      "cells": [
        "BBB",
        "222"
      ],
      "line": 14,
      "id": "booking-functionality-in-the-adaction-application;verify-the-user-is-able-to-login-the-application;;3"
    },
    {
      "cells": [
        "charanm3",
        "helloworld"
      ],
      "line": 15,
      "id": "booking-functionality-in-the-adaction-application;verify-the-user-is-able-to-login-the-application;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Verify the user is able to login the application",
  "description": "",
  "id": "booking-functionality-in-the-adaction-application;verify-the-user-is-able-to-login-the-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launches the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters the valid \"AAA\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters the valid \"111\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User verifies weather the homepage navigates to the search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_launches_the_Application()"
});
formatter.result({
  "duration": 3455904400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 23
    }
  ],
  "location": "Stepdefinition.user_enters_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 158763100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "111",
      "offset": 23
    }
  ],
  "location": "Stepdefinition.user_enters_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 107654300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 471984000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_verifies_weather_the_homepage_navigates_to_the_search_hotel_page()"
});
formatter.result({
  "duration": 17800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify the user is able to login the application",
  "description": "",
  "id": "booking-functionality-in-the-adaction-application;verify-the-user-is-able-to-login-the-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launches the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters the valid \"BBB\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters the valid \"222\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User verifies weather the homepage navigates to the search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_launches_the_Application()"
});
formatter.result({
  "duration": 317880100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BBB",
      "offset": 23
    }
  ],
  "location": "Stepdefinition.user_enters_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 102088100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "222",
      "offset": 23
    }
  ],
  "location": "Stepdefinition.user_enters_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 110047500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 432702800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_verifies_weather_the_homepage_navigates_to_the_search_hotel_page()"
});
formatter.result({
  "duration": 19100,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify the user is able to login the application",
  "description": "",
  "id": "booking-functionality-in-the-adaction-application;verify-the-user-is-able-to-login-the-application;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launches the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters the valid \"charanm3\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters the valid \"helloworld\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User verifies weather the homepage navigates to the search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_launches_the_Application()"
});
formatter.result({
  "duration": 309430300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "charanm3",
      "offset": 23
    }
  ],
  "location": "Stepdefinition.user_enters_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 104209100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "helloworld",
      "offset": 23
    }
  ],
  "location": "Stepdefinition.user_enters_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 100723900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 3422727800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_verifies_weather_the_homepage_navigates_to_the_search_hotel_page()"
});
formatter.result({
  "duration": 14500,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "To verify if the user is able to Search Hotels",
  "description": "",
  "id": "booking-functionality-in-the-adaction-application;to-verify-if-the-user-is-able-to-search-hotels",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "User selects the Location of the hotel",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User selects Hotel Name",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User selects Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User selects Number of rooms",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User selects Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User selects Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User selects Number of Adults",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User selects Number of Children",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User clicks on the Search button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User verifies weather the Search Hotel page navigates to Hotel Confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_selects_the_Location_of_the_hotel()"
});
formatter.result({
  "duration": 120877400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_selects_Hotel_Name()"
});
formatter.result({
  "duration": 106003800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_selects_Room_Type()"
});
formatter.result({
  "duration": 99908300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_selects_Number_of_rooms()"
});
formatter.result({
  "duration": 99831800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_selects_Check_In_Date()"
});
formatter.result({
  "duration": 102159100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_selects_Check_Out_Date()"
});
formatter.result({
  "duration": 99944600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_selects_Number_of_Adults()"
});
formatter.result({
  "duration": 103496500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_selects_Number_of_Children()"
});
formatter.result({
  "duration": 96974400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_clicks_on_the_Search_button()"
});
formatter.result({
  "duration": 877025700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_verifies_weather_the_Search_Hotel_page_navigates_to_Hotel_Confirmation_page()"
});
formatter.result({
  "duration": 11100,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "To verify if the user is able to Confirm Hotel selection",
  "description": "",
  "id": "booking-functionality-in-the-adaction-application;to-verify-if-the-user-is-able-to-confirm-hotel-selection",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "User clicks on selected Hotel Information for Confirmation",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "User clicks on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User verifies weather the Hotel Confirmation page navigates to Payment details page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_clicks_on_selected_Hotel_Information_for_Confirmation()"
});
formatter.result({
  "duration": 69658700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_clicks_on_Continue_button()"
});
formatter.result({
  "duration": 807211500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_verifies_weather_the_Hotel_Confirmation_page_navigates_to_Payment_details_page()"
});
formatter.result({
  "duration": 16200,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "To verify if user is able to fill in Billing Details",
  "description": "",
  "id": "booking-functionality-in-the-adaction-application;to-verify-if-user-is-able-to-fill-in-billing-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "User enters First Name in first name field",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User enters Last name in last name field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User enters Billing Address in billing address field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User enters Credit card number",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User select Credit Card type",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User selects Expiry Month",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User selects Expiry Year",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User enters CVV number",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User clicks on Book Now",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User verifies weather the Booking is confirmed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_enters_First_Name_in_first_name_field()"
});
formatter.result({
  "duration": 112026500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enters_Last_name_in_last_name_field()"
});
formatter.result({
  "duration": 96662300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enters_Billing_Address_in_billing_address_field()"
});
formatter.result({
  "duration": 107570300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enters_Credit_card_number()"
});
formatter.result({
  "duration": 109152900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_select_Credit_Card_type()"
});
formatter.result({
  "duration": 101976200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_selects_Expiry_Month()"
});
formatter.result({
  "duration": 97203000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_selects_Expiry_Year()"
});
formatter.result({
  "duration": 102371500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enters_CVV_number()"
});
formatter.result({
  "duration": 109683400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_clicks_on_Book_Now()"
});
formatter.result({
  "duration": 80028100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_verifies_weather_the_Booking_is_confirmed()"
});
formatter.result({
  "duration": 11500,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Check booking details and logout",
  "description": "",
  "id": "booking-functionality-in-the-adaction-application;check-booking-details-and-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 48,
  "name": "User clicks on Logout",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "User verifies if the his account is logged out",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_clicks_on_Logout()"
});
formatter.result({
  "duration": 6261812300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_verifies_if_the_his_account_is_logged_out()"
});
formatter.result({
  "duration": 12400,
  "status": "passed"
});
});