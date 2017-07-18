package com.test.automation.phrAutomation.homepage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.test.automation.phrAutomation.testBase.TestBase;
import com.test.automation.phrAutomation.uiActions.HomePage;

public class TC002_VerifySHRAnBP extends TestBase {

	public static final Logger log = Logger.getLogger(TC002_VerifySHRAnBP.class.getName());
	HomePage homepage;

	/*
	 * @DataProvider(name="LogindatawithNbp") public String [][] getTestData(){
	 * String[][] testRecords = getData("TestData.xlsx","LoginTestData"); return
	 * testRecords; }
	 */

	@BeforeTest
	public void setUp() throws IOException {
		init();

	}

	@Test
	public void SHRAwithNoBp() throws InterruptedException {
		
		homepage = new HomePage(driver);
		
		homepage.loginToApplication("sanjiv139@gmail.com", "6387891l");
		log.info("++++++++++ InsertValuesinSHRAwithNoBp Test+++++++++++++");
		homepage.InsertValuesinSHRAwithNoBp(4, 8, 72);
		log.info("++++++++++++ Finished LoginandInsertValuesinSHRAwithYBp Test+++++++++++++++");

	}

	@AfterClass
	public void endTest() {
		 driver.close();
	}
}
