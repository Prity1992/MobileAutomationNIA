package NiaMobileAutomationPages;

import org.openqa.selenium.By;

import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.BuyNowEntermidiaryEntity;
import com.aqm.staf.library.databin.TWInsuredDetailsIntmyEntity;
import com.aqm.staf.library.databin.TWdetailsIntmyEntity;

import io.appium.java_client.AppiumDriver;

public class TWInsuredDetailsIntmyPage extends MobileScreen {
	
	MobileScreenElement individualeRadioButton;
	MobileScreenElement maleRadioButton;
	MobileScreenElement firstNameTextField;
	MobileScreenElement lastNameTextField;
	MobileScreenElement dateOfBirthTextField;
	MobileScreenElement bldgNoStreetTextField;
	MobileScreenElement stateTextField;
	MobileScreenElement pinCodeTextField;
	MobileScreenElement MobileNoTextField;
	MobileScreenElement alertPartyCodeLabel;
	MobileScreenElement alertPartyCodeOkButton;
	MobileScreenElement saveAndCalculatePremiumButton;
	MobileScreenElement saveAndRecalculatePremiumButton;
	MobileScreenElement approveAndPayButton;
	MobileScreenElement alertProposalApprovedLabel;
	MobileScreenElement alertProposalApprovedOkButton;
	
	public TWInsuredDetailsIntmyPage(AppiumDriver driver, String screenName,String DeviceOS) {

		super(driver,screenName,DeviceOS);
		if(DeviceOS.equalsIgnoreCase("Android")){

			individualeRadioButton=new MobileScreenElement(By.xpath("//android.view.View[@content-desc='Quick Quote Heading']"), "Quick Quote Heading", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			maleRadioButton=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Select Make'and @index='1']"), "Select Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			firstNameTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='First Name *' and @index='9']//following::android.widget.EditText"), "First Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			lastNameTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Last Name *' and @index='13']//following::android.widget.EditText"), "Last Name ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			dateOfBirthTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='7']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			bldgNoStreetTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='9']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			stateTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='11']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			pinCodeTextField=new MobileScreenElement(By.xpath("//android.widget.CheckBox[@text='I agree to all the Terms and Conditions']"), "I agree to all the Terms and Conditions", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			MobileNoTextField=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Know your premium' and @resource-id='twoWheelerPolicy-btn']"), "Know your premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
			alertPartyCodeLabel=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='3']"), "Vehicle Model", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			alertPartyCodeOkButton=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Nearest City of purchase/registration']"), "Nearest City of purchase/registration", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			saveAndCalculatePremiumButton=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='7']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			saveAndRecalculatePremiumButton=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='9']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			approveAndPayButton=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='11']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			alertProposalApprovedLabel=new MobileScreenElement(By.xpath("//android.widget.CheckBox[@text='I agree to all the Terms and Conditions']"), "I agree to all the Terms and Conditions", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			alertProposalApprovedOkButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Know your premium' and @resource-id='twoWheelerPolicy-btn']"), "Know your premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		}
	}
	public void fillTWInsuredDetails(TWInsuredDetailsIntmyEntity tWInsuredDetailsIntmyEntity,CustomAssert assertReference ) throws InterruptedException{

		if(tWInsuredDetailsIntmyEntity.getAction().equalsIgnoreCase("add")||tWInsuredDetailsIntmyEntity.getAction().equalsIgnoreCase("edit")){
			if(tWInsuredDetailsIntmyEntity.getBooleanValueForField("ConfigIndividual")){
				click(individualeRadioButton);
			}
			if(tWInsuredDetailsIntmyEntity.getBooleanValueForField("ConfigMale")){
				click(maleRadioButton);
			}
			if(tWInsuredDetailsIntmyEntity.getBooleanValueForField("ConfigFirstName")){
				clearAndSendKeys(firstNameTextField, tWInsuredDetailsIntmyEntity.getStringValueForField("FirstName"));
			}
			if(tWInsuredDetailsIntmyEntity.getBooleanValueForField("ConfigLastName")){
				clearAndSendKeys(lastNameTextField, tWInsuredDetailsIntmyEntity.getStringValueForField("LastName"));
			}
			if(tWInsuredDetailsIntmyEntity.getBooleanValueForField("ConfigDateOfBirth")){
				clearAndSendKeys(dateOfBirthTextField, tWInsuredDetailsIntmyEntity.getStringValueForField("DateOfBirth"));
			}
			if(tWInsuredDetailsIntmyEntity.getBooleanValueForField("ConfigBldgNoStreet")){
				clearAndSendKeys(bldgNoStreetTextField, tWInsuredDetailsIntmyEntity.getStringValueForField("BldgNoStreet"));
			}
			if(tWInsuredDetailsIntmyEntity.getBooleanValueForField("ConfigState")){
				clearAndSendKeys(stateTextField, tWInsuredDetailsIntmyEntity.getStringValueForField("State"));
			}
			if(tWInsuredDetailsIntmyEntity.getBooleanValueForField("ConfigPinCode")){
				clearAndSendKeys(pinCodeTextField, tWInsuredDetailsIntmyEntity.getStringValueForField("PinCode"));
			}
			if(tWInsuredDetailsIntmyEntity.getBooleanValueForField("ConfigMobileNo")){
				clearAndSendKeys(MobileNoTextField, tWInsuredDetailsIntmyEntity.getStringValueForField("MobileNo"));
			}
			
		}
	}
	public void clickOnSaveAndCalculateButton(TWInsuredDetailsIntmyEntity tWInsuredDetailsIntmyEntity) {
		if(tWInsuredDetailsIntmyEntity.getBooleanValueForField("ConfigSaveAndCalculate")){
			click(saveAndCalculatePremiumButton);
		}
	}
	public void clickOnSaveAndRECalculateButton(TWInsuredDetailsIntmyEntity tWInsuredDetailsIntmyEntity) {
		if(tWInsuredDetailsIntmyEntity.getBooleanValueForField("ConfigSaveAndReCalculate")){
			click(saveAndRecalculatePremiumButton);
		}
	}
	public void clickOnApproveAndPayButton(TWInsuredDetailsIntmyEntity tWInsuredDetailsIntmyEntity) {
		if(tWInsuredDetailsIntmyEntity.getBooleanValueForField("ConfigApproveAndPay")){
			click(approveAndPayButton);
		}
	}
	
	public void fillandSubmitTWInsuredDetails(TWInsuredDetailsIntmyEntity tWInsuredDetailsIntmyEntity,CustomAssert assertReference,String stepgroup) throws InterruptedException{
		if(isConfigTrue(tWInsuredDetailsIntmyEntity.getConfigExecute()))		
		{

			fillTWInsuredDetails(tWInsuredDetailsIntmyEntity, assertReference);
			clickOnSaveAndCalculateButton(tWInsuredDetailsIntmyEntity);
			clickOnSaveAndRECalculateButton(tWInsuredDetailsIntmyEntity);
		}
	}
}
