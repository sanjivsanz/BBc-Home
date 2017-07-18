package com.test.automation.phrAutomation.homepage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
//import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.relevantcodes.extentreports.LogStatus;
import com.test.automation.phrAutomation.testBase.TestBase;
import com.test.automation.phrAutomation.uiActions.HomePage;

public class TC001_VerifyLoginWithInvalidCredentials extends TestBase {

	public static final Logger log = Logger.getLogger(TC001_VerifyLoginWithInvalidCredentials.class.getName());
	HomePage homepage;

	@BeforeTest
	public void setUp() throws IOException {
		init();

	}
	
	

	@Test
	public void VerifyLoginWithInvalidCredentials() throws InterruptedException  {
		log.info("++++++++++ Starting VerifyLoginWithInvalidCredentials Test+++++++++++++");
		homepage = new HomePage(driver);
		homepage.loginToApplication("sanjiv139@gmail.com", "6387891ll");
		String actual= homepage.getInvalidLoginText();
		log.info("The error message is -"+actual.toString());
		String expected = "Invalid Username / Password";
		Assert.assertEquals(expected,actual);
		log.info("++++++++++++ Finished VerifyLoginWithInvalidCredentials Test+++++++++++++++");

	}

	@AfterClass
	public void endTest() {
		driver.close();
	}
	
	
	}

