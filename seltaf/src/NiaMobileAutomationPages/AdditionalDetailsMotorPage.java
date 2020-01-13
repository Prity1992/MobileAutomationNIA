package NiaMobileAutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AdditionalDetailsMotorEntity;
import io.appium.java_client.AppiumDriver;

public class AdditionalDetailsMotorPage extends MobileScreen {

	MobileScreenElement quoteNoLabel;
	MobileScreenElement estimatedPremiumLabel;
	MobileScreenElement totalIDVLabel;
	MobileScreenElement additionalVehicleMaximize;
	MobileScreenElement BackButton;
	MobileScreenElement viewBreakupButton;
	MobileScreenElement SaveAndContinueButton;
	MobileScreenElement engineNoTextField;
	MobileScreenElement chassisNoTextField;
	MobileScreenElement colourOfVehicleDropDown;
	MobileScreenElement ColourAsPerRCBookTextField;
	MobileScreenElement policyExcessTextField;

	MobileScreenElement personalDetailsMaximize;
	MobileScreenElement relationshipWithRegisteredUserDropDown;
	MobileScreenElement firstNameTextField;
	MobileScreenElement lastNameTextField;
	MobileScreenElement maleRadioButton;
	MobileScreenElement femaleRadioButton;
	MobileScreenElement dobTextField;
	MobileScreenElement bldgNoStreetTextField;
	MobileScreenElement stateTextField;
	MobileScreenElement pinCodeTextField;
	MobileScreenElement cityTextField;
	MobileScreenElement mobileNoTextField;
	MobileScreenElement emailidNoTextField;
	MobileScreenElement adharCardLinkYesRadioButton;
	MobileScreenElement adharCardLinkNoRadioButton;
	MobileScreenElement nameLabel;
	MobileScreenElement dateLabel;
	MobileScreenElement iHereByCheckBox;
	MobileScreenElement submitButton;
	MobileScreenElement saveAndContinueButton;
	MobileScreenElement submitQuoteButton;
	MobileScreenElement colorRadioButton;
	MobileScreenElement selfRadioButton;
	MobileScreenElement oKButton;
	
	
	
	


	public AdditionalDetailsMotorPage(AppiumDriver driver, String screenName,String DeviceOS) {

		super(driver,screenName,DeviceOS);
		if(DeviceOS.equalsIgnoreCase("Android")){

			quoteNoLabel=new MobileScreenElement(By.xpath("//android.view.View[contains(@text='Quote No.')]"), "Quote No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			totalIDVLabel=new MobileScreenElement(By.xpath("//android.view.View[contains(@text='Total IDV')]") ,"Total IDV", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			estimatedPremiumLabel= new MobileScreenElement(By.xpath("//android.view.View[contains(@text='Estimated Premium')]") ,"Estimated Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			additionalVehicleMaximize=new MobileScreenElement(By.xpath("//android.view.View[@text='Additional Vehicle Details']"), "Additional Vehicle Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			BackButton=new MobileScreenElement(By.xpath("android.view.View[@text='back_icon Back']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			viewBreakupButton=new MobileScreenElement(By.xpath("android.view.View[@text='View Breakup']"), "BAck", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			SaveAndContinueButton=new MobileScreenElement(By.xpath("android.view.View[@text='Basic Premium']"), "I agree to all the Terms and Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			engineNoTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='−']//following::android.widget.EditText[1]"), "Engine No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			chassisNoTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Engine No.' and @index='0']//following::android.widget.EditText[1]"), "Chassis No.", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			colourOfVehicleDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@resource-id='vehicleColor']"), "vehicleColor", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			ColourAsPerRCBookTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Colour of vehicle']//following::android.widget.EditText[1]"), "Colour as per RC Book ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			policyExcessTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='7']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

			personalDetailsMaximize=new MobileScreenElement(By.xpath("//android.view.View[@text='Financier Details(Optional) no errors icon ']//following::android.view.View"), "Personal Details error icon ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			relationshipWithRegisteredUserDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='relationType' and @index='0']"), "relationType", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			firstNameTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Basic Premium']"), "I agree to all the Terms and Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			lastNameTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Coverage Type']"), "Coverage Type", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			maleRadioButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Male']"), "Male", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			femaleRadioButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Female']"), "Female", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			dobTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Date of Birth (dd/mm/yyyy)']"), "Date of Birth (dd/mm/yyyy)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			bldgNoStreetTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='7']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			stateTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='9']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			pinCodeTextField=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Proceed']"), "Proceed", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			cityTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Basic Premium']"), "I agree to all the Terms and Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			mobileNoTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Coverage Type']"), "Coverage Type", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			emailidNoTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='ENHANCEMENT']"), "ENHANCEMENT", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			adharCardLinkYesRadioButton=new MobileScreenElement(By.xpath("//android.view.View[@index='1']"), "Yes", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			adharCardLinkNoRadioButton=new MobileScreenElement(By.xpath("//android.view.View[@index='2']"), "No", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			iHereByCheckBox=new MobileScreenElement(By.xpath("//android.widget.CheckBox[@index='0']"), "I, hereby agree to link my Aadhaar Number with this policy within 6 months from the date of inception of policy as per IRDAI Circular no IRDAI/SDD/MISC/CIR/248/11/2017 and IRDAI/SDD/CIR/MISC/047/03/2018.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			submitButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit' and @index='0']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			saveAndContinueButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save & Continue'and @index='2']"), "Save & Continue", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			submitQuoteButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit Quote' and @index='2']"), "Submit Quote", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			oKButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='OK']"), "OK", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		}
		
	}
	public void fillAdditionalVehicleDetails(AdditionalDetailsMotorEntity additionalDetailsMotorEntity,CustomAssert assertReference ) throws InterruptedException{

		if(additionalDetailsMotorEntity.getAction().equalsIgnoreCase("add")||additionalDetailsMotorEntity.getAction().equalsIgnoreCase("edit")){
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigAdditionalVehicleMaximize")){
				click(additionalVehicleMaximize);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigEngineNo")){
				scrollUp();
				clearAndSendKeys(engineNoTextField, additionalDetailsMotorEntity.getStringValueForField("EngineNo"));
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigChassisNo")){
				clearAndSendKeys(chassisNoTextField, additionalDetailsMotorEntity.getStringValueForField("ChassisNo"));
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigColourOfVehicle")){
				click(colourOfVehicleDropDown);
				String color=additionalDetailsMotorEntity.getStringValueForField("ColourOfVehicle");
				colorRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+color+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(colorRadioButton);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigColourAsPerRCBook")){
				scrollDown();
				clearAndSendKeys(ColourAsPerRCBookTextField, additionalDetailsMotorEntity.getStringValueForField("ColourAsPerRCBook"));
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigPolicyExcess")){
				clearAndSendKeys(policyExcessTextField, additionalDetailsMotorEntity.getStringValueForField("PolicyExcess"));
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigPersonalDetailsMaximize")){
				click(personalDetailsMaximize);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigRelationshipWithRegisteredUser")){
				click(relationshipWithRegisteredUserDropDown);
				String relation=additionalDetailsMotorEntity.getStringValueForField("RelationshipWithRegisteredUser");
				selfRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+relation+"'"+"]"), "relation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(selfRadioButton);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigFirstName")){
				clearAndSendKeys(firstNameTextField, additionalDetailsMotorEntity.getStringValueForField("FirstName"));
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigLastName")){
				clearAndSendKeys(lastNameTextField, additionalDetailsMotorEntity.getStringValueForField("LastName"));
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigMale")){
				click(maleRadioButton);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigFemale")){
				click(femaleRadioButton);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigDOB")){
				clearAndSendKeys(dobTextField, additionalDetailsMotorEntity.getStringValueForField("DOB"));
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigBldgNoStreet")){
				clearAndSendKeys(bldgNoStreetTextField, additionalDetailsMotorEntity.getStringValueForField("BldgNoStreet"));
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigState")){
				clearAndSendKeys(stateTextField, additionalDetailsMotorEntity.getStringValueForField("State"));
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigPinCode")){
				clearAndSendKeys(pinCodeTextField, additionalDetailsMotorEntity.getStringValueForField("PinCode"));
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigCity")){
				clearAndSendKeys(cityTextField, additionalDetailsMotorEntity.getStringValueForField("City"));
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigMobileNo")){
				clearAndSendKeys(mobileNoTextField, additionalDetailsMotorEntity.getStringValueForField("MobileNo"));
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigEmailid")){
				clearAndSendKeys(emailidNoTextField, additionalDetailsMotorEntity.getStringValueForField("Emailid"));
			}
			/*if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigAdharCardLinkYes")){
				click(adharCardLinkYesRadioButton);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigAdharCardLinkNo")){
				click(adharCardLinkNoRadioButton);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigIHereBy")){
				check(iHereByCheckBox);
			}*/

		}
		else if (additionalDetailsMotorEntity.getAction().equalsIgnoreCase("verify")) {
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigColourOfVehicle")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("ColourOfVehicle"),fetchValueFromList(colourOfVehicleDropDown),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigEngineNo")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("EngineNo"),fetchValueFromTextFields(engineNoTextField),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigChassisNo")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("ChassisNo"),fetchValueFromTextFields(chassisNoTextField),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigColourAsPerRCBook")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("ColourAsPerRCBook"),fetchValueFromTextFields(ColourAsPerRCBookTextField),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigPolicyExcess")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("PolicyExcess"),fetchValueFromTextFields(policyExcessTextField),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigFirstName")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("FirstName"),fetchValueFromTextFields(firstNameTextField),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigRelationshipWithRegisteredUser")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("RelationshipWithRegisteredUser"),fetchValueFromList(relationshipWithRegisteredUserDropDown),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigLastName")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("LastName"),fetchValueFromTextFields(lastNameTextField),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigDOB")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("DOB"),fetchValueFromTextFields(dobTextField),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigBldgNoStreet")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("BldgNoStreet"),fetchValueFromTextFields(bldgNoStreetTextField),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigState")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("State"),fetchValueFromTextFields(stateTextField),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigPinCode")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("PinCode"),fetchValueFromTextFields(pinCodeTextField),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigCity")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("City"),fetchValueFromTextFields(cityTextField),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigMobileNo")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("MobileNo"),fetchValueFromTextFields(mobileNoTextField),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigEmailid")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("Emailid"),fetchValueFromTextFields(emailidNoTextField),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigQuoteNo")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("QuoteNo"),fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigEstimatedPremium")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("EstimatedPremium"),fetchValueFromFields(estimatedPremiumLabel),AssertionType.WARNING);
			}
			if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigTotalIDV")){
				assertReference.assertEquals(additionalDetailsMotorEntity.getStringValueForField("TotalIDV"),fetchValueFromFields(totalIDVLabel),AssertionType.WARNING);
			}
		}
	}
	public void clickOnSubmitButton(AdditionalDetailsMotorEntity additionalDetailsMotorEntity) {
		if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigSubmit")){
			click(submitButton);
		}
	}
	public void clickOnSaveAndContinueButton(AdditionalDetailsMotorEntity additionalDetailsMotorEntity) {

		if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigSaveAndContinue")){
			scrollDown();
			scrollDown();
			scrollDown();
			scrollDown();
			click(saveAndContinueButton);
		}
	}
	public void clickOnSubmitQuoteButton(AdditionalDetailsMotorEntity additionalDetailsMotorEntity) {
		if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigSubmitQuote")){
			if(additionalDetailsMotorEntity.getTestScenario().equals("NIAMotorMobile_Automation_TC_0001")) {
				scrollDown();
				scrollDown();
			}
			click(submitQuoteButton);
		}
	}
	public void clickOnOkPopUpButton(AdditionalDetailsMotorEntity additionalDetailsMotorEntity) {
		if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigOk")){
			click(oKButton);
		}
 	}
	public void clickOnNoRadioButton(AdditionalDetailsMotorEntity additionalDetailsMotorEntity) {
		if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigAdharCardLinkNo")){
			click(adharCardLinkNoRadioButton);
		}
	}
	public void checkOnIhereByCheckBox(AdditionalDetailsMotorEntity additionalDetailsMotorEntity) {
		if(additionalDetailsMotorEntity.getBooleanValueForField("ConfigIHereBy")){
			check(iHereByCheckBox);
		}
	}
	public void fillAndSubmitAdditionalVehicleDetails(AdditionalDetailsMotorEntity additionalDetailsMotorEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(additionalDetailsMotorEntity.getConfigExecute())) {
			fillAdditionalVehicleDetails(additionalDetailsMotorEntity, assertReference);
			clickOnOkPopUpButton(additionalDetailsMotorEntity);
			clickOnNoRadioButton(additionalDetailsMotorEntity);
			checkOnIhereByCheckBox(additionalDetailsMotorEntity);
			clickOnSubmitButton(additionalDetailsMotorEntity);
			clickOnSaveAndContinueButton(additionalDetailsMotorEntity);
			clickOnSubmitQuoteButton(additionalDetailsMotorEntity);
			
			
			
		}
}
}

