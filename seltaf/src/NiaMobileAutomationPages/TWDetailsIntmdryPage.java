package NiaMobileAutomationPages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.By;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.TWdetailsIntmyEntity;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TWDetailsIntmdryPage extends MobileScreen{

	MobileScreenElement yearOfManufactureDropDown;
	MobileScreenElement engineNumberTextField;
	MobileScreenElement chassisNumberTextField;
	MobileScreenElement vehicleZoneFortwoWheelerDropDown;
	MobileScreenElement colorAsPerRCBookTextField;
	MobileScreenElement typeOfFuelDropDown;
	MobileScreenElement selectVehicleColorDropDown;
	MobileScreenElement continueButton;
	
	
	MobileScreenElement rightArrowIcon;
	MobileScreenElement cityTextField;
	MobileScreenElement saveAndCalculatePremiumButton;

	MobileScreenElement quoteNoLabel;
	MobileScreenElement iAgreeCheckBox;
	MobileScreenElement authinticateWithOTPAndBuyNowButton;
	MobileScreenElement oTpTextField;
	MobileScreenElement submitButton;

	MobileScreenElement yearRadiobutton;
	MobileScreenElement zoneRadiobutton;
	MobileScreenElement fuelRadiobutton;
	MobileScreenElement rightArrowIcon1;
	MobileScreenElement colorRadiobutton;
	
	
	public TWDetailsIntmdryPage(AppiumDriver driver, String screenName,String DeviceOS) {

		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android")){

			yearOfManufactureDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Year of Manufacture' and @index='1']"), "Year Of Manufacture", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			engineNumberTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Engine Number *' and @index='0']//following::android.widget.EditText"), "Engine Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			chassisNumberTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Chassis Number *' and @index='0']//following::android.widget.EditText"), "Chassis Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			vehicleZoneFortwoWheelerDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Vehicle Zone for Two Wheeler' and @index='1']"), "Vehicle Zone for Two Wheeler", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			colorAsPerRCBookTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Type of Fuel *' and @index='0']//preceding::android.widget.EditText[1]"), "Color as per RC Book ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			typeOfFuelDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Type of Fuel' and @index='1']"), "Type of Fuel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			rightArrowIcon=new MobileScreenElement(By.xpath("//android.widget.Button[@text='next']"), "Next", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//	rightArrowIcon1=new MobileScreenElement(By.xpath("//android.widget.Button[@text='next' and @index='2']"), "Next", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			cityTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Basic Premium']"), "I agree to all the Terms and Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

			saveAndCalculatePremiumButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save and Calculate Premium' and @index='0']"), "Save and Calculate Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			quoteNoLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Quote No']//following::android.view.View"), "Quote no", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			iAgreeCheckBox=new MobileScreenElement(By.xpath("//Save and Calculate Premium[@index='0']"), "I agree to all the Terms and Conditions ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			authinticateWithOTPAndBuyNowButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Authenticate with OTP and Buy Now'and @index='0']"), "Authenticate with OTP and Buy Now", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			oTpTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='0']"), "Enter the OTP received from NIA", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			submitButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit' and @index='0']"), "Submit", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

			selectVehicleColorDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Select vehicle colour' and @index='1']"), "Select vehicle colour", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			continueButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Continue' and @index='1']"), "Continue", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		}
	}
	public void fillTwoWheelerIntermidiaryDetails(TWdetailsIntmyEntity TWdetailsIntmyEntity,CustomAssert assertReference ) throws InterruptedException{

		if(TWdetailsIntmyEntity.getAction().equalsIgnoreCase("add")||TWdetailsIntmyEntity.getAction().equalsIgnoreCase("edit")){
			if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigYearOfManufacture")){
				click(yearOfManufactureDropDown);
				String year=TWdetailsIntmyEntity.getStringValueForField("YearOfManufacture");
				yearRadiobutton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+year+"'"+"]"), "Year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(yearRadiobutton);
			}
			

			if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigEngineNumber")){
				clearAndSendKeys(engineNumberTextField, TWdetailsIntmyEntity.getStringValueForField("EngineNumber"));
			}
			if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigChassisNumber")){
				clearAndSendKeys(chassisNumberTextField, TWdetailsIntmyEntity.getStringValueForField("ChassisNumber"));
				
			}
			if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigColorAsPerRCBook")){
				scrollDown();
				clearAndSendKeys(colorAsPerRCBookTextField, TWdetailsIntmyEntity.getStringValueForField("ColorAsPerRCBook"));
			}
			if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigVehicleZoneFortwoWheeler")){
				click(vehicleZoneFortwoWheelerDropDown);
				String zone=TWdetailsIntmyEntity.getStringValueForField("VehicleZoneFortwoWheeler");
				zoneRadiobutton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+zone+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(zoneRadiobutton);
			}
			if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigTypeOfFuel")){
				click(typeOfFuelDropDown);
				String fuel=TWdetailsIntmyEntity.getStringValueForField("TypeOfFuel");
				fuelRadiobutton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+fuel+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(fuelRadiobutton);
			}
			if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigCity")){
				clearAndSendKeys(cityTextField, TWdetailsIntmyEntity.getStringValueForField("City"));
			}

		}
		else if (TWdetailsIntmyEntity.getAction().equalsIgnoreCase("verify")) {
			if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigEngineNumber")){
				assertReference.assertEquals(TWdetailsIntmyEntity.getStringValueForField("EngineNumber"),fetchValueFromTextFields(engineNumberTextField),AssertionType.WARNING);
			}
			if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigChassisNumber")){
				assertReference.assertEquals(TWdetailsIntmyEntity.getStringValueForField("ChassisNumber"),fetchValueFromTextFields(chassisNumberTextField),AssertionType.WARNING);
			}
			if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigCity")){
				assertReference.assertEquals(TWdetailsIntmyEntity.getStringValueForField("City"),fetchValueFromTextFields(cityTextField),AssertionType.WARNING);
			}
			if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigColorAsPerRCBook")){
				assertReference.assertEquals(TWdetailsIntmyEntity.getStringValueForField("ColorAsPerRCBook"),fetchValueFromTextFields(colorAsPerRCBookTextField),AssertionType.WARNING);
			}
			if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigQuoteNo")){
				assertReference.assertEquals(TWdetailsIntmyEntity.getStringValueForField("QuoteNo"),fetchValueFromTextFields(quoteNoLabel),AssertionType.WARNING);
			}
		}
	}

	public void clickOnRightArrowIcon(TWdetailsIntmyEntity TWdetailsIntmyEntity) throws InterruptedException {
		if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigRightArrow")){
			click(rightArrowIcon);
			
			
		}
	
		if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigSelectVehicleColour")){
			TouchAction action1 = new TouchAction(driver);
			action1.press(PointOption.point(338,794)).release().perform();
			String color=TWdetailsIntmyEntity.getStringValueForField("SelectVehicleColour");
			colorRadiobutton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+color+"'"+"]"), "Year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(colorRadiobutton);
			click(rightArrowIcon);
			click(rightArrowIcon);
		}
	}

	public void clickOnContinueButton(TWdetailsIntmyEntity TWdetailsIntmyEntity) throws InterruptedException {
		if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigContinue")){
			TouchAction action1 = new TouchAction(driver);
			action1.press(PointOption.point(379,552)).release().perform();
			
		}
	}
	public void checkOnIAgreeCheckBox(TWdetailsIntmyEntity TWdetailsIntmyEntity) {
		if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigIagree")){
			//check(iAgreeCheckBox);
		}
	}
	public void clickOnSaveAndCalculate(TWdetailsIntmyEntity TWdetailsIntmyEntity) {
		if(TWdetailsIntmyEntity.getBooleanValueForField("ConfigSaveAndCalculatePremium")){
			click(saveAndCalculatePremiumButton);
			waitForPageElement(quoteNoLabel);
			TWdetailsIntmyEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNoLabel));
		}
	}
	public void fetchQuoteNumber(TWdetailsIntmyEntity TWdetailsIntmyEntity) throws InterruptedException {
		TWdetailsIntmyEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNoLabel));
	}
	
	public void fillAndSubmitTwoWheelerIntermidiaryDetails(TWdetailsIntmyEntity TWdetailsIntmyEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(TWdetailsIntmyEntity.getConfigExecute())) {
			fillTwoWheelerIntermidiaryDetails(TWdetailsIntmyEntity, assertReference);
			clickOnRightArrowIcon(TWdetailsIntmyEntity);
			clickOnSaveAndCalculate(TWdetailsIntmyEntity);
			checkOnIAgreeCheckBox(TWdetailsIntmyEntity);
			clickOnContinueButton(TWdetailsIntmyEntity);
			//fetchQuoteNumber(TWdetailsIntmyEntity);
			
			
			//clickOnAuthenticateWithOTPAndBuyNowButton(TWdetailsIntmyEntity);
			
		}
	}
}


