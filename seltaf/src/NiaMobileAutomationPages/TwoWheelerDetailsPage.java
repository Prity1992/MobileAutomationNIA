package NiaMobileAutomationPages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.By;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.SummaryPageEntity;
import com.aqm.staf.library.databin.TwoWheelerBasicPremiumEntity;
import com.aqm.staf.library.databin.TwoWheelerDetailsEntity;

import io.appium.java_client.AppiumDriver;

public class TwoWheelerDetailsPage extends MobileScreen{

	MobileScreenElement yearOfManufactureDropDown;
	MobileScreenElement engineNumberTextField;
	MobileScreenElement chassisNumberTextField;
	MobileScreenElement vehicleZoneFortwoWheelerDropDown;
	MobileScreenElement colorAsPerRCBookTextField;
	MobileScreenElement typeOfFuelDropDown;
	MobileScreenElement rightArrowIcon;
	MobileScreenElement cityTextField;
	MobileScreenElement saveAndCalculatePremiumButton;

	MobileScreenElement quoteNoLabel;
	MobileScreenElement iAgreeCheckBox;
	MobileScreenElement authinticateWithOTPAndBuyNowButton;
	MobileScreenElement oTpTextField;
	MobileScreenElement submitButton;

	MobileScreenElement yearRadiobutton;
	MobileScreenElement zoneRadiobutton;
	MobileScreenElement fuelRadiobutton;
	MobileScreenElement rightArrowIcon1;

	public TwoWheelerDetailsPage(AppiumDriver driver, String screenName,String DeviceOS) {

		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android")){

			yearOfManufactureDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Year of Manufacture' and @index='1']"), "Year Of Manufacture", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			engineNumberTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Engine Number *' and @index='0']//following::android.widget.EditText"), "Engine Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			chassisNumberTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Chassis Number *' and @index='0']//following::android.widget.EditText"), "Chassis Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			vehicleZoneFortwoWheelerDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Vehicle Zone for Two Wheeler' and @index='1']"), "Vehicle Zone for Two Wheeler", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			colorAsPerRCBookTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Color as per RC Book *' and @index='0']//following::android.widget.EditText"), "Color as per RC Book ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			typeOfFuelDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Type of Fuel' and @index='1']"), "Type of Fuel", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			rightArrowIcon=new MobileScreenElement(By.xpath("//android.widget.Button[@text='next']"), "Next", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//	rightArrowIcon1=new MobileScreenElement(By.xpath("//android.widget.Button[@text='next' and @index='2']"), "Next", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			cityTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Basic Premium']"), "I agree to all the Terms and Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

			saveAndCalculatePremiumButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save and Calculate Premium' and @index='0']"), "Save and Calculate Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			quoteNoLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Quote No']//following::android.view.View"), "Quote no", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			iAgreeCheckBox=new MobileScreenElement(By.xpath("//Save and Calculate Premium[@index='0']"), "I agree to all the Terms and Conditions ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			authinticateWithOTPAndBuyNowButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Authenticate with OTP and Buy Now'and @index='0']"), "Authenticate with OTP and Buy Now", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			oTpTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='0']"), "Enter the OTP received from NIA", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			submitButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit' and @index='0']"), "Submit", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		}
	}
	public void fillTwoWheelerDetails(TwoWheelerDetailsEntity twoWheelerDetailsEntity,CustomAssert assertReference ) throws InterruptedException{

		if(twoWheelerDetailsEntity.getAction().equalsIgnoreCase("add")||twoWheelerDetailsEntity.getAction().equalsIgnoreCase("edit")){
			if(twoWheelerDetailsEntity.getBooleanValueForField("ConfigYearOfManufacture")){
				click(yearOfManufactureDropDown);
				String year=twoWheelerDetailsEntity.getStringValueForField("YearOfManufacture");
				yearRadiobutton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+year+"'"+"]"), "Year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(yearRadiobutton);
			}

			if(twoWheelerDetailsEntity.getBooleanValueForField("ConfigEngineNumber")){
				clearAndSendKeys(engineNumberTextField, twoWheelerDetailsEntity.getStringValueForField("EngineNumber"));
			}
			if(twoWheelerDetailsEntity.getBooleanValueForField("ConfigChassisNumber")){
				clearAndSendKeys(chassisNumberTextField, twoWheelerDetailsEntity.getStringValueForField("ChassisNumber"));
			}
			if(twoWheelerDetailsEntity.getBooleanValueForField("ConfigColorAsPerRCBook")){
				clearAndSendKeys(colorAsPerRCBookTextField, twoWheelerDetailsEntity.getStringValueForField("ColorAsPerRCBook"));
			}
			if(twoWheelerDetailsEntity.getBooleanValueForField("ConfigVehicleZoneFortwoWheeler")){
				click(vehicleZoneFortwoWheelerDropDown);
				String zone=twoWheelerDetailsEntity.getStringValueForField("VehicleZoneFortwoWheeler");
				zoneRadiobutton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+zone+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(zoneRadiobutton);
			}
			if(twoWheelerDetailsEntity.getBooleanValueForField("ConfigTypeOfFuel")){
				click(typeOfFuelDropDown);
				String fuel=twoWheelerDetailsEntity.getStringValueForField("TypeOfFuel");
				fuelRadiobutton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+fuel+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(fuelRadiobutton);
			}
			if(twoWheelerDetailsEntity.getBooleanValueForField("ConfigCity")){
				clearAndSendKeys(cityTextField, twoWheelerDetailsEntity.getStringValueForField("City"));
			}

		}
		else if (twoWheelerDetailsEntity.getAction().equalsIgnoreCase("verify")) {
			if(twoWheelerDetailsEntity.getBooleanValueForField("ConfigEngineNumber")){
				assertReference.assertEquals(twoWheelerDetailsEntity.getStringValueForField("EngineNumber"),fetchValueFromTextFields(engineNumberTextField),AssertionType.WARNING);
			}
			if(twoWheelerDetailsEntity.getBooleanValueForField("ConfigChassisNumber")){
				assertReference.assertEquals(twoWheelerDetailsEntity.getStringValueForField("ChassisNumber"),fetchValueFromTextFields(chassisNumberTextField),AssertionType.WARNING);
			}
			if(twoWheelerDetailsEntity.getBooleanValueForField("ConfigCity")){
				assertReference.assertEquals(twoWheelerDetailsEntity.getStringValueForField("City"),fetchValueFromTextFields(cityTextField),AssertionType.WARNING);
			}
			if(twoWheelerDetailsEntity.getBooleanValueForField("ConfigColorAsPerRCBook")){
				assertReference.assertEquals(twoWheelerDetailsEntity.getStringValueForField("ColorAsPerRCBook"),fetchValueFromTextFields(colorAsPerRCBookTextField),AssertionType.WARNING);
			}
			if(twoWheelerDetailsEntity.getBooleanValueForField("ConfigQuoteNo")){
				assertReference.assertEquals(twoWheelerDetailsEntity.getStringValueForField("QuoteNo"),fetchValueFromTextFields(quoteNoLabel),AssertionType.WARNING);
			}
		}
	}

	public void clickOnRightArrowIcon(TwoWheelerDetailsEntity twoWheelerDetailsEntity) throws InterruptedException {
		if(twoWheelerDetailsEntity.getBooleanValueForField("ConfigRightArrow")){
			click(rightArrowIcon);
			click(rightArrowIcon);
		}
	}
	public void checkOnIAgreeCheckBox(TwoWheelerDetailsEntity twoWheelerDetailsEntity) {
		if(twoWheelerDetailsEntity.getBooleanValueForField("ConfigIagree")){
			//check(iAgreeCheckBox);
		}
	}
	public void clickOnSaveAndCalculate(TwoWheelerDetailsEntity twoWheelerDetailsEntity) {
		if(twoWheelerDetailsEntity.getBooleanValueForField("ConfigSaveAndCalculatePremium")){
			click(saveAndCalculatePremiumButton);
			waitForPageElement(quoteNoLabel);
			twoWheelerDetailsEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNoLabel));
		}
	}
	public void fetchQuoteNumber(TwoWheelerDetailsEntity twoWheelerDetailsEntity) throws InterruptedException {
		twoWheelerDetailsEntity.setStringValueForField("QuoteNo", fetchValueFromFields(quoteNoLabel));
	}
	public void clickOnAuthenticateWithOTPAndBuyNowButton(TwoWheelerDetailsEntity twoWheelerDetailsEntity) throws InterruptedException {
		String BuyButton;
		BuyButton=twoWheelerDetailsEntity.getStringValueForField("ConfigAuthenticateWithOTPAndBuyNowButton");
		if((BuyButton!=null)&&(!BuyButton.isEmpty())){
			click(authinticateWithOTPAndBuyNowButton);
			String OtpTextField=null;
			String mailHost="pop.rediffmailpro.com";
			String userName="harshit.jethva@aqmtechnologies.com";
			String password="Nia@1234";

			Properties mailProp=System.getProperties();
			Session sessionOBJ=Session.getDefaultInstance(mailProp,new MailCleanerAuthenticator(userName,password));

			try {
				Store storeOBJ=sessionOBJ.getStore("pop3");

				storeOBJ.connect(mailHost, userName, password);

				Folder folderOBJ=storeOBJ.getFolder("INBOX");

				folderOBJ.open(Folder.READ_ONLY);

				Message[] message=folderOBJ.getMessages();

				// for (int i = message.length-1; i >=0; i--) {
				for (int i = 0; i <message.length; i++) {

					System.out.println("________________________"+i+"________________________");
					if (message[i].isMimeType("text/plain")) {
						String result = message[i].getContent().toString();
						if(result.contains("The OTP for authenticating your e-proposal quote") && result.contains(twoWheelerDetailsEntity.getStringValueForField("QuoteNo"))) {
							System.out.println("Plain Text:"+result);
						}
					} else if (message[i].isMimeType("multipart/*")) {
						MimeMultipart mimeMultipart = (MimeMultipart) message[i].getContent();
						String result = getTextFromMimeMultipart(mimeMultipart);
						//Get CurrentDate
						DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
						String currentData = df.format(new Date());
						//Print Email content
						if(result.contains("The OTP for authenticating your e-proposal quote") && result.contains(twoWheelerDetailsEntity.getStringValueForField("QuoteNo"))) {
							System.out.println("*****Mail body******:"+result.toString());
							String otp=result.toString();
							String[] getOtp = otp.split("\\s+");
							System.out.print(getOtp[12]);
							OtpTextField = getOtp[12];
						}
						/*  else
	                    {
	                    	throw new SkipException("OTP not received");
	                    }*/
					}

				}

				folderOBJ.close(true);
				storeOBJ.close();

			} catch (NoSuchProviderException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clearAndSendKeys(oTpTextField,OtpTextField);
			click(submitButton);
			/*String iagree;
	        iagree=summaryPageEntity.getStringValueForField("Iagree");
			if((iagree!=null)&&(!iagree.isEmpty())){
				click(iAgree);}
			String proceed;
			proceed=summaryPageEntity.getStringValueForField("Proceed");
			if((proceed!=null)&&(!proceed.isEmpty())){
			click(pRoceed);}
			//waitForPageElement(policyNoLabel);
			//paymentEntity.setStringValueForField("PolicyNumber",fetchValueFromFields(policyNoLabel));
			click(myDashboard);*/

		}
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
	public void fillAndSubmitTwoWheelerDetails(TwoWheelerDetailsEntity twoWheelerDetailsEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(twoWheelerDetailsEntity.getConfigExecute())) {
			fillTwoWheelerDetails(twoWheelerDetailsEntity, assertReference);
			clickOnRightArrowIcon(twoWheelerDetailsEntity);
			clickOnSaveAndCalculate(twoWheelerDetailsEntity);
			checkOnIAgreeCheckBox(twoWheelerDetailsEntity);
			
			//fetchQuoteNumber(twoWheelerDetailsEntity);
			
			
			//clickOnAuthenticateWithOTPAndBuyNowButton(twoWheelerDetailsEntity);
			
		}
	}
}
/*class MailCleanerAuthenticator extends Authenticator{
    
    MailCleanerAuthenticator(String username,String password){
         
        new PasswordAuthentication(username, password);
         
 
	}

	}*/
