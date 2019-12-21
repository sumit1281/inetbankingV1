package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	
WebDriver ldriver;
	
	public AddNewCustomer(WebDriver rdriver)
	
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath ="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement NewCustomer;
	
	@FindBy(name="name")
	@CacheLookup
	WebElement CustomerName;
	
	@FindBy(name="rad1")
	@CacheLookup
	WebElement Gender;
	
	@CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	WebElement DOB;
	
	@FindBy(name="addr")
	@CacheLookup
	WebElement Address;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement City;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement State;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement PinNo;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement MobileNo;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement Email;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement Password;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "sub")
	WebElement btnSubmit;
	
	public void clickNewCustomer() {
		NewCustomer.click();
	}
	
	public void setNewCustName(String custname) {
		CustomerName.sendKeys(custname);
	}
	
	public void selectGender(String gender) {
		Gender.click();
	}
	
	public void dob(String mm,String dd,String yyyy) {
		DOB.sendKeys(mm);
		DOB.sendKeys(dd);
		DOB.sendKeys(yyyy);
		
	}
	
	public void setAddress(String address) {
		Address.sendKeys(address);
	}
	
	public void setCity(String city) {
		City.sendKeys(city);
	}
	
	public void setState(String state) {
		State.sendKeys(state);
	}

	public void setPinNo(String pinno) {
		PinNo.sendKeys(String.valueOf(pinno));
	}

	public void settelephoneno(String telephoneno) {
		MobileNo.sendKeys(telephoneno);
	}

	public void setemailid(String emailid) {
		Email.sendKeys(emailid);
	}

	public void setpassword(String password) {
		Password.sendKeys(password);
	}

	public void clicksubmit() {
		btnSubmit.click();
	}
	}
