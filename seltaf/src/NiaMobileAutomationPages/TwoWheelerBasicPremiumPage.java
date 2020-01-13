package NiaMobileAutomationPages;

import org.openqa.selenium.By;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.TwoWheelerBasicPremiumEntity;
import com.aqm.staf.library.databin.TwoWheelerBuyInsuranceEntity;

import io.appium.java_client.AppiumDriver;

public class TwoWheelerBasicPremiumPage extends MobileScreen {

	MobileScreenElement coverageTypeLabel;
	MobileScreenElement enhancementCover;
	MobileScreenElement packageCover;
	MobileScreenElement liabilityCover;
	MobileScreenElement oneYearsRadioButton;
	MobileScreenElement twoYearsRadioButton;
	MobileScreenElement ProceedButton;
	MobileScreenElement basicPremiumLabel;

	public TwoWheelerBasicPremiumPage(AppiumDriver driver, String screenName,String DeviceOS) {

		super(driver,screenName,DeviceOS);
		if(DeviceOS.equalsIgnoreCase("Android")){

			coverageTypeLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Coverage Type']"), "Coverage Type", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			enhancementCover=new MobileScreenElement(By.xpath("//android.view.View[@text='ENHANCEMENT' and @index='0']"), "ENHANCEMENT", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			packageCover=new MobileScreenElement(By.xpath("//android.view.View[@text='PACKAGE']"), "PACKAGE", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			liabilityCover=new MobileScreenElement(By.xpath("//android.view.View[@text='LIABILITY']"), "LIABILITY", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			oneYearsRadioButton=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='7']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			twoYearsRadioButton=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='9']"), "New Current Account", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			ProceedButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Proceed' and @index='0']"), "Proceed", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			basicPremiumLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Basic Premium']"), "I agree to all the Terms and Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		}
	}
	public void fillTwoWheelerBasicPremiumDetails(TwoWheelerBasicPremiumEntity twoWheelerBasicPremiumEntity,CustomAssert assertReference ) throws InterruptedException{

		if(twoWheelerBasicPremiumEntity.getAction().equalsIgnoreCase("add")||twoWheelerBasicPremiumEntity.getAction().equalsIgnoreCase("edit")){
			{
				
			}
		}
		else if (twoWheelerBasicPremiumEntity.getAction().equalsIgnoreCase("verify")) {
			if(twoWheelerBasicPremiumEntity.getBooleanValueForField("ConfigCoverageType")){
				assertReference.assertEquals(twoWheelerBasicPremiumEntity.getStringValueForField("CoverageType"),fetchValueFromFields(coverageTypeLabel),AssertionType.WARNING);
			}
			if(twoWheelerBasicPremiumEntity.getBooleanValueForField("ConfigBasicPremium")){
				assertReference.assertEquals(twoWheelerBasicPremiumEntity.getStringValueForField("BasicPremium"),fetchValueFromFields(basicPremiumLabel),AssertionType.WARNING);
			}
		}
	}
	
	public void clickOnEnhancementCover(TwoWheelerBasicPremiumEntity twoWheelerBasicPremiumEntity) {
		if(twoWheelerBasicPremiumEntity.getBooleanValueForField("ConfigEnhancement")){
			click(enhancementCover);
		}
	}
	public void clickOnPackageCover(TwoWheelerBasicPremiumEntity twoWheelerBasicPremiumEntity) {
		if(twoWheelerBasicPremiumEntity.getBooleanValueForField("ConfigPackage")){
			click(packageCover);
		}
	}
	public void clickOnLiabilityCover(TwoWheelerBasicPremiumEntity twoWheelerBasicPremiumEntity) {
		if(twoWheelerBasicPremiumEntity.getBooleanValueForField("ConfigLiability")){
			click(liabilityCover);
		}
	}
	public void clickOnProceedButton(TwoWheelerBasicPremiumEntity twoWheelerBasicPremiumEntity) {
		if(twoWheelerBasicPremiumEntity.getBooleanValueForField("ConfigProceed")){
			click(ProceedButton);
		}
	}
	public void fillAndSubmitTwoWheelerBasicPremiumPageDetails(TwoWheelerBasicPremiumEntity twoWheelerBasicPremiumEntity,CustomAssert assertReference) throws InterruptedException{
		if(isConfigTrue(twoWheelerBasicPremiumEntity.getConfigExecute())) {
			fillTwoWheelerBasicPremiumDetails(twoWheelerBasicPremiumEntity, assertReference);
			clickOnEnhancementCover(twoWheelerBasicPremiumEntity);
			clickOnPackageCover(twoWheelerBasicPremiumEntity);
			clickOnLiabilityCover(twoWheelerBasicPremiumEntity);
			clickOnProceedButton(twoWheelerBasicPremiumEntity);
			
}
	}
}