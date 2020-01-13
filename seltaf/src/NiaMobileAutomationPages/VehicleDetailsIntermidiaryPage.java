package NiaMobileAutomationPages;

import javax.swing.text.Highlighter.HighlightPainter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;

import com.aqm.staf.library.databin.VehicleDetailsIntmyEntity;
import com.sun.corba.se.spi.orbutil.fsm.Action;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class VehicleDetailsIntermidiaryPage extends MobileScreen{

	MobileScreenElement VehicleDetailsLabel;
	MobileScreenElement makeDropDown;
	MobileScreenElement modelTextField;
	MobileScreenElement nearestCityOfPurchaseList;
	MobileScreenElement dateOfFirstPurchaserTextField;
	MobileScreenElement insuredDeclaredValueTextField;
	MobileScreenElement mobileNoTextField;
	MobileScreenElement emailIdTextField;
	MobileScreenElement iAgreeToTheTermsConditionCheckBox;
	MobileScreenElement calculatePremiumButton;
	MobileScreenElement audiRadioButton;
	MobileScreenElement modelNameLabel;
	MobileScreenElement cityRadioButton;
    MobileScreenElement dropDownModel;
    MobileScreenElement dropDownOption;
    


	public VehicleDetailsIntermidiaryPage(AppiumDriver driver, String screenName,String DeviceOS) {

		super(driver,screenName,DeviceOS);
		if(DeviceOS.equalsIgnoreCase("Android")){

			VehicleDetailsLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Vehicle Details']"), "Vehicle Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			makeDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Select Make' and @index='1']"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			modelTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[ @index='2']"), "Model", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			nearestCityOfPurchaseList=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Nearest City of Purchase / Registration*']"), "LIABILITY", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			dateOfFirstPurchaserTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='Date of First Purchase' and @index='0']"), "Date of First Purchase", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			insuredDeclaredValueTextField=new MobileScreenElement(By.id("android.widget.EditText:IDV"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			mobileNoTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='Mobile' and @index='0']"), "Mobile", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			emailIdTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='Email' and @index='0']"), "Email", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			iAgreeToTheTermsConditionCheckBox=new MobileScreenElement(By.xpath("//android.widget.CheckBox[@text='I agree to the terms & conditions' and @index='3']"), "I agree to the terms & conditions", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			calculatePremiumButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Calculate Premium' and @index='8']"), "Know Your Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			modelNameLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='DISCOVER/DISCOVER 4G/2' and @index='0']"), "DISCOVER/DISCOVER 4G/2", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		}
	}
	public void fillPrivateCarDetails(VehicleDetailsIntmyEntity vehicleDetailsIntmyEntity,CustomAssert assertReference ) throws InterruptedException{

		if(vehicleDetailsIntmyEntity.getAction().equalsIgnoreCase("add")||vehicleDetailsIntmyEntity.getAction().equalsIgnoreCase("edit")){
			if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigMake")){
				click(makeDropDown);
				String make=vehicleDetailsIntmyEntity.getStringValueForField("Make");
				audiRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+make+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(audiRadioButton);
				//selectValueFromList(sumInsuredDropDown, topUpMediclaimEntity.getStringValueForField("SumInsured"));

			}		
			if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigModel")){
				
				try {
					click(modelTextField);
				} catch (Exception e) {					
					e.printStackTrace();
				}			
				sendKeys(modelTextField, vehicleDetailsIntmyEntity.getStringValueForField("Model"));
				Thread.sleep(2000);
				/*TouchAction action1 = new TouchAction(driver);
				action1.press(PointOption.point(402,563)).release().perform();*/
				String model=vehicleDetailsIntmyEntity.getStringValueForField("Model");
				dropDownOption=new MobileScreenElement(By.xpath("//android.view.View[@text="+"'"+model+"'"+"]"), "Model", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20);
				//dropDownOption=new MobileScreenElement(By.xpath("//android.widget.ListView[@resource-id='typeahead-59-8800']"), "Model", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20);
				//Select s= new Select(dropDownOption);
		//				System.out.println();
//				s.selectByVisibleText(model);
				Thread.sleep(2000);
				//selectValueFromList(new MobileScreenElement(By.xpath("//android.view.View[@text="+"'"+model+"'"+"]"), "Model", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20), model);
				click(dropDownOption);
				//Thread.sleep(2000);
				
				//sendKeys(modelTextField, Keys.TAB);
				//sendKeys(new MobileScreenElement(By.xpath("//android.widget.EditText[@index='2']"), "Model", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20), Keys.ENTER);
				Thread.sleep(5000*2);
				/*driver.findElement(By.xpath("//android.widget.EditText[@index='4']")).click();*/
				String invoice=fetchValueFromFields(new MobileScreenElement(By.xpath("//android.widget.EditText[@index='4']"), "Invoice", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20));
				System.out.println(invoice);
				
				clearAndSendKeys(new MobileScreenElement(By.xpath("//android.widget.EditText[@index='4']"), "Invoice", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20), invoice);
				//sendKeys(new MobileScreenElement(By.xpath("//android.widget.EditText[@index='4']"), "Invoice", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20), Keys.ENTER);
				Thread.sleep(2000);
				/*driver.findElement(By.xpath("//android.widget.EditText[@index='6']")).click();*/
				String insuredValue=fetchValueFromFields(new MobileScreenElement(By.xpath("//android.widget.EditText[@index='6']"), "Invoice", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20));
				System.out.println(insuredValue);
				clearAndSendKeys(new MobileScreenElement(By.xpath("//android.widget.EditText[@index='6']"), "Invoice", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20), insuredValue);
				//sendKeys(new MobileScreenElement(By.xpath("//android.widget.EditText[@index='6']"), "Invoice", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20), Keys.ENTER);

			}
			/*if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigNearestCityOfPurchase")){
				click(nearestCityOfPurchaseList);
				String city=vehicleDetailsIntmyEntity.getStringValueForField("NearestCityOfPurchase");
				cityRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+city+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(cityRadioButton);
			}*/
			if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigDateOfFirstPurchaser")){
				clearAndSendKeys(dateOfFirstPurchaserTextField, vehicleDetailsIntmyEntity.getStringValueForField("DateOfFirstPurchaser"));
			}
			if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigInsuredDeclaredValue")){
				clearAndSendKeys(insuredDeclaredValueTextField, vehicleDetailsIntmyEntity.getStringValueForField("InsuredDeclaredValue"));
			}
			if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigMobileNoTextField")){
				clearAndSendKeys(mobileNoTextField, vehicleDetailsIntmyEntity.getStringValueForField("MobileNo"));
			}
			if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigEmailId")){
				clearAndSendKeys(emailIdTextField, vehicleDetailsIntmyEntity.getStringValueForField("EmailId"));
			}

		}

		else if (vehicleDetailsIntmyEntity.getAction().equalsIgnoreCase("verify")) {
			if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigMake")){
				assertReference.assertEquals(vehicleDetailsIntmyEntity.getStringValueForField("ConfigMake"),fetchValueFromList(makeDropDown),AssertionType.WARNING);
			}
			if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigModel")){
				assertReference.assertEquals(vehicleDetailsIntmyEntity.getStringValueForField("Model"),fetchValueFromTextFields(modelTextField),AssertionType.WARNING);
			}
			if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigNearestCityOfPurchase")){
				assertReference.assertEquals(vehicleDetailsIntmyEntity.getStringValueForField("NearestCityOfPurchase"),fetchValueFromList(nearestCityOfPurchaseList),AssertionType.WARNING);
			}
			if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigDateOfFirstPurchaser")){
				assertReference.assertEquals(vehicleDetailsIntmyEntity.getStringValueForField("DateOfFirstPurchaser"),fetchValueFromTextFields(dateOfFirstPurchaserTextField),AssertionType.WARNING);
			}
			if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigInsuredDeclaredValue")){
				assertReference.assertEquals(vehicleDetailsIntmyEntity.getStringValueForField("InsuredDeclaredValue"),fetchValueFromTextFields(insuredDeclaredValueTextField),AssertionType.WARNING);
			}
			if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigMobileNo")){
				assertReference.assertEquals(vehicleDetailsIntmyEntity.getStringValueForField("MobileNo"),fetchValueFromTextFields(mobileNoTextField),AssertionType.WARNING);
			}
			if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigEmailId")){
				assertReference.assertEquals(vehicleDetailsIntmyEntity.getStringValueForField("EmailId"),fetchValueFromTextFields(emailIdTextField),AssertionType.WARNING);
			}
			if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigPrivateCar")){
				assertReference.assertEquals(vehicleDetailsIntmyEntity.getStringValueForField("PrivateCar"),fetchValueFromFields(VehicleDetailsLabel),AssertionType.WARNING);
			}

		}
	}
	/*public void checkOnIagreeCheckBox(vehicleDetailsIntmyEntity vehicleDetailsIntmyEntity) {
		if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigIAgreeToTheTermsCondition")){
			check(iAgreeToTheTermsConditionCheckBox);
		}
	}*/
	public void clickOnCalaculateremiumButton(VehicleDetailsIntmyEntity vehicleDetailsIntmyEntity) {
		if(vehicleDetailsIntmyEntity.getBooleanValueForField("ConfigCalculatePremium")){
			click(calculatePremiumButton);
		}
	}
	
	public void fillAndSubmitVehicleDetailPageDetails(VehicleDetailsIntmyEntity vehicleDetailsIntmyEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(vehicleDetailsIntmyEntity.getConfigExecute())) {
			fillPrivateCarDetails(vehicleDetailsIntmyEntity, assertReference);
			
			clickOnCalaculateremiumButton(vehicleDetailsIntmyEntity);
			
			
			
			
}
	}
}

