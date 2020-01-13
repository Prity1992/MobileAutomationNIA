package NiaMobileAutomationPages;

import org.openqa.selenium.By;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PrivateCarEntity;
import com.aqm.staf.library.databin.TwoWheelerBasicPremiumEntity;

import io.appium.java_client.AppiumDriver;

public class PrivateCarPage extends MobileScreen{

	MobileScreenElement privateCarLabel;
	MobileScreenElement makeDropDown;
	MobileScreenElement modelTextField;
	MobileScreenElement nearestCityOfPurchaseList;
	MobileScreenElement dateOfFirstPurchaserTextField;
	MobileScreenElement insuredDeclaredValueTextField;
	MobileScreenElement mobileNoTextField;
	MobileScreenElement emailIdTextField;
	MobileScreenElement iAgreeToTheTermsConditionCheckBox;
	MobileScreenElement knowYourPremiumButton;
	MobileScreenElement audiRadioButton;
	MobileScreenElement modelNameLabel;
	MobileScreenElement cityRadioButton;


	public PrivateCarPage(AppiumDriver driver, String screenName,String DeviceOS) {

		super(driver,screenName,DeviceOS);
		if(DeviceOS.equalsIgnoreCase("Android")){

			privateCarLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Coverage Type']"), "Coverage Type", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			makeDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Make*' and @index='0']"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			modelTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='model' and @index='0']"), "Model", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			nearestCityOfPurchaseList=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Nearest City of Purchase / Registration*']"), "LIABILITY", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			dateOfFirstPurchaserTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='Date of First Purchase' and @index='0']"), "Date of First Purchase", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			insuredDeclaredValueTextField=new MobileScreenElement(By.id("android.widget.EditText:IDV"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			mobileNoTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='Mobile' and @index='0']"), "Mobile", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			emailIdTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='Email' and @index='0']"), "Email", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			iAgreeToTheTermsConditionCheckBox=new MobileScreenElement(By.xpath("//android.widget.CheckBox[@text='I agree to the terms & conditions' and @index='3']"), "I agree to the terms & conditions", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			knowYourPremiumButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Know Your Premium' and @index='6']"), "Know Your Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		}
	}
	public void fillPrivateCarDetails(PrivateCarEntity privateCarEntity,CustomAssert assertReference ) throws InterruptedException{

		if(privateCarEntity.getAction().equalsIgnoreCase("add")||privateCarEntity.getAction().equalsIgnoreCase("edit")){
			if(privateCarEntity.getBooleanValueForField("ConfigMake")){
				click(makeDropDown);
				String make=privateCarEntity.getStringValueForField("Make");
				audiRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+make+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(audiRadioButton);
				//selectValueFromList(sumInsuredDropDown, topUpMediclaimEntity.getStringValueForField("SumInsured"));

			}		
			if(privateCarEntity.getBooleanValueForField("ConfigModel")){
				clearAndSendKeys(modelTextField, privateCarEntity.getStringValueForField("Model"));
				String model=privateCarEntity.getStringValueForField("Model");
				modelNameLabel=new MobileScreenElement(By.xpath("//android.view.View[@text="+"'"+model+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(modelNameLabel);
			}
			if(privateCarEntity.getBooleanValueForField("ConfigNearestCityOfPurchase")){
				click(nearestCityOfPurchaseList);
				String city=privateCarEntity.getStringValueForField("NearestCityOfPurchase");
				cityRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+city+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(cityRadioButton);
			}
			if(privateCarEntity.getBooleanValueForField("ConfigDateOfFirstPurchaser")){
				String dateOfFirstPurchaser=RandomCodeGenerator.dateGenerator(privateCarEntity.getStringValueForField("DateOfFirstPurchaser"));
				clearAndSendKeys(dateOfFirstPurchaserTextField,dateOfFirstPurchaser);
				//clearAndSendKeys(dateOfFirstPurchaserTextField, privateCarEntity.getStringValueForField("DateOfFirstPurchaser"));
			}
			if(privateCarEntity.getBooleanValueForField("ConfigInsuredDeclaredValue")){
				clearAndSendKeys(insuredDeclaredValueTextField, privateCarEntity.getStringValueForField("InsuredDeclaredValue"));
			}
			if(privateCarEntity.getBooleanValueForField("ConfigMobileNoTextField")){
				clearAndSendKeys(mobileNoTextField, privateCarEntity.getStringValueForField("MobileNo"));
			}	
			if(privateCarEntity.getBooleanValueForField("ConfigEmailId")){
				clearAndSendKeys(emailIdTextField, privateCarEntity.getStringValueForField("EmailId"));
			}

		}

		else if (privateCarEntity.getAction().equalsIgnoreCase("verify")) {
			if(privateCarEntity.getBooleanValueForField("ConfigMake")){
				assertReference.assertEquals(privateCarEntity.getStringValueForField("ConfigMake"),fetchValueFromList(makeDropDown),AssertionType.WARNING);
			}
			if(privateCarEntity.getBooleanValueForField("ConfigModel")){
				assertReference.assertEquals(privateCarEntity.getStringValueForField("Model"),fetchValueFromTextFields(modelTextField),AssertionType.WARNING);
			}
			if(privateCarEntity.getBooleanValueForField("ConfigNearestCityOfPurchase")){
				assertReference.assertEquals(privateCarEntity.getStringValueForField("NearestCityOfPurchase"),fetchValueFromList(nearestCityOfPurchaseList),AssertionType.WARNING);
			}
			if(privateCarEntity.getBooleanValueForField("ConfigDateOfFirstPurchaser")){
				assertReference.assertEquals(privateCarEntity.getStringValueForField("DateOfFirstPurchaser"),fetchValueFromTextFields(dateOfFirstPurchaserTextField),AssertionType.WARNING);
			}
			if(privateCarEntity.getBooleanValueForField("ConfigInsuredDeclaredValue")){
				assertReference.assertEquals(privateCarEntity.getStringValueForField("InsuredDeclaredValue"),fetchValueFromTextFields(insuredDeclaredValueTextField),AssertionType.WARNING);
			}
			if(privateCarEntity.getBooleanValueForField("ConfigMobileNo")){
				assertReference.assertEquals(privateCarEntity.getStringValueForField("MobileNo"),fetchValueFromTextFields(mobileNoTextField),AssertionType.WARNING);
			}
			if(privateCarEntity.getBooleanValueForField("ConfigEmailId")){
				assertReference.assertEquals(privateCarEntity.getStringValueForField("EmailId"),fetchValueFromTextFields(emailIdTextField),AssertionType.WARNING);
			}
			if(privateCarEntity.getBooleanValueForField("ConfigPrivateCar")){
				assertReference.assertEquals(privateCarEntity.getStringValueForField("PrivateCar"),fetchValueFromFields(privateCarLabel),AssertionType.WARNING);
			}

		}
	}
	public void checkOnIagreeCheckBox(PrivateCarEntity privateCarEntity) {
		if(privateCarEntity.getBooleanValueForField("ConfigIAgreeToTheTermsCondition")){
			check(iAgreeToTheTermsConditionCheckBox);
		}
	}
	public void clickOnKnowYourPremiumButton(PrivateCarEntity privateCarEntity) {
		if(privateCarEntity.getBooleanValueForField("ConfigKnowYourPremium")){
			scrollDown();
			click(knowYourPremiumButton);
		}
	}
	
	public void fillAndSubmitPrivateCarPageDetails(PrivateCarEntity privateCarEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(privateCarEntity.getConfigExecute())) {
			fillPrivateCarDetails(privateCarEntity, assertReference);
			checkOnIagreeCheckBox(privateCarEntity);
			clickOnKnowYourPremiumButton(privateCarEntity);
			
			
			
			
}
	}
}
