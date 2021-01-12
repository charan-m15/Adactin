package com.adactin.scenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ConfirmHotelSelection {

	public static WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton_0;

	@FindBy(className = "reg_button") 
	private WebElement reg_button;

	public ConfirmHotelSelection(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinue() {
		return reg_button;
	}
}
