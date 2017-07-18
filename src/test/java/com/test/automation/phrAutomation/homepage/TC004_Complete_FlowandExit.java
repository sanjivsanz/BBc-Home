package com.test.automation.phrAutomation.homepage;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.phrAutomation.testBase.TestBase;
import com.test.automation.phrAutomation.uiActions.HomePage;
import com.test.automation.phrAutomation.uiActions.ShraActions;

public class TC004_Complete_FlowandExit extends TestBase {

	public static final Logger log = Logger.getLogger(TC004_Complete_FlowandExit.class.getName());
	HomePage homepage;
	ShraActions shractions;
	
	@BeforeTest
	public void setUp() throws IOException {
		init();
	}

	@Test
	public void Complete_FlowandExit() throws InterruptedException {
		homepage = new HomePage(driver);
		homepage.loginToApplication("sanjanasanz143@gmail.com", "6387891l");
		/*
		homepage.LoginandInsertValuesinSHRAwithYBp(5, 4, 68, 120, 110);
		shractions = new ShraActions(driver);
		shractions.PersonalHealthValuesCheckboxes();
		shractions.FamilyHealthValuesCheckboxes();
		shractions.DibeticProfileNO();
		shractions.DibeticProfileYESvalues(80,100,65,70);
		shractions.LipidProfileNO();
		shractions.LipidProfileYesValues(60,80,60,50,100);
		shractions.GenralHLifeStyle();
		shractions.GenralSocialWellness();
		*/
		shractions = new ShraActions(driver);
	//shractions.OccupationalWellnessGENRAL();
	//shractions.OccupationalWellnessBPO();
			
	//shractions.OccupationalWellnessIT();
		
		
		
		
		shractions.WomensHealth();
		shractions.CheckupActions();
		

		
	}

	@AfterClass
	public void endTest() {
		// driver.close();
	}

}
