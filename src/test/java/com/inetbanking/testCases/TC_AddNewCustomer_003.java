package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddNewCustomer;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddNewCustomer_003 extends BaseClass  {
	
	@Test
	public void AddNewCustomer () throws InterruptedException, IOException {
		
		logger.info("URL is opened");

		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername(uname);
		logger.info("UserName is entered");
		lp.setPassword(password);
		logger.info("Password is entered");
		lp.click();
		logger.info("Login button is clicked");
		
		Thread.sleep(5000);
		
		AddNewCustomer add = new AddNewCustomer(driver);
		add.clickNewCustomer();
		add.setNewCustName("Sumit");
		add.selectGender("female");
		add.dob("10","10","1985");
		add.setAddress("ABCD");
		add.setCity("Gurgaon");
		add.setState("HR");
		add.setPinNo("122001");
		add.settelephoneno("9311370374");
		
		String email=randomestring()+"@gmail.com";
		add.setemailid(email);
		add.setpassword("xyz");
		add.clicksubmit();
		
Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
			}
	
	}
