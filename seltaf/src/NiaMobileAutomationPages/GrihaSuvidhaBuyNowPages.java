package NiaMobileAutomationPages;

import org.openqa.selenium.By;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.BuyNowEntermidiaryEntity;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class GrihaSuvidhaBuyNowPages extends MobileScreen {

	MobileScreenElement option1RadioButtoon;
	MobileScreenElement MobileNumberTextBox;
	MobileScreenElement EmailidTextBox;
	MobileScreenElement IagreeCheckBox;
	MobileScreenElement CalculatePremiumButton;
	MobileScreenElement ProceedButton;
	MobileScreenElement sumInsuredDropDown;
	MobileScreenElement amountRadioButton;
	MobileScreenElement buyOnlineButton;
	MobileScreenElement knowYourPremiumButton;




	public GrihaSuvidhaBuyNowPages(AppiumDriver driver,String Screenname,String DeviceOS) {
		super (driver,Screenname,DeviceOS);
		if(DeviceOS.equalsIgnoreCase("Android")){

			option1RadioButtoon=new MobileScreenElement(By.xpath("//android.widget.Button[@resource-id='accordion0']"), "option radio", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			MobileNumberTextBox= new MobileScreenElement(By.xpath("//android.view.View[@text='No']//following::android.widget.EditText[1]"), "Mobile Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			EmailidTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='No']//following::android.widget.EditText[2]"), "Email id", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			IagreeCheckBox=new MobileScreenElement(By.xpath("//android.widget.CheckBox[@resource-id='termsAndConditionSummary']"), "Iagree", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			CalculatePremiumButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Calculate Premium' and @index='0']"), "Email id", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			ProceedButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Proceed' and @index='0']"), "Email id", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			sumInsuredDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Sum Insured(Rs) - Fire and Allied Perils*' and @index='0']"), "Sum Insured(Rs) - Fire and Allied Perils*", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			buyOnlineButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Buy Online' and @index='1']"), "By Online", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			knowYourPremiumButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Know Your Premium' ]"), "Know Your Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		}
	}
	public void FillemailandMobileNoTextBox(BuyNowEntermidiaryEntity BuyNowEntermidiaryEntity,CustomAssert assertReference) {
		if (BuyNowEntermidiaryEntity.getAction().equalsIgnoreCase("add") || BuyNowEntermidiaryEntity.getAction().equalsIgnoreCase("edit")) {

			///if(BuyNowEntermidiaryEntity.getBooleanValueForField("ConfigMobileNumberTextBox")) {
				//clearAndSendKeys(MobileNumberTextBox, BuyNowEntermidiaryEntity.getStringValueForField("MobileNumberTextBox"));

			}
			if(BuyNowEntermidiaryEntity.getBooleanValueForField("ConfigSumInsuredDropDown")) {
			click(sumInsuredDropDown);
			String sins=BuyNowEntermidiaryEntity.getStringValueForField("SumInsured");
			amountRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+sins+"'"+"]"), "Relationship", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(amountRadioButton);
			}
			if(BuyNowEntermidiaryEntity.getBooleanValueForField("ConfigMobileNumberTextBox")) {
				scrollDown();
				clearAndSendKeys(MobileNumberTextBox, BuyNowEntermidiaryEntity.getStringValueForField("MobileNumberTextBox"));

			if(BuyNowEntermidiaryEntity.getBooleanValueForField("ConfigEmailidTextBox")) {
				clearAndSendKeys(EmailidTextBox, BuyNowEntermidiaryEntity.getStringValueForField("EmailidTextBox"));
			}
		}
		else if(BuyNowEntermidiaryEntity.getAction().equalsIgnoreCase("verify")) {


			if(BuyNowEntermidiaryEntity.getBooleanValueForField("ConfigMobileNumberTextBox")){
				assertReference.assertEquals(BuyNowEntermidiaryEntity.getStringValueForField("MobileNumberTextBox"), fetchValueFromFields(MobileNumberTextBox), AssertionType.WARNING);
			}

			if(BuyNowEntermidiaryEntity.getBooleanValueForField("ConfigEmailidTextBox")){
				assertReference.assertEquals(BuyNowEntermidiaryEntity.getStringValueForField("EmailidTextBox"), fetchValueFromFields(EmailidTextBox), AssertionType.WARNING);
			} 

		}


	}


	public void ClickonOption(BuyNowEntermidiaryEntity BuyNowEntermidiaryEntity,CustomAssert assertReference) {
		if (BuyNowEntermidiaryEntity.getBooleanValueForField("Configoption1RadioButtoon")){
			TouchAction action = new TouchAction(driver);
			action.press(PointOption.point(139,565)).release().perform();
			
			//click(option1RadioButtoon);
		}
	}


	public void ClickonIagreeCheckBox(BuyNowEntermidiaryEntity BuyNowEntermidiaryEntity,CustomAssert assertReference) {

		if(BuyNowEntermidiaryEntity.getBooleanValueForField("ConfigIagreeCheckBox")) {
			click(IagreeCheckBox);
		}
	}


	public void ClickonCalculatePremiumButton(BuyNowEntermidiaryEntity BuyNowEntermidiaryEntity,CustomAssert assertReference) {

		if(BuyNowEntermidiaryEntity.getBooleanValueForField("ConfigCalculatePremiumButton")) {
			click(CalculatePremiumButton);
			//click(buyOnlineButton);
		}
	}

	public void ProceedButton(BuyNowEntermidiaryEntity BuyNowEntermidiaryEntity,CustomAssert assertReference ) {

		if(BuyNowEntermidiaryEntity.getBooleanValueForField("ConfigProceedButton")) {
			click(ProceedButton);
		}



	}

	public void clickOnKnowYourPremiumButton(BuyNowEntermidiaryEntity BuyNowEntermidiaryEntity,CustomAssert assertReference ) {
		if(BuyNowEntermidiaryEntity.getBooleanValueForField("ConfigKnowyourPremium")) {
			click(knowYourPremiumButton);
			click(buyOnlineButton);
		}
	}

	public void fillandproceedBuyNow(BuyNowEntermidiaryEntity BuyNowEntermidiaryEntity,CustomAssert assertReference){
		if(isConfigTrue(BuyNowEntermidiaryEntity.getConfigExecute()))		
		{


			ClickonOption(BuyNowEntermidiaryEntity,assertReference);
			//scrollDown();
			FillemailandMobileNoTextBox(BuyNowEntermidiaryEntity,assertReference);
			ClickonIagreeCheckBox(BuyNowEntermidiaryEntity,assertReference);
			ClickonCalculatePremiumButton(BuyNowEntermidiaryEntity,assertReference);
			ProceedButton(BuyNowEntermidiaryEntity,assertReference);
			clickOnKnowYourPremiumButton(BuyNowEntermidiaryEntity, assertReference);
			

		}

	}
}












