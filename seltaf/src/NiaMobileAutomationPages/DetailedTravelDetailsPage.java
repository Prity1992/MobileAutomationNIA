package NiaMobileAutomationPages;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.internal.TouchAction;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.DetailedTravelEntity;

import io.appium.java_client.AppiumDriver;

public class DetailedTravelDetailsPage extends MobileScreen {
	MobileScreenElement excludingUSARadioButton;
	MobileScreenElement includingUSARadioButton;
	MobileScreenElement business;
	MobileScreenElement holiday;
	MobileScreenElement leaveReturnBirth;
	MobileScreenElement leavingIndiaOn;
	MobileScreenElement returningToIndiaOn;
	MobileScreenElement dateOfBirth;
	MobileScreenElement plan;
	MobileScreenElement aTwoRadioButton;
	MobileScreenElement aOneRadioButton;
	MobileScreenElement travelDetails;
	MobileScreenElement calculatePremium;
	MobileScreenElement saveAndContinue;
	MobileScreenElement b2TwoRadioButton;
	MobileScreenElement b1TwoRadioButton;
	MobileScreenElement standardCoversMaximizeButton;
	//jwellary
	MobileScreenElement jwellaryandValuablesMaximizeButton;
	MobileScreenElement jwellaryBroadDiscriptionTextfield;
	MobileScreenElement jwellaryWeightVolTextfield;
	MobileScreenElement jwellaryValueTextfield;
	//Appliances
	MobileScreenElement domesticApplaincesMaximizeButton;
	MobileScreenElement domesticMakeTextfield;
	MobileScreenElement domesticModelTextfield;
	MobileScreenElement domesticYearTextfield;
	//Television
	MobileScreenElement televisionMaximizeButton;
	MobileScreenElement televisionMakeTextfield;
	MobileScreenElement televisionModelTextfield;
	MobileScreenElement televisionYearTextfield;
	MobileScreenElement recalculatePremiumButton;
	MobileScreenElement BurglaryAndHousebreakingMaximizeButton;
	MobileScreenElement travelPurposeDropDown;
	MobileScreenElement okButton;
	MobileScreenElement travelPurposeRadioButton;
    MobileScreenElement planTypeDropDown;
	MobileScreenElement planRadioButton;
	MobileScreenElement leavingIndiaDateTextField;
	String leavingDate;
	String returnDate;
	MobileScreenElement returnIndiaDateTextField;
	MobileScreenElement termsAndConditionCheckBox;
	MobileScreenElement leavingIndiaDate;
	MobileScreenElement returningIndiaDate;
	MobileScreenElement calenderOkButton;

	
	
	public DetailedTravelDetailsPage(AppiumDriver driver, String screenName,String DeviceOS)
	{
		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android"))
		{
			excludingUSARadioButton=new MobileScreenElement(By.id("TravelDestination0"),"Excluding USA", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			includingUSARadioButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Your Travel includes US & Canada']//following::android.widget.RadioButton[1]"),"Including USA", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			
			holiday=new MobileScreenElement(By.id("TravelPurpose1"),"Holiday", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			b2TwoRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text='  B2 ']"),"B2", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			b1TwoRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text='   B1  ']"),"A One", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			leavingIndiaOn=new MobileScreenElement(By.xpath("//android.view.View[@text='Leaving India on']//following::android.widget.EditText"),"Leaving India On", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			returningToIndiaOn=new MobileScreenElement(By.xpath("//android.view.View[@text='Returning to India on']//following::android.widget.EditText"),"Returning to India On", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			dateOfBirth=new MobileScreenElement(By.xpath("//android.view.View[@text='Date of Birth (dd/mm/yyyy)']//following::android.widget.EditText"),"Date Of Birth", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			travelDetails=new MobileScreenElement(By.xpath("//android.view.View[@text='Travel Details']"),"Travel Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			plan=new MobileScreenElement(By.xpath("//android.view.View[@text='Plan']"),"Plan", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			calculatePremium=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save And Calculate Premium']"),"Calculate Premium Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			saveAndContinue=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Continue']"),"Continue Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			standardCoversMaximizeButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Standard Covers (Fire and Allied Perils, Earth Quake, Terrorism, Burglary,House Breaking and Break Down Appliances)error icon 9 mandatory fields pending' and @index='0']"),"Standard Covers", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			jwellaryandValuablesMaximizeButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Jewellery and Valuables error icon 3 mandatory fields pending' and @index='0']"),"Jewellery and Valuables", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			jwellaryBroadDiscriptionTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='Broad description for Jewellery and Valuables' and @index='0']//following::android.widget.EditText"),"Broad description for Jewellery and Valuables", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			jwellaryWeightVolTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='Weight/Vol for Jewellery and Valuables' and @index='0']//following::android.widget.EditText"),"Weight/Vol for Jewellery and Valuables", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			jwellaryValueTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='Value' and @index='0']//following::android.widget.EditText"),"Value", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			domesticApplaincesMaximizeButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Domestic Appliances error icon 3 mandatory fields pending' and @index='0']"),"Domestic Appliances", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			domesticMakeTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='Make' and @index='0']//following::android.widget.EditText"),"Make", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			domesticModelTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='Model' and @index='0']//following::android.widget.EditText"),"Model", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			domesticYearTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='Year ']//following::android.widget.EditText"),"Year", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			televisionMaximizeButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Television/Desktop error icon 3 mandatory fields pending' and @index='0']"),"Television/Desktop", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			televisionMakeTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='Make' and @index='0']//following::android.widget.EditText"),"Make", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			televisionModelTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='Model' and @index='0']//following::android.widget.EditText"),"Model", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			televisionYearTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='Year ']//following::android.widget.EditText"),"Year", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			recalculatePremiumButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Recalculate Premium']"),"Recalculate Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			BurglaryAndHousebreakingMaximizeButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Burglary and Housebreaking' and @index='0']"),"Burglary and Housebreaking", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			travelPurposeDropDown= new MobileScreenElement(By.xpath("//android.view.View[@text='Travel Purpose*']//following::android.widget.Spinner[1]"),"Travel Purpose Drop Down", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		    okButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='OK']"),"OK Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		    planTypeDropDown=new MobileScreenElement(By.xpath("//android.view.View[@text='Plan Type*']//following::android.widget.Spinner[1]"),"Plan Type Drop Down", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		    leavingIndiaDateTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Leaving India On*']//following::android.widget.EditText[1]"),"Leaving Date", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		    returnIndiaDateTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Returning India On*']//following::android.widget.EditText[1]"),"Returning India On", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		    termsAndConditionCheckBox=new MobileScreenElement(By.xpath("//android.view.View[@text='I accept']//preceding::android.widget.CheckBox[1]"),"I accept Check Box", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		    calenderOkButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='OK']]"),"Ok Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		}
	}


	public void fillDetailedTravelDetailsDetails(DetailedTravelEntity detailedTravelEntity,CustomAssert assertReference ) throws InterruptedException{
		if(detailedTravelEntity.getAction().equalsIgnoreCase("add")||detailedTravelEntity.getAction().equalsIgnoreCase("edit")){
			if(detailedTravelEntity.getBooleanValueForField("ConfigExcludingUSA")){
				click(excludingUSARadioButton);
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigIncludingUSA")){
				click(includingUSARadioButton);
				scrollDown();
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigTravelPurpose")){
				click(travelPurposeDropDown);
				String str=detailedTravelEntity.getStringValueForField("PurposeType");
				travelPurposeRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+str+"'"+"]"),"Business Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(travelPurposeRadioButton);
				click(okButton);			
				}
			if(detailedTravelEntity.getBooleanValueForField("ConfigPlanType")) {
				click(planTypeDropDown);	
				String str1=detailedTravelEntity.getStringValueForField("TypeOfPlan");
				planRadioButton= new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+str1+"'"+"]"),"Type of Plan Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				click(planRadioButton);
				click(okButton);
				Thread.sleep(8000);
				}
			
			/*if(detailedTravelEntity.getBooleanValueForField("ConfigTravelDetails")){
				click(travelDetails);
				List<MobileScreenElement> inputs = (List<MobileScreenElement>) driver.findElements(By.className("android.widget.EditText"));
				leavingIndiaOn = inputs.get(0);
				returningToIndiaOn = inputs.get(1);
				dateOfBirth = inputs.get(2);*/

				/*if(detailedTravelEntity.getBooleanValueForField("ConfigLeavingIndiaOn")){
					click(leavingIndiaDateTextField);
					
					leavingDate=RandomCodeGenerator.calenderDateGenerator(detailedTravelEntity.getStringValueForField("LeavingIndiaOn"));
					String[] str=leavingDate.split("/");
					String finalLeavingDate=str[0];
					leavingIndiaDate=new MobileScreenElement(By.xpath("//android.webkit.WebView[2]//android.view.View[@index='1']//android.view.View[2]//android.view.View[@text='19' and @index='30']"),"Leaving India On", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
					 //leavingIndiaDate=new MobileScreenElement(By.xpath("//android.view.View[@text='"+finalLeavingDate+"']"),"Leaving India On", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
					 click(leavingIndiaDate);
					click(calenderOkButton);
					 //clearAndSendKeys(leavingIndiaDateTextField, leavingDate);
				}
				if(detailedTravelEntity.getBooleanValueForField("ConfigReturningToIndiOn")){
					click(returnIndiaDateTextField);
					returnDate= RandomCodeGenerator.calenderDateGenerator(detailedTravelEntity.getStringValueForField("ReturningToIndiOn"));
					String[] str1=returnDate.split("/");
					String finalReturnDate=str1[0];
					returningIndiaDate= new MobileScreenElement(By.xpath("//android.view.View[@text="+"'"+finalReturnDate+"'"+"]"),"Returning India On", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
					click(returningIndiaDate);
					click(calenderOkButton);
					//clearAndSendKeys(returnIndiaDateTextField, returnDate);
				}*/
				if(detailedTravelEntity.getBooleanValueForField("ConfigDateOfBirth")){
					clearAndSendKeys(dateOfBirth, detailedTravelEntity.getStringValueForField("DateOfBirth"));
					scrollDown();
				}
				if(detailedTravelEntity.getBooleanValueForField("ConfigATwoRadioButton")){
					click(b1TwoRadioButton);
				}
				if(detailedTravelEntity.getBooleanValueForField("ConfigAOneRadioButton")){
					click(b2TwoRadioButton);
				}
				if(detailedTravelEntity.getBooleanValueForField("ConfigCalculatePremium")){
					click(termsAndConditionCheckBox);
					click(calculatePremium);
				}
				
		}


	}
	public void fillJwellaryAndValublesDetails(DetailedTravelEntity detailedTravelEntity,CustomAssert assertReference ) throws InterruptedException{
		if(detailedTravelEntity.getAction().equalsIgnoreCase("add")||detailedTravelEntity.getAction().equalsIgnoreCase("edit")){
			if(detailedTravelEntity.getBooleanValueForField("ConfigJwellaryandValuables")){
				click(standardCoversMaximizeButton);
				click(BurglaryAndHousebreakingMaximizeButton);
				click(jwellaryandValuablesMaximizeButton);
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigJwellaryBroadDiscription")){
				clearAndSendKeys(jwellaryBroadDiscriptionTextfield, detailedTravelEntity.getStringValueForField("JwellaryBroadDiscription"));
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigJwellaryWeightVol")){
				clearAndSendKeys(jwellaryWeightVolTextfield, detailedTravelEntity.getStringValueForField("JwellaryWeightVol"));
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigJwellaryValue")){
				clearAndSendKeys(jwellaryValueTextfield, detailedTravelEntity.getStringValueForField("JwellaryValue"));
			}
		}
		else if (detailedTravelEntity.getAction().equalsIgnoreCase("verify")) {
			if(detailedTravelEntity.getBooleanValueForField("ConfigJwellaryBroadDiscription")){
				assertReference.assertEquals(detailedTravelEntity.getStringValueForField("JwellaryBroadDiscription"),fetchValueFromFields(jwellaryBroadDiscriptionTextfield),AssertionType.WARNING);
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigJwellaryWeightVol")){
				assertReference.assertEquals(detailedTravelEntity.getStringValueForField("JwellaryWeightVol"),fetchValueFromFields(jwellaryWeightVolTextfield),AssertionType.WARNING);
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigJwellaryValue")){
				assertReference.assertEquals(detailedTravelEntity.getStringValueForField("JwellaryValue"),fetchValueFromFields(jwellaryValueTextfield),AssertionType.WARNING);
			}
		}
	}
	
	public void fillDomesticAppliancesDetails(DetailedTravelEntity detailedTravelEntity,CustomAssert assertReference ) throws InterruptedException{
		if(detailedTravelEntity.getAction().equalsIgnoreCase("add")||detailedTravelEntity.getAction().equalsIgnoreCase("edit")){
			if(detailedTravelEntity.getBooleanValueForField("ConfigDomesticApplainces")){
				scrollDown();
				click(domesticApplaincesMaximizeButton);
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigDomesticMake")){
				clearAndSendKeys(domesticMakeTextfield, detailedTravelEntity.getStringValueForField("DomesticMake"));
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigDomesticModel")){
				clearAndSendKeys(domesticModelTextfield, detailedTravelEntity.getStringValueForField("DomesticModel"));
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigDomesticYear")){
				clearAndSendKeys(domesticYearTextfield, detailedTravelEntity.getStringValueForField("DomesticYear"));
			}
		}
		else if (detailedTravelEntity.getAction().equalsIgnoreCase("verify")) {
			if(detailedTravelEntity.getBooleanValueForField("ConfigDomesticMake")){
				assertReference.assertEquals(detailedTravelEntity.getStringValueForField("DomesticMake"),fetchValueFromFields(domesticMakeTextfield),AssertionType.WARNING);
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigDomesticModel")){
				assertReference.assertEquals(detailedTravelEntity.getStringValueForField("DomesticModel"),fetchValueFromFields(domesticModelTextfield),AssertionType.WARNING);
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigDomesticYear")){
				assertReference.assertEquals(detailedTravelEntity.getStringValueForField("DomesticYear"),fetchValueFromFields(domesticYearTextfield),AssertionType.WARNING);
			}
		}
	}
	
	public void fillTelevisionDetails(DetailedTravelEntity detailedTravelEntity,CustomAssert assertReference ) throws InterruptedException{
		if(detailedTravelEntity.getAction().equalsIgnoreCase("add")||detailedTravelEntity.getAction().equalsIgnoreCase("edit")){
			if(detailedTravelEntity.getBooleanValueForField("ConfigTelevision")){
				click(televisionMaximizeButton);
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigTelevisionMake")){
				clearAndSendKeys(televisionMakeTextfield, detailedTravelEntity.getStringValueForField("TelevisionMake"));
			}

			if(detailedTravelEntity.getBooleanValueForField("ConfigTelevisionModel")){
				clearAndSendKeys(televisionModelTextfield, detailedTravelEntity.getStringValueForField("TelevisionModel"));
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigTelevisionYear")){
				clearAndSendKeys(televisionYearTextfield, detailedTravelEntity.getStringValueForField("TelevisionYear"));
			}
		}
		else if (detailedTravelEntity.getAction().equalsIgnoreCase("verify")) {
			if(detailedTravelEntity.getBooleanValueForField("ConfigTelevisionMake")){
				assertReference.assertEquals(detailedTravelEntity.getStringValueForField("TelevisionMake"),fetchValueFromFields(televisionMakeTextfield),AssertionType.WARNING);
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigTelevisionModel")){
				assertReference.assertEquals(detailedTravelEntity.getStringValueForField("TelevisionModel"),fetchValueFromFields(televisionModelTextfield),AssertionType.WARNING);
			}
			if(detailedTravelEntity.getBooleanValueForField("ConfigTelevisionYear")){
				assertReference.assertEquals(detailedTravelEntity.getStringValueForField("TelevisionYear"),fetchValueFromFields(televisionYearTextfield),AssertionType.WARNING);
			}
		}
	}
	public void clickOnRecalculatePremiumButton(DetailedTravelEntity detailedTravelEntity) {
		if(detailedTravelEntity.getBooleanValueForField("ConfigRecalculatePremium")){
			scrollDown();
			click(recalculatePremiumButton);
		}
	}
	public void clickOnSaveAndContinueButton(DetailedTravelEntity detailedTravelEntity) {
		if(detailedTravelEntity.getBooleanValueForField("ConfigSaveAndContinue")){
			click(termsAndConditionCheckBox);
			click(saveAndContinue);
		}
	}
	
	public void fillAndSubmitDetailedTravelDetailsDetails(DetailedTravelEntity detailedTravelEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(detailedTravelEntity.getConfigExecute()))		
		{
			fillDetailedTravelDetailsDetails(detailedTravelEntity, assertReference);
			fillJwellaryAndValublesDetails(detailedTravelEntity, assertReference);
			fillDomesticAppliancesDetails(detailedTravelEntity, assertReference);
			fillTelevisionDetails(detailedTravelEntity, assertReference);
			clickOnRecalculatePremiumButton(detailedTravelEntity);
			clickOnSaveAndContinueButton(detailedTravelEntity);
			
			
			
		}
	}
}
