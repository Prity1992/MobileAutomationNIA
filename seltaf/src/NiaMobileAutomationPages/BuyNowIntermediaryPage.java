package NiaMobileAutomationPages;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.BuyNowEntity;
import com.aqm.staf.library.databin.BuyNowInterEntity;
import com.aqm.staf.library.databin.HomeIntermediaryEntity;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class BuyNowIntermediaryPage extends MobileScreen {
	MobileScreenElement motorIcon;
	MobileScreenElement healthIcon;
	MobileScreenElement homeAccidentIcon;
	MobileScreenElement twoWheelerButton;
	MobileScreenElement newIndiaFloaterMediClaimButton;
	MobileScreenElement newIndiaMediClaimButton;
	MobileScreenElement newIndiaAshaKiranButton;
	MobileScreenElement newIndiaTopUpMediClaimButton;
	MobileScreenElement grihaSuvidhaButton;
	MobileScreenElement continueButon;
	MobileScreenElement newIndiaPremiumMediclaimButton;
	MobileScreenElement noteLabel;
	MobileScreenElement buyInsForNewVehicleButton;
	MobileScreenElement healthLabel;
	MobileScreenElement motorLabel;
	MobileScreenElement homeAndAccLabel;

	public BuyNowIntermediaryPage(AppiumDriver driver, String screenName,String DeviceOS)
	{
		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android"))
		{	
			motorIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='MOTOR' and @index='1']"),"Motor", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			healthIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='HEALTH' and @index='1']"),"Health", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			homeAccidentIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='HOME AND ACCIDENT']"),"Home And Accident", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			twoWheelerButton=new MobileScreenElement(By.xpath("//android.view.View[@text='TWO WHEELER']"),"Two Wheeler", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			newIndiaTopUpMediClaimButton=new MobileScreenElement(By.xpath("//android.view.View[@text='NEW INDIA TOP UP MEDICLAIM']"),"New India Top Up Mediclaim", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			newIndiaFloaterMediClaimButton=new MobileScreenElement(By.xpath("//android.view.View[@text='NEW INDIA FLOATER MEDICLAIM']"),"New India Floater Mediclaim", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			newIndiaMediClaimButton=new MobileScreenElement(By.xpath("//android.view.View[@text='NEW INDIA MEDICLAIM']"),"New India Mediclaim", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			newIndiaAshaKiranButton=new MobileScreenElement(By.xpath("//android.view.View[@text='NEW INDIA ASHA KIRAN']"),"New India Asha Kiran", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			grihaSuvidhaButton=new MobileScreenElement(By.xpath("//android.view.View[@text='GRIHA SUVIDHA']"),"GRIHA SUVIDHA", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			continueButon=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Continue']"),"Continue", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			newIndiaPremiumMediclaimButton=new MobileScreenElement(By.xpath("//android.view.View[@text='NEW INDIA PREMIER MEDICLAIM POLICY']"),"New India Premium Mediclaim Policy", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			noteLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='NOTE:']"),"Note", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			buyInsForNewVehicleButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Buy insurance for a new vehicle']"),"Buy insurance for a new vehicle", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			healthLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='HEALTH']"),"Health", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			motorLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='MOTOR']"),"Motor", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			homeAndAccLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='HOME AND ACCIDENT']"),"Home and accident", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			
		}
	}
	public void fillBuyNowDetails(BuyNowInterEntity buyNowEntity,CustomAssert assertReference ) throws InterruptedException{
		if(buyNowEntity.getAction().equalsIgnoreCase("add")||buyNowEntity.getAction().equalsIgnoreCase("edit")){
			if(buyNowEntity.getBooleanValueForField("ConfigMotor")){
				click(motorIcon);
				if(buyNowEntity.getBooleanValueForField("ConfigTwoWheeler")){
					click(twoWheelerButton);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigBuyInsForNewVevhicle")){
					click(buyInsForNewVehicleButton);
				}
			}

			if(buyNowEntity.getBooleanValueForField("ConfigHealth")){
				click(healthIcon);
				if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaTopUpMediClaim")){
					click(newIndiaTopUpMediClaimButton);
					/*	JavascriptExecutor js = (JavascriptExecutor) driver;
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", "down");
				js.executeScript("mobile: scroll", scrollObject);*/
/*
				int x = noteLabel.getLocation().getX();
				int y = noteLabel.getLocation().getY();*/

					/*TouchAction action = new TouchAction(driver);
				action.longPress(PointOption.point(90,950))
				.moveTo(PointOption.point(90,400))
				.release().perform();*/
					scrollDown();
					//scrollToElementForward();
					click(continueButon);
				}

				if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaPremiumMediclaim")){
					click(newIndiaPremiumMediclaimButton);
					click(continueButon);

				}
				if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaFloaterMediClaim")){
					click(newIndiaFloaterMediClaimButton);
					click(continueButon);

				}
				if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaMediClaim")){
					click(newIndiaMediClaimButton);
					click(continueButon);

				}
				if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaAshaKiran")){
					click(newIndiaAshaKiranButton);
					click(continueButon);

				}
			}

			if(buyNowEntity.getBooleanValueForField("ConfigHomeAndAccident")){
				click(homeAccidentIcon);
				if(buyNowEntity.getBooleanValueForField("ConfigGrihaSuvidha")){
					click(grihaSuvidhaButton);
				}
			}
		}
	}
	public void clickOnHealthButton(BuyNowInterEntity buyNowEntity,CustomAssert  assertReference  ){
		if(buyNowEntity.getBooleanValueForField("ConfigHealthIcon")){
			click(healthIcon);
		}

	}
	
	public void verifyBuyNowIntermediary(BuyNowInterEntity buyNowEntity,CustomAssert assertReference ) throws InterruptedException{
		if(buyNowEntity.getAction().equalsIgnoreCase("verify")) {
			if(buyNowEntity.getBooleanValueForField("ConfigHealthLabel")){
				assertReference.assertEquals(buyNowEntity.getStringValueForField("HealthLabel"), fetchValueFromFields(healthLabel), AssertionType.WARNING);
			}
			if(buyNowEntity.getBooleanValueForField("ConfigMotorLabel")){
				assertReference.assertEquals(buyNowEntity.getStringValueForField("MotorLabel"), fetchValueFromFields(motorLabel), AssertionType.WARNING);
			}
			if(buyNowEntity.getBooleanValueForField("ConfigHomeAndAccLabel")){
				assertReference.assertEquals(buyNowEntity.getStringValueForField("HomeAndAccLabel"), fetchValueFromFields(homeAndAccLabel), AssertionType.WARNING);
			}
			if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaTopUpLabel")){
				assertReference.assertEquals(buyNowEntity.getStringValueForField("NewIndiaTopUpLabel"), fetchValueFromFields(newIndiaTopUpMediClaimButton), AssertionType.WARNING);
			}
			if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaPremiumLabel")){
				assertReference.assertEquals(buyNowEntity.getStringValueForField("NewIndiaPremiumLabel"), fetchValueFromFields(newIndiaPremiumMediclaimButton), AssertionType.WARNING);
			}
			if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaFloaterLabel")){
				assertReference.assertEquals(buyNowEntity.getStringValueForField("NewIndiaFloaterLabel"), fetchValueFromFields(newIndiaFloaterMediClaimButton), AssertionType.WARNING);
			}
		}
	}
	public void fillAndSubmitBuyDetails(BuyNowInterEntity buyNowEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(buyNowEntity.getConfigExecute()))		
		{
			fillBuyNowDetails(buyNowEntity, assertReference);
			clickOnHealthButton(buyNowEntity, assertReference);
			verifyBuyNowIntermediary(buyNowEntity, assertReference);
		}
	}



}
