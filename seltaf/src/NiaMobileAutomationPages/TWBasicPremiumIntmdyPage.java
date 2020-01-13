package NiaMobileAutomationPages;

import org.openqa.selenium.By;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.TWBasicPremiumIntmyEntity;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TWBasicPremiumIntmdyPage extends MobileScreen {

	MobileScreenElement coverageTypeLabel;
	MobileScreenElement enhancementCover;
	MobileScreenElement packageCover;
	MobileScreenElement liabilityCover;
	MobileScreenElement oneYearsRadioButton;
	MobileScreenElement twoYearsRadioButton;
	MobileScreenElement fiveYearsRadioButton;
	MobileScreenElement ProceedButton;
	MobileScreenElement basicPremiumLabel;

	public TWBasicPremiumIntmdyPage(AppiumDriver driver, String screenName,String DeviceOS) {

		super(driver,screenName,DeviceOS);
		if(DeviceOS.equalsIgnoreCase("Android")){

			coverageTypeLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Coverage Type']"), "Coverage Type", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			enhancementCover=new MobileScreenElement(By.xpath("//android.widget.ListView[@index='1']"), "ENHANCEMENT", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			packageCover=new MobileScreenElement(By.xpath("//android.view.View[@text='PACKAGE']"), "PACKAGE", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			liabilityCover=new MobileScreenElement(By.xpath("//android.view.View[@text='LIABILITY']"), "LIABILITY", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			oneYearsRadioButton=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='7']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			twoYearsRadioButton=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='9']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			ProceedButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Proceed' and @index='0']"), "Proceed", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			basicPremiumLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Basic Premium']"), "I agree to all the Terms and Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			fiveYearsRadioButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Basic Premium']"), "Five Years", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			
		}
	}
	public void fillTwoWheelerBasicPremiumDetails(TWBasicPremiumIntmyEntity tWBasicPremiumIntmyEntity,CustomAssert assertReference ) throws InterruptedException{

		if(tWBasicPremiumIntmyEntity.getAction().equalsIgnoreCase("add")||tWBasicPremiumIntmyEntity.getAction().equalsIgnoreCase("edit")){
			{

			}
		}
		else if (tWBasicPremiumIntmyEntity.getAction().equalsIgnoreCase("verify")) {
			if(tWBasicPremiumIntmyEntity.getBooleanValueForField("ConfigCoverageType")){
				assertReference.assertEquals(tWBasicPremiumIntmyEntity.getStringValueForField("CoverageType"),fetchValueFromFields(coverageTypeLabel),AssertionType.WARNING);
			}
			if(tWBasicPremiumIntmyEntity.getBooleanValueForField("ConfigBasicPremium")){
				assertReference.assertEquals(tWBasicPremiumIntmyEntity.getStringValueForField("BasicPremium"),fetchValueFromFields(basicPremiumLabel),AssertionType.WARNING);
			}
		}
	}

	public void clickOnEnhancementCover(TWBasicPremiumIntmyEntity tWBasicPremiumIntmyEntity) {
		if(tWBasicPremiumIntmyEntity.getBooleanValueForField("ConfigEnhancement")){
			TouchAction action1 = new TouchAction(driver);
			action1.press(PointOption.point(484,329)).release().perform();
		}
	}
	public void clickOnPackageCover(TWBasicPremiumIntmyEntity tWBasicPremiumIntmyEntity) {
		if(tWBasicPremiumIntmyEntity.getBooleanValueForField("ConfigPackage")){
			click(packageCover);
		}
	}
	public void clickOnLiabilityCover(TWBasicPremiumIntmyEntity tWBasicPremiumIntmyEntity) {
		if(tWBasicPremiumIntmyEntity.getBooleanValueForField("ConfigLiability")){
			click(liabilityCover);
		}
	}
	public void clickOnProceedButton(TWBasicPremiumIntmyEntity tWBasicPremiumIntmyEntity) {
		if(tWBasicPremiumIntmyEntity.getBooleanValueForField("ConfigProceed")){
			click(ProceedButton);
		}
	}
	public void fillAndSubmitTWBasicPremiumPageDetails(TWBasicPremiumIntmyEntity tWBasicPremiumIntmyEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(tWBasicPremiumIntmyEntity.getConfigExecute())) {
			fillTwoWheelerBasicPremiumDetails(tWBasicPremiumIntmyEntity, assertReference);
			clickOnEnhancementCover(tWBasicPremiumIntmyEntity);
			clickOnPackageCover(tWBasicPremiumIntmyEntity);
			clickOnLiabilityCover(tWBasicPremiumIntmyEntity);
			clickOnProceedButton(tWBasicPremiumIntmyEntity);

		}
	}
} 


