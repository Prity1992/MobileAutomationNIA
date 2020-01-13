package NiaMobileAutomationPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyInfoIntermidiaryEntity;
import com.aqm.staf.library.databin.QuickRenewPolicyEntity;
import com.aqm.staf.library.databin.SummaryIntermidiarEntity;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class QuickPayRenewalPolicyDetailsPage extends MobileScreen{

	MobileScreenElement pendingForRenewalsButton;
	MobileScreenElement grihaSuvidhaLabel;
	MobileScreenElement policyNoLabel;
	MobileScreenElement oldPolicyNoLabel;
	MobileScreenElement policyStatusLabel;
	MobileScreenElement quoteStatusLabel;
	MobileScreenElement getDetailsButton;
	MobileScreenElement proceedToPayButton;
	MobileScreenElement OkAlerTButton;
	MobileScreenElement saveAndCalculatePremiumButton;
	MobileScreenElement ApproveAndPayHealthButton;
	MobileScreenElement renewButton;
	MobileScreenElement StateMotorTextBox;
	MobileScreenElement StateHealthname;
	MobileScreenElement PinCodeHealth3TExtBox;
	MobileScreenElement PinNoHealthTextField;
	MobileScreenElement alertApprovedLabel;
	MobileScreenElement alertApprovedOkButton;
	MobileScreenElement closePanButton;
	MobileScreenElement newindiaTopUpLabel;
	MobileScreenElement dateTopUpLabel;
	MobileScreenElement twoWheelerLabel;
	MobileScreenElement seniorCitizenMediclaimLabel;
	MobileScreenElement renewPolicyTextField;
	
	public QuickPayRenewalPolicyDetailsPage(AppiumDriver driver, String screenName,String DeviceOS) {

		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android")){
			seniorCitizenMediclaimLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Senior Citizen Mediclaim']"), "Senior Citizen Mediclaim ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			twoWheelerLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Two Wheeler']"), "Two Wheeler ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			pendingForRenewalsButton=new MobileScreenElement(By.xpath("//android.widget.EditText[@text='Pending For Renewals']"), "Pending For Renewals ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			grihaSuvidhaLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Griha Suvidha']"), "Griha Suvidha", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			policyNoLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Gross Premium' and @index='5']//following::android.view.View"), "Gross Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			oldPolicyNoLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Old Policy No.']//following::android.widget.EditText[1]"), "Old Policy No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			policyStatusLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Policy Status' ]//following::android.widget.EditText[1]"), "Policy Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			quoteStatusLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Quote Status']//following::android.widget.EditText[1]"), "Quote Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			getDetailsButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Get Details']"), "Get Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			proceedToPayButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Proceed to Pay']"), "Proceed to Pay", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			OkAlerTButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='OK']"), "Ok", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			saveAndCalculatePremiumButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save & Re-Calculate Premium' and @index='1']"), "Save & Re-Calculate Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			ApproveAndPayHealthButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Approve & Pay']"), "Approve And Pay", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			renewButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Renew']"), "Renew", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

			StateMotorTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='State']//following::android.widget.EditText[1]"), "State", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			StateHealthname=new MobileScreenElement(By.xpath("//android.view.View[@text='MAHARASHTRA']"), "MAHARASHTRA", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			PinCodeHealth3TExtBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Pin Code']//following::android.widget.EditText[1]"), "PinCode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			PinNoHealthTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='400066']"), "Pin", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			alertApprovedLabel=new MobileScreenElement(By.xpath("//android.widget.TextView[@text='Alert']//following::android.widget.TextView[1]"), "Proposal Approved", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			alertApprovedOkButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Continue']"), "CONTINUE", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			closePanButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Close']"), "Close", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			newindiaTopUpLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='New India Top Up Mediclaim']"), "New India Top Up Mediclaim", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			//dateTopUpLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='31']"), "31", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			renewPolicyTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Quick Pay/ Renew Policy']//following::android.widget.EditText[1]"), "Enter Policy No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		}
	}

	public void fillQuickPayRenewalPolicyDetails(QuickRenewPolicyEntity quickRenewPolicyEntity,CustomAssert assertReference ) throws InterruptedException{
		if(quickRenewPolicyEntity.getAction().equalsIgnoreCase("add")||quickRenewPolicyEntity.getAction().equalsIgnoreCase("edit")){
			if(quickRenewPolicyEntity.getBooleanValueForField("ConfigRenewPolicy")){
				clearAndSendKeys(renewPolicyTextField, quickRenewPolicyEntity.getStringValueForField("RenewPolicy"));
			}
			if(quickRenewPolicyEntity.getBooleanValueForField("ConfigPolicyNo")){
				TouchAction action1 = new TouchAction(driver);
				action1.press(PointOption.point(364,501)).release().perform();
			}
			if(quickRenewPolicyEntity.getBooleanValueForField("ConfigOldPolicyNo")){
				quickRenewPolicyEntity.setStringValueForField("OldPolicyNo", fetchValueFromFields(oldPolicyNoLabel));
			}
			if(quickRenewPolicyEntity.getBooleanValueForField("ConfigPolicyStatus")){
				quickRenewPolicyEntity.setStringValueForField("PolicyStatus", fetchValueFromFields(policyStatusLabel));
			}
			if(quickRenewPolicyEntity.getBooleanValueForField("ConfigQuoteStatus")){
				quickRenewPolicyEntity.setStringValueForField("QuoteStatus", fetchValueFromFields(quoteStatusLabel));
				click(renewButton);
			}
		}
	}

	public void clickOnPendingForRenewals(QuickRenewPolicyEntity quickRenewPolicyEntity) {
		if(quickRenewPolicyEntity.getBooleanValueForField("ConfigPendingForRenewals")){
			
			String renewalDate=RandomCodeGenerator.dateGenerator(quickRenewPolicyEntity.getStringValueForField("RenewalDate"));
			String[] dateParts=renewalDate.split("/");
			String day=dateParts[0];
			dateTopUpLabel= new MobileScreenElement(By.xpath("//android.view.View[@text="+day+"]"), "31", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(dateTopUpLabel);
			click(pendingForRenewalsButton);
		}
	}
	public void clickOnGetDetails(QuickRenewPolicyEntity quickRenewPolicyEntity) throws InterruptedException {
		if(quickRenewPolicyEntity.getBooleanValueForField("ConfigGetDetails")){
			click(getDetailsButton);
		}
		if(quickRenewPolicyEntity.getBooleanValueForField("ConfigApproved")){
			quickRenewPolicyEntity.setStringValueForField("Approved", fetchValueFromFields(alertApprovedLabel));
			click(alertApprovedOkButton);
			click(closePanButton);
		}
		scrollDown();
		scrollDown();

		if(quickRenewPolicyEntity.getBooleanValueForField("ConfigStateTextBox")){				
			clearAndSendKeys(StateMotorTextBox, quickRenewPolicyEntity.getStringValueForField("State"));
			click(StateHealthname);
		}
		if(quickRenewPolicyEntity.getBooleanValueForField("ConfigpincodeTextBox")){
			click(PinCodeHealth3TExtBox);
			clearAndSendKeys(PinCodeHealth3TExtBox, quickRenewPolicyEntity.getStringValueForField("pin"));
			click(PinNoHealthTextField);
		}
	}
	public void clickProceedToPay(QuickRenewPolicyEntity quickRenewPolicyEntity) {
		if(quickRenewPolicyEntity.getBooleanValueForField("ConfigProceedToPay")){
			click(proceedToPayButton);
			click(OkAlerTButton);
		}
	}
	public void clickOnGrihaSuvidhaLabel(QuickRenewPolicyEntity quickRenewPolicyEntity) {
		if(quickRenewPolicyEntity.getBooleanValueForField("ConfigGrihaSuvidha")){
			click(grihaSuvidhaLabel);
			
		}
	}
	public void clickOnNewIndiaTopUpLabel(QuickRenewPolicyEntity quickRenewPolicyEntity) {
		if(quickRenewPolicyEntity.getBooleanValueForField("ConfiNewIndiaTopUp")){
			click(newindiaTopUpLabel);
			
		}
	}
	public void clickOnTwoWheelerLabel(QuickRenewPolicyEntity quickRenewPolicyEntity) {
		if(quickRenewPolicyEntity.getBooleanValueForField("ConfigTwoWheeler")){
			click(twoWheelerLabel);
			
		}
	}
	public void clickOnseniorCitizenMediclaimLabel(QuickRenewPolicyEntity quickRenewPolicyEntity) {
		if(quickRenewPolicyEntity.getBooleanValueForField("ConfigSeniorCitizenMediclaim")){
			click(seniorCitizenMediclaimLabel);
			
		}
	}
	public void fillAndSubmitQuickPayRenewalPolicyDetails(QuickRenewPolicyEntity quickRenewPolicyEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(quickRenewPolicyEntity.getConfigExecute())) {

			clickOnPendingForRenewals(quickRenewPolicyEntity);
			clickOnseniorCitizenMediclaimLabel(quickRenewPolicyEntity);
			clickOnNewIndiaTopUpLabel(quickRenewPolicyEntity);
			scrollDown();
			scrollDown();
			clickOnGrihaSuvidhaLabel(quickRenewPolicyEntity);
			clickOnTwoWheelerLabel(quickRenewPolicyEntity);
			fillQuickPayRenewalPolicyDetails(quickRenewPolicyEntity, assertReference);
			clickOnGetDetails(quickRenewPolicyEntity);
			clickProceedToPay(quickRenewPolicyEntity);


		}
	}

}

