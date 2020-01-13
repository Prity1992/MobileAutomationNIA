package NiaMobileAutomationPages;

import java.util.ArrayList;

import org.openqa.selenium.By;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.ScenarioTestData;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PremiumSummaryEntity;
import com.aqm.staf.library.databin.SummaryPageEntity;

import io.appium.java_client.AppiumDriver;

public class PremiumSummaryPage extends MobileScreen{

	MobileScreenElement prmeiumSummaryLabel;
	MobileScreenElement enhancementPremiumAmount;
	MobileScreenElement packagePremiumAmount;
	MobileScreenElement liabilityPremiumAmount;
	MobileScreenElement buyOnlineButton;
	MobileScreenElement quoteNoLabel;
	MobileScreenElement estimatedPremiumLabel;
	MobileScreenElement totalIDVLabel;
	MobileScreenElement buyInsuranceForNewVehicleButton;
	MobileScreenElement vehicleDetailsList;
	MobileScreenElement vehicleZoneDropDown;
	MobileScreenElement recalculatePremiumButton ;
	MobileScreenElement saveAndContinueButton ;
	MobileScreenElement aRadioButton ;
	MobileScreenElement yEarOfManufactureDropDown ;
	MobileScreenElement yearRadioButton;
	MobileScreenElement coverageDetails;
	MobileScreenElement coverageDetailsRadioButton;

	public PremiumSummaryPage(AppiumDriver driver, String screenName,String DeviceOS) {

		super(driver,screenName,DeviceOS);
		if(DeviceOS.equalsIgnoreCase("Android")){

			prmeiumSummaryLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Premium Summary']"), "Premium Summary", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			enhancementPremiumAmount=new MobileScreenElement(By.xpath("//android.view.View[@text='Enhancement' and @index='0']"), "Enhancement", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			packagePremiumAmount=new MobileScreenElement(By.xpath("//android.view.View[@text='Package']"), "Model", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			liabilityPremiumAmount=new MobileScreenElement(By.xpath("//android.view.View[@text='Liability']"), "LIABILITY", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			buyOnlineButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Buy Online'and @index='0']"), "Buy Online", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			quoteNoLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Estimated Premium:167,764.00' and @index='2']//preceding::android.view.View"), "Quote No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			totalIDVLabel=new MobileScreenElement(By.xpath("//android.view.View[contains(@text='Total IDV')]") ,"Total IDV", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			buyInsuranceForNewVehicleButton=new MobileScreenElement(By.xpath("//android.view.View[@index='1']"), "Buy Insurance For Aa new vehicle", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			vehicleDetailsList=new MobileScreenElement(By.xpath("//android.view.View[@text='−']"), "−", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			vehicleZoneDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@resource-id='vehicleZone' and @index='0']"), "vehicle Zone", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			recalculatePremiumButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Recalculate Premium' and @index='1']"), "Recalculate Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			saveAndContinueButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save & Continue' and @index='2']"), "Save & Continue", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			estimatedPremiumLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Estimated Premium')]") ,"Estimated Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			yEarOfManufactureDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='year' and @index='0']"), "Year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			coverageDetails=new MobileScreenElement(By.xpath("//android.view.View[@text='Coverage Details no errors icon ']"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			coverageDetailsRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text='  1st year OD+3 years TP ']"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		}
	}
	public void PremiumSummaryPageDetails(PremiumSummaryEntity premiumSummaryEntity,CustomAssert assertReference ) throws InterruptedException{

		if(premiumSummaryEntity.getAction().equalsIgnoreCase("add")||premiumSummaryEntity.getAction().equalsIgnoreCase("edit")){
			/*if(premiumSummaryEntity.getBooleanValueForField("ConfigVehicleZone")){
				click(vehicleZoneDropDown);
				String a=premiumSummaryEntity.getStringValueForField("VehicleZone");
				aRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+a+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(aRadioButton);*/
		}
		if(premiumSummaryEntity.getBooleanValueForField("ConfigYear")){
			click(yEarOfManufactureDropDown);
			String year=premiumSummaryEntity.getStringValueForField("Year");
			yearRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+year+"'"+"]"), "year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(yearRadioButton);
			//selectValueFromList(sumInsuredDropDown, topUpMediclaimEntity.getStringValueForField("SumInsured"));

		}		
		else if (premiumSummaryEntity.getAction().equalsIgnoreCase("verify")) {
			/*if(premiumSummaryEntity.getBooleanValueForField("ConfigVehicleZone")){
				assertReference.assertEquals(premiumSummaryEntity.getStringValueForField("VehicleZone"),fetchValueFromList(vehicleZoneDropDown),AssertionType.WARNING);
			}*/
			if(premiumSummaryEntity.getBooleanValueForField("ConfigPremiumSummary")){
				assertReference.assertEquals(premiumSummaryEntity.getStringValueForField("PremiumSummary"),fetchValueFromFields(prmeiumSummaryLabel),AssertionType.WARNING);
			}
			if(premiumSummaryEntity.getBooleanValueForField("ConfigQuoteNo")){
				assertReference.assertEquals(premiumSummaryEntity.getStringValueForField("QuoteNo"),fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
			}
			if(premiumSummaryEntity.getBooleanValueForField("ConfigEstimatedPremium")){
				assertReference.assertEquals(premiumSummaryEntity.getStringValueForField("EstimatedPremium"),fetchValueFromFields(estimatedPremiumLabel),AssertionType.WARNING);
			}
			if(premiumSummaryEntity.getBooleanValueForField("ConfigTotalIDV")){
				assertReference.assertEquals(premiumSummaryEntity.getStringValueForField("TotalIDV"),fetchValueFromFields(totalIDVLabel),AssertionType.WARNING);
			}

		}
		}
	
	public void clickOnEnhancementPremium(PremiumSummaryEntity premiumSummaryEntity) {
		if(premiumSummaryEntity.getBooleanValueForField("ConfigEnhancementPremiumAmount")){
			click(enhancementPremiumAmount);
		}
	}
	public void clickOnPackagePremium(PremiumSummaryEntity premiumSummaryEntity) {
		if(premiumSummaryEntity.getBooleanValueForField("ConfigPackagePremiumAmount")){
			click(packagePremiumAmount);
		}
	}
	public void clickOnLiabilityPremium(PremiumSummaryEntity premiumSummaryEntity) {
		if(premiumSummaryEntity.getBooleanValueForField("ConfigLiabilityPremiumAmount")){
			click(liabilityPremiumAmount);
		}
	}
	public void clickOnBuyOnLineButton(PremiumSummaryEntity premiumSummaryEntity) throws InterruptedException {
		if(premiumSummaryEntity.getBooleanValueForField("ConfigBuyOnline")){
			scrollDown();
			click(buyOnlineButton);
			//waitForPageElement(quoteNoLabel);
			Thread.sleep(10000);
			//premiumSummaryEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNoLabel));
		}
	}
	public void clickOnVehicleDetailsList(PremiumSummaryEntity premiumSummaryEntity) {
		/*if(premiumSummaryEntity.getBooleanValueForField("ConfigvehicleDetails")){
			click(vehicleDetailsList);*/
			if(premiumSummaryEntity.getBooleanValueForField("ConfigVehicleZone")){
				scrollDown();
				//scrollDown();
				click(vehicleZoneDropDown);
				String a=premiumSummaryEntity.getStringValueForField("VehicleZone");
				aRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+a+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(aRadioButton);
		}		
			}
	
	private void clickOnCoverageDetails(PremiumSummaryEntity premiumSummaryEntity) {
		if(premiumSummaryEntity.getBooleanValueForField("ConfigCoverageDetails")) {
			scrollDown();
			click(coverageDetails);
			click(coverageDetailsRadioButton);
		}
		
	}
	
	public void clickOnBuyInsuranceForNewVehicleButton(PremiumSummaryEntity premiumSummaryEntity) {
		if(premiumSummaryEntity.getBooleanValueForField("ConfigBuyInsuranceForNewVehicle")){
			click(buyInsuranceForNewVehicleButton);
		}
	}
	public void clickOnRecalculatePremiumButton(PremiumSummaryEntity premiumSummaryEntity) throws InterruptedException {
		if(premiumSummaryEntity.getBooleanValueForField("ConfigRecalculatePremium")){
			scrollDown();
			click(recalculatePremiumButton);
			Thread.sleep(5000);
		}
	}
	public void clickOnSaveAndContinueButton(PremiumSummaryEntity premiumSummaryEntity) {
		if(premiumSummaryEntity.getBooleanValueForField("ConfigSaveAndContinue")){
			scrollDown();
			click(saveAndContinueButton);
		}
	}
	
	/*private void setEditPartyDependency(PremiumSummaryEntity premiumSummaryEntity, ScenarioTestData testData) {
		if(premiumSummaryEntity.getStringValueForField("DependencyForQuoteNo")!=null){
			ArrayList<SummaryPageEntity> summaryPageEntityEntityList=testData.getObjectByReference(testData.getSummaryPageEntity(), premiumSummaryEntity.getStringValueForField("DependencyForQuoteNo"));
			for(SummaryPageEntity summaryPageEntityData :summaryPageEntityEntityList){
				summaryPageEntityData.setStringValueForField("QuoteNo",premiumSummaryEntity.getStringValueForField("QuoteNo"));
				testData.updateRecordsForCriteria(summaryPageEntityData);
			}
		}
	}*/
	public void fillAndSubmitPremiumSummaryPageDetails(PremiumSummaryEntity premiumSummaryEntity,CustomAssert assertReference,String stepGroup,ScenarioTestData testData) throws InterruptedException{
		if(isConfigTrue(premiumSummaryEntity.getConfigExecute())) {
			clickOnEnhancementPremium(premiumSummaryEntity);
			clickOnBuyOnLineButton(premiumSummaryEntity);
			//setEditPartyDependency(premiumSummaryEntity, testData);
			clickOnBuyInsuranceForNewVehicleButton(premiumSummaryEntity);
			PremiumSummaryPageDetails(premiumSummaryEntity, assertReference);
			clickOnPackagePremium(premiumSummaryEntity);
			clickOnLiabilityPremium(premiumSummaryEntity);
		
			clickOnVehicleDetailsList(premiumSummaryEntity);
			clickOnCoverageDetails(premiumSummaryEntity);
		
			clickOnRecalculatePremiumButton(premiumSummaryEntity);
			clickOnSaveAndContinueButton(premiumSummaryEntity);
		}
	}
}
