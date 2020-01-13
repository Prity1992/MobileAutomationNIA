package NiaMobileAutomationPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PersonalAccidentDetEntity;
import io.appium.java_client.AppiumDriver;

public class PersonalAccidentDet extends MobileScreen {
	MobileScreenElement coverageRequiredForDropDown;
	MobileScreenElement noOfChildrenToBeCovered;
	MobileScreenElement dateOfBirth;
	MobileScreenElement dateOfBirthTextField;
	MobileScreenElement grossMonthlyIncome;
	MobileScreenElement occupation;
	MobileScreenElement occupationText;
	MobileScreenElement	requiredSumInsuredForSelftext;
	MobileScreenElement requiredSumInsuredForSelf;
	MobileScreenElement mobileNotext;
	MobileScreenElement mobileNo;
	MobileScreenElement emailIDtext;
	MobileScreenElement emailID;
	MobileScreenElement knowYourPremium;
	MobileScreenElement reCalculatePremium;
	MobileScreenElement buyOnline;
	MobileScreenElement sumInsuredInformation;
	MobileScreenElement childDOB;
	MobileScreenElement additionalCoverageLink;
	MobileScreenElement yesRadioButton;
	MobileScreenElement noRadioButton;
	MobileScreenElement saveAndContinueButton;
	MobileScreenElement SelfradioButtton;
	MobileScreenElement grossMonthlyIncometext;
	

	public PersonalAccidentDet(AppiumDriver driver, String screenName, String DeviceOS) {
		super(driver, screenName, DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (DeviceOS.equalsIgnoreCase("Android")) {
			coverageRequiredForDropDown = new MobileScreenElement(By.xpath("//android.view.View[@text='Coverage Required for']"),"Coverage Required For", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
			noOfChildrenToBeCovered = new MobileScreenElement(By.xpath("//android.view.View[@index='3']"), "No Of Children", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			dateOfBirth = new MobileScreenElement(By.xpath("//android.view.View[@text='Date of Birth(dd/mm/yyyy)']"), "Date Of Birth", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			dateOfBirthTextField = new MobileScreenElement(By.xpath("//android.view.View[@text='Date of Birth(dd/mm/yyyy)']//preceding::android.widget.EditText[1]"), "Date Of Birth", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			grossMonthlyIncometext= new MobileScreenElement(By.xpath("//android.view.View[@text='Gross Monthly Income']"), "Gross Monthly ncome", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			grossMonthlyIncome = new MobileScreenElement(By.xpath("//android.view.View[@text='Gross Monthly Income']//preceding::android.widget.EditText[1]"), "Gross Monthly Income", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			occupation = new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text='Accountants']"), "Occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			occupationText=new MobileScreenElement(By.xpath("//android.view.View[@text='Occupation']"), "Occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			requiredSumInsuredForSelftext=new MobileScreenElement(By.xpath("//android.view.View[@text='Required Sum Insured for Self']"), "Required Sum Insured for Self", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			requiredSumInsuredForSelf = new MobileScreenElement(By.xpath("//android.view.View[@text='Required Sum Insured for Self']/preceding::android.widget.EditText[1]"), "Required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			mobileNotext=new MobileScreenElement(By.xpath("//android.view.View[@text='Mobile No.']"), "mo no text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			mobileNo = new MobileScreenElement(By.xpath("//android.view.View[@text='Mobile No.']/preceding::android.widget.EditText[1]"), "Mobile No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			emailIDtext=new MobileScreenElement(By.xpath("//android.view.View[@text='Email ID']"), "email id", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			emailID=new MobileScreenElement(By.xpath("//android.view.View[@text='Email ID']/preceding::android.widget.EditText[1]"), "Emailid", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			knowYourPremium = new MobileScreenElement(By.xpath("//android.widget.Button[@text='Know Your Premium']"), "Know Your Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			reCalculatePremium = new MobileScreenElement(By.xpath("//android.widget.Button[@text='Recalculate Premium']"), "Re Calculate Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			buyOnline = new MobileScreenElement(By.xpath("//android.widget.Button[@index='1']"), "Buy Online", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			sumInsuredInformation = new MobileScreenElement(By.xpath("//android.view.View[@content-desc='Sum Insured Information Link']"), "Sum Insured Information", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			childDOB = new MobileScreenElement(By.xpath("//android.widget.EditText[@index='0']"), "Child DOB", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			additionalCoverageLink =new MobileScreenElement(By.xpath("//android.view.View[@content-desc='Additional coverage Link']"), "Additional Coverage Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			yesRadioButton =new MobileScreenElement(By.xpath("//android.widget.RadioButton[@index='0']"), "Yes", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			noRadioButton = new MobileScreenElement(By.xpath("//android.widget.RadioButton[@index='2']"), "No", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			saveAndContinueButton = new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save & Continue']"), "Save And Continue", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			SelfradioButtton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text='Self']"), "No", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

		}
	}
	
public void fillPersonalAccidentDet(PersonalAccidentDetEntity personalAccidentDetEntity,CustomAssert assertReference) throws InterruptedException {
	if (personalAccidentDetEntity.getAction().equalsIgnoreCase("add") || personalAccidentDetEntity.getAction().equalsIgnoreCase("edit")) {
		
		if (personalAccidentDetEntity.getBooleanValueForField("ConfigCoverageRequiredFor")) {
			
			click(coverageRequiredForDropDown);
			click(SelfradioButtton);		
		}
		if (personalAccidentDetEntity.getBooleanValueForField("ConfigNoOfChildren")) {
			selectValueFromList(noOfChildrenToBeCovered,personalAccidentDetEntity.getStringValueForField("NoOfChildren"));
		}
		if(personalAccidentDetEntity.getBooleanValueForField("ConfigDateOfBirth")) {
			click(dateOfBirth);
			clearAndSendKeys(dateOfBirthTextField,personalAccidentDetEntity.getStringValueForField("DateOfBirth"));
		}
		if(personalAccidentDetEntity.getBooleanValueForField("ConfigGrossMonthlyIncome")) {
			click(grossMonthlyIncometext);
			clearAndSendKeys(grossMonthlyIncome,personalAccidentDetEntity.getStringValueForField("GrossMonthlyIncome"));
		}
		if(personalAccidentDetEntity.getBooleanValueForField("ConfigOccupation")) {
			 click(occupationText);
		     click(occupation);
		}
		if(personalAccidentDetEntity.getBooleanValueForField("ConfigRequiredSumInsuredForself")) {
			scrollDown();
			click(requiredSumInsuredForSelftext);
			clearAndSendKeys(requiredSumInsuredForSelf,personalAccidentDetEntity.getStringValueForField("RequiredSumInsuredForSelf"));
		}
		if(personalAccidentDetEntity.getBooleanValueForField("ConfigMobileNo")) {
			click(mobileNotext);
			clearAndSendKeys(mobileNo,personalAccidentDetEntity.getStringValueForField("MobileNo"));
		}
		if(personalAccidentDetEntity.getBooleanValueForField("ConfigEmailID")) {
			scrollDown();
			click(emailIDtext);
			clearAndSendKeys(emailID,personalAccidentDetEntity.getStringValueForField("EmailID"));
		}
		if(personalAccidentDetEntity.getBooleanValueForField("ConfigKnowYourPremium")) {
			click(knowYourPremium);
		}
		if(personalAccidentDetEntity.getBooleanValueForField("ConfigReCalculatePremium")) {
			click(reCalculatePremium);
		}
		if(personalAccidentDetEntity.getBooleanValueForField("ConfigBuyOnline")) {
			click(buyOnline);
		}
		if(personalAccidentDetEntity.getBooleanValueForField("ConfigSumInsuredInformation")) {
			click(sumInsuredInformation);
			if(personalAccidentDetEntity.getBooleanValueForField("ConfigChildDOB")) {
				clearAndSendKeys(childDOB,personalAccidentDetEntity.getStringValueForField("ChildDOb"));
			}
		}
		if(personalAccidentDetEntity.getBooleanValueForField("ConfigAdditionalCoverageLink")){
			click(additionalCoverageLink);
			if(personalAccidentDetEntity.getBooleanValueForField("ConfigYesRadioButton")){
				click(yesRadioButton);
			}
			else if(personalAccidentDetEntity.getBooleanValueForField("ConfigNoRadioButton")){
				click(noRadioButton);
			}
		}
		if(personalAccidentDetEntity.getBooleanValueForField("ConfigRecalPremium")) {
			scrollDown();
			Thread.sleep(2000);
			click(reCalculatePremium);
		}
		if(personalAccidentDetEntity.getBooleanValueForField("ConfigSaveAndcontinue")) {
			click(saveAndContinueButton);
		}
	}
	}
	public void fillAndSubmitPersonalAccidentDet(PersonalAccidentDetEntity personalAccidentDetEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(personalAccidentDetEntity.getConfigExecute()))		
		{
			fillPersonalAccidentDet(personalAccidentDetEntity, assertReference);
			
		}
	}
}