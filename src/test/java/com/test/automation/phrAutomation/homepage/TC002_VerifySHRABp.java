package com.test.automation.phrAutomation.homepage;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.phrAutomation.testBase.TestBase;
import com.test.automation.phrAutomation.uiActions.HomePage;


public class TC002_VerifySHRABp extends TestBase {
	
	public static final Logger log = Logger.getLogger(TC001_VerifyLoginWithInvalidCredentials.class.getName());
	HomePage homepage;
	
	@BeforeTest
	public void setUp() throws IOException
	{
		init();
		
	}
    @Test
	public void SHRAwithYBp() throws InterruptedException 
	{
    	homepage = new HomePage(driver);
    	homepage.loginToApplication("sanjiv139@gmail.com", "6387891l");
    	log.info("++++++++++ Starting LoginandInsertValuesinSHRAwithYBp Test+++++++++++++");
    	homepage.LoginandInsertValuesinSHRAwithYBp(4,8,72,100,120);
    	log.info("++++++++++++ Finished LoginandInsertValuesinSHRAwithYBp Test+++++++++++++++");
	
	
	}
	@AfterClass
	public void endTest()
	{
		 driver.close();
	}
}
