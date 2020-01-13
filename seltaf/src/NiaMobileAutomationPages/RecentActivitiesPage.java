package NiaMobileAutomationPages;

import org.openqa.selenium.By;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.RecentActivitiesEntity;
import io.appium.java_client.AppiumDriver;

public class RecentActivitiesPage extends MobileScreen{

	MobileScreenElement quoteNumberLabel;
	MobileScreenElement productNameLabel;
	MobileScreenElement partyCodeLabel;
	MobileScreenElement quoteStartDateLabel;
	MobileScreenElement statusNameLabel;
	MobileScreenElement quoteExpiryDateLabel;
	MobileScreenElement collectPremiumButton;

	public RecentActivitiesPage(AppiumDriver driver, String screenName,String DeviceOS) {

		super(driver,screenName,DeviceOS);
		if(DeviceOS.equalsIgnoreCase("Android")){

			quoteNumberLabel=new MobileScreenElement(By.xpath("android.view.View[@index='1']"), "Quote Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			productNameLabel=new MobileScreenElement(By.xpath("android.view.View[@index='3']"), "Product Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			partyCodeLabel=new MobileScreenElement(By.xpath("android.view.View[@index='5']"), "Party Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			quoteStartDateLabel=new MobileScreenElement(By.xpath("android.view.View[@index='7']"), "Quote Start Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			statusNameLabel=new MobileScreenElement(By.xpath("android.view.View[@index='11']"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			quoteExpiryDateLabel=new MobileScreenElement(By.xpath("android.view.View[@index='9']"), "Policy Start Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			collectPremiumButton=new MobileScreenElement(By.xpath("android.widget.Button[@text='Collect Premium']"), "Collect Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		}
	}


	public void fillRecentActivitiesDetails(RecentActivitiesEntity recentActivitiesEntity,CustomAssert assertReference ) throws InterruptedException{

		if(recentActivitiesEntity.getAction().equalsIgnoreCase("add")||recentActivitiesEntity.getAction().equalsIgnoreCase("edit")){

			if(recentActivitiesEntity.getAction().equalsIgnoreCase("add")||recentActivitiesEntity.getAction().equalsIgnoreCase("edit")){
				
			}
		}
		else if (recentActivitiesEntity.getAction().equalsIgnoreCase("verify")) {
			if(recentActivitiesEntity.getBooleanValueForField("ConfigQuoteNumber")){
				assertReference.assertEquals(recentActivitiesEntity.getStringValueForField("QuoteNumber"),fetchValueFromFields(quoteNumberLabel),AssertionType.WARNING);
			}
			if(recentActivitiesEntity.getBooleanValueForField("ConfigProductName")){
				assertReference.assertEquals(recentActivitiesEntity.getStringValueForField("ProductName"),fetchValueFromFields(productNameLabel),AssertionType.WARNING);
			}
			if(recentActivitiesEntity.getBooleanValueForField("ConfigPartyCode")){
				assertReference.assertEquals(recentActivitiesEntity.getStringValueForField("PartyCode"),fetchValueFromFields(partyCodeLabel),AssertionType.WARNING);
			}
			if(recentActivitiesEntity.getBooleanValueForField("ConfigQuoteStartDate")){
				assertReference.assertEquals(recentActivitiesEntity.getStringValueForField("QuoteStartDate"),fetchValueFromFields(quoteStartDateLabel),AssertionType.WARNING);
			}
			if(recentActivitiesEntity.getBooleanValueForField("ConfigProductName")){
				assertReference.assertEquals(recentActivitiesEntity.getStringValueForField("ProductName"),fetchValueFromFields(productNameLabel),AssertionType.WARNING);
			}
			if(recentActivitiesEntity.getBooleanValueForField("ConfigStatusName")){
				assertReference.assertEquals(recentActivitiesEntity.getStringValueForField("StatusName"),fetchValueFromFields(statusNameLabel),AssertionType.WARNING);
			}
			if(recentActivitiesEntity.getBooleanValueForField("ConfigQuoteExpiryDate")){
				assertReference.assertEquals(recentActivitiesEntity.getStringValueForField("QuoteExpiryDate"),fetchValueFromFields(quoteExpiryDateLabel),AssertionType.WARNING);
			}
		}
	}
	public void clickOnCollectionPremiumButton(RecentActivitiesEntity recentActivitiesEntity) {
		if(recentActivitiesEntity.getBooleanValueForField("ConfigCollectPremium")){
		click(collectPremiumButton);	
		}
	}
	
	public void fillAndSubmitRecentActivitiesPageDetails(RecentActivitiesEntity recentActivitiesEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(recentActivitiesEntity.getConfigExecute())) {
			fillRecentActivitiesDetails(recentActivitiesEntity, assertReference);
			clickOnCollectionPremiumButton(recentActivitiesEntity);
			
			
		}
}

}
