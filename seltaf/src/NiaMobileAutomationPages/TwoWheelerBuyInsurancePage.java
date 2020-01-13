package NiaMobileAutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.TwoWheelerBuyInsuranceEntity;

import io.appium.java_client.AppiumDriver;

public class TwoWheelerBuyInsurancePage extends MobileScreen{

	MobileScreenElement twoWheelerTab;
	MobileScreenElement buyInsuranceForNewVehicleTab;
	MobileScreenElement quickQuoteLable;
	MobileScreenElement makeDropDown;
	MobileScreenElement vehicleModelDropDown;
    MobileScreenElement nearestCityOfPurchaseDropDown;
	MobileScreenElement insuredDeclaredValueTextField;
	MobileScreenElement mobilenumberTextField;
	MobileScreenElement emailIdtextField;
	MobileScreenElement iAgreeCheckBox;
	MobileScreenElement knowYourPremiumButton;

	MobileScreenElement makerRadioButton;
	MobileScreenElement modelNameLabel;
	MobileScreenElement cityRadioButton;
	MobileScreenElement oKButton;
   


	
	

	
	public TwoWheelerBuyInsurancePage(AppiumDriver driver, String screenName,String DeviceOS) {

		super(driver,screenName,DeviceOS);
		if(DeviceOS.equalsIgnoreCase("Android")){

			quickQuoteLable=new MobileScreenElement(By.xpath("//android.view.View[@content-desc='Quick Quote Heading']"), "Quick Quote Heading", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			makeDropDown=new MobileScreenElement(By.xpath("//android.view.View[@text='Make*']//following::android.widget.Spinner[1]"), "Select Make Drop Down", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			vehicleModelDropDown=new MobileScreenElement(By.xpath("//android.view.View[@text='Vehicle Model*']//following::android.widget.Spinner[1]"), "Vehicle Model Drop Down", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			nearestCityOfPurchaseDropDown=new MobileScreenElement(By.xpath("//android.view.View[@text='Nearest City of Purchase/Registration*']//following::android.widget.Spinner[1]"), "Nearest City of purchase/registration", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			insuredDeclaredValueTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='7']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			mobilenumberTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='9']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			emailIdtextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='11']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			iAgreeCheckBox=new MobileScreenElement(By.xpath("//android.view.View[@text='I am the registered owner of the vehicle and I agree to ']//preceding::android.widget.CheckBox[1]"), "I agree to all the Terms and Conditions", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			
			
			knowYourPremiumButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Know Your Premium']"), "Know your premium Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			oKButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='OK']"), "Ok Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			
		}
	}
	public void fillTwoWheelerBuyInsurance(TwoWheelerBuyInsuranceEntity twoWheelerBuyInsuranceEntity,CustomAssert assertReference ) throws InterruptedException{

		if(twoWheelerBuyInsuranceEntity.getAction().equalsIgnoreCase("add")||twoWheelerBuyInsuranceEntity.getAction().equalsIgnoreCase("edit")){

			if(twoWheelerBuyInsuranceEntity.getBooleanValueForField("ConfigMake")){
					click(makeDropDown);
					String make=twoWheelerBuyInsuranceEntity.getStringValueForField("Make");
					makerRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+make+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(makerRadioButton);
					click(oKButton);
					//selectValueFromList(sumInsuredDropDown, topUpMediclaimEntity.getStringValueForField("SumInsured"));

				}		
			if(twoWheelerBuyInsuranceEntity.getBooleanValueForField("ConfigVehicleModel")){
				click(vehicleModelDropDown);
				//clearAndSendKeys(vehicleModelTextField, twoWheelerBuyInsuranceEntity.getStringValueForField("VehicleModel"));
				String model=twoWheelerBuyInsuranceEntity.getStringValueForField("VehicleModel");
				modelNameLabel=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+model+"'"+"]"), "VehicleModel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(modelNameLabel);
				click(oKButton);
			}
			if(twoWheelerBuyInsuranceEntity.getBooleanValueForField("ConfigNearestCityOfPurchase")){
				click(nearestCityOfPurchaseDropDown);
				String city=twoWheelerBuyInsuranceEntity.getStringValueForField("NearestCityOfPurchase");
				cityRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+city+"'"+"]"), "city", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(cityRadioButton);
				click(oKButton);
				
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.SeekBar[@index='0']")));
				
				//WebDriverWait wait = new WebDriverWait(AppiumController.instance.driver, 20); wait.until(ExpectedConditions.visibilityOf(elementName));
			}
			if(twoWheelerBuyInsuranceEntity.getBooleanValueForField("ConfigInsuredDeclaredValue")){
				clearAndSendKeys(insuredDeclaredValueTextField, twoWheelerBuyInsuranceEntity.getStringValueForField("InsuredDeclaredValue"));
			}
			if(twoWheelerBuyInsuranceEntity.getBooleanValueForField("ConfigMobilenumber")){
				clearAndSendKeys(mobilenumberTextField, twoWheelerBuyInsuranceEntity.getStringValueForField("Mobilenumber"));
			}
			if(twoWheelerBuyInsuranceEntity.getBooleanValueForField("ConfigEmailId")){
				clearAndSendKeys(emailIdtextField, twoWheelerBuyInsuranceEntity.getStringValueForField("EmailId"));
			}
		}
		else if (twoWheelerBuyInsuranceEntity.getAction().equalsIgnoreCase("verify")) {
			if(twoWheelerBuyInsuranceEntity.getBooleanValueForField("ConfigMake")){
				assertReference.assertEquals(twoWheelerBuyInsuranceEntity.getStringValueForField("ConfigMake"),fetchValueFromList(makeDropDown),AssertionType.WARNING);
			}
			if(twoWheelerBuyInsuranceEntity.getBooleanValueForField("ConfigVehicleModel")){
				assertReference.assertEquals(twoWheelerBuyInsuranceEntity.getStringValueForField("ConfigVehicleModel"),fetchValueFromTextFields(vehicleModelDropDown),AssertionType.WARNING);
			}
			if(twoWheelerBuyInsuranceEntity.getBooleanValueForField("ConfigNearestCityOfPurchase")){
				assertReference.assertEquals(twoWheelerBuyInsuranceEntity.getStringValueForField("ConfigNearestCityOfPurchase"),fetchValueFromList(nearestCityOfPurchaseDropDown),AssertionType.WARNING);
			}
			if(twoWheelerBuyInsuranceEntity.getBooleanValueForField("ConfigInsuredDeclaredValue")){
				assertReference.assertEquals(twoWheelerBuyInsuranceEntity.getStringValueForField("InsuredDeclaredValue"),fetchValueFromTextFields(insuredDeclaredValueTextField),AssertionType.WARNING);
			}
			if(twoWheelerBuyInsuranceEntity.getBooleanValueForField("ConfigMobilenumber")){
				assertReference.assertEquals(twoWheelerBuyInsuranceEntity.getStringValueForField("mobilenumberTextField"),fetchValueFromTextFields(mobilenumberTextField),AssertionType.WARNING);
			}
			if(twoWheelerBuyInsuranceEntity.getBooleanValueForField("ConfigEmailId")){
				assertReference.assertEquals(twoWheelerBuyInsuranceEntity.getStringValueForField("ConfigEmailId"),fetchValueFromTextFields(emailIdtextField),AssertionType.WARNING);
			}
			if(twoWheelerBuyInsuranceEntity.getBooleanValueForField("ConfigQuickQuote")){
				assertReference.assertEquals(twoWheelerBuyInsuranceEntity.getStringValueForField("QuickQuote"),fetchValueFromFields(quickQuoteLable),AssertionType.WARNING);
			}
		}
	}
	public void checkOnIAgreeCheckBox(TwoWheelerBuyInsuranceEntity twoWheelerBuyInsuranceEntity) {
		if(twoWheelerBuyInsuranceEntity.getBooleanValueForField("ConfigIAgree")) {
			check(iAgreeCheckBox);
		}
	}
	public void clickOnKnowYourPremiumButton(TwoWheelerBuyInsuranceEntity twoWheelerBuyInsuranceEntity) {
		if(twoWheelerBuyInsuranceEntity.getBooleanValueForField("ConfigKnowYourPremium")) {
			click(knowYourPremiumButton);
		}
	}
	public void fillAndSubmitTwoWheelerBuyInsuranceDetails(TwoWheelerBuyInsuranceEntity twoWheelerBuyInsuranceEntity,CustomAssert assertReference) throws InterruptedException{
		if(isConfigTrue(twoWheelerBuyInsuranceEntity.getConfigExecute())) {
			fillTwoWheelerBuyInsurance(twoWheelerBuyInsuranceEntity, assertReference);
			checkOnIAgreeCheckBox(twoWheelerBuyInsuranceEntity);
			clickOnKnowYourPremiumButton(twoWheelerBuyInsuranceEntity);

		}
	}
}