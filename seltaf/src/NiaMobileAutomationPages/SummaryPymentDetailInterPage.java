package NiaMobileAutomationPages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.SummaryIntermidiarEntity;
import io.appium.java_client.AppiumDriver;

public class SummaryPymentDetailInterPage extends MobileScreen  {

	MobileScreenElement Policyperiod;
	MobileScreenElement quoteNoLabel;
	MobileScreenElement GrosspremiumLabel;
	MobileScreenElement GoodsServiceTaxLabel;
	MobileScreenElement NetpremiumLabel;
	MobileScreenElement ApproveAndPayButton;
	MobileScreenElement AlertConfermButton;
	MobileScreenElement APProveproposal;
	MobileScreenElement OkAlerTButton;
	MobileScreenElement saveAndCalculatePremiumButton;
	MobileScreenElement ApproveAndPayHealthButton;

	public SummaryPymentDetailInterPage(AppiumDriver driver, String screenName,String DeviceOS) {

		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android")){
			Policyperiod=new MobileScreenElement(By.xpath("//android.view.View[@text='Policy Period']/following::android.view.View"), "policy period ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			quoteNoLabel=new MobileScreenElement(By.xpath("//android.view.View[(@text='Quote No.')]//following::android.view.View"), "Quote No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			GrosspremiumLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Gross Premium' and @index='5')]//following::android.view.View"), "Gross Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			GoodsServiceTaxLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Goods & Services Tax (GST)' and @index='9')]//following::android.view.View"), "Goods & Services Tax (GST)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			NetpremiumLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Net premium' and @index='13')]//following::android.view.View"), "Net premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			ApproveAndPayButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Approve and Pay' and @index='0']"), "Approve And Pay", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			AlertConfermButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='CONFIRM']"), "Confirm", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			APProveproposal=new MobileScreenElement(By.xpath("//android.widget.TextView[@resource-id='android:id/message')]"), "Quote No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			OkAlerTButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='OK']"), "Ok", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			saveAndCalculatePremiumButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save & Re-Calculate Premium' and @index='1']"), "Save & Re-Calculate Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			ApproveAndPayHealthButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Approve & Pay']"), "Approve And Pay", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		}
	}
	public void fillSummaryPageDetails(SummaryIntermidiarEntity summaryIntermidiarEntity,CustomAssert assertReference ) throws InterruptedException{

		if(summaryIntermidiarEntity.getAction().equalsIgnoreCase("verify")){

			if(summaryIntermidiarEntity.getBooleanValueForField("ConfigQuoteNo")){
				assertReference.assertEquals(summaryIntermidiarEntity.getStringValueForField("QuoteNo"),fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
			}
			if(summaryIntermidiarEntity.getBooleanValueForField("ConfigGrossPremium")){
				assertReference.assertEquals(summaryIntermidiarEntity.getStringValueForField("GrossPremium"),fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
			}
			if(summaryIntermidiarEntity.getBooleanValueForField("ConfigGoodsAndServicesTax")){
				assertReference.assertEquals(summaryIntermidiarEntity.getStringValueForField("GoodsAndServicesTax"),fetchValueFromFields(GrosspremiumLabel),AssertionType.WARNING);
			}
			if(summaryIntermidiarEntity.getBooleanValueForField("ConfigNetPremiumLabel")){
				assertReference.assertEquals(summaryIntermidiarEntity.getStringValueForField("NetPremiumLabel"),fetchValueFromFields(GoodsServiceTaxLabel),AssertionType.WARNING);
			}
			if(summaryIntermidiarEntity.getBooleanValueForField("ConfigProductName")){
				assertReference.assertEquals(summaryIntermidiarEntity.getStringValueForField("ProductName"),fetchValueFromFields(NetpremiumLabel),AssertionType.WARNING);
			}

		}
	}
	
	public void fetchQuoteNumber(SummaryIntermidiarEntity summaryIntermidiarEntity) throws InterruptedException {
		if(summaryIntermidiarEntity.getBooleanValueForField("ConfigQuoteNoHome")){
			summaryIntermidiarEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNoLabel));
		}
	}
	public void fetchPolicyPeriod(SummaryIntermidiarEntity summaryIntermidiarEntity) throws InterruptedException {
		if(summaryIntermidiarEntity.getBooleanValueForField("ConfigPolicyperiod")){
			summaryIntermidiarEntity.setStringValueForField("policyperiod", fetchValueFromFields(Policyperiod));
		}
	}
	public void fetchalertofApproveproposal(SummaryIntermidiarEntity summaryIntermidiarEntity) throws InterruptedException {
		if(summaryIntermidiarEntity.getBooleanValueForField("ConfigApproveproposal")){
			summaryIntermidiarEntity.setStringValueForField("Approveproposal", fetchValueFromFields(APProveproposal));
			click(OkAlerTButton);

		}
	}

	public void clickOnApproveAndPay(SummaryIntermidiarEntity summaryIntermidiarEntity) {
		if(summaryIntermidiarEntity.getBooleanValueForField("ConfigApprove")){
			click(ApproveAndPayButton);
			
			click(AlertConfermButton);
			click(OkAlerTButton);
		}
	}
	public void clickOnApproveAndPayHealth(SummaryIntermidiarEntity summaryIntermidiarEntity) {
		if(summaryIntermidiarEntity.getBooleanValueForField("ConfigApproveHealth")){
			click(ApproveAndPayHealthButton);
			click(AlertConfermButton);
		}
	}

	public void clickOnSaveAndReCalculatePremium(SummaryIntermidiarEntity summaryIntermidiarEntity) {
		if(summaryIntermidiarEntity.getBooleanValueForField("ConfigSaveAndReCalclatePremium")){
			click(saveAndCalculatePremiumButton);
			//click(AlertConfermButton);
		}

	}


	public void fillAndSubmitPremiumSummaryPageDetails(SummaryIntermidiarEntity summaryIntermidiarEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(summaryIntermidiarEntity.getConfigExecute())) {
			
			fetchQuoteNumber(summaryIntermidiarEntity);
			fetchPolicyPeriod(summaryIntermidiarEntity);
			scrollToElementForward();
			fillSummaryPageDetails(summaryIntermidiarEntity, assertReference);
			clickOnSaveAndReCalculatePremium(summaryIntermidiarEntity);
			clickOnApproveAndPay(summaryIntermidiarEntity);
			clickOnApproveAndPayHealth(summaryIntermidiarEntity);
			fetchalertofApproveproposal(summaryIntermidiarEntity);
			
			
		}
	}
}