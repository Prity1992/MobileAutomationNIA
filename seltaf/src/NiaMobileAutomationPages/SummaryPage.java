package NiaMobileAutomationPages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMultipart;

import org.testng.SkipException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.framework.core.entity.TestScenario;
import com.aqm.staf.library.databin.PremiumSummaryEntity;
import com.aqm.staf.library.databin.SummaryPageEntity;
import com.aqm.staf.library.databin.TopUpMediEntity;
import com.aqm.staf.library.databin.TwoWheelerDetailsEntity;
import com.sun.mail.handlers.multipart_mixed;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import okhttp3.MultipartBody;

public class SummaryPage<OutboundNotification> extends MobileScreen{

	MobileScreenElement quoteNoLabel;
	MobileScreenElement grossPremiumLabel;
	MobileScreenElement goodsAndServicesTaxLabel;
	MobileScreenElement netPremiumLabel;
	MobileScreenElement productNameLabel;
	MobileScreenElement policyHolderNameLabel;
	MobileScreenElement policyStartDateLabel;
	MobileScreenElement policyExpiryDateLabel;
	MobileScreenElement disclaimerCheckBox;
	MobileScreenElement iaccesptCheckBox;
	MobileScreenElement BackButton;
	MobileScreenElement viewBreakupButton;
	MobileScreenElement authenticateWithOTPAndBuyNowButton;
	MobileScreenElement buyLaterButton;
	MobileScreenElement otpTextField;
	MobileScreenElement submitButton;
	MobileScreenElement iAgree;
	MobileScreenElement pRoceed;
	MobileScreenElement authenticateWithOTPAndBuyNowHealthButton;
	MobileScreenElement policyStatusLabel;
	MobileScreenElement iAgreeCheckBox;
	MobileScreenElement quoteNoTWLabel;
	MobileScreenElement policyPeriod;
	MobileScreenElement keepMeInformedCkeckBox;
	MobileScreenElement proceedButton;
	private String code;
    MobileScreenElement delete;
	MobileScreenElement deletAll;




	public SummaryPage(AppiumDriver driver, String screenName,String DeviceOS) {

		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android")){
			iAgreeCheckBox=new MobileScreenElement(By.xpath("//android.view.View[@text='I agree to all the ']//preceding::android.widget.CheckBox"), "I agree to all the Terms and Conditions ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			quoteNoLabel=new MobileScreenElement(By.xpath("//android.view.View[(@text='Quote No.')]//following::android.view.View[1]"), "Fetch Quote No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			grossPremiumLabel=new MobileScreenElement(By.xpath("//android.view.View[(@text='Gross Premium' and @index='5')]//following::android.view.View"), "Gross Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			goodsAndServicesTaxLabel=new MobileScreenElement(By.xpath("//android.view.View[(@text='Goods & Services Tax (GST)' and @index='9')]//following::android.view.View"), "Goods & Services Tax (GST)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			netPremiumLabel=new MobileScreenElement(By.xpath("//android.view.View[(@text='Net premium' and @index='13')]//following::android.view.View"), "Net premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			productNameLabel=new MobileScreenElement(By.xpath("//android.widget.Image[(@text='Nia logo')]//following::android.view.View[5]"), "Fetch Product Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			policyHolderNameLabel=new MobileScreenElement(By.xpath("//android.view.View[(@text='Policy Holder Name')]//following::android.view.View[1]"), "Fetch Policy Holder Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			policyStartDateLabel=new MobileScreenElement(By.xpath("android.view.View[@index='26']"), "Policy Start Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			policyExpiryDateLabel=new MobileScreenElement(By.xpath("android.view.View[@index='30']"), "Policy Expiry Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			disclaimerCheckBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Disclaimer']//following::android.widget.CheckBox[1]"), "Click on Disclaimer CheckBox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			//iaccesptCheckBox=new MobileScreenElement(By.xpath("//android.view.View[@text='I accept policy Terms & Conditions'and @index='1']//preceding::android.widget.CheckBox"), "I Accept", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			
			iaccesptCheckBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Disclaimer']//following::android.widget.CheckBox[2]"), "Click on I Accept CheckBox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			BackButton=new MobileScreenElement(By.xpath("android.view.View[@text='back_icon Back']"), "Back", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			viewBreakupButton=new MobileScreenElement(By.xpath("android.view.View[@text='View Breakup']"), "View Breakup", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			authenticateWithOTPAndBuyNowButton=new MobileScreenElement(By.xpath("//android.widget.Button[(@text='Authenticate With OTP And Buy Now')]"), "Authenticate With OTP And Buy Now", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			buyLaterButton= new MobileScreenElement(By.xpath("android.widget.Button[contains(@text='Buy Later')]") ,"Buy Later", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			submitButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit']") ,"Click on Submit Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			otpTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='8657592822']//following::android.widget.EditText[1]") ,"Enter the OTP received from NIA", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			iAgree=new MobileScreenElement(By.xpath("//android.view.View[@text='I agree to ' and @index='0' ]//preceding::android.widget.CheckBox") ,"I Agree", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			pRoceed=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Proceed' and @index='0']") ,"Proceed", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			authenticateWithOTPAndBuyNowHealthButton=new MobileScreenElement(By.xpath("//android.widget.Button[(@text='Authenticate with OTP')]"), "Click on Authenticate With OTP Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			policyStatusLabel=new MobileScreenElement(By.xpath("//android.widget.Button[(@text='Authenticate with OTP and Buy now' and @index='0')]//following::android.view.View[4]") ,"Message", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			quoteNoTWLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Quote No']//following::android.view.View"), "Quote no", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			policyPeriod= new MobileScreenElement(By.xpath("//android.view.View[@text='Policy Period']//following::android.view.View[1]"), "Fetch Policy Period", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			keepMeInformedCkeckBox= new MobileScreenElement(By.xpath("//android.view.View[@text='Disclaimer']//following::android.widget.CheckBox[3]"), "Click on Keep me Informed CkeckBox", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			proceedButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Proceed']"), "Click on Proceed Butoon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			delete=new MobileScreenElement(By.xpath("//android.widget.Button[@text='DELETE']"), "Click on DELETE Butoon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			deletAll= new MobileScreenElement(By.xpath("//android.widget.TextView[@text='All']//following::android.widget.CheckBox"), "Click on DELETE ALL Radio Butoon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		}

	}
	public void fillSummaryPageDetails(SummaryPageEntity summaryPageEntity,CustomAssert assertReference ) throws InterruptedException{

		if(summaryPageEntity.getAction().equalsIgnoreCase("verify")){

			if(summaryPageEntity.getBooleanValueForField("ConfigQuoteNo")){
				assertReference.assertEquals(summaryPageEntity.getStringValueForField("QuoteNo"),fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
			}
			if(summaryPageEntity.getBooleanValueForField("ConfigGrossPremium")){
				assertReference.assertEquals(summaryPageEntity.getStringValueForField("GrossPremium"),fetchValueFromFields(grossPremiumLabel),AssertionType.WARNING);
			}
			if(summaryPageEntity.getBooleanValueForField("ConfigGoodsAndServicesTax")){
				assertReference.assertEquals(summaryPageEntity.getStringValueForField("GoodsAndServicesTax"),fetchValueFromFields(goodsAndServicesTaxLabel),AssertionType.WARNING);
			}
			if(summaryPageEntity.getBooleanValueForField("ConfigNetPremiumLabel")){
				assertReference.assertEquals(summaryPageEntity.getStringValueForField("NetPremiumLabel"),fetchValueFromFields(netPremiumLabel),AssertionType.WARNING);
			}
			if(summaryPageEntity.getBooleanValueForField("ConfigProductName")){
				
				assertReference.assertEquals(summaryPageEntity.getStringValueForField("ProductName"),fetchValueFromFields(productNameLabel),AssertionType.WARNING);
			}
			
			if(summaryPageEntity.getBooleanValueForField("ConfigPolicyHolderName")){
				assertReference.assertEquals(summaryPageEntity.getStringValueForField("PolicyHolderName"),fetchValueFromFields(policyHolderNameLabel),AssertionType.WARNING);
			}
			if(summaryPageEntity.getBooleanValueForField("ConfigPolicyPeriod")){
				assertReference.assertEquals(summaryPageEntity.getStringValueForField("PolicyPeriod"),fetchValueFromFields(policyPeriod),AssertionType.WARNING);
			}
			if(summaryPageEntity.getBooleanValueForField("ConfigPolicyStartDate")){
				assertReference.assertEquals(summaryPageEntity.getStringValueForField("PolicyStartDate"),fetchValueFromFields(policyStartDateLabel),AssertionType.WARNING);
			}
			if(summaryPageEntity.getBooleanValueForField("ConfigPolicyExpiryDate")){
				assertReference.assertEquals(summaryPageEntity.getStringValueForField("PolicyExpiryDate"),fetchValueFromFields(policyExpiryDateLabel),AssertionType.WARNING);
			}
		}
	}
	public void fetchQuoteNumber(SummaryPageEntity summaryPageEntity) throws InterruptedException {
		if(summaryPageEntity.getBooleanValueForField("ConfigQuoteNoHealth")){
			summaryPageEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNoLabel));
		}
	}
	public void fetchQuoteTWNumber(SummaryPageEntity summaryPageEntity) throws InterruptedException {
		if(summaryPageEntity.getBooleanValueForField("ConfigQuoteNoMotor")){
			summaryPageEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNoTWLabel));
		}
	}
	public void clickOnViewBreakupButton(SummaryPageEntity summaryPageEntity) {
		if(summaryPageEntity.getBooleanValueForField("ConfigViewBreakup")){
			click(viewBreakupButton);
		}
	}
	public void clickOnBackButton(SummaryPageEntity summaryPageEntity) {
		if(summaryPageEntity.getBooleanValueForField("ConfigBack")){
			click(BackButton);
		}

	}

	public void clickOnAuthenticateWithOTPAndBuyNowButton(SummaryPageEntity summaryPageEntity) throws InterruptedException {
		String BuyButton;
		BuyButton=summaryPageEntity.getStringValueForField("ConfigAuthenticateWithOTPAndBuyNowButton");
		
		if((BuyButton!=null)&&(!BuyButton.isEmpty())){
			if((summaryPageEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor"))) {
				click(authenticateWithOTPAndBuyNowButton);
			}
			else if((summaryPageEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")||summaryPageEntity.getStringValueForField("LOB").equalsIgnoreCase("Travel"))) {
				scrollDown();
				Thread.sleep(2000);
				click(authenticateWithOTPAndBuyNowHealthButton);
				click(proceedButton);
				
				
				/*Thread.sleep(3000);
				WebDriverWait wait= new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@text='Enter OTP']")));
				
				TouchAction action=new TouchAction(driver);
				action.press(PointOption.point(701, 306)).release().perform();
				
				
				
				
				click(delete);
				click(deletAll);
				click(delete);
				click(delete);*/
				
				/*String otpValue = getOTP();
				System.out.println("OTP VALUE : "+otpValue);*/
		
				
				
				
;			}
		}
	}
				/*private String getOTP() {
					
					driver.startActivity("com.android.messaging", "com.android.messaging.ui.conversationlist.ConversationListActivity");
					String getOTPValue = driver.findElementById("com.android.messaging:id/conversation_snippet").getText().split(":")[1].trim();
					return getOTPValue;
		// TODO Auto-generated method stub
		
	}*/
				/*public  String readOTP()
				{
					
			//driver.startActivity 13(“com.android.mms”, “com.android.mms.ui.ConversationList”);
				driver.openNotifications();
			String otp = driver.findElementByXPath("//*[contains(@text,‘is’)]").getText().split(“code:” )[0];
			return otp;
				}*/
				   

					
			
//			String OtpTextField=null;
//			String mailHost="pop.rediffmailpro.com";
//			String userName="dhwani.patel@aqmtechnologies.com";
//			String password="Dh7718070148";
//			Multipart multipart = null;
//
//			Properties mailProp=System.getProperties();
//			Session sessionOBJ=Session.getDefaultInstance(mailProp,new MailCleanerAuthenticator(userName,password));
//
//			try {
//				Store storeOBJ=sessionOBJ.getStore("pop3");
//
//				storeOBJ.connect(mailHost, userName, password);
//				
//				Folder folderOBJ=storeOBJ.getFolder("INBOX");
//				//Folder folderOBJ1=storeOBJ.getFolder("TRASE");
//				folderOBJ.open(Folder.READ_ONLY);
//
//				Message[] message=folderOBJ.getMessages();
//				 
//				// for (int i = message.length-1; i >=0; i--) {
//				for (int i = 0; i <message.length; i++) {
//					BodyPart part= multipart.getBodyPart(i);
//					
//					System.out.println("________________________"+i+"________________________");
//					
//					if (part.isMimeType("text/plain")) {
//						String result = message[i].getContent().toString();
//						if(result.contains("The OTP for authenticating your e-proposal quote") && result.contains(summaryPageEntity.getStringValueForField("QuoteNo"))) {
//							System.out.println("Plain Text:"+result);
//						}
//					} else if (part.isMimeType("multipart/*")) {
//					
//					//	System.out.println(message[i].getMessageNumber());
//						MimeMultipart mimeMultipart = (MimeMultipart) message[i].getContent();
//						String result = getTextFromMimeMultipart(mimeMultipart);
//						//Get CurrentDate
//						DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//						String currentData = df.format(new Date());
//						//Print Email content
//						if(result.contains("The OTP for authenticating your e-proposal quote") && result.contains(summaryPageEntity.getStringValueForField("QuoteNo"))) {
//							System.out.println("*****Mail body******:"+result.toString());
//							String otp=result.toString();
//							String[] getOtp = otp.split("\\s+");
//							System.out.print(getOtp[12]);
//							OtpTextField = getOtp[12];
//						}
//						/*  else
//	                    {
//	                    	throw new SkipException("OTP not received");
//	                    }*/
//					}
//
//				}
//
//				folderOBJ.close(true);
//				storeOBJ.close();
//
//			} catch (NoSuchProviderException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (MessagingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			clearAndSendKeys(otpTextField,OtpTextField);
//			click(submitButton);
//
//		}
//	}



	public void paymentTermsAndConditions(SummaryPageEntity summaryPageEntity,CustomAssert assertReference) throws InterruptedException {     
		summaryPageEntity.setStringValueForField("PolicyStatus", fetchValueFromFields(policyStatusLabel));
		if(summaryPageEntity.getBooleanValueForField("ConfigPolicyStatus")){
			assertReference.assertEquals(summaryPageEntity.getStringValueForField("PolicyStatus"),fetchValueFromFields(policyStatusLabel),AssertionType.WARNING);
		}
		String iagree;
		iagree=summaryPageEntity.getStringValueForField("Iagree");
		if((iagree!=null)&&(!iagree.isEmpty())){
			click(iAgree);
		}
		String proceed;
		proceed=summaryPageEntity.getStringValueForField("Proceed");
		if((proceed!=null)&&(!proceed.isEmpty())){
			click(pRoceed);
		}
		//waitForPageElement(policyNoLabel);
		//paymentEntity.setStringValueForField("PolicyNumber",fetchValueFromFields(policyNoLabel));
	}

	private static String getTextFromMimeMultipart(MimeMultipart mimeMultipart)   throws MessagingException, IOException{
		String result = "";
		int count = mimeMultipart.getCount();
		for (int i = 0; i < count; i++) {
			BodyPart bodyPart = mimeMultipart.getBodyPart(i);
			if (bodyPart.isMimeType("text/plain")) {
				result = result + "\n" + bodyPart.getContent();
				break; 
			} else if (bodyPart.isMimeType("text/html")) {
				String html = (String) bodyPart.getContent();
				result = result + "\n" + org.jsoup.Jsoup.parse(html).text();
			} else if (bodyPart.getContent() instanceof MimeMultipart){
				result = result + getTextFromMimeMultipart((MimeMultipart)bodyPart.getContent());
			}
		}
		return result;
	}
	public void clickOnBuyLaterButton(SummaryPageEntity summaryPageEntity) {
		if(summaryPageEntity.getBooleanValueForField("ConfigBuyLater")){
			click(buyLaterButton);
		}

	}
	public void clickOnDisclaimerCheckBox(SummaryPageEntity summaryPageEntity) throws InterruptedException {
		if(summaryPageEntity.getBooleanValueForField("ConfigDisclaimer")){
			if(summaryPageEntity.getTestScenario().equals("NIAMotorMobile_Automation_TC_0001")) {
				scrollDown();
			}
			scrollDown();
			Thread.sleep(2000);
			check(disclaimerCheckBox);

		}
	}
	public void clickOnIacceptCheckBox(SummaryPageEntity summaryPageEntity) throws InterruptedException {
		if(summaryPageEntity.getBooleanValueForField("ConfigIAccept")){
			scrollDown();
			Thread.sleep(2000);
			check(iaccesptCheckBox);
			
				click(keepMeInformedCkeckBox);
			

		}
	}
	public void clickOnSubmitButton(SummaryPageEntity summaryPageEntity) {
		if(summaryPageEntity.getBooleanValueForField("ConfigSumbit")){
			check(submitButton);

		}
	}
	public void checkOnIAgreeCheckBox(SummaryPageEntity summaryPageEntity) {
		if(summaryPageEntity.getBooleanValueForField("ConfigIagree")){
			check(iAgreeCheckBox);
		}
	}

	public void fillAndSubmitPremiumSummaryPageDetails(SummaryPageEntity summaryPageEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(summaryPageEntity.getConfigExecute())) {
			fetchQuoteTWNumber(summaryPageEntity);
			fetchQuoteNumber(summaryPageEntity);
			checkOnIAgreeCheckBox(summaryPageEntity);
			fillSummaryPageDetails(summaryPageEntity, assertReference);
			clickOnDisclaimerCheckBox(summaryPageEntity);
			clickOnIacceptCheckBox(summaryPageEntity);
			clickOnAuthenticateWithOTPAndBuyNowButton(summaryPageEntity);
			paymentTermsAndConditions(summaryPageEntity, assertReference);
			clickOnBackButton(summaryPageEntity);
			clickOnViewBreakupButton(summaryPageEntity);
			clickOnBuyLaterButton(summaryPageEntity);
		
		}
	}
}
class MailCleanerAuthenticator extends Authenticator{

	MailCleanerAuthenticator(String username,String password){

		new PasswordAuthentication(username, password);


	}

}
