package com.test.automation.phrAutomation.homepage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.automation.phrAutomation.testBase.TestBase;
import com.test.automation.phrAutomation.uiActions.HomePage;

public class TC003_VerifyLoginWithDiffrentRecords extends TestBase {

	public static final Logger log = Logger.getLogger(TC003_VerifyLoginWithDiffrentRecords.class.getName());
	HomePage homepage;

	@DataProvider(name = "LoginData")
	public String[][] getTestData() {
		String[][] testRecords = getData("TestData.xlsx", "LoginTestData");
		return testRecords;
	}

	@BeforeTest
	public void setUp() throws IOException {
		init();
	}

	@Test(dataProvider = "LoginData")
	public void VerifyLoginandLogout(String Username, String Password, String Runmode) throws InterruptedException {

		if (Runmode.equalsIgnoreCase("n")) {
			throw new SkipException("user marked this record as no run ");
		}
		log.info("++++++++++ Starting VerifyLoginandLogout Test+++++++++++++");
		homepage = new HomePage(driver);
		homepage.VerifyLoginAndLogout(Username, Password);
		boolean status = homepage.verifyLogoutDisplay();
		getScreenShot("TestLoginData" + Username);
		if (status) {
			homepage.clickOnLogout();
		}

		Assert.assertEquals(status, true);

	}

	@AfterClass
	public void endTest() {
		driver.close();
	}

}
