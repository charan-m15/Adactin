package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Baseclass;
import com.adactin.filereadermanager.FileReaderManager;
import com.adactin.helper.ConfigurationReader;
import com.adactin.scenario.BillingDetails;
import com.adactin.scenario.ConfirmHotelSelection;
import com.adactin.scenario.Login;
import com.adactin.scenario.Logout;
import com.adactin.scenario.SearchHotel;
import com.adactin.testrunner.Runner;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class Stepdefinition extends Baseclass {

	public static WebDriver driver = Runner.driver;

	@Given("^User launches the Application$")
	public void user_launches_the_Application() throws Throwable {

		/*
		 * driver = getBrowser("chrome"); getUrl("http://adactinhotelapp.com/");
		 */

		/*
		 * ConfigurationReader cr = new ConfigurationReader(); String url = cr.getUrl();
		 * getUrl(url);
		 */

		String url = FileReaderManager.getInstance().getCrInstance().getUrl();
		getUrl(url);

	}

	/*
	 * @When("^User enters the valid username in the username field$") 
	 * public void user_enters_the_valid_username_in_the_username_field() throws Throwable {
	 * Login l = new Login(driver); 
	 * inputToElement(l.getUsername(), "charanm3"); }
	 * 
	 * @When("^User enters the valid password in the password field$") 
	 * public void user_enters_the_valid_password_in_the_password_field() throws Throwable {
	 * Login l = new Login(driver); 
	 * inputToElement(l.getPassword(), "helloworld");
	 * }
	 */

	@When("^User enters the valid \"([^\"]*)\" in the username field$")
	public void user_enters_the_valid_in_the_username_field(String username) throws Throwable {
		Login l = new Login(driver);
		inputToElement(l.getUsername(), username);
	}

	@When("^User enters the valid \"([^\"]*)\" in the password field$")
	public void user_enters_the_valid_in_the_password_field(String password) throws Throwable {
		Login l = new Login(driver);
		inputToElement(l.getPassword(), password);
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {

		Login l = new Login(driver);
		inputToClick(l.getLogin());

	}

	@Then("^User verifies weather the homepage navigates to the search hotel page$")
	public void user_verifies_weather_the_homepage_navigates_to_the_search_hotel_page() throws Throwable {

	}

	@When("^User selects the Location of the hotel$")
	public void user_selects_the_Location_of_the_hotel() throws Throwable {

		SearchHotel s = new SearchHotel(driver);
		selectDropDown(s.getLocation(), "value", "Adelaide");

	}

	@When("^User selects Hotel Name$")
	public void user_selects_Hotel_Name() throws Throwable {

		SearchHotel s = new SearchHotel(driver);
		selectDropDown(s.getHotels(), "value", "Hotel Sunshine");

	}

	@When("^User selects Room Type$")
	public void user_selects_Room_Type() throws Throwable {

		SearchHotel s = new SearchHotel(driver);
		selectDropDown(s.getRoom_type(), "value", "Double");

	}

	@When("^User selects Number of rooms$")
	public void user_selects_Number_of_rooms() throws Throwable {

		SearchHotel s = new SearchHotel(driver);
		selectDropDown(s.getRoom_nos(), "value", "3");

	}

	@When("^User selects Check In Date$")
	public void user_selects_Check_In_Date() throws Throwable {

		SearchHotel s = new SearchHotel(driver);
		inputToElement(s.getDatepick_in(), "06/01/20");

	}

	@When("^User selects Check Out Date$")
	public void user_selects_Check_Out_Date() throws Throwable {

		SearchHotel s = new SearchHotel(driver);
		inputToElement(s.getDatepick_out(), "08/01/20");

	}

	@When("^User selects Number of Adults$")
	public void user_selects_Number_of_Adults() throws Throwable {

		SearchHotel s = new SearchHotel(driver);
		selectDropDown(s.getAdult_room(), "value", "2");

	}

	@When("^User selects Number of Children$")
	public void user_selects_Number_of_Children() throws Throwable {

		SearchHotel s = new SearchHotel(driver);
		selectDropDown(s.getChild_room(), "value", "2");

	}

	@When("^User clicks on the Search button$")
	public void user_clicks_on_the_Search_button() throws Throwable {

		SearchHotel s = new SearchHotel(driver);
		inputToClick(s.getSubmit());

	}

	@Then("^User verifies weather the Search Hotel page navigates to Hotel Confirmation page$")
	public void user_verifies_weather_the_Search_Hotel_page_navigates_to_Hotel_Confirmation_page() throws Throwable {

	}

	@When("^User clicks on selected Hotel Information for Confirmation$")
	public void user_clicks_on_selected_Hotel_Information_for_Confirmation() throws Throwable {

		ConfirmHotelSelection ch = new ConfirmHotelSelection(driver);
		inputToClick(ch.getRadiobutton_0());

	}

	@When("^User clicks on Continue button$")
	public void user_clicks_on_Continue_button() throws Throwable {

		ConfirmHotelSelection ch = new ConfirmHotelSelection(driver);
		inputToClick(ch.getContinue());

	}

	@Then("^User verifies weather the Hotel Confirmation page navigates to Payment details page$")
	public void user_verifies_weather_the_Hotel_Confirmation_page_navigates_to_Payment_details_page() throws Throwable {

	}

	@When("^User enters First Name in first name field$")
	public void user_enters_First_Name_in_first_name_field() throws Throwable {

		BillingDetails b = new BillingDetails(driver);
		inputToElement(b.getFirst_name(), "Charan");

	}

	@When("^User enters Last name in last name field$")
	public void user_enters_Last_name_in_last_name_field() throws Throwable {

		BillingDetails b = new BillingDetails(driver);
		inputToElement(b.getLast_name(), "Murali");

	}

	@When("^User enters Billing Address in billing address field$")
	public void user_enters_Billing_Address_in_billing_address_field() throws Throwable {

		BillingDetails b = new BillingDetails(driver);
		inputToElement(b.getAddress(), "Adyar, Chennai-20");
	}

	@When("^User enters Credit card number$")
	public void user_enters_Credit_card_number() throws Throwable {

		BillingDetails b = new BillingDetails(driver);
		inputToElement(b.getCc_num(), "1234567891234567");

	}

	@When("^User select Credit Card type$")
	public void user_select_Credit_Card_type() throws Throwable {

		BillingDetails b = new BillingDetails(driver);
		selectDropDown(b.getCc_type(), "value", "VISA");
	}

	@When("^User selects Expiry Month$")
	public void user_selects_Expiry_Month() throws Throwable {

		BillingDetails b = new BillingDetails(driver);
		selectDropDown(b.getCc_exp_month(), "value", "2");

	}

	@When("^User selects Expiry Year$")
	public void user_selects_Expiry_Year() throws Throwable {

		BillingDetails b = new BillingDetails(driver);
		selectDropDown(b.getCc_exp_year(), "value", "2022");

	}

	@When("^User enters CVV number$")
	public void user_enters_CVV_number() throws Throwable {

		BillingDetails b = new BillingDetails(driver);
		inputToElement(b.getCc_cvv(), "234");

	}

	@When("^User clicks on Book Now$")
	public void user_clicks_on_Book_Now() throws Throwable {

		BillingDetails b = new BillingDetails(driver);
		inputToClick(b.getBook_now());

	}

	@Then("^User verifies weather the Booking is confirmed$")
	public void user_verifies_weather_the_Booking_is_confirmed() throws Throwable {

	}

	@When("^User clicks on Logout$")
	public void user_clicks_on_Logout() throws Throwable {

		Logout l = new Logout(driver);
		inputToClick(l.getLogout());

	}

	@Then("^User verifies if the his account is logged out$")
	public void user_verifies_if_the_his_account_is_logged_out() throws Throwable {

	}

}
