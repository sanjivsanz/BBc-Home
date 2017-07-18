package com.test.automation.phrAutomation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

import com.test.automation.phrAutomation.testBase.TestBase;

public class ShraActions extends TestBase {

	public static final Logger log = Logger.getLogger(ShraActions.class.getName());
	WebDriver driver;

	@FindBy(xpath = ".//*[@id='DiabeticProf']/div[1]/div[2]/div[1]/input[1]")
	WebElement fbs;

	@FindBy(xpath = ".//*[@id='DiabeticProf']/div[2]/div[2]/div[1]/input[1]")
	WebElement rbs;

	@FindBy(xpath = ".//*[@id='DiabeticProf']/div[3]/div[2]/div[1]/input[1]")
	WebElement bs;

	@FindBy(xpath = ".//*[@id='DiabeticProf']/div[4]/div[2]/div[1]/input[1]")
	WebElement Hbs1c;

	@FindBy(xpath = ".//*[@id='divKNWLIPNUM_84_NO']/div/ins")
	WebElement LipidProfileN;

	@FindBy(xpath = ".//*[@id='divKNWDIANUM_85_NO']/div/ins")
	WebElement DibeticProfileN;

	@FindBy(xpath = ".//*[@id='divKNWDIANUM_85_YES']/div/ins")
	WebElement DibeticProfileY;

	@FindBy(xpath = ".//*[@id='divKNWLIPNUM_84_YES']/div/ins")
	WebElement LipidProfileY;

	@FindBy(xpath = "//*[@id='btnNext']")
	WebElement Next;

	@FindBy(xpath = "//*[@id='LipidProfile']/div[5]/div[2]/div[1]/input")
	WebElement HDL;

	@FindBy(xpath = "//*[@id='LipidProfile']/div[6]/div[2]/div[1]/input")
	WebElement LDL;
	@FindBy(xpath = "//*[@id='LipidProfile']/div[7]/div[2]/div[1]/input")
	WebElement Triglyceride;
	@FindBy(xpath = "//*[@id='LipidProfile']/div[8]/div[2]/div[1]/input")
	WebElement VLDL;
	@FindBy(xpath = "//*[@id='LipidProf']/div/div/div/input[1]")
	WebElement Total;

	@FindBy(xpath = ".//*[@id='div_5FRUIT']/div[1]/div/div/ins[1]")
	WebElement FruitA;
	@FindBy(xpath = ".//*[@id='div_5FRUIT']/div[2]/div/div/ins[1]")
	WebElement FruitU;
	@FindBy(xpath = ".//*[@id='div_5FRUIT']/div[3]/div/div/ins[1]")
	WebElement FruitS;
	@FindBy(xpath = ".//*[@id='div_5FRUIT']/div[4]/div/div/ins[1]")
	WebElement FruitN;

	@FindBy(xpath = ".//*[@id='div_FATFOOD']/div[1]/div/div/ins[1]")
	WebElement FatfoodA;
	@FindBy(xpath = ".//*[@id='div_FATFOOD']/div[2]/div/div/ins[1]")
	WebElement FatfoodU;
	@FindBy(xpath = ".//*[@id='div_FATFOOD']/div[3]/div/div/ins[1]")
	WebElement FatfoodS;
	@FindBy(xpath = ".//*[@id='div_FATFOOD']/div[4]/div/div/ins[1]")
	WebElement FatfoodN;

	@FindBy(xpath = ".//*[@id='div_PHYEXER']/div[1]/div/div/ins[1]")
	WebElement exerciseA;
	@FindBy(xpath = ".//*[@id='div_PHYEXER']/div[2]/div/div/ins[1]")
	WebElement exerciseU;
	@FindBy(xpath = ".//*[@id='div_PHYEXER']/div[3]/div/div/ins[1]")
	WebElement exerciseS;
	@FindBy(xpath = ".//*[@id='div_PHYEXER']/div[4]/div/div/ins[1]")
	WebElement exerciseN;

	@FindBy(xpath = ".//*[@id='div_PHYSLEEP']/div[1]/div/div/ins[1]")
	WebElement sleepA;
	@FindBy(xpath = ".//*[@id='div_PHYSLEEP']/div[2]/div/div/ins[1]")
	WebElement sleepU;
	@FindBy(xpath = ".//*[@id='div_PHYSLEEP']/div[3]/div/div/ins[1]")
	WebElement sleepS;
	@FindBy(xpath = ".//*[@id='div_PHYSLEEP']/div[4]/div/div/ins[1]")
	WebElement sleepN;

	@FindBy(xpath = ".//*[@id='div_HABIT']//div[1]/div[1]/div[1]/div[1]/ins")
	WebElement habitsNone;
	@FindBy(xpath = ".//*[@id='div_HABIT']//div[1]/div[2]/div[1]/div[1]/ins")
	WebElement habitsSmoking;
	@FindBy(xpath = ".//*[@id='div_HABIT']//div[2]/div[1]/div[1]/div[1]/ins")
	WebElement habitsTobacco;
	@FindBy(xpath = ".//*[@id='div_HABIT']//div[2]/div[2]/div[1]/div[1]/ins")
	WebElement habitsOther;
	@FindBy(xpath = ".//*[@id='div_HABIT']//div[3]/div[1]/div[1]/div[1]/ins")
	WebElement habitsPan;
	@FindBy(xpath = ".//*[@id='divOth86_OTHERS']/div[1]/div/ul/li[1]/input")
	WebElement habitsothers;

	@FindBy(xpath = ".//*[@id='div_SMOKECNT']//div[1]/div[1]/div[1]/div[1]/ins[1]")
	WebElement Cigarettes1;
	@FindBy(xpath = ".//*[@id='div_SMOKECNT']//div[2]/div[1]/div[1]/div[1]/ins[1]")
	WebElement Cigarettes3;
	@FindBy(xpath = ".//*[@id='div_SMOKECNT']//div[3]/div[1]/div[1]/div[1]/ins[1]")
	WebElement Cigarettes4;

	@FindBy(xpath = ".//*[@id='div_GENDRINK']//div[1]/div[1]/div[1]/div[1]/ins[1]")
	WebElement alcoholDontD;
	@FindBy(xpath = ".//*[@id='div_GENDRINK']//div[2]/div[1]/div[1]/div[1]/ins[1]")
	WebElement alcoholOccD;
	@FindBy(xpath = ".//*[@id='div_GENDRINK']//div[3]/div[1]/div[1]/div[1]/ins[1]")
	WebElement alcoholOfFD;

	@FindBy(xpath = ".//*[@id='div_DRINKCNT']//div[1]/div[1]/div[1]/div[1]/ins[1]")
	WebElement pegs1;
	@FindBy(xpath = ".//*[@id='div_DRINKCNT']//div[2]/div[1]/div[1]/div[1]/ins[1]")
	WebElement pegs3;
	@FindBy(xpath = ".//*[@id='div_DRINKCNT']//div[3]/div[1]/div[1]/div[1]/ins[1]")
	WebElement pegs4;

	@FindBy(xpath = ".//*[@id='div_GENOVER']//div[1]/div[1]/div[1]/div[1]/ins[1]")
	WebElement SatisfiedC;
	@FindBy(xpath = ".//*[@id='div_GENOVER']//div[2]/div[1]/div[1]/div[1]/ins[1]")
	WebElement SatisfiedM;
	@FindBy(xpath = ".//*[@id='div_GENOVER']//div[3]/div[1]/div[1]/div[1]/ins[1]")
	WebElement SatisfiedP;
	@FindBy(xpath = ".//*[@id='div_GENOVER']//div[4]/div[1]/div[1]/div[1]/ins[1]")
	WebElement SatisfiedNS;

	@FindBy(xpath = ".//*[@id='div_SOCSYSTM']//div[1]/div[1]/div[1]/div[1]/ins[1]")
	WebElement socialV;

	@FindBy(xpath = ".//*[@id='div_SOCSYSTM']//div[2]/div[1]/div[1]/div[1]/ins[1]")
	WebElement socialA;
	@FindBy(xpath = ".//*[@id='div_SOCSYSTM']//div[3]/div[1]/div[1]/div[1]/ins[1]")
	WebElement socialB;
	@FindBy(xpath = ".//*[@id='div_SOCSYSTM']//div[4]/div[1]/div[1]/div[1]/ins[1]")
	WebElement socialNS;

	@FindBy(xpath = ".//*[@id='div_PHYSTRES']//div[1]/div[1]/div[1]/div[1]/ins[1]")
	WebElement StressNo;
	@FindBy(xpath = ".//*[@id='div_PHYSTRES']//div[2]/div[1]/div[1]/div[1]/ins[1]")
	WebElement StressYes;

	@FindBy(xpath = ".//*[@id='divPHY']//div[1]/div[1]/div[1]/div[1]/ins[1]")
	WebElement stressedN;

	@FindBy(xpath = ".//*[@id='divPHY']//div[1]/div[2]/div[1]/div[1]/ins[1]")
	WebElement stressedD;

	@FindBy(xpath = ".//*[@id='divPHY']//div[1]/div[3]/div[1]/div[1]/ins[1]")
	WebElement stressedE;

	@FindBy(xpath = ".//*[@id='divPHY']//div[1]/div[4]/div[1]/div[1]/ins[1]")
	WebElement stressedF;

	@FindBy(xpath = ".//*[@id='divPHY']//div[2]/div[1]/div[1]/div[1]/ins[1]")
	WebElement stressedL;

	@FindBy(xpath = ".//*[@id='divPHY']//div[2]/div[2]/div[1]/div[1]/ins[1]")
	WebElement stressedO;

	@FindBy(xpath = ".//*[@id='divPHY']//div[2]/div[3]/div[1]/div[1]/ins[1]")
	WebElement stressedP;

	@FindBy(xpath = ".//*[@id='divPHY']//div[2]/div[4]/div[1]/div[1]/ins[1]")
	WebElement stressedOther;

	@FindBy(xpath = ".//*[@id='divOth66_OTHERS']/div[1]/div/ul/li[1]/input")
	WebElement stressedOtherT;

	@FindBy(xpath = ".//*[@id='divRightContent']")
	WebElement divRightContent;

	@FindBy(xpath = "//*[@id='profile-main']/ul/li[5]/a")
	WebElement GenralHealthsection;

	@FindBy(xpath = "//*[@id='GHTabs']/li[3]/a")
	WebElement OccupationalWellness;

	@FindBy(xpath = ".//*[@id='divOCCType']/div/button")
	WebElement SelectBoxOpen;

	@FindBy(xpath = ".//*[@id='divOCCType']/div/div/ul/li[2]/a")
	WebElement SelectGenral;
	@FindBy(xpath = ".//*[@id='divOCCType']/div/div/ul/li[3]/a")
	WebElement SelectBPO;
	@FindBy(xpath = ".//*[@id='divOCCType']/div/div/ul/li[4]/a")
	WebElement SelectIT;

	@FindBy(xpath = ".//*[@id='div_OCCEXTWRK']/div[1]/div/div/ins[1]")
	WebElement ExtraA;
	@FindBy(xpath = ".//*[@id='div_OCCEXTWRK']/div[2]/div/div/ins[1]")
	WebElement ExtraS;
	@FindBy(xpath = ".//*[@id='div_OCCEXTWRK']/div[3]/div/div/ins[1]")
	WebElement ExtraR;
	@FindBy(xpath = ".//*[@id='div_OCCEXTWRK']/div[4]/div/div/ins[1]")
	WebElement ExtraN;

	@FindBy(xpath = ".//*[@id='div_JPT']/div[1]/div/div/ins[1]")
	WebElement PaidA;
	@FindBy(xpath = ".//*[@id='div_JPT']/div[2]/div/div/ins[1]")
	WebElement PaidS;
	@FindBy(xpath = ".//*[@id='div_JPT']/div[3]/div/div/ins[1]")
	WebElement PaidR;
	@FindBy(xpath = ".//*[@id='div_JPT']/div[4]/div/div/ins[1]")
	WebElement PaidN;

	@FindBy(xpath = "//*[@id='div_BALWF']/div[1]/div/div/ins[1]")
	WebElement WlbA;
	@FindBy(xpath = "//*[@id='div_BALWF']/div[2]/div/div/ins[1]")
	WebElement WlbS;
	@FindBy(xpath = "//*[@id='div_BALWF']/div[3]/div/div/ins[1]")
	WebElement WlbR;
	@FindBy(xpath = "//*[@id='div_BALWF']/div[4]/div/div/ins[1]")
	WebElement WlbN;

	@FindBy(xpath = ".//*[@id='div_OCCPCTIM']/div[1]/div/div/ins[1]")
	WebElement PC8plusA;
	@FindBy(xpath = ".//*[@id='div_OCCPCTIM']/div[2]/div/div/ins[1]")
	WebElement PC8plusS;
	@FindBy(xpath = ".//*[@id='div_OCCPCTIM']/div[3]/div/div/ins[1]")
	WebElement PC8plusR;
	@FindBy(xpath = ".//*[@id='div_OCCPCTIM']/div[4]/div/div/ins[1]")
	WebElement PC8plusN;

	@FindBy(xpath = "//*[@id='div_OCCSHIFT']/div[1]/div/div/ins[1]")
	WebElement ShiftsA;
	@FindBy(xpath = "//*[@id='div_OCCSHIFT']/div[2]/div/div/ins[1]")
	WebElement ShiftsS;
	@FindBy(xpath = "//*[@id='div_OCCSHIFT']/div[3]/div/div/ins[1]")
	WebElement ShiftsR;
	@FindBy(xpath = "//*[@id='div_OCCSHIFT']/div[4]/div/div/ins[1]")
	WebElement ShiftsN;

	@FindBy(xpath = "//*[@id='div_OCCSPACE']/div[1]/div/div/ins[1]")
	WebElement SpaceA;
	@FindBy(xpath = "//*[@id='div_OCCSPACE']/div[2]/div/div/ins[1]")
	WebElement SpaceS;
	@FindBy(xpath = "//*[@id='div_OCCSPACE']/div[3]/div/div/ins[1]")
	WebElement SpaceR;
	@FindBy(xpath = "//*[@id='div_OCCSPACE']/div[4]/div/div/ins[1]")
	WebElement SpaceN;

	@FindBy(xpath = "//*[@id='div_OCCTALKLOT']/div[1]/div/div/ins[1]")
	WebElement TalkA;
	@FindBy(xpath = "//*[@id='div_OCCTALKLOT']/div[2]/div/div/ins[1]")
	WebElement TalkS;
	@FindBy(xpath = "//*[@id='div_OCCTALKLOT']/div[3]/div/div/ins[1]")
	WebElement TalkR;
	@FindBy(xpath = "//*[@id='div_OCCTALKLOT']/div[4]/div/div/ins[1]")
	WebElement TalkN;

	@FindBy(xpath = ".//*[@id='div_OCCFINPAIN']/div[1]/div/div/ins[1]")
	WebElement PainA;
	@FindBy(xpath = ".//*[@id='div_OCCFINPAIN']/div[2]/div/div/ins[1]")
	WebElement PainS;
	@FindBy(xpath = ".//*[@id='div_OCCFINPAIN']/div[3]/div/div/ins[1]")
	WebElement PainR;
	@FindBy(xpath = ".//*[@id='div_OCCFINPAIN']/div[4]/div/div/ins[1]")
	WebElement PainN;

	@FindBy(xpath = "//*[@id='div_OCCADJDESK']/div[1]/div/div/ins[1]")
	WebElement AdjustA;
	@FindBy(xpath = "//*[@id='div_OCCADJDESK']/div[2]/div/div/ins[1]")
	WebElement AdjustS;
	@FindBy(xpath = "//*[@id='div_OCCADJDESK']/div[3]/div/div/ins[1]")
	WebElement AdjustR;
	@FindBy(xpath = "//*[@id='div_OCCADJDESK']/div[4]/div/div/ins[1]")
	WebElement AdjustN;

	@FindBy(xpath = "//*[@id='div_OCCJOBINS']/div[1]/div/div/ins[1]")
	WebElement SecurityA;
	@FindBy(xpath = "//*[@id='div_OCCJOBINS']/div[2]/div/div/ins[1]")
	WebElement SecurityS;
	@FindBy(xpath = "//*[@id='div_OCCJOBINS']/div[3]/div/div/ins[1]")
	WebElement SecurityR;
	@FindBy(xpath = "//*[@id='div_OCCJOBINS']/div[4]/div/div/ins[1]")
	WebElement SecurityN;

	@FindBy(xpath = "//*[@id='div_OCCBORE']/div[1]/div/div/ins[1]")
	WebElement NarrowA;
	@FindBy(xpath = "//*[@id='div_OCCBORE']/div[2]/div/div/ins[1]")
	WebElement NarrowS;
	@FindBy(xpath = "//*[@id='div_OCCBORE']/div[3]/div/div/ins[1]")
	WebElement NarrowR;
	@FindBy(xpath = "//*[@id='div_OCCBORE']/div[4]/div/div/ins[1]")
	WebElement NarrowN;

	@FindBy(xpath = "//*[@id='div_OCCROLEUNC']/div[1]/div/div/ins[1]")
	WebElement ConflictA;
	@FindBy(xpath = "//*[@id='div_OCCROLEUNC']/div[2]/div/div/ins[1]")
	WebElement ConflictS;
	@FindBy(xpath = "//*[@id='div_OCCROLEUNC']/div[3]/div/div/ins[1]")
	WebElement ConflictR;
	@FindBy(xpath = "//*[@id='div_OCCROLEUNC']/div[4]/div/div/ins[1]")
	WebElement ConflictN;

	@FindBy(xpath = "//*[@id='div_GHCKPSCREEN']/div[1]/div/ins")
	WebElement HCheckLessOneYear;
	@FindBy(xpath = "//*[@id='div_GHCKPSCREEN']/div[2]/div/ins")
	WebElement HCheckMoreOneYear;
	@FindBy(xpath = "//*[@id='div_GHCKPSCREEN']/div[3]/div/ins")
	WebElement HCheckNone;

	@FindBy(xpath = "//*[@id='div_EYEEXAM']/div[1]/div/ins")
	WebElement ECheckLessOneYear;
	@FindBy(xpath = "//*[@id='div_EYEEXAM']/div[2]/div/ins")
	WebElement ECheckMoreOneYear;
	@FindBy(xpath = "//*[@id='div_EYEEXAM']/div[3]/div/ins")
	WebElement ECheckNone;

	@FindBy(xpath = "//*[@id='div_DENC']/div[1]/div/ins")
	WebElement DCheckLessOneYear;
	@FindBy(xpath = "//*[@id='div_DENC']/div[2]/div/ins")
	WebElement DCheckMoreOneYear;
	@FindBy(xpath = "//*[@id='div_DENC']/div[3]/div/ins")
	WebElement DCheckNone;
	
	@FindBy(xpath = "//*[@id='div_LIPIDSCRN']/div[1]/div/ins")
	WebElement LipidCLessOneYear;
	@FindBy(xpath = "//*[@id='div_LIPIDSCRN']/div[2]/div/ins")
	WebElement LipidCMoreOneYear;
	@FindBy(xpath = "//*[@id='div_LIPIDSCRN']/div[3]/div/ins")
	WebElement LipidCNone;

	@FindBy(xpath = "//*[@id='profile-main']/ul/li[7]/a")
	WebElement CheckUpSection;
	@FindBy(xpath = "html/body/div[11]/div/div/div[3]/button[1]")
	WebElement SubmitSHRA;
	@FindBy(xpath = "html/body/div[11]/div/div/div[3]/button[2]")
	WebElement DoNotSUbmit;

	@FindBy(xpath = "//*[@id='div_WOMOTHER']//div[1]/div[1]/div[1]/div[1]/ins[1]")
	WebElement WHNone;
	@FindBy(xpath = "//*[@id='div_WOMOTHER']//div[1]/div[2]/div[1]/div[1]/ins[1]")
	WebElement WHBrestPain;
	@FindBy(xpath = "//*[@id='div_WOMOTHER']//div[1]/div[3]/div[1]/div[1]/ins[1]")
	WebElement WHCinCon;
	@FindBy(xpath = "//*[@id='div_WOMOTHER']//div[1]/div[4]/div[1]/div[1]/ins[1]")
	WebElement WHFibroids;

	@FindBy(xpath = "//*[@id='div_WOMOTHER']//div[2]/div[1]/div[1]/div[1]/ins[1]")
	WebElement WHGenDia;
	@FindBy(xpath = "//*[@id='div_WOMOTHER']//div[2]/div[2]/div[1]/div[1]/ins[1]")
	WebElement WHMenPro;
	@FindBy(xpath = "//*[@id='div_WOMOTHER']//div[2]/div[3]/div[1]/div[1]/ins[1]")
	WebElement WHPelID;
	@FindBy(xpath = "//*[@id='div_WOMOTHER']//div[2]/div[4]/div[1]/div[1]/ins[1]")
	WebElement WHPcos;

	@FindBy(xpath = "//*[@id='div_WOMOTHER']//div[3]/div[1]/div[1]/div[1]/ins[1]")
	WebElement WHUniTI;
	@FindBy(xpath = "//*[@id='div_WOMOTHER']//div[3]/div[2]/div[1]/div[1]/ins[1]")
	WebElement WHVDis;
	@FindBy(xpath = "//*[@id='div_WOMOTHER']//div[3]/div[3]/div[1]/div[1]/ins[1]")
	WebElement WHMisCar;
	@FindBy(xpath = "//*[@id='div_WOMOTHER']//div[3]/div[4]/div[1]/div[1]/ins[1]")
	WebElement WHOther;
	@FindBy(xpath = "//*[@id='divOth87_OTHERS']/div[1]/div/ul/li[1]/input")
	WebElement WHOthers;

	@FindBy(xpath = "//*[@id='div_WOMSEXACT']//div[1]/div[1]/div[1]/div[1]/ins[1]")
	WebElement WHPntAns;
	@FindBy(xpath = "//*[@id='div_WOMSEXACT']//div[2]/div[1]/div[1]/div[1]/ins[1]")
	WebElement WHYes;
	@FindBy(xpath = "//*[@id='div_WOMSEXACT']//div[3]/div[1]/div[1]/div[1]/ins[1]")
	WebElement WHNo;

	@FindBy(xpath = "//*[@id='tabWomen']/a")
	WebElement WomensHealth;
	
	@FindBy(xpath = ".//*[@id='queDiv_LIPIDSCRN']")
	WebElement WHLIPIDCheck; 


	public ShraActions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void PersonalHealthValuesCheckboxes() throws InterruptedException {
		
		Thread.sleep(5000);
		// 1. Do you have any of these symptoms?
		
		WebElement checkBox11 = driver.findElement(By.xpath(".//*[@id='div_HHPROB']/div[1]/div[1]/div[1]/div[1]"));
		if (checkBox11 != null)
			checkBox11.click();
		log.info("None is getting selected");
		Thread.sleep(2000);

		WebElement checkBox12 = driver.findElement(By.xpath(".//*[@id='div_HHPROB']/div[1]/div[2]/div[1]/div[1]"));
		if (checkBox12 != null)
			checkBox12.click();
		log.info("Allergies is getting selected");
		Thread.sleep(2000);

		WebElement checkBox13 = driver.findElement(By.xpath(".//*[@id='div_HHPROB']/div[1]/div[3]/div[1]/div[1]"));
		if (checkBox13 != null)
			checkBox13.click();
		log.info("Digestive Symptoms is getting selected");
		Thread.sleep(2000);

		WebElement checkBox21 = driver.findElement(By.xpath(".//*[@id='div_HHPROB']/div[2]/div[1]/div[1]/div[1]"));
		if (checkBox21 != null)
			checkBox21.click();
		log.info("Back pain is getting selected");
		Thread.sleep(2000);

		WebElement checkBox22 = driver.findElement(By.xpath(".//*[@id='div_HHPROB']/div[2]/div[2]/div[1]/div[1]"));
		if (checkBox22 != null)
			checkBox22.click();
		log.info("Back Pain is getting selected");
		Thread.sleep(2000);

		WebElement checkBox23 = driver.findElement(By.xpath(".//*[@id='div_HHPROB']/div[2]/div[3]/div[1]/div[1]"));
		if (checkBox23 != null)
			checkBox23.click();
		log.info("Breathlessness is getting selected");
		Thread.sleep(2000);

		WebElement checkBox31 = driver.findElement(By.xpath(".//*[@id='div_HHPROB']/div[3]/div[1]/div[1]/div[1]"));
		if (checkBox31 != null)
			checkBox31.click();
		log.info("Get dizzy/lose balance is getting selected");
		Thread.sleep(2000);

		WebElement checkBox32 = driver.findElement(By.xpath(".//*[@id='div_HHPROB']/div[3]/div[2]/div[1]/div[1]"));
		if (checkBox32 != null)
			checkBox32.click();
		log.info("Joint Pain is getting selected");
		Thread.sleep(2000);

		WebElement checkBox33 = driver.findElement(By.xpath(".//*[@id='div_HHPROB']/div[3]/div[3]/div[1]/div[1]"));
		if (checkBox33 != null)
			checkBox33.click();
		log.info("Other is getting selected");
		Thread.sleep(5000);

		WebElement Textbox1 = driver.findElement(By.xpath(".//*[@id='divOth16_OTHERS']/div[1]/div/ul/li[1]/input"));
		Textbox1.sendKeys("bigboss");
		log.info("Enterring value Bigboss");
		Thread.sleep(3000);

		// 2. Do you have any of these diseases?
		WebElement checkBox111 = driver.findElement(By.xpath(".//*[@id='div_HHILL']/div[1]/div[1]/div[1]/div[1]"));
		if (checkBox111 != null)
			checkBox111.click();
		log.info("None is getting selected");
		Thread.sleep(5000);

		WebElement checkBox112 = driver.findElement(By.xpath(".//*[@id='div_HHILL']/div[1]/div[2]/div[1]/div[1]"));
		if (checkBox112 != null)
			checkBox112.click();
		log.info("Asthma is getting selected");
		Thread.sleep(2000);

		WebElement checkBox113 = driver.findElement(By.xpath(".//*[@id='div_HHILL']/div[1]/div[3]/div[1]/div[1]"));
		if (checkBox113 != null)
			checkBox113.click();
		log.info("Arthritis  is getting selected");
		Thread.sleep(2000);

		WebElement checkBox114 = driver.findElement(By.xpath(".//*[@id='div_HHILL']/div[1]/div[4]/div[1]/div[1]"));
		if (checkBox114 != null)
			checkBox114.click();
		log.info("BP is getting selected");
		Thread.sleep(2000);

		WebElement checkBox121 = driver.findElement(By.xpath(".//*[@id='div_HHILL']/div[2]/div[1]/div[1]/div[1]"));
		if (checkBox121 != null)
			checkBox121.click();
		log.info("Cancer is getting selected");
		Thread.sleep(2000);

		WebElement checkBox122 = driver.findElement(By.xpath(".//*[@id='div_HHILL']/div[2]/div[2]/div[1]/div[1]"));
		if (checkBox122 != null)
			checkBox122.click();
		log.info("Cholesterol is getting selected");
		Thread.sleep(2000);

		WebElement checkBox123 = driver.findElement(By.xpath(".//*[@id='div_HHILL']/div[2]/div[3]/div[1]/div[1]"));
		if (checkBox123 != null)
			checkBox123.click();
		log.info("Diabetes is getting selected");
		Thread.sleep(2000);

		WebElement checkBox124 = driver.findElement(By.xpath(".//*[@id='div_HHILL']/div[2]/div[4]/div[1]/div[1]"));
		if (checkBox124 != null)
			checkBox124.click();
		log.info("Heart Problems is getting selected");
		Thread.sleep(2000);

		WebElement checkBox131 = driver.findElement(By.xpath(".//*[@id='div_HHILL']/div[3]/div[1]/div[1]/div[1]"));
		if (checkBox131 != null)
			checkBox131.click();
		log.info("Mental illness is getting selected");
		Thread.sleep(5000);

		WebElement checkBox132 = driver.findElement(By.xpath(".//*[@id='div_HHILL']/div[3]/div[2]/div[1]/div[1]"));
		if (checkBox132 != null)
			checkBox132.click();
		log.info("Stroke is getting selected");
		Thread.sleep(2000);

		WebElement checkBox133 = driver.findElement(By.xpath(".//*[@id='div_HHILL']/div[3]/div[3]/div[1]/div[1]"));
		if (checkBox133 != null)
			checkBox133.click();
		log.info("Thyroid is getting selected");
		Thread.sleep(5000);

		WebElement checkBox134 = driver.findElement(By.xpath("//*[@id='div_HHILL']/div[3]/div[4]/div[1]/div[1]"));
		if (checkBox134 != null)
			checkBox134.click();
		log.info("Other is getting selected");
		Thread.sleep(5000);

		WebElement Textbox2 = driver.findElement(By.xpath(".//*[@id='divOth15_OTHERS']/div[1]/div/ul/li[1]/input"));
		Textbox2.sendKeys("bigboss2");
		log.info("Enterring value Bigboss2");
		Thread.sleep(3000);

		Thread.sleep(3000);

		// 3. Do you have any of these skin problems?
		WebElement checkBox211 = driver.findElement(By.xpath(".//*[@id='div_SKINPRB']/div[1]/div[1]/div[1]/div[1]"));
		if (checkBox211 != null)
			checkBox211.click();
		log.info("None is getting selected");
		Thread.sleep(2000);

		WebElement checkBox212 = driver.findElement(By.xpath(".//*[@id='div_SKINPRB']/div[1]/div[2]/div[1]/div[1]"));
		if (checkBox212 != null)
			checkBox212.click();
		log.info("Acne is getting selected");
		Thread.sleep(2000);

		WebElement checkBox221 = driver.findElement(By.xpath(".//*[@id='div_SKINPRB']/div[2]/div[1]/div[1]/div[1]"));
		if (checkBox221 != null)
			checkBox221.click();
		log.info("Dandruff is getting selected");
		Thread.sleep(5000);

		WebElement checkBox222 = driver.findElement(By.xpath(".//*[@id='div_SKINPRB']/div[2]/div[2]/div[1]/div[1]"));
		if (checkBox222 != null)
			checkBox222.click();
		log.info("Dryness Pain is getting selected");
		Thread.sleep(2000);

		WebElement checkBox231 = driver.findElement(By.xpath(".//*[@id='div_SKINPRB']/div[3]/div[1]/div[1]/div[1]"));
		if (checkBox231 != null)
			checkBox231.click();
		log.info("Rashes is getting selected");
		Thread.sleep(5000);

		WebElement checkBox232 = driver.findElement(By.xpath(".//*[@id='div_SKINPRB']/div[3]/div[2]/div[1]/div[1]"));
		if (checkBox232 != null)
			checkBox232.click();
		log.info("Other is getting selected");
		Thread.sleep(5000);

		WebElement Textbox3 = driver.findElement(By.xpath(".//*[@id='divOth65_OTHERS']/div[1]/div/ul/li[1]/input"));
		Textbox3.sendKeys("bigboss3");
		log.info("Enterring value Bigboss3");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(3000);

		// 4. Do you have any of these dental problems?

		WebElement checkBox311 = driver.findElement(By.xpath(".//*[@id='div_DENPROB']/div[1]/div[1]/div[1]/div[1]"));
		if (checkBox311 != null)
			checkBox311.click();
		log.info("None is getting selected");
		Thread.sleep(2000);

		WebElement checkBox312 = driver.findElement(By.xpath(".//*[@id='div_DENPROB']/div[1]/div[2]/div[1]/div[1]"));
		if (checkBox312 != null)
			checkBox312.click();
		log.info("Bad Breath is getting selected");
		Thread.sleep(2000);

		WebElement checkBox321 = driver.findElement(By.xpath(".//*[@id='div_DENPROB']/div[2]/div[1]/div[1]/div[1]"));
		if (checkBox321 != null)
			checkBox321.click();
		log.info("Cavities is getting selected");
		Thread.sleep(5000);

		WebElement checkBox322 = driver.findElement(By.xpath(".//*[@id='div_DENPROB']/div[2]/div[2]/div[1]/div[1]"));
		if (checkBox322 != null)
			checkBox322.click();
		log.info("Decay Pain is getting selected");
		Thread.sleep(2000);

		WebElement checkBox331 = driver.findElement(By.xpath(".//*[@id='div_DENPROB']/div[3]/div[1]/div[1]/div[1]"));
		if (checkBox331 != null)
			checkBox331.click();
		log.info("Staining is getting selected");
		Thread.sleep(5000);

		WebElement checkBox332 = driver.findElement(By.xpath(".//*[@id='div_DENPROB']/div[3]/div[2]/div[1]/div[1]"));
		if (checkBox332 != null)
			checkBox332.click();
		log.info("Other is getting selected");
		Thread.sleep(5000);

		WebElement Textbox4 = driver.findElement(By.xpath(".//*[@id='divOth63_OTHERS']/div[1]/div/ul/li[1]/input"));
		Textbox4.sendKeys("bigboss3");
		log.info("Enterring value Bigboss3");
		Thread.sleep(3000);
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(3000);

		// 5.Do you have any of these eye problems?

		WebElement checkBox411 = driver.findElement(By.xpath(".//*[@id='div_EYEPROB']/div[1]/div[1]/div[1]/div[1]"));
		if (checkBox411 != null)
			checkBox411.click();
		log.info("None is getting selected");
		Thread.sleep(2000);

		WebElement checkBox412 = driver.findElement(By.xpath(".//*[@id='div_EYEPROB']/div[1]/div[2]/div[1]/div[1]"));
		if (checkBox412 != null)
			checkBox412.click();
		log.info("Blurred Vision is getting selected");
		Thread.sleep(2000);

		WebElement checkBox421 = driver.findElement(By.xpath(".//*[@id='div_EYEPROB']/div[2]/div[1]/div[1]/div[1]"));
		if (checkBox421 != null)
			checkBox421.click();
		log.info("Cataract is getting selected");
		Thread.sleep(5000);

		WebElement checkBox422 = driver.findElement(By.xpath(".//*[@id='div_EYEPROB']/div[2]/div[2]/div[1]/div[1]"));
		if (checkBox422 != null)
			checkBox422.click();
		log.info("Dry Eyes is getting selected");
		Thread.sleep(2000);

		WebElement checkBox431 = driver.findElement(By.xpath(".//*[@id='div_EYEPROB']/div[3]/div[1]/div[1]/div[1]"));
		if (checkBox431 != null)
			checkBox431.click();
		log.info("Tearing is getting selected");
		Thread.sleep(5000);

		WebElement checkBox432 = driver.findElement(By.xpath(".//*[@id='div_EYEPROB']/div[3]/div[2]/div[1]/div[1]"));
		if (checkBox432 != null)
			checkBox432.click();
		log.info("Other is getting selected");
		Thread.sleep(5000);

		WebElement Textbox5 = driver.findElement(By.xpath(".//*[@id='divOth64_OTHERS']/div[1]/div/ul/li[1]/input"));
		Textbox5.sendKeys("bigboss5");
		log.info("Enterring value Bigboss5");
		Thread.sleep(3000);
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("window.scrollBy(0,550)", "");

		divRightContent.click();
		Next.click();
		log.info("Clicked on Next Sucessfully:-" + Next.toString());
		Thread.sleep(5000);

	}

	public void FamilyHealthValuesCheckboxes() throws InterruptedException {

		WebElement checkBox511 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[1]/div[1]/div[1]/div[1]/ins[1]"));
		if (checkBox511 != null)
			checkBox511.click();
		log.info("None is getting selected");
		Thread.sleep(2000);

		WebElement checkBox512 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[1]/div[2]/div[1]/div[1]/ins[1]"));
		if (checkBox512 != null)
			checkBox512.click();
		log.info("Anxiety is getting selected");
		Thread.sleep(2000);

		WebElement checkBox513 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[1]/div[3]/div[1]/div[1]/ins[1]"));
		if (checkBox513 != null)
			checkBox513.click();
		log.info("Arthritis is getting selected");
		Thread.sleep(5000);

		WebElement checkBox514 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[1]/div[4]/div[1]/div[1]/ins[1]"));
		if (checkBox514 != null)
			checkBox514.click();
		log.info("Asthma is getting selected");
		Thread.sleep(2000);

		WebElement checkBox517 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[1]/div[7]/div[1]/div[1]/ins[1]"));
		if (checkBox517 != null)
			checkBox517.click();
		log.info("Colorectal is getting selected");
		Thread.sleep(5000);

		WebElement checkBox518 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[1]/div[8]/div[1]/div[1]/ins[1]"));
		if (checkBox518 != null)
			checkBox518.click();
		log.info("Depression is getting selected");
		Thread.sleep(5000);
		WebElement checkBox519 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[1]/div[9]/div[1]/div[1]/ins[1]"));
		if (checkBox519 != null)
			checkBox519.click();
		log.info("Diabetes is getting selected");
		Thread.sleep(2000);

		WebElement checkBox5110 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[1]/div[10]/div[1]/div[1]/ins[1]"));
		if (checkBox5110 != null)
			checkBox5110.click();
		log.info("Prostate Cancer is getting selected");
		Thread.sleep(5000);

		WebElement checkBox5111 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[1]/div[11]/div[1]/div[1]/ins[1]"));
		if (checkBox5111 != null)
			checkBox5111.click();
		log.info("Stroke under age 50 is getting selected");
		Thread.sleep(5000);

		WebElement checkBox521 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[2]/div[1]/div[1]/div[1]/ins[1]"));
		if (checkBox521 != null)
			checkBox521.click();
		log.info("Elevated cholesterol is getting selected");
		Thread.sleep(2000);

		WebElement checkBox522 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[2]/div[2]/div[1]/div[1]/ins[1]"));
		if (checkBox522 != null)
			checkBox522.click();
		log.info("Heart attack under age 50 is getting selected");
		Thread.sleep(2000);

		WebElement checkBox523 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[2]/div[3]/div[1]/div[1]/ins[1]"));
		if (checkBox523 != null)
			checkBox523.click();
		log.info("Heart surgery is getting selected");
		Thread.sleep(5000);

		WebElement checkBox524 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[2]/div[4]/div[1]/div[1]/ins[1]"));
		if (checkBox524 != null)
			checkBox524.click();
		log.info("High blood pressure is getting selected");
		Thread.sleep(2000);

		WebElement checkBox525 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[2]/div[5]/div[1]/div[1]/ins[1]"));
		if (checkBox525 != null)
			checkBox525.click();
		log.info("Mental illness is getting selected");
		Thread.sleep(5000);

		WebElement checkBox526 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[2]/div[6]/div[1]/div[1]/ins[1]"));
		if (checkBox526 != null)
			checkBox526.click();
		log.info("Migraine is getting selected");
		Thread.sleep(5000);
		WebElement checkBox527 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[2]/div[7]/div[1]/div[1]/ins[1]"));
		if (checkBox527 != null)
			checkBox527.click();
		log.info("Obesity is getting selected");
		Thread.sleep(2000);

		WebElement checkBox528 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[2]/div[8]/div[1]/div[1]/ins[1]"));
		if (checkBox528 != null)
			checkBox528.click();
		log.info("Osteoporosis is getting selected");
		Thread.sleep(5000);

		WebElement checkBox529 = driver
				.findElement(By.xpath(".//*[@id='div_FHIST']/div[2]/div[9]/div[1]/div[1]/ins[1]"));
		if (checkBox529 != null)
			checkBox529.click();
		log.info("Other is getting selected");
		Thread.sleep(5000);

		WebElement Textbox6 = driver.findElement(By.xpath(".//*[@id='divOthFHIST_OTHERS']/div[1]/div/ul/li[1]/input"));
		Textbox6.sendKeys("bigboss5");
		log.info("Enterring value Bigboss5");
		Thread.sleep(3000);
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("window.scrollBy(0,550)", "");

		divRightContent.click();
		Next.click();
		log.info("Clicked on Next Sucessfully:-" + Next.toString());
		Thread.sleep(5000);
	}

	public void DibeticProfileNO() throws InterruptedException {

		DibeticProfileN.click();
		log.info("Clicked on DibeticProfileNO:-");
		Thread.sleep(5000);
	}

	public void LipidProfileNO() throws InterruptedException {
		LipidProfileN.click();
		log.info("Clicked on DibeticProfileNO:-");
		Thread.sleep(5000);

	}

	public void DibeticProfileYESvalues(int Fbs, int Rbs, int Bs, int hbs1c) throws InterruptedException {

		DibeticProfileY.click();
		log.info("Clicked on DibeticProfileYES:-");
		Thread.sleep(5000);

		fbs.clear();
		Thread.sleep(5000);
		fbs.sendKeys(Integer.toString(Fbs));
		log.info("Entered the Fbs value:-" + Fbs);

		rbs.clear();
		Thread.sleep(2000);
		rbs.sendKeys(Integer.toString(Rbs));
		log.info("Entered the Rbs value:-" + Rbs);

		bs.clear();
		Thread.sleep(5000);
		bs.sendKeys(Integer.toString(Bs));
		log.info("Entered the weight value:-" + Bs);

		Hbs1c.clear();
		Thread.sleep(5000);
		Hbs1c.sendKeys(Integer.toString(hbs1c));
		log.info("Entered the weight value:-" + hbs1c);

	}

	public void LipidProfileYesValues(int i, int j, int k, int l, int m) throws InterruptedException {
		LipidProfileY.click();
		log.info("Clicked on LipidProfileYES:-");
		Thread.sleep(5000);

		HDL.clear();
		Thread.sleep(5000);
		HDL.sendKeys(Integer.toString(i));
		log.info("Entered the HDL value:-" + i);

		LDL.clear();
		Thread.sleep(2000);
		LDL.sendKeys(Integer.toString(j));
		log.info("Entered the LDL value:-" + j);

		Triglyceride.clear();
		Thread.sleep(5000);
		Triglyceride.sendKeys(Integer.toString(k));
		log.info("Entered the Triglyceride value:-" + k);

		VLDL.clear();
		Thread.sleep(5000);
		VLDL.sendKeys(Integer.toString(l));
		log.info("Entered the VLDL value:-" + l);

		Total.clear();
		Thread.sleep(5000);
		Total.sendKeys(Integer.toString(m));
		log.info("Entered the Total cholesterol  value:-" + m);

		divRightContent.click();
		Next.click();
		log.info("Clicked on Next Sucessfully:-" + Next.toString());
		Thread.sleep(5000);

	}

	public void GenralHLifeStyle() throws InterruptedException {
		Thread.sleep(5000);
		FruitA.click();
		log.info("Clicked on FruitA:-");
		Thread.sleep(2000);
		FruitU.click();
		log.info("Clicked on FruitU:-");
		Thread.sleep(2000);
		FruitS.click();
		log.info("Clicked on FruitS:-");
		Thread.sleep(2000);
		FruitN.click();
		log.info("Clicked on FruitN:-");
		Thread.sleep(5000);

		FatfoodA.click();
		Thread.sleep(2000);
		log.info("Clicked on FatfoodA:-");
		FatfoodU.click();
		Thread.sleep(2000);
		log.info("Clicked on FatfoodU:-");
		FatfoodS.click();
		Thread.sleep(2000);
		log.info("Clicked on FatfoodS:-");
		FatfoodN.click();
		Thread.sleep(5000);
		log.info("Clicked on FatfoodN:-");

		exerciseA.click();
		log.info("Clicked on exerciseA:-");
		Thread.sleep(2000);
		exerciseU.click();
		log.info("Clicked on exerciseU:-");
		Thread.sleep(2000);
		exerciseS.click();
		log.info("Clicked on exerciseS:-");
		Thread.sleep(2000);
		exerciseN.click();
		log.info("Clicked on exerciseN:-");
		Thread.sleep(5000);

		sleepA.click();
		log.info("Clicked on sleepA:-");
		Thread.sleep(2000);
		sleepU.click();
		log.info("Clicked on sleepU:-");
		Thread.sleep(2000);
		sleepS.click();
		log.info("Clicked on sleepS:-");
		Thread.sleep(2000);
		sleepN.click();
		log.info("Clicked on sleepN:-");
		Thread.sleep(5000);

		habitsNone.click();
		Thread.sleep(2000);
		log.info("Clicked on habitsNone:-");
		habitsTobacco.click();
		log.info("Clicked on habitsTobacco:-");
		Thread.sleep(5000);
		habitsSmoking.click();
		log.info("Clicked on habitsSmoking:-");
		Thread.sleep(2000);
		habitsPan.click();
		log.info("Clicked on habitsPan:-");
		Thread.sleep(2000);
		habitsOther.click();
		log.info("Clicked on habitsOther:-");
		Thread.sleep(2000);

		habitsothers.sendKeys("bigboss5");
		log.info("Enterring value Bigboss5");
		Thread.sleep(3000);
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("window.scrollBy(0,550)", "");

		Cigarettes1.click();
		log.info("Clicked on Cigarettes>1:-");
		Thread.sleep(2000);
		Cigarettes3.click();
		log.info("Clicked on Cigarettes2-3:-");
		Thread.sleep(2000);
		Cigarettes4.click();
		log.info("Clicked on Cigarettes-3-4:-");
		Thread.sleep(5000);

		alcoholDontD.click();
		log.info("Clicked on alcoholDontD:-");
		Thread.sleep(2000);
		alcoholOccD.click();
		log.info("Clicked on alcoholOccD:-");
		Thread.sleep(2000);
		alcoholOfFD.click();
		log.info("Clicked on alcoholOfFD:-");
		Thread.sleep(5000);

		pegs1.click();
		log.info("Clicked on pegs1:-");
		Thread.sleep(2000);
		pegs3.click();
		log.info("Clicked on pegs3:-");
		Thread.sleep(2000);
		pegs4.click();
		log.info("Clicked on pegs4:-");
		Thread.sleep(2000);

		Next.click();
		log.info("Clicked on Next Sucessfully:-" + Next.toString());
		Thread.sleep(5000);

	}

	public void GenralSocialWellness() throws InterruptedException {

		Thread.sleep(5000);
		SatisfiedC.click();
		log.info("Clicked on SatisfiedC:-");
		Thread.sleep(2000);
		SatisfiedM.click();
		log.info("Clicked on SatisfiedM:-");
		Thread.sleep(2000);
		SatisfiedP.click();
		log.info("Clicked on SatisfiedP:-");
		Thread.sleep(2000);
		SatisfiedNS.click();
		log.info("Clicked on SatisfiedNS:-");
		Thread.sleep(5000);

		socialV.click();
		log.info("Clicked on socialV:-");
		Thread.sleep(2000);
		socialA.click();
		log.info("Clicked on socialA:-");
		Thread.sleep(2000);
		socialB.click();
		log.info("Clicked on socialB:-");
		Thread.sleep(2000);
		socialNS.click();
		log.info("Clicked on socialNS:-");
		Thread.sleep(5000);

		StressNo.click();
		log.info("Clicked on StressNo:-");
		Thread.sleep(2000);
		StressYes.click();
		log.info("Clicked on StressYes:-");
		Thread.sleep(5000);
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("window.scrollBy(0,550)", "");

		Thread.sleep(5000);
		stressedN.click();
		log.info("Clicked on stressedN:-");
		Thread.sleep(2000);
		stressedD.click();
		log.info("Clicked on stressedD:-");
		Thread.sleep(2000);
		stressedE.click();
		log.info("Clicked on stressedE:-");
		Thread.sleep(2000);
		stressedF.click();
		log.info("Clicked on stressedF:-");
		Thread.sleep(5000);

		Thread.sleep(5000);
		stressedL.click();
		log.info("Clicked on stressedL:-");
		Thread.sleep(2000);
		stressedO.click();
		log.info("Clicked on stressedO:-");
		Thread.sleep(2000);
		stressedP.click();
		log.info("Clicked on stressedP:-");
		Thread.sleep(2000);
		stressedOther.click();
		log.info("Clicked on stressedOther:-");
		Thread.sleep(5000);
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("window.scrollBy(0,550)", "");
		stressedOtherT.sendKeys("Bigboss");
		Thread.sleep(5000);

		divRightContent.click();
		Next.click();
		log.info("Clicked on Next Sucessfully:-" + Next.toString());
		Thread.sleep(5000);

	}

	public void OccupationalWellnessGENRAL() throws InterruptedException {
		Thread.sleep(5000);
		GenralHealthsection.click();
		Thread.sleep(5000);
		OccupationalWellness.click();
		Thread.sleep(5000);
		SelectBoxOpen.click();
		Thread.sleep(5000);
		SelectGenral.click();
		Thread.sleep(5000);

		Thread.sleep(5000);
		ExtraA.click();
		log.info("Clicked on ExtraA:-");
		Thread.sleep(2000);
		ExtraS.click();
		log.info("Clicked on ExtraS:-");
		Thread.sleep(2000);
		ExtraR.click();
		log.info("Clicked on ExtraR:-");
		Thread.sleep(2000);
		ExtraN.click();
		log.info("Clicked on ExtraN:-");
		Thread.sleep(5000);

		PaidA.click();
		Thread.sleep(2000);
		log.info("Clicked on PaidA:-");
		PaidS.click();
		Thread.sleep(2000);
		log.info("Clicked on PaidS:-");
		PaidR.click();
		Thread.sleep(2000);
		log.info("Clicked on PaidR:-");
		PaidN.click();
		Thread.sleep(5000);
		log.info("Clicked on PaidN:-");
		JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("window.scrollBy(0,550)", "");

		WlbA.click();
		log.info("Clicked on WlbA:-");
		Thread.sleep(2000);
		WlbS.click();
		log.info("Clicked on WlbS:-");
		Thread.sleep(2000);
		WlbR.click();
		log.info("Clicked on WlbR:-");
		Thread.sleep(2000);
		WlbN.click();
		log.info("Clicked on WlbN:-");
		Thread.sleep(5000);

		PC8plusA.click();
		log.info("Clicked on PC8plusA:-");
		Thread.sleep(2000);
		PC8plusS.click();
		log.info("Clicked on PC8plusS:-");
		Thread.sleep(2000);
		PC8plusR.click();
		log.info("Clicked on PC8plusR:-");
		Thread.sleep(2000);
		PC8plusN.click();
		log.info("Clicked on PC8plusN:-");
		Thread.sleep(5000);

		ShiftsA.click();
		Thread.sleep(2000);
		log.info("Clicked on ShiftsA:-");
		ShiftsS.click();
		Thread.sleep(2000);
		log.info("Clicked on ShiftsS:-");
		ShiftsR.click();
		Thread.sleep(2000);
		log.info("Clicked on ShiftsR:-");
		ShiftsN.click();
		Thread.sleep(5000);
		log.info("Clicked on ShiftsN:-");

		SpaceA.click();
		log.info("Clicked on SpaceA:-");
		Thread.sleep(2000);
		SpaceS.click();
		log.info("Clicked on SpaceS:-");
		Thread.sleep(2000);
		SpaceR.click();
		log.info("Clicked on SpaceR:-");
		Thread.sleep(2000);
		SpaceN.click();
		log.info("Clicked on SpaceN:-");
		Thread.sleep(5000);

		TalkA.click();
		log.info("Clicked on TalkA:-");
		Thread.sleep(2000);
		TalkS.click();
		log.info("Clicked on TalkS:-");
		Thread.sleep(2000);
		TalkR.click();
		log.info("Clicked on TalkR:-");
		Thread.sleep(2000);
		TalkN.click();
		log.info("Clicked on TalkN:-");
		Thread.sleep(5000);
		divRightContent.click();
		Next.click();
		log.info("Clicked on Next Sucessfully:-" + Next.toString());
		Thread.sleep(5000);

	}

	public void OccupationalWellnessBPO() throws InterruptedException {
		Thread.sleep(10000);
		GenralHealthsection.click();
		Thread.sleep(5000);
		OccupationalWellness.click();
		Thread.sleep(5000);
		SelectBoxOpen.click();
		Thread.sleep(5000);
		SelectBPO.click();
		Thread.sleep(5000);

		PC8plusA.click();
		log.info("Clicked on PC8plusA:-");
		Thread.sleep(2000);
		PC8plusS.click();
		log.info("Clicked on PC8plusS:-");
		Thread.sleep(2000);
		PC8plusR.click();
		log.info("Clicked on PC8plusR:-");
		Thread.sleep(2000);
		PC8plusN.click();
		log.info("Clicked on PC8plusN:-");
		Thread.sleep(5000);

		Thread.sleep(5000);
		ExtraA.click();
		log.info("Clicked on ExtraA:-");
		Thread.sleep(2000);
		ExtraS.click();
		log.info("Clicked on ExtraS:-");
		Thread.sleep(2000);
		ExtraR.click();
		log.info("Clicked on ExtraR:-");
		Thread.sleep(2000);
		ExtraN.click();
		log.info("Clicked on ExtraN:-");
		Thread.sleep(5000);

		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("window.scrollBy(0,550)", "");

		Thread.sleep(5000);
		PainA.click();
		log.info("Clicked on PainA:-");
		Thread.sleep(2000);
		PainS.click();
		log.info("Clicked on PainS:-");
		Thread.sleep(2000);
		PainR.click();
		log.info("Clicked on PainR:-");
		Thread.sleep(2000);
		PainN.click();
		log.info("Clicked on PainN:-");
		Thread.sleep(5000);

		WlbA.click();
		log.info("Clicked on WlbA:-");
		Thread.sleep(2000);
		WlbS.click();
		log.info("Clicked on WlbS:-");
		Thread.sleep(2000);
		WlbR.click();
		log.info("Clicked on WlbR:-");
		Thread.sleep(2000);
		WlbN.click();
		log.info("Clicked on WlbN:-");
		Thread.sleep(5000);

		ShiftsA.click();
		Thread.sleep(2000);
		log.info("Clicked on ShiftsA:-");
		ShiftsS.click();
		Thread.sleep(2000);
		log.info("Clicked on ShiftsS:-");
		ShiftsR.click();
		Thread.sleep(2000);
		log.info("Clicked on ShiftsR:-");
		ShiftsN.click();
		Thread.sleep(5000);
		log.info("Clicked on ShiftsN:-");

		SpaceA.click();
		log.info("Clicked on SpaceA:-");
		Thread.sleep(2000);
		SpaceS.click();
		log.info("Clicked on SpaceS:-");
		Thread.sleep(2000);
		SpaceR.click();
		log.info("Clicked on SpaceR:-");
		Thread.sleep(2000);
		SpaceN.click();
		log.info("Clicked on SpaceN:-");
		Thread.sleep(5000);

		AdjustA.click();
		log.info("Clicked on AdjustA:-");
		Thread.sleep(2000);
		AdjustS.click();
		log.info("Clicked on AdjustS:-");
		Thread.sleep(2000);
		AdjustR.click();
		log.info("Clicked on AdjustR:-");
		Thread.sleep(2000);
		AdjustN.click();
		log.info("Clicked on AdjustN:-");
		Thread.sleep(5000);
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("window.scrollBy(0,550)", "");

		SecurityA.click();
		log.info("Clicked on SecurityA:-");
		Thread.sleep(2000);
		SecurityS.click();
		log.info("Clicked on SecurityS:-");
		Thread.sleep(2000);
		SecurityR.click();
		log.info("Clicked on SecurityR:-");
		Thread.sleep(2000);
		SecurityN.click();
		log.info("Clicked on SecurityN:-");
		Thread.sleep(5000);

		TalkA.click();
		log.info("Clicked on TalkA:-");
		Thread.sleep(2000);
		TalkS.click();
		log.info("Clicked on TalkS:-");
		Thread.sleep(2000);
		TalkR.click();
		log.info("Clicked on TalkR:-");
		Thread.sleep(2000);
		TalkN.click();
		log.info("Clicked on TalkN:-");
		Thread.sleep(5000);

		NarrowA.click();
		log.info("Clicked on NarrowA:-");
		Thread.sleep(2000);
		NarrowS.click();
		log.info("Clicked on NarrowS:-");
		Thread.sleep(2000);
		NarrowR.click();
		log.info("Clicked on NarrowR:-");
		Thread.sleep(2000);
		NarrowN.click();
		log.info("Clicked on NarrowN:-");
		Thread.sleep(5000);

		divRightContent.click();
		Next.click();
		log.info("Clicked on Next Sucessfully:-" + Next.toString());
		Thread.sleep(5000);

	}

	public void OccupationalWellnessIT() throws InterruptedException {

		Thread.sleep(10000);
		GenralHealthsection.click();
		Thread.sleep(5000);
		OccupationalWellness.click();
		Thread.sleep(5000);
		SelectBoxOpen.click();
		Thread.sleep(5000);
		SelectIT.click();
		Thread.sleep(5000);

		PC8plusA.click();
		log.info("Clicked on PC8plusA:-");
		Thread.sleep(2000);
		PC8plusS.click();
		log.info("Clicked on PC8plusS:-");
		Thread.sleep(2000);
		PC8plusR.click();
		log.info("Clicked on PC8plusR:-");
		Thread.sleep(2000);
		PC8plusN.click();
		log.info("Clicked on PC8plusN:-");
		Thread.sleep(5000);

		Thread.sleep(5000);
		ExtraA.click();
		log.info("Clicked on ExtraA:-");
		Thread.sleep(2000);
		ExtraS.click();
		log.info("Clicked on ExtraS:-");
		Thread.sleep(2000);
		ExtraR.click();
		log.info("Clicked on ExtraR:-");
		Thread.sleep(2000);
		ExtraN.click();
		log.info("Clicked on ExtraN:-");
		Thread.sleep(5000);

		Thread.sleep(5000);
		PainA.click();
		log.info("Clicked on PainA:-");
		Thread.sleep(2000);
		PainS.click();
		log.info("Clicked on PainS:-");
		Thread.sleep(2000);
		PainR.click();
		log.info("Clicked on PainR:-");
		Thread.sleep(2000);
		PainN.click();
		log.info("Clicked on PainN:-");
		Thread.sleep(5000);
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("window.scrollBy(0,250)", "");

		WlbA.click();
		log.info("Clicked on WlbA:-");
		Thread.sleep(2000);
		WlbS.click();
		log.info("Clicked on WlbS:-");
		Thread.sleep(2000);
		WlbR.click();
		log.info("Clicked on WlbR:-");
		Thread.sleep(2000);
		WlbN.click();
		log.info("Clicked on WlbN:-");
		Thread.sleep(5000);

		ShiftsA.click();
		Thread.sleep(2000);
		log.info("Clicked on ShiftsA:-");
		ShiftsS.click();
		Thread.sleep(2000);
		log.info("Clicked on ShiftsS:-");
		ShiftsR.click();
		Thread.sleep(2000);
		log.info("Clicked on ShiftsR:-");
		ShiftsN.click();
		Thread.sleep(5000);
		log.info("Clicked on ShiftsN:-");

		SpaceA.click();
		log.info("Clicked on SpaceA:-");
		Thread.sleep(2000);
		SpaceS.click();
		log.info("Clicked on SpaceS:-");
		Thread.sleep(2000);
		SpaceR.click();
		log.info("Clicked on SpaceR:-");
		Thread.sleep(2000);
		SpaceN.click();
		log.info("Clicked on SpaceN:-");
		Thread.sleep(5000);
		JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("window.scrollBy(0,250)", "");

		AdjustA.click();
		log.info("Clicked on AdjustA:-");
		Thread.sleep(2000);
		AdjustS.click();
		log.info("Clicked on AdjustS:-");
		Thread.sleep(2000);
		AdjustR.click();
		log.info("Clicked on AdjustR:-");
		Thread.sleep(2000);
		AdjustN.click();
		log.info("Clicked on AdjustN:-");
		Thread.sleep(5000);

		SecurityA.click();
		log.info("Clicked on SecurityA:-");
		Thread.sleep(2000);
		SecurityS.click();
		log.info("Clicked on SecurityS:-");
		Thread.sleep(2000);
		SecurityR.click();
		log.info("Clicked on SecurityR:-");
		Thread.sleep(2000);
		SecurityN.click();
		log.info("Clicked on SecurityN:-");
		Thread.sleep(5000);

		ConflictA.click();
		log.info("Clicked on ConflictA:-");
		Thread.sleep(2000);
		ConflictS.click();
		log.info("Clicked on ConflictS:-");
		Thread.sleep(2000);
		ConflictR.click();
		log.info("Clicked on ConflictR:-");
		Thread.sleep(2000);
		ConflictN.click();
		log.info("Clicked on ConflictN:-");

		NarrowA.click();
		log.info("Clicked on NarrowA:-");
		Thread.sleep(2000);
		NarrowS.click();
		log.info("Clicked on NarrowS:-");
		Thread.sleep(2000);
		NarrowR.click();
		log.info("Clicked on NarrowR:-");
		Thread.sleep(2000);
		NarrowN.click();
		log.info("Clicked on NarrowN:-");
		Thread.sleep(5000);

		divRightContent.click();
		Next.click();
		log.info("Clicked on Next Sucessfully:-" + Next.toString());
		Thread.sleep(5000);

	}

	public void CheckupActions() throws InterruptedException {

		Thread.sleep(10000);
		CheckUpSection.click();
		log.info("Clicked on Next CheckUpSection:-" + CheckUpSection.toString());
		Thread.sleep(5000);

		HCheckLessOneYear.click();
		log.info("Clicked on HCheckLessOneYear:-");
		Thread.sleep(2000);
		HCheckMoreOneYear.click();
		log.info("Clicked on HCheckMoreOneYear:-");
		Thread.sleep(2000);
		HCheckNone.click();
		log.info("Clicked on HCheckNone:-");
		Thread.sleep(5000);
		
		
	
		try {
			if(WHLIPIDCheck.isDisplayed()){
				
				LipidCLessOneYear.click();
				log.info("Clicked on LipidCLessOneYear:-");
				Thread.sleep(2000);
				LipidCMoreOneYear.click();
				log.info("Clicked on LipidCMoreOneYear:-");
				Thread.sleep(2000);
				LipidCNone.click();
				log.info("Clicked on LipidCNone:-");
				Thread.sleep(2000);
			}
			else
				System.out.println("Thi is a Mens profile and Lipid/ Total Cholesterol  is NA.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	// 	Lipid/ Total Cholesterol  only in Woemens
		
		
	
		ECheckLessOneYear.click();
		log.info("Clicked on ECheckLessOneYear:-");
		Thread.sleep(2000);
		ECheckMoreOneYear.click();
		log.info("Clicked on ECheckMoreOneYear:-");
		Thread.sleep(2000);
		ECheckNone.click();
		log.info("Clicked on ECheckNone:-");
		Thread.sleep(2000);

		DCheckLessOneYear.click();
		log.info("Clicked on ECheckLessOneYear:-");
		Thread.sleep(2000);
		DCheckMoreOneYear.click();
		log.info("Clicked on ECheckMoreOneYear:-");
		Thread.sleep(2000);
		DCheckNone.click();
		log.info("Clicked on ECheckNone:-");
		Thread.sleep(2000);

		divRightContent.click();
		Next.click();
		log.info("Clicked on Next Sucessfully:-" + Next.toString());
		Thread.sleep(10000);

		// Submitting the Form and SHRA Details:
		// iframe id="vEFqLuu-1500362777389
		SubmitSHRA.click();
		log.info("Clicked on SubmitSHRA:-");
		Thread.sleep(2000);
		// If Selected No then it will not submit
		// DoNotSUbmit.click();
		// log.info("Clicked on DoNotSUbmit:-");

	}

	public void WomensHealth() throws InterruptedException {

		Thread.sleep(10000);
		WomensHealth.click();
		log.info("Clicked on Next WomensHealth:-" + WomensHealth.toString());
		Thread.sleep(5000);

		// Do you have any of these diseases?
		// WHNone;
		Thread.sleep(5000);
		WHNone.click();
		log.info("Clicked on WH None:-");
		// WHBrestPain
		Thread.sleep(2000);
		WHBrestPain.click();
		log.info("Clicked on Breast pain:-");
		// WHCinCon
		Thread.sleep(2000);
		WHCinCon.click();
		log.info("Clicked on Complication in conceiving:-");
		// WHFibroids
		Thread.sleep(2000);
		WHFibroids.click();
		log.info("Clicked on Fibroids:-");
		Thread.sleep(5000);

		// WHGenDia;
		Thread.sleep(5000);
		WHGenDia.click();
		log.info("Clicked on Gestational diabetes:-");
		// WHMenPro
		Thread.sleep(2000);
		WHMenPro.click();
		log.info("Clicked on Menstrual Problems:-");
		// WHPelID
		Thread.sleep(2000);
		WHPelID.click();
		log.info("Clicked on Pelvic Inflammatory Disease:-");
		// WHPcos
		Thread.sleep(2000);
		WHPcos.click();
		log.info("Clicked on Polycystic ovary syndrome (PCOS):-");
		Thread.sleep(5000);

		// WHUniTI;
		Thread.sleep(5000);
		WHUniTI.click();
		log.info("Clicked on Urinary Tract Infections:-");
		// WHVDis
		Thread.sleep(2000);
		WHVDis.click();
		log.info("Clicked on Vaginal discharge:-");
		// WHMisCar
		Thread.sleep(2000);
		WHMisCar.click();
		log.info("Clicked on Miscarriage:-");
		// WHOther
		Thread.sleep(2000);
		WHOther.click();
		log.info("Clicked on Other:-");
		Thread.sleep(5000);

		WHOthers.sendKeys("Bigboss");
		Thread.sleep(3000);
		
		JavascriptExecutor jse15 = (JavascriptExecutor) driver;
		jse15.executeScript("window.scrollBy(0,250)", "");
		divRightContent.click();
		Thread.sleep(2000);
		// Are you sexually active ?

		Thread.sleep(5000);
		WHPntAns.click();
		log.info("Clicked on  Prefer not to answer:-");
		Thread.sleep(2000);
		WHYes.click();
		log.info("Clicked on Yes :-");
		Thread.sleep(2000);
		WHNo.click();
		log.info("Clicked on No:-");
		Thread.sleep(2000);

		divRightContent.click();
		Thread.sleep(2000);
		Next.click();
		log.info("Clicked on Next Sucessfully:-" + Next.toString());
		Thread.sleep(5000);

	}

}