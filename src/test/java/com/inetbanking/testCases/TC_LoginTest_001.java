package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	
	@Test
	public void LoginTest() throws InterruptedException, IOException {
	
		logger.info("URL is opened");

		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername(uname);
		logger.info("UserName is entered");
		lp.setPassword(password);
		logger.info("Password is entered");
		lp.click();
		logger.info("Login button is clicked");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"LoginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
		
	}
	
	}
