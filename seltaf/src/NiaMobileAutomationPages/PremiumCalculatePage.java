package NiaMobileAutomationPages;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.PackageElement;

import org.openqa.jetty.html.Page;
import org.openqa.selenium.By;

import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.DetailedTravelEntity;
import com.aqm.staf.library.databin.Home_IntermediaryEntity;
import com.aqm.staf.library.databin.LoginEntity;
import com.aqm.staf.library.databin.PremiumCalculateEntity;

import io.appium.java_client.AppiumDriver;

public class PremiumCalculatePage extends MobileScreen{
	//Pravina
	MobileScreenElement sumInsuredDropDown;
	MobileScreenElement cityOfRecidenceDropDown;
	MobileScreenElement dateOfBirthPrposerTextField;
	MobileScreenElement dateOfBirthdateOfBirthDaughterTextField;
	MobileScreenElement dependentTypeDropDown;
	MobileScreenElement termsAndConditions;
	MobileScreenElement saveAndCalculatePremiumButton;
	MobileScreenElement continueButton;
	MobileScreenElement policyStartDateTextFiled;
	MobileScreenElement policyEndDateTextFiled;
	MobileScreenElement nomineeNameTextFiled;
	MobileScreenElement relationshipwiththeNomineeDropDown;
	MobileScreenElement nextButton;
	
	
	
	public PremiumCalculatePage(AppiumDriver driver, String screenName,String DeviceOS)
	{
		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android"))
		{	
			sumInsuredDropDown          = new MobileScreenElement(By.xpath("android.widget.Spinner[@index='2']"), "sumInsured", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			cityOfRecidenceDropDown     = new MobileScreenElement(By.xpath("android.widget.Spinner[@index='4']"), "cityOfRecidence", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			dateOfBirthPrposerTextField =new MobileScreenElement(By.xpath("android.widget.EditText[text(),'Date of Birth*']"), "cityOfRecidence", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			dateOfBirthdateOfBirthDaughterTextField=new MobileScreenElement(By.xpath("android.widget.EditText[text(),'Date of Birth* Dependent Type*']]"), "dateOfBirthdateOfBirthDaughter", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			dependentTypeDropDown       = new MobileScreenElement(By.xpath("android.widget.Spinner[@index='5']"), "dependent Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			termsAndConditions          = new MobileScreenElement(By.xpath("android.widget.CheckBox[@index='1']"), "TermsAndConditions", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			saveAndCalculatePremiumButton=new MobileScreenElement(By.xpath("android.widget.Button[@index='0']"), "Save And Calculate Premium Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			continueButton               = new MobileScreenElement(By.xpath("android.widget.Button[@content-desc='Continue']"), "Continue Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			policyStartDateTextFiled     = new MobileScreenElement(By.xpath("android.widget.EditText[@index='1']"), "Policy Start Date", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			policyEndDateTextFiled       = new MobileScreenElement(By.xpath("android.widget.EditText[@index='1']"), "Policy End Date", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			nomineeNameTextFiled         = new MobileScreenElement(By.xpath("android.widget.EditText[text(),'Nominee Name*']"), "Nominee Name", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			relationshipwiththeNomineeDropDown = new MobileScreenElement(By.xpath("android.widget.Button[@content-desc='Relationship with the Nominee']"), "Continue Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			nextButton                   = new MobileScreenElement(By.xpath("android.widget.Button[@content-desc='Next']"), "Next Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);


		}
	}
	
	public  void fillAndSubmitBasicInformation(PremiumCalculateEntity PremiumCalculateEntity) {
		if(PremiumCalculateEntity.getAction().equalsIgnoreCase("add") && PremiumCalculateEntity.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")) {
	 
			if(PremiumCalculateEntity.getBooleanValueForField("ConfigSumInsured")){
				selectValueFromList(sumInsuredDropDown, PremiumCalculateEntity.getStringValueForField("SumInsured"));
			}
			
			if(PremiumCalculateEntity.getBooleanValueForField("ConfigcityOfRecidenceDropDown")){
				selectValueFromList(cityOfRecidenceDropDown, PremiumCalculateEntity.getStringValueForField("cityOfRecidence"));
			}
			
			if (PremiumCalculateEntity.getBooleanValueForField("ConfigDateOfBirthPrposer"))
			{
			String dateOfBirthPrposer=RandomCodeGenerator.dateGenerator(PremiumCalculateEntity.getStringValueForField("DateOfBirthPrposer"));
			clearAndEnterDate(dateOfBirthPrposerTextField, dateOfBirthPrposer);
			}
			
			if (PremiumCalculateEntity.getBooleanValueForField("ConfigDateOfBirthDaughter"))
			{
			String dateOfBirthDaughter=RandomCodeGenerator.dateGenerator(PremiumCalculateEntity.getStringValueForField("DateOfBirthDaughter"));
			clearAndEnterDate(dateOfBirthdateOfBirthDaughterTextField, dateOfBirthDaughter);
			}
			
			if(PremiumCalculateEntity.getBooleanValueForField("ConfigDependentType"))
			{
				selectValueFromList(dependentTypeDropDown, PremiumCalculateEntity.getStringValueForField("DependentType"));
			}
			//fillDaughter(PremiumCalculateEntity);
			
			if(PremiumCalculateEntity.getBooleanValueForField("ConfigTermsAndConditions"))
			{
				click(termsAndConditions);
			}
			
			if(PremiumCalculateEntity.getBooleanValueForField("ConfigSaveAndContinue"))
			{
				click(saveAndCalculatePremiumButton);
			}
			
			if(PremiumCalculateEntity.getBooleanValueForField("ConfigContinue"))
			{
				click(continueButton);
			}
		}
	}
	
	
	public  void fillDaughter(PremiumCalculateEntity PremiumCalculateEntity) {
		
		
	}
	
	public  void fillAndSubmitPolicyHolderInformation(PremiumCalculateEntity PremiumCalculateEntity) {
			
		}
	public  void fillAndSubmitProposerInformation(PremiumCalculateEntity PremiumCalculateEntity) {
		if(PremiumCalculateEntity.getAction().equalsIgnoreCase("add") && PremiumCalculateEntity.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")) {
			
		fillAndSubmitDaughterInformation(PremiumCalculateEntity);
		}
	}
	public  void fillAndSubmitDaughterInformation(PremiumCalculateEntity PremiumCalculateEntity) {
		
	}
	public  void fillAndSubmitPolicyPeriodInformation(PremiumCalculateEntity PremiumCalculateEntity) 
	{
		if(PremiumCalculateEntity.getAction().equalsIgnoreCase("add") && PremiumCalculateEntity.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")) {
			if(PremiumCalculateEntity.getBooleanValueForField("ConfigPolicyStartDate")) {
			PremiumCalculateEntity.setStringValueForField("PolicyStartDate", fetchValueFromTextFields(policyStartDateTextFiled));
			}
			
			if(PremiumCalculateEntity.getBooleanValueForField("ConfigPolicyEndDate")) {
			PremiumCalculateEntity.setStringValueForField("policyEndDate", fetchValueFromTextFields(policyEndDateTextFiled));
			}
		}
	}
	
	public  void fillAndSubmitNomineeDetaild(PremiumCalculateEntity PremiumCalculateEntity) {
		if(PremiumCalculateEntity.getAction().equalsIgnoreCase("add") && PremiumCalculateEntity.getStringValueForField("LOBName").equalsIgnoreCase("HEALTH")) {
		
			if(PremiumCalculateEntity.getBooleanValueForField("ConfigNomineeName")){
				clearAndSendKeys(nomineeNameTextFiled, PremiumCalculateEntity.getStringValueForField("NomineeName"));
			}
			if(PremiumCalculateEntity.getBooleanValueForField("ConfigRelationshipWiththeNominee")){
				selectValueFromList(relationshipwiththeNomineeDropDown, PremiumCalculateEntity.getStringValueForField("RelationshipWiththeNominee"));
			}
			if(PremiumCalculateEntity.getBooleanValueForField("ConfigNextButton"))
			{
				click(nextButton);
			}
			
		}
	}
	public  void fillAndSubmitRelationDetails(PremiumCalculateEntity PremiumCalculateEntity) {
		
	}
	public  void fillAndSubmitBuyNow(PremiumCalculateEntity PremiumCalculateEntity) {
		if(PremiumCalculateEntity.getAction().equalsIgnoreCase("add") && PremiumCalculateEntity.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")) {
			
		}
	}
	public  void fillAndSubmitVehicleDetails(PremiumCalculateEntity PremiumCalculateEntity) {
		if(PremiumCalculateEntity.getAction().equalsIgnoreCase("add") && PremiumCalculateEntity.getStringValueForField("LOBName").equalsIgnoreCase("MOTOR")) {
			
		}
	}
	public  void fillAndSubmitSelectOption(PremiumCalculateEntity PremiumCalculateEntity) {
		if(PremiumCalculateEntity.getAction().equalsIgnoreCase("add") && PremiumCalculateEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")) {
			
		}
	}
	public  void fillAndSubmitAdditionalDetails(PremiumCalculateEntity PremiumCalculateEntity) {
		if(PremiumCalculateEntity.getAction().equalsIgnoreCase("add") && PremiumCalculateEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")) {
			
		}
	}
	public  void fillAndSubmitAddressAndFinanciarDetails(PremiumCalculateEntity PremiumCalculateEntity) {
		if(PremiumCalculateEntity.getAction().equalsIgnoreCase("add") && PremiumCalculateEntity.getStringValueForField("LOBName").equalsIgnoreCase("MISCELLANEOUS")) {
			
		}
	}

	public  void fillAndSubmitPremiumCalculatePage(PremiumCalculateEntity PremiumCalculateEntity,CustomAssert customAssert,String stepGroup) {
		fillAndSubmitBasicInformation(PremiumCalculateEntity);
		fillAndSubmitPolicyHolderInformation(PremiumCalculateEntity);
		fillAndSubmitProposerInformation(PremiumCalculateEntity);
		fillAndSubmitPolicyPeriodInformation(PremiumCalculateEntity);
		fillAndSubmitNomineeDetaild(PremiumCalculateEntity);
		fillAndSubmitRelationDetails(PremiumCalculateEntity);
		fillAndSubmitBuyNow(PremiumCalculateEntity);
		fillAndSubmitVehicleDetails(PremiumCalculateEntity);
		fillAndSubmitSelectOption(PremiumCalculateEntity);
		fillAndSubmitAdditionalDetails(PremiumCalculateEntity);
		fillAndSubmitAddressAndFinanciarDetails(PremiumCalculateEntity);
		
	}
}
