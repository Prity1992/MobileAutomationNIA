package NiaMobileAutomationPages;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.CollectionIntemidiaryEntity;
import com.aqm.staf.library.databin.SummaryIntermidiarEntity;
import com.aqm.staf.library.databin.SummaryPageEntity;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class CollectionIntemidiaryPage extends MobileScreen {
	MobileScreenElement CollectionModeTExt;
	MobileScreenElement CashText;
	MobileScreenElement CollectionAmountTextField;
	MobileScreenElement CollectPremiumButton;
	MobileScreenElement proposalIssued;
	MobileScreenElement OK;
	MobileScreenElement PolicyNumber;
	MobileScreenElement policyNumberLabel;
	MobileScreenElement quoteNumberLabel;
	MobileScreenElement collectionNumberLabel;
	MobileScreenElement paymentSuccessfulLabel;
	MobileScreenElement cashCollectionModeLabel;
	// cheque
	MobileScreenElement pOTypeDropDown;
	MobileScreenElement pONoTextField;
	MobileScreenElement pODate;
	MobileScreenElement draweeBankNameTextField;
	MobileScreenElement draweeBankBranchTextField;
	MobileScreenElement collectionAmountTextField;
	MobileScreenElement clearingLabel;
	MobileScreenElement date;
	MobileScreenElement Bank;
	MobileScreenElement chequeText;
	MobileScreenElement draftText;
	MobileScreenElement NetBankingText;
	MobileScreenElement PostalOrderText;
	MobileScreenElement MOdeDraftPOnoHelth3Dropdown;
	MobileScreenElement PoNumberHealth3TextBox;
	MobileScreenElement PoDateHealth3;
	MobileScreenElement DraweeBankNameTextFieldHealth3;
	MobileScreenElement DraweeBankBranchHealth3;
	MobileScreenElement CollectionAmounttextFieldHealth3;
	MobileScreenElement searchBankRenewalTextField;
	MobileScreenElement searchBankRenewalSearchButton;
	MobileScreenElement bankRenewaLButton;

	MobileScreenElement transactionLabel;
	MobileScreenElement policyNoRenewalLabel;
	MobileScreenElement productNameLabel;
	MobileScreenElement policyHolderLabel;
	MobileScreenElement premiumLabel;
	MobileScreenElement poDateLabel;
	private int currentDate;

	public CollectionIntemidiaryPage(AppiumDriver driver, String screenName, String DeviceOS) {
		super(driver, screenName, DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (DeviceOS.equalsIgnoreCase("Android")) {
			searchBankRenewalTextField = new MobileScreenElement(
					By.xpath("//android.widget.EditText[@text='04/12/2018']//following::android.view.View[]"),
					"Bank Search", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			searchBankRenewalSearchButton = new MobileScreenElement(
					By.xpath("//android.view.View[@text='Search Bank']//following::android.view.View[3]"),
					"Bank Search", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			CollectionModeTExt = new MobileScreenElement(By.xpath("//android.view.View[@text='Collection Mode']"),
					"Collection Mode", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			CashText = new MobileScreenElement(By.xpath("//android.view.View[@text='Cash']"), "Cash", false,
					WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			CollectionAmountTextField = new MobileScreenElement(
					By.xpath("//android.view.View[@text='Mode-Cash']/following::android.widget.EditText[1]"),
					"Collect Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			CollectPremiumButton = new MobileScreenElement(By.xpath("//android.widget.Button[@text='Collect Premium']"),
					"Collect Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			proposalIssued = new MobileScreenElement(By.xpath("//android.widget.TextView[@text=' Proposal Issued']"),
					"Collect Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			OK = new MobileScreenElement(By.xpath("//android.widget.Button[@text='Ok']"), "Collect Premium", false,
					WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			PolicyNumber = new MobileScreenElement(
					By.xpath("//android.widget.Button[@text='Collect Premium']/preceding::android.widget.EditText[1]"),
					"Collect Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			policyNumberLabel = new MobileScreenElement(By.xpath(
					"//android.view.View[@text='Your payment has been processed. The details of the transaction are as follows.']//following::android.view.View[1]"),
					"Policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			quoteNumberLabel = new MobileScreenElement(By.xpath(
					"//android.view.View[@text='Your payment has been processed. The details of the transaction are as follows.']//following::android.view.View[2]"),
					"Quote Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			collectionNumberLabel = new MobileScreenElement(By.xpath(
					"//android.view.View[@text='Your payment has been processed. The details of the transaction are as follows.']//following::android.view.View[3]"),
					"Collection Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			paymentSuccessfulLabel = new MobileScreenElement(By.xpath(
					"//android.view.View[@text='Your payment has been processed. The details of the transaction are as follows.']"),
					"Payment Successful", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			cashCollectionModeLabel = new MobileScreenElement(
					By.xpath("//android.view.View[@text='All fields are mandatory']//following::android.view.View[3]"),
					"Collect Mode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			// Chq/Draft
			pOTypeDropDown = new MobileScreenElement(By.xpath(
					"//android.view.View[@text='All fields are mandatory']//following::android.widget.EditText[1]"),
					"Cheque/Draft/P.O Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			pONoTextField = new MobileScreenElement(By.xpath(
					"//android.view.View[@text='All fields are mandatory']//following::android.widget.EditText[2]"),
					"Cheque/Draft/P.O no.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			pODate = new MobileScreenElement(By.xpath(
					"//android.view.View[@text='All fields are mandatory']//following::android.widget.EditText[3]"),
					"Cheque/Draft/P.O Date.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			draweeBankNameTextField = new MobileScreenElement(By.xpath(
					"//android.view.View[@text='All fields are mandatory']//following::android.widget.EditText[4]"),
					"Drawee Bank Name,", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			draweeBankBranchTextField = new MobileScreenElement(By.xpath(
					"//android.view.View[@text='All fields are mandatory']//following::android.widget.EditText[5]"),
					"Drawee Bank Branch", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			collectionAmountTextField = new MobileScreenElement(By.xpath(
					"//android.view.View[@text='All fields are mandatory']//following::android.widget.EditText[6]"),
					"Collect Mode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			date = new MobileScreenElement(
					By.xpath("//android.view.View[@text='Fri']//following::android.view.View(@index='0')"), "Date",
					false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			Bank = new MobileScreenElement(By.xpath("//android.view.View[@text='HDFC BANK LTD:DR00021104']"), "Bank",
					false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			chequeText = new MobileScreenElement(By.xpath("//android.view.View[@text='Cheque']"), "Cheque", false,
					WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			draftText = new MobileScreenElement(By.xpath("//android.view.View[@text='Draft']"), "Draft", false,
					WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			NetBankingText = new MobileScreenElement(By.xpath("//android.view.View[@text='Net Banking']"),
					"Net Banking", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			PostalOrderText = new MobileScreenElement(By.xpath("//android.view.View[@text='Postal Order']"),
					"Postal Order", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			clearingLabel = new MobileScreenElement(By.xpath("//android.view.View[@text='Clearing']"), "clearing ",
					false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			MOdeDraftPOnoHelth3Dropdown = new MobileScreenElement(
					By.xpath("//android.view.View[@text='Mode-Demand Draft']/following::android.widget.EditText[1]"),
					"clearing ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			PoNumberHealth3TextBox = new MobileScreenElement(
					By.xpath("//android.widget.EditText[@text='Clearing']/following::android.widget.EditText[1]"),
					"clearing ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			PoDateHealth3 = new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='ddDate_0']"),
					"clearing ", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			DraweeBankNameTextFieldHealth3 = new MobileScreenElement(
					By.xpath(
							"//android.widget.EditText[@resource-id='ddDate_0']/following::android.widget.EditText[1]"),
					"Cheque/Draft/P.O no.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			DraweeBankBranchHealth3 = new MobileScreenElement(By.xpath(
					"//android.widget.EditText[@text='HDFC BANK LTD:DR00021104']/following::android.widget.EditText[1]"),
					"Cheque/Draft/P.O no.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			CollectionAmounttextFieldHealth3 = new MobileScreenElement(
					By.xpath("//android.widget.EditText[@text='Mumbai']/following::android.widget.EditText[1]"),
					"Cheque/Draft/P.O no.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

			transactionLabel = new MobileScreenElement(
					By.xpath("//android.view.View[@text='Your transaction was successful.']"),
					"Your transaction was successful.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			policyNoRenewalLabel = new MobileScreenElement(By.xpath(
					"//android.view.View[@text='Your transaction was successful.']//following::android.view.View[1]"),
					"Policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			productNameLabel = new MobileScreenElement(By.xpath(
					"//android.view.View[@text='Your transaction was successful.']//following::android.view.View[2]"),
					"Policy Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			policyHolderLabel = new MobileScreenElement(By.xpath(
					"//android.view.View[@text='Your transaction was successful.']//following::android.view.View[3]"),
					"Policy Holder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			premiumLabel = new MobileScreenElement(By.xpath(
					"//android.view.View[@text='Your transaction was successful.']//following::android.view.View[6]"),
					"Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

			// poDateLabel=new
			// MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='chequeDate_0'and
			// @index='0']"),"Po Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		}
	}

	public void fillCollectionDetail(CollectionIntemidiaryEntity collectionIntemidiaryEntity,
			CustomAssert assertReference) throws InterruptedException {
		if (collectionIntemidiaryEntity.getAction().equalsIgnoreCase("add")
				|| collectionIntemidiaryEntity.getAction().equalsIgnoreCase("edit")) {
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigCollectionModeTExt")) {
				click(CollectionModeTExt);
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigCashText")) {
				click(CashText);
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigChequeText")) {

				click(chequeText);

			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigDraftText")) {
				click(draftText);

			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigNetBankingText")) {
				click(NetBankingText);
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigPostalOrderText")) {
				click(PostalOrderText);
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigCollectionAmountTextField")) {
				clearAndSendKeys(CollectionAmountTextField,
						collectionIntemidiaryEntity.getStringValueForField("CollectionAmount"));
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigQuoteNoHome")) {
				collectionIntemidiaryEntity.setStringValueForField("proposalIssued",
						fetchValueFromFields(proposalIssued));
			}

			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigCollectionMode")) {
				assertReference.assertEquals(collectionIntemidiaryEntity.getStringValueForField("CollectionMode"),
						fetchValueFromFields(cashCollectionModeLabel), AssertionType.WARNING);
			}
		}
		if (collectionIntemidiaryEntity.getAction().equalsIgnoreCase("verify")) {
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigCollectionMode")) {
				assertReference.assertEquals(collectionIntemidiaryEntity.getStringValueForField("CollectionMode"),
						fetchValueFromFields(cashCollectionModeLabel), AssertionType.WARNING);
			}

			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigCollectionAmountTextField")) {
				assertReference.assertEquals(collectionIntemidiaryEntity.getStringValueForField("CollectionAmount"),
						fetchValueFromFields(CollectionAmountTextField), AssertionType.WARNING);
			}
		}
	}

	public void fillChequeDetails(CollectionIntemidiaryEntity collectionIntemidiaryEntity, CustomAssert assertReference)
			throws InterruptedException {
		if (collectionIntemidiaryEntity.getAction().equalsIgnoreCase("add")
				|| collectionIntemidiaryEntity.getAction().equalsIgnoreCase("edit")) {
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigPoType")) {
				click(pOTypeDropDown);
				click(clearingLabel);
			}

			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigPotypeHealth3")) {
				click(MOdeDraftPOnoHelth3Dropdown);
				click(clearingLabel);
			}

			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigPoNo")) {
				clearAndSendKeys(pONoTextField, collectionIntemidiaryEntity.getStringValueForField("PoNo"));
			}

			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigPoNoHelth3")) {
				clearAndSendKeys(PoNumberHealth3TextBox, collectionIntemidiaryEntity.getStringValueForField("PoNo"));
			}

			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigPoDateHealth3")) {
				click(PoDateHealth3);
				//click(date);
				Thread.sleep(2000);
				Calendar currentdate = Calendar.getInstance();
				System.out.println("Current Date is : " + currentdate.get(Calendar.DATE));
				currentDate = currentdate.get(Calendar.DATE);
				poDateLabel = new MobileScreenElement(By.xpath("//android.view.View[@text=" + "'" + currentDate + "']"),
						"PO Date");
				click(poDateLabel);
			}

			// need to check
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigPoDate")) {
				click(pODate);
				Thread.sleep(2000);
				Calendar currentdate = Calendar.getInstance();
				System.out.println("Current Date is : " + currentdate.get(Calendar.DATE));
				currentDate = currentdate.get(Calendar.DATE);
				poDateLabel = new MobileScreenElement(By.xpath("//android.view.View[@text=" + "'" + currentDate + "']"),
						"PO Date");
				
				// MobileScreenElement(By.xpath("//android.view.View[@resource-id='cal-data-container']"),"PODate");
				click(poDateLabel);
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigDraweeBankName")) {
				clearAndSendKeys(draweeBankNameTextField,
						collectionIntemidiaryEntity.getStringValueForField("DraweeBankName"));
				click(Bank);
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigBankSearchRenewal")) {
				click(searchBankRenewalTextField);
				String make = collectionIntemidiaryEntity.getStringValueForField("BankSearchRenewal");
				bankRenewaLButton = new MobileScreenElement(
						By.xpath("//android.view.View[@text=" + "'" + make + "'" + "]"), "Make", false,
						WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(searchBankRenewalSearchButton);
				TouchAction action1 = new TouchAction(driver);
				action1.press(PointOption.point(601, 302)).release().perform();
				click(Bank);
				scrollDown();
			}

			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigDraweeHealth3BankName")) {
				clearAndSendKeys(DraweeBankNameTextFieldHealth3,
						collectionIntemidiaryEntity.getStringValueForField("DraweeBankName"));
				click(Bank);
			}

			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigDraweeBankHealth3Branch")) {
				clearAndSendKeys(DraweeBankBranchHealth3,
						collectionIntemidiaryEntity.getStringValueForField("DraweeBankBranch"));

			}

			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigHealth3CollectionAmountCheque")) {
				clearAndSendKeys(CollectionAmounttextFieldHealth3,
						collectionIntemidiaryEntity.getStringValueForField("CollectionAmountCheque"));

			}

			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigDraweeBankBranch")) {
				clearAndSendKeys(draweeBankBranchTextField,
						collectionIntemidiaryEntity.getStringValueForField("DraweeBankBranch"));

			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigCollectionAmountCheque")) {
				clearAndSendKeys(collectionAmountTextField,
						collectionIntemidiaryEntity.getStringValueForField("CollectionAmountCheque"));

			}

		} else if (collectionIntemidiaryEntity.getAction().equalsIgnoreCase("verify")) {
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigDraweeBankName")) {
				assertReference.assertEquals(collectionIntemidiaryEntity.getStringValueForField("DraweeBankName"),
						fetchValueFromFields(draweeBankNameTextField), AssertionType.WARNING);
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigDraweeBankBranch")) {
				assertReference.assertEquals(collectionIntemidiaryEntity.getStringValueForField("DraweeBankBranch"),
						fetchValueFromFields(draweeBankBranchTextField), AssertionType.WARNING);
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigCollectionAmountCheque")) {
				assertReference.assertEquals(
						collectionIntemidiaryEntity.getStringValueForField("CollectionAmountCheque"),
						fetchValueFromFields(collectionAmountTextField), AssertionType.WARNING);
			}

			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigHealth3CollectionAmountCheque")) {
				assertReference.assertEquals(
						collectionIntemidiaryEntity.getStringValueForField("CollectionAmountCheque"),
						fetchValueFromFields(CollectionAmounttextFieldHealth3), AssertionType.WARNING);
			}
		}
	}

	private void selectDateFromCalender(MobileScreenElement poDateLabel2, boolean booleanValueForField) {
		// TODO Auto-generated method stub

	}

	private void selectDateFromCalender(MobileScreenElement poDateLabel2, String stringValueForField) {

	}

	public void verifyCollectionDetails(CollectionIntemidiaryEntity collectionIntemidiaryEntity,
			CustomAssert assertReference) {
		if (collectionIntemidiaryEntity.getAction().equalsIgnoreCase("verify")) {
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(collectionIntemidiaryEntity.getStringValueForField("PolicyNo"),
						fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(collectionIntemidiaryEntity.getStringValueForField("QuoteNo"),
						fetchValueFromFields(quoteNumberLabel), AssertionType.WARNING);
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigCollectionNo")) {
				assertReference.assertEquals(collectionIntemidiaryEntity.getStringValueForField("CollectionNo"),
						fetchValueFromFields(collectionNumberLabel), AssertionType.WARNING);
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigPaymentSuccessful")) {
				assertReference.assertEquals(collectionIntemidiaryEntity.getStringValueForField("PaymentSuccessful"),
						fetchValueFromFields(paymentSuccessfulLabel), AssertionType.WARNING);
			}

			//
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigTransactionRenewal")) {
				assertReference.assertEquals(collectionIntemidiaryEntity.getStringValueForField("TransactionRenewal"),
						fetchValueFromFields(transactionLabel), AssertionType.WARNING);
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigPolicyNoRenewal")) {
				collectionIntemidiaryEntity.setStringValueForField("PolicyNoRenewal",
						fetchValueFromFields(policyNoRenewalLabel));
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigPolicyNameRenewal")) {
				collectionIntemidiaryEntity.setStringValueForField("PolicyNameRenewal",
						fetchValueFromFields(productNameLabel));
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigPolicyHolder")) {
				collectionIntemidiaryEntity.setStringValueForField("PolicyHolder",
						fetchValueFromFields(policyHolderLabel));
			}
			if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigPremiumRenewal")) {
				assertReference.assertEquals(collectionIntemidiaryEntity.getStringValueForField("PremiumRenewal"),
						fetchValueFromFields(premiumLabel), AssertionType.WARNING);
			}
		}

	}

	public void fetchQuoteNumber(CollectionIntemidiaryEntity collectionIntemidiaryEntity) throws InterruptedException {
		if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigQuoteNoHealth")) {
			collectionIntemidiaryEntity.setStringValueForField("PolicyNo", fetchValueFromFields(policyNumberLabel));
			collectionIntemidiaryEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNumberLabel));
			collectionIntemidiaryEntity.setStringValueForField("CollectionNo",
					fetchValueFromFields(collectionNumberLabel));
		}
	}

	public void clickOnCollectionButton(CollectionIntemidiaryEntity collectionIntemidiaryEntity)
			throws InterruptedException {
		if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigCollectPremiumButton")) {
			scrollToElementForward();
			click(CollectPremiumButton);
			}
		if (collectionIntemidiaryEntity.getBooleanValueForField("ConfigOK")) {
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			//click(OK);
		}
	}

	public void fillAndSubmitCollectionPageDetails(CollectionIntemidiaryEntity collectionIntemidiaryEntity,
			CustomAssert assertReference, String stepGroup) throws InterruptedException {
		if (isConfigTrue(collectionIntemidiaryEntity.getConfigExecute())) {

			fetchQuoteNumber(collectionIntemidiaryEntity);
			fillCollectionDetail(collectionIntemidiaryEntity, assertReference);
			fillChequeDetails(collectionIntemidiaryEntity, assertReference);
			clickOnCollectionButton(collectionIntemidiaryEntity);
			verifyCollectionDetails(collectionIntemidiaryEntity, assertReference);
		}
	}
}