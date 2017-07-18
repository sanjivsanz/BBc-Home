package com.test.automation.phrAutomation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.test.automation.phrAutomation.testBase.TestBase;

public class HomePage extends TestBase {

	public static final Logger log = Logger.getLogger(HomePage.class.getName());
	WebDriver driver;

	@FindBy(xpath = "//*[@id='btnMain']")
	WebElement signIn;

	@FindBy(xpath = "//*[@id='txtUserName']")
	WebElement loginEmailAddress;

	@FindBy(xpath = "//*[@id='txtPassword']")
	WebElement loginPassword;

	@FindBy(xpath = "//*[@id='btnLoginSubmit']")
	WebElement submitButton;

	@FindBy(xpath = "//*[@id='spanMessage']")
	WebElement authenticationFailed;

	@FindBy(xpath = "//*[@id='takeHRA']/a/div[2]/h1")
	WebElement StartHRA;

	@FindBy(xpath = "//*[@id='txtFt']")
	WebElement hfeet;

	@FindBy(xpath = "//*[@id='txtInch']")
	WebElement inches;

	@FindBy(xpath = "//*[@id='txtWeight']")
	WebElement Weight;

	@FindBy(xpath = "//*[@id='divKNWBPNUM_86_NO']/div/ins")
	WebElement NoBp;

	@FindBy(xpath = "//*[@id='divKNWBPNUM_86_YES']/div/ins")
	WebElement YesBp;

	@FindBy(xpath = "//*[@id='txtSystolic']")
	WebElement Systolic;

	@FindBy(xpath = "//*[@id='txtDiastolic']")
	WebElement Diastolic;

	@FindBy(xpath = "//*[@id='hrastep2']/div/div")
	WebElement Clickoutside;

	@FindBy(xpath = "//*[@id='btnNext']")
	WebElement Next;

	@FindBy(xpath = "//*[@id='mnuLoginStatus']/li[2]/a")
	WebElement LogoutDropdown;

	@FindBy(xpath = "//*[@id='listFamilyMemb']/li[5]/a")
	WebElement Logout;

	@FindBy(xpath = "//*[@id='dashWellness']/section[3]/div/div/div[1]/a/span")
	WebElement LogoutDisplay;
	
	
	@FindBy(xpath = "html/body/div[11]/div/div/div[3]/button[1]")
	WebElement StartNEWHRA;
	
	
	@FindBy(xpath = "//*[@id='profile-main']/ul/li[1]/a")
	WebElement StartVitals;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginToApplication(String emailAdress, String password) throws InterruptedException {
		Thread.sleep(5000);
		signIn.click();
		log.info("cliked on sign in and object is:-" + signIn.toString());
		loginEmailAddress.sendKeys(emailAdress);
		log.info("entered email address:-" + emailAdress + " and object is " + loginEmailAddress.toString());
		Thread.sleep(5000);
		loginPassword.sendKeys(password);
		log.info("entered password:-" + password + " and object is " + loginPassword.toString());
		Thread.sleep(5000);
		submitButton.click();
		log.info("clicked on sublit button and object is:-" + submitButton.toString());
		log.info("++++++++++++++++++Logged in Sucessfully++++++++++++++++++++++");
		Thread.sleep(15000);
		//Just for testing.
		StartHRA.click();
		log.info("clicked SHRA button and object is:-" + StartHRA.toString());
		Thread.sleep(5000);
		
		try {
			if(StartNEWHRA.isDisplayed()){
				StartNEWHRA.click();
				log.info("clicked StartNEWHRA button and object is:-" + StartNEWHRA.toString());
				Thread.sleep(5000);
			}
			else
				StartVitals.click();
			log.info("clicked StartVitals button and object is:-" + StartVitals.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
			
		
	//	Start a New HRA OPtions If it is already Filled: 
			
		//	Xpath for the new HRA: html/body/div[11]/div/div/div[3]/button[1]
				
				
				
		
		
		
	}

	public void LoginandInsertValuesinSHRAwithYBp(int Hfeet, int Hinch, int weight, int BpS, int BpD)
			throws InterruptedException {

		Thread.sleep(15000);
		StartHRA.click();
		Thread.sleep(5000);
		log.info("clicked SHRA button and object is:-" + StartHRA.toString());
		hfeet.clear();
		Thread.sleep(3000);
		hfeet.sendKeys(Integer.toString(Hfeet));
		log.info("Entered the hfeet value:-" + Hfeet);
		inches.clear();
		Thread.sleep(3000);
		inches.sendKeys(Integer.toString(Hinch));
		Weight.clear();
		log.info("Entered the inches value:-" + Hinch);
		Thread.sleep(3000);
		Weight.sendKeys(Integer.toString(weight));
		log.info("Entered the weight value:-" + weight);
		YesBp.click();
		Systolic.clear();
		Thread.sleep(3000);
		Systolic.sendKeys(Integer.toString(BpS));
		log.info("Entered the Systolic value:-" + BpS);
		Diastolic.clear();
		Thread.sleep(3000);
		Diastolic.sendKeys(Integer.toString(BpD));
		log.info("Entered the Diastolic value:-" + BpD);
		Clickoutside.click();
		Thread.sleep(5000);
		log.info("Clicked on Clickoutside Sucessfully:-" + Clickoutside.toString());
		Next.click();
		log.info("Clicked on Next Sucessfully:-" + Next.toString());
		Thread.sleep(5000);
	}

	public void InsertValuesinSHRAwithNoBp(int Hfeet, int Hinch, int weight) throws InterruptedException {
		Thread.sleep(10000);
		StartHRA.click();
		Thread.sleep(8000);
		log.info("clicked SHRA button and object is:-" + StartHRA.toString());
		hfeet.clear();
		Thread.sleep(5000);
		hfeet.sendKeys(Integer.toString(Hfeet));
		log.info("Entered the hfeet value:-" + Hfeet);
		inches.clear();
		Thread.sleep(2000);
		inches.sendKeys(Integer.toString(Hinch));
		Weight.clear();
		log.info("Entered the inches value:-" + Hinch);
		Thread.sleep(5000);
		Weight.sendKeys(Integer.toString(weight));
		log.info("Entered the weight value:-" + weight);
		NoBp.click();
		Thread.sleep(5000);
		Clickoutside.click();
		log.info("Clicked outside Sucessfully:-" + Clickoutside.toString());
		Thread.sleep(5000);
		Next.click();
		log.info("Clicked on Next Sucessfully:-" + Next.toString());
	}

	public String getInvalidLoginText() {
		log.info("erorr message is:-" + authenticationFailed.getText());
		return authenticationFailed.getText();
	}

	public boolean verifyLogoutDisplay() {
		try {
			LogoutDisplay.isDisplayed();
			log.info(" logout is displayed-" + LogoutDisplay.toString());
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public void VerifyLoginAndLogout(String emailAdress, String password) throws InterruptedException {
		Thread.sleep(5000);
		signIn.click();
		log.info("cliked on sign in and object is:-" + signIn.toString());
		Thread.sleep(5000);
		loginEmailAddress.sendKeys(emailAdress);
		log.info("entered email address:-" + emailAdress + " and object is " + loginEmailAddress.toString());
		Thread.sleep(2000);
		loginPassword.sendKeys(password);
		log.info("entered password:-" + password + " and object is " + loginPassword.toString());
		Thread.sleep(5000);
		submitButton.click();
		log.info("clicked on sublit button and object is:-" + submitButton.toString());
		Thread.sleep(5000);
		log.info(" Enterd password and emailid Sucessfully:-");

	}

	public void clickOnLogout() throws InterruptedException {
		// waitForElement(300,LogoutDropdown);
		Thread.sleep(5000);
		LogoutDropdown.click();
		log.info(" clicked on Selecct box:-");
		// waitForElement(300,Logout);
		Thread.sleep(5000);
		Logout.click();

		log.info(" Logout sucessfully-");

	}

	
	
	
	
	
	
	
	
	
}
