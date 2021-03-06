package NiaMobileAutomationPages;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.aspectj.weaver.NewFieldTypeMunger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.RandomCodeGenerator;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.LoginEntity;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;



public class NiaLoginPage extends MobileScreen {

	MobileScreenElement menuIcon;
	MobileScreenElement loginButton;
	MobileScreenElement userNameTextField;
	MobileScreenElement passwordTextField;
	MobileScreenElement submitButton;
	MobileScreenElement quickPayOrRenewPolicyButton;
	MobileScreenElement downloadPolicyButton;
	MobileScreenElement linkAadhaarOrPanNumberButton;
	MobileScreenElement quickQuoteButton;
	MobileScreenElement forgotUserIdButton;
	MobileScreenElement forgotPasswordButton;
	MobileScreenElement newUserLink;
	MobileScreenElement registerButton;
	MobileScreenElement goBackButton;
	MobileScreenElement emailIdTextField;
	MobileScreenElement dobUserTextField;
	MobileScreenElement submitForgotUserDetails;
	MobileScreenElement cancelForgotUserDetails;
	MobileScreenElement UserIdPassTextField;
	MobileScreenElement dobPasstextField;
	//*********Registration Details*****
	MobileScreenElement firstNameTextField;
	MobileScreenElement lastNameTextField;
	MobileScreenElement dobRegisterTextField;
	MobileScreenElement genderDropDown;
	MobileScreenElement emailRegisterTextField;
	MobileScreenElement mobileNumberTextField;
	MobileScreenElement termsAndConditionsCheckBox;
	MobileScreenElement submitRegistrationButton;
	MobileScreenElement resetButton;
	MobileScreenElement allowPopUpButton;
	MobileScreenElement UserNameIntermediaryTextField;
	MobileScreenElement PasswardintermediaryTextField;
	MobileScreenElement LoginButtoninter;
	MobileScreenElement loginLabel;
	MobileScreenElement downloadPolicyTitle;
	MobileScreenElement policyNumberTextField;
	MobileScreenElement customerIdTextField;
	MobileScreenElement downloadButton;
	MobileScreenElement alertMessageLabel;
	MobileScreenElement registerLabel;
	MobileScreenElement welcomeMessageLabel;
	MobileScreenElement enterYourEmailIDTextField;
	MobileScreenElement dateOfBirthIDTextField;
	MobileScreenElement UserIDSubmitButton;

	MobileScreenElement motorIcon;
	MobileScreenElement healthIcon;
	MobileScreenElement travelIcon;
	MobileScreenElement homeAccidentIcon;
	MobileScreenElement userIDAlertLabel;
	MobileScreenElement monthLabel;
	MobileScreenElement YearLabel;
	MobileScreenElement dateLabel;
	MobileScreenElement monthRadioButton;
	MobileScreenElement YearRadioButton;
	MobileScreenElement otpButton;
	MobileScreenElement intermediaryAppLabel;
	MobileScreenElement forgotPasswordLabel;
	MobileScreenElement forgotPasswordUserTextField;
	MobileScreenElement forgotPasswordSubmitButton;
	MobileScreenElement enterOtpHereTextField;
	MobileScreenElement forgotPasswordOkButton;
	MobileScreenElement okAlertButton;
	MobileScreenElement passwordChangedLabel;
	MobileScreenElement oldPasswordTextField;
	MobileScreenElement newPasswordTextField;
	MobileScreenElement confirmPasswordTextField;
	MobileScreenElement confirmPasswordChangedButton;
	MobileScreenElement usernameTextField;
	
	MobileScreenElement newMobileNoTextField;
	MobileScreenElement nextButton;
	MobileScreenElement welcomeMessageLabel1;
	AndroidDriver<MobileElement> And_Driver;
	
	public NiaLoginPage(AppiumDriver driver, String screenName,String DeviceOS)
	{
		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android"))
		{	
			//menuIcon=new MobileScreenElement(By.xpath("//android.view.View[@index='2' or @content-desc='MENU']) "),"Menu", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			//menuIcon=new MobileScreenElement(By.xpath("(//android.view.View[@index='2']) or (//android.view.View@content-desc='MENU']) or (//android.view.View[@index='1']) "),"Menu", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			menuIcon=new MobileScreenElement(By.xpath("//android.view.View[@index='2']"),"Menu", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			///menuIcon=new MobileScreenElement(By.xpath("//android.view.View[@content-desc='MENU']"),"Menu", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			//loginButton=new MobileScreenElement(By.xpath("//android.widget.Button[text(),'Login']"),"Login", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

			loginButton=new MobileScreenElement(By.xpath("//android.widget.Button[@index='3']"),"Login", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			quickPayOrRenewPolicyButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Quick Pay / Renew Policy']"),"Quick Pay and Renew", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			downloadPolicyButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Download Policy']"),"Download Policy", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			linkAadhaarOrPanNumberButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Link Aadhaar/PAN number']"),"Link Aadhar and Pan Number", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			quickQuoteButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Quick Quote']"),"Quick Quote", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			userNameTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='0']"),"UserName", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			passwordTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='1']"),"Password", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			usernameTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='0']"),"UserName", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			submitButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Login' and @index='2']"),"Submit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			UserIdPassTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='0']"),"User Id", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			dobPasstextField=new MobileScreenElement(By.id("com.nia.customer:id/dateOfBirthFP"),"DOB", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			submitForgotUserDetails=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit']"),"Submit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			cancelForgotUserDetails=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Cancel']"),"Cancel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			emailIdTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='0']"),"Email Id", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			dobUserTextField=new MobileScreenElement(By.id("com.nia.customer:id/dateOfBirth"),"DOB", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			forgotUserIdButton=new MobileScreenElement(By.xpath("//android.view.View[@text='User ID']"),"User Id", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			forgotPasswordButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Password' and @index='1']"),"Password", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			registerButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Register']"),"Register", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			goBackButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Go back']"),"Go Back", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			firstNameTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='1']"),"First Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			lastNameTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='2']"),"Last Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			dobRegisterTextField=new MobileScreenElement(By.id("com.nia.customer:id/dateOfBirthNR"),"DOB", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			genderDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Select Gender']"),"Gender", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			emailRegisterTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='7']"),"Email Registration", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			mobileNumberTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='7']"),"Mobile Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			termsAndConditionsCheckBox=new MobileScreenElement(By.id("com.nia.customer:id/termsAndCondition"),"Terms And Conditions", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			submitRegistrationButton=new MobileScreenElement(By.id("com.nia.customer:id/newRegister-btn"),"Submit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			resetButton=new MobileScreenElement(By.id("com.nia.customer:id/resetBtn"),"Reset", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			allowPopUpButton= new MobileScreenElement(By.id("com.android.packageinstaller:id/permission_allow_button"),"Allow", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			UserNameIntermediaryTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='1']"),"User Intermediary Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//	PasswardintermediaryTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@bounds='[158,742][562,826]']"),"UserIntermediaryName", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			PasswardintermediaryTextField=new MobileScreenElement(By.xpath("//android.widget.Image[@text='User Name']//following::android.widget.EditText[2]"),"Password Intermediary", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			LoginButtoninter=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Login' and @index='0' ]"),"Quick Quote", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			loginLabel=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Login']"),"Login", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			downloadPolicyTitle=new MobileScreenElement(By.xpath("//android.view.View[@text='Download Policy']"),"Download Policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			policyNumberTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='policytextForDownloadPolicy']"),"Policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			customerIdTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='custtxtboxForDownloadPolicy']"),"Customer Id", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			downloadButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Download']"),"Download", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			alertMessageLabel = new MobileScreenElement(By.xpath("//android.widget.TextView[@text='Customer ID does not exist or Customer ID is not attached with the Proposal number']"),"Alert Message", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			registerLabel = new MobileScreenElement(By.xpath("//android.view.View[@text='Registration']"),"Register", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			welcomeMessageLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Please enter your']"),"Welcome Message", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			welcomeMessageLabel1= new MobileScreenElement(By.xpath("//android.view.View[@text='mobile number to get started!']"),"Welcome Message", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			enterYourEmailIDTextField= new MobileScreenElement(By.xpath("//android.webkit.WebView[@text='NIA Customer' and @index='0']//following::android.widget.EditText"),"Enter Your email ID", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			dateOfBirthIDTextField= new MobileScreenElement(By.xpath("//android.widget.EditText[@index='1']"),"Date of birth", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			UserIDSubmitButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit']"),"Submit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			userIDAlertLabel= new MobileScreenElement(By.xpath("//android.widget.TextView[@text='Please use your Email ID to login']"),"Please use your Email ID to login", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			monthLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='javascript:void(0)' and @index='0']//following::android.widget.Spinner"),"Month", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			
			motorIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='MOTOR' and @index='1']"),"Motor", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			healthIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='HEALTH' and @index='1']"),"Health", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			travelIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='TRAVEL']"),"Travel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			homeAccidentIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='HOME AND ACCIDENT']"),"Home And Accident", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);}
		YearLabel= new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='2018' and @index='2']"),"Year", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		dateLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='10']"),"Date", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		otpButton= new MobileScreenElement(By.xpath("//android.view.View[@text='One Time Password']"),"One Time Password", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		intermediaryAppLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Intermediary App']"),"Intermediary App", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		forgotPasswordLabel= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Login']//following::android.view.View[2]"),"Forgot Password?", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		forgotPasswordUserTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='No problem. We will help you.']//following::android.widget.EditText[1]"),"Enter User ID", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forgotPasswordSubmitButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit']"),"Submit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		enterOtpHereTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Please confirm by entering the OTP in the following field. Maximum you can get OTP 3 times. You have received OTP 1 time(s)']//following::android.widget.EditText[1]"),"Enter OTP here", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forgotPasswordOkButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='OK']"),"OK", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		okAlertButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='ok']"),"OK", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		passwordChangedLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Please confirm by entering the OTP in the following field. Maximum you can get OTP 3 times. You have received OTP 1 time(s)']//following::android.widget.EditText[1]"),"Enter OTP here", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		oldPasswordTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Agent Application']//following::android.widget.EditText[1]"),"Old Password", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newPasswordTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Agent Application']//following::android.widget.EditText[2]"),"New Password", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		confirmPasswordTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Agent Application']//following::android.widget.EditText[3]"),"Confirm Password", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		confirmPasswordChangedButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit']"),"Submit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		monthRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text='February' and resource-id='android:id/text1']"),"Submit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
		newMobileNoTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='0']"),"Enter Mobile No",false,WaitType.WAITFORELEMENTTODISAPPEAR, 10);
		nextButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Next']"),"Next Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void fillForgotPasswordDetails(LoginEntity logindata,CustomAssert assertReference ,AppiumDriver<MobileElement> mobileDriver) throws InterruptedException{
		if(logindata.getAction().equalsIgnoreCase("add")||logindata.getAction().equalsIgnoreCase("edit")){
			if(logindata.getBooleanValueForField("ConfigForgotPasswordAgent")){
				click(forgotPasswordLabel);
			}
			if(logindata.getBooleanValueForField("ConfigForgotPasswordUser")){
				clearAndSendKeys(forgotPasswordUserTextField, logindata.getStringValueForField("ForgotPasswordUser"));
			}
			if(logindata.getBooleanValueForField("ConfigForgotPasswordSubmit")){
				click(forgotPasswordSubmitButton);
			}
			if(logindata.getBooleanValueForField("ConfigEnterOtpHere")){
				String otp=fetchOTP(mobileDriver);
				otp=logindata.setStringValueForField("EnterOtpHere", otp);
				clearAndSendKeys(enterOtpHereTextField, logindata.getStringValueForField("EnterOtpHere"));
				click(forgotPasswordOkButton);
				click(okAlertButton);
			}
			if(logindata.getBooleanValueForField("ConfigOldPassword")){
				clearAndSendKeys(oldPasswordTextField, logindata.getStringValueForField("OldPassword"));
			}
			if(logindata.getBooleanValueForField("ConfigNewPassword")){
				clearAndSendKeys(newPasswordTextField, logindata.getStringValueForField("NewPassword"));
			}
			if(logindata.getBooleanValueForField("ConfigConfirmPassword")){
				clearAndSendKeys(confirmPasswordTextField, logindata.getStringValueForField("ConfirmPassword"));
			}
			if(logindata.getBooleanValueForField("ConfigPasswordChanged")){
				click(confirmPasswordChangedButton);
			}
		}
		else if(logindata.getAction().equalsIgnoreCase("verify")) {
			if(logindata.getBooleanValueForField("ConfigPasswordChangedLabel")){
				assertReference.assertEquals(logindata.getStringValueForField("PasswordChangedLabel"), fetchValueFromFields(passwordChangedLabel), AssertionType.WARNING);
			}
		}
	}
	public void fillLoginPageDetails(LoginEntity logindata,CustomAssert assertReference ) throws InterruptedException{
		if(logindata.getAction().equalsIgnoreCase("add")||logindata.getAction().equalsIgnoreCase("edit")){
			if(logindata.getBooleanValueForField("ConfigQuickPayOrRenewal")){
				click(quickPayOrRenewPolicyButton);

				//quick Pay or renewal details are to be added
			}
			if(logindata.getBooleanValueForField("ConfigDownloadPolicy")){
				click(downloadPolicyButton);
				isElementDisplayed(downloadPolicyTitle);
				assertReference.assertEquals(logindata.getStringValueForField("DownloadPolicy"), fetchValueFromFields(downloadPolicyTitle), AssertionType.WARNING);	
				//Download policy details are to be added
			}
			if(logindata.getBooleanValueForField("ConfigPolicyNumber")){
				clearAndSendKeys(policyNumberTextField, logindata.getStringValueForField("PolicyNumber"));
			}
			if(logindata.getBooleanValueForField("ConfigCustomerId")){
				clearAndSendKeys(customerIdTextField, logindata.getStringValueForField("CustomerId"));
				click(downloadButton);
				if(logindata.getBooleanValueForField("ConfigAlertMessage")){
					assertReference.assertEquals(logindata.getStringValueForField("AlertMessage"), fetchValueFromFields(alertMessageLabel), AssertionType.WARNING);	
				}
			}

			if(logindata.getBooleanValueForField("ConfigLinkAadharOrPanNumber")){
				//LinkAadharOrPanNumber details are to be added
			}
			if(logindata.getBooleanValueForField("ConfigLogin")){
				TouchAction action = new TouchAction(driver);
				action.press(PointOption.point(344,716)).release().perform();
				//click(loginButton);
				if(logindata.getBooleanValueForField("ConfigUsername")){
					clearAndSendKeys(usernameTextField, logindata.getStringValueForField("Username"));
					//clearAndSendKeys(userNameTextField, logindata.getStringValueForField("Username"));
					
					//String loginId=logindata.getStringValueForField("Username");
					//MobileScreenElement test=new MobileScreenElement(By.xpath("//android.widget.EditText[@index='0']"),"UserName", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
					//click(test);
					//MobileElement username=(MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
					//username.sendKeys(loginId);


					//userNameTextField.sendKeys(loginId);

					//clearAndSendKeys(AndroidKeyCode.KEYCODE_NUMPAD_0 value);
				}
				if(logindata.getBooleanValueForField("ConfigPassword")){
					clearAndSendKeys(passwordTextField, logindata.getStringValueForField("Password"));
				}
			}
			if(logindata.getBooleanValueForField("ConfigQuickQuote")){
				click(quickQuoteButton);
				if(logindata.getBooleanValueForField("ConfigMotorLabel")){
					assertReference.assertEquals(logindata.getStringValueForField("MotorLabel"), fetchValueFromFields(motorIcon), AssertionType.WARNING);
				}
				if(logindata.getBooleanValueForField("ConfigHealthLabel")){
					assertReference.assertEquals(logindata.getStringValueForField("HealthLabel"), fetchValueFromFields(healthIcon), AssertionType.WARNING);
				}
				if(logindata.getBooleanValueForField("ConfigTravelLabel")){
					assertReference.assertEquals(logindata.getStringValueForField("TravelLabel"), fetchValueFromFields(travelIcon), AssertionType.WARNING);
				}
				if(logindata.getBooleanValueForField("ConfigHomeAndAccidentLabel")){
					assertReference.assertEquals(logindata.getStringValueForField("HomeAndAccidentLabel"), fetchValueFromFields(homeAccidentIcon), AssertionType.WARNING);
				}
				//QuickQuote details are to be added
			}


			/*if(logindata.getBooleanValueForField("ConfigPassword")){
				clearAndSendKeys(passwordTextField, logindata.getStringValueForField("Password"));
			}*/
			//code written by mohammad for intermediary
			try {
				Alert alert=driver.switchTo().alert();
				alert.accept();
				}
				catch(Exception e) {
				System.out.println(e);
				}
			if(logindata.getBooleanValueForField("ConfigUserNameIntermediary")){
				
				clearAndSendKeys(UserNameIntermediaryTextField, logindata.getStringValueForField("userNameIntermediary"));
			}

			if(logindata.getBooleanValueForField("ConfigPasswardintermediary")){
				clearAndSendKeys(PasswardintermediaryTextField, logindata.getStringValueForField("passwardintermediary"));
			}


			if(logindata.getBooleanValueForField("ConfigloginButtoninter")){
				click(LoginButtoninter);
				try {
					Alert alert=driver.switchTo().alert();
					alert.accept();
					}
					catch(Exception e) {
					System.out.println(e);
					}
			}
			if(logindata.getBooleanValueForField("ConfigForgotUserIdButton")){
				click(forgotUserIdButton);
			}
			if(logindata.getBooleanValueForField("ConfigForgotPassword")){
				click(forgotPasswordButton);
			}
			if(logindata.getBooleanValueForField("ConfigEnterYourEmailID")){
				clearAndSendKeys(enterYourEmailIDTextField, logindata.getStringValueForField("EnterYourEmailID"));
			}

			if (logindata.getBooleanValueForField("ConfigDateOfBirthUserID")) {
				click(dateOfBirthIDTextField);
				click(monthLabel);
				String month=logindata.getStringValueForField("Month");
				scrollToElementBackward();
				click(monthRadioButton);
				click(YearLabel);
				String year=logindata.getStringValueForField("Year");
				YearRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+year+"'"+"]"), "Year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(YearRadioButton);
				click(dateLabel);



			}


		}




		if(logindata.getAction().equalsIgnoreCase("verify")) {

			if(logindata.getBooleanValueForField("ConfigQuickPayRenewPolicyLabel")){
				assertReference.assertEquals(logindata.getStringValueForField("QuickPayRenewPolicyLabel"), fetchValueFromFields(quickPayOrRenewPolicyButton), AssertionType.WARNING);
			}
			if(logindata.getBooleanValueForField("ConfigDownloadPolicyLabel")){
				assertReference.assertEquals(logindata.getStringValueForField("DownloadPolicyLabel"), fetchValueFromFields(downloadPolicyButton), AssertionType.WARNING);
			}
			if(logindata.getBooleanValueForField("ConfigLinkAadharPanLabel")){
				assertReference.assertEquals(logindata.getStringValueForField("LinkAadharPanLabel"), fetchValueFromFields(linkAadhaarOrPanNumberButton), AssertionType.WARNING);
			}
			if(logindata.getBooleanValueForField("ConfigLoginLabel")){
				assertReference.assertEquals(logindata.getStringValueForField("LoginLabel"), fetchValueFromFields(loginLabel), AssertionType.WARNING);
			}
			if(logindata.getBooleanValueForField("ConfigQuickQuoteLabel")){
				assertReference.assertEquals(logindata.getStringValueForField("QuickQuoteLabel"), fetchValueFromFields(quickQuoteButton), AssertionType.WARNING);
			}
			
			if(logindata.getBooleanValueForField("ConfigWelcomeMessage")){
				String str = fetchValueFromFields(welcomeMessageLabel);
				String str1= fetchValueFromFields(welcomeMessageLabel1);
				String str3=str+" "+str1;
				assertReference.customLogger("Verify Chat: "+str3, !str3.equals("") ,AssertionType.WARNING);		
			}
			if(logindata.getBooleanValueForField("ConfigUserIDAlert")){
				assertReference.assertEquals(logindata.getStringValueForField("UserIDAlert"), fetchValueFromFields(userIDAlertLabel), AssertionType.WARNING);
			}
			if(logindata.getBooleanValueForField("ConfigOTP")){
				assertReference.assertEquals(logindata.getStringValueForField("OTP"), fetchValueFromFields(otpButton), AssertionType.WARNING);
			}
			if(logindata.getBooleanValueForField("ConfigIntermediaryApp")){
				assertReference.assertEquals(logindata.getStringValueForField("IntermediaryApp"), fetchValueFromFields(intermediaryAppLabel), AssertionType.WARNING);
			}

		}
	}
	
	public void fillNewLoginPageDetails(LoginEntity logindata,CustomAssert assertReference ) throws InterruptedException{
		if(logindata.getAction().equalsIgnoreCase("add")||logindata.getAction().equalsIgnoreCase("edit"))
		{
			if(logindata.getBooleanValueForField("ConfigMobileNo"))
			{
				Thread.sleep(2000);
				SendMobileNo(newMobileNoTextField,logindata.getStringValueForField("MobileNo"));
				Thread.sleep(2000);
				
				//click(newMobileNoTextField);
				//sendKeys(newMobileNoTextField, logindata.getStringValueForField("MobileNo"));
				click(nextButton);
				Thread.sleep(5000);
				try {
					Alert alert=driver.switchTo().alert();
					alert.accept();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				//	MobileScreenElement	Btn_Next=new MobileScreenElement(By.xpath("//android.view.View[@text='Next']"),"Next", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				Thread.sleep(8000);
				//Btn_Next.click();
				
			}
		  }
		}

	public void fillRegistrationPageDetails(LoginEntity logindata,CustomAssert assertReference ) throws InterruptedException{
		if(logindata.getAction().equalsIgnoreCase("add")||logindata.getAction().equalsIgnoreCase("edit")){

			if(logindata.getBooleanValueForField("ConfigFirstName")){
				clearAndSendKeys(firstNameTextField, logindata.getStringValueForField("FirstName"));
			}
			if(logindata.getBooleanValueForField("ConfigLastName")){
				clearAndSendKeys(lastNameTextField, logindata.getStringValueForField("LastName"));
			}
			if(logindata.getBooleanValueForField("ConfigRegDOB")){
				clearAndSendKeys(dobRegisterTextField, logindata.getStringValueForField("RegDOB"));
			}
			if(logindata.getBooleanValueForField("ConfigGender")){
				selectValueFromList(genderDropDown, logindata.getStringValueForField("Gender"));
			}
			if(logindata.getBooleanValueForField("ConfigRegEmailId")){
				clearAndSendKeys(emailRegisterTextField, logindata.getStringValueForField("RegEmailId"));
			}
			if(logindata.getBooleanValueForField("ConfigMobileNumber")){
				clearAndSendKeys(mobileNumberTextField, logindata.getStringValueForField("MobileNumber"));
			}
			if(logindata.getBooleanValueForField("ConfigTermsAndConditions")){
				check(termsAndConditionsCheckBox);
			}
		}
		else if(logindata.getAction().equalsIgnoreCase("verify")) {
			if(logindata.getBooleanValueForField("ConfigRegistration")){
				assertReference.assertEquals(logindata.getStringValueForField("Registration"),fetchValueFromFields(registerLabel),AssertionType.WARNING);
			}
		}
	}
	public void fillForgotUserIdAndPasswordDetails(LoginEntity logindata,CustomAssert assertReference ) throws InterruptedException{
		if(logindata.getAction().equalsIgnoreCase("add")||logindata.getAction().equalsIgnoreCase("edit")){
			if(logindata.getBooleanValueForField("ConfigForgotEmail")){
				clearAndSendKeys(emailIdTextField, logindata.getStringValueForField("ForgotEmail"));
			}
			if(logindata.getBooleanValueForField("ConfigForgotDOB")){
				clearAndSendKeys(dobUserTextField, logindata.getStringValueForField("ForgotDOB"));
			}
			if(logindata.getBooleanValueForField("ConfigForgotUserID")){
				clearAndSendKeys(UserIdPassTextField, logindata.getStringValueForField("ForgotUserID"));
			}
			if(logindata.getBooleanValueForField("ConfigForgotPassDOB")){
				clearAndSendKeys(dobPasstextField, logindata.getStringValueForField("ForgotPassDOB"));
			}
		}
	}
	public void clickOnSubmit(LoginEntity logindata,CustomAssert assertReference ) throws InterruptedException{
		if(logindata.getBooleanValueForField("ConfigSubmit")){
			click(submitButton);
			}
		
	}
	public void clickOnForgotUserIdButton(LoginEntity logindata,CustomAssert assertReference ) throws InterruptedException{

	}

	public void clickOnRegisterButton(LoginEntity logindata,CustomAssert assertReference ) throws InterruptedException{
		if(logindata.getBooleanValueForField("ConfigRegister")){
			click(registerButton);
		}
	}
	public void clickOnSubmitRegister(LoginEntity logindata,CustomAssert assertReference ) throws InterruptedException{
		if(logindata.getBooleanValueForField("ConfigSubmitRegister")){
			click(submitRegistrationButton);
		}
	}
	public void clickOnForgotSubmit(LoginEntity logindata,CustomAssert assertReference ) throws InterruptedException{
		if(logindata.getBooleanValueForField("ConfigForgotSubmit")){
			click(submitForgotUserDetails);
		}
	}
	public void clickOnForgotCancel(LoginEntity logindata,CustomAssert assertReference ) throws InterruptedException{
		if(logindata.getBooleanValueForField("ConfigForgotCancel")){
			click(cancelForgotUserDetails);
		}
	}
	public void clickOnReset(LoginEntity logindata,CustomAssert assertReference ) throws InterruptedException{
		if(logindata.getBooleanValueForField("ConfigReset")){
			click(resetButton);
		}
	}
	public void clickOnGoBack(LoginEntity logindata,CustomAssert assertReference ) throws InterruptedException{
		if(logindata.getBooleanValueForField("ConfigGoBack")){
			click(goBackButton);
		}
	}
	public void fillDenyAllowPopUp(LoginEntity loginEntity,CustomAssert assertReference) throws InterruptedException
	{
		for(int i=1;i<=2;i++)
		{
			if((driver.findElements(By.xpath("//android.widget.Button[@text='ALLOW']"))).size()!=0){
				click(allowPopUpButton);
			}
			else if((driver.findElements(By.xpath("//android.widget.Button[@text='ALLOW']"))).size()==0)
			{
				break;
			}
		}
	}
	//menuIcon
	public void clickMenu(LoginEntity logindata,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(logindata.getBooleanValueForField("ConfigMenu")){
			click(menuIcon);		
		}
	}
	public void clickOnUserIDSubmitButton(LoginEntity logindata,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(logindata.getBooleanValueForField("ConfigUserIDSubmit")){
			click(UserIDSubmitButton);		
		}
	}
	public String fetchOTP(AppiumDriver<MobileElement> driver) throws InterruptedException {
		String textMessage=driver.findElement(By.id("aqm.com.sms_reader:id/txtView")).getText();
		if(textMessage.contains("Text here")) {
			textMessage=driver.findElement(By.id("aqm.com.sms_reader:id/txtView")).getText();
		}
		//String textMessage="";
		System.out.println(textMessage);
		String text[]=textMessage.split(":");
		String trt[]=text[1].split("is");
		String message=trt[0].trim();
		System.out.println(message);
		driver.quit();
		return message;
	}

	///  OTP Verification code 
	
		/*public void verifyOTPValue()
	{
		driver.findElementByAccessibilityId("OS").click();
		driver.findElementByAccessibilityId("SMS Messaging").click();
		driver.findElementById("io.appium.android.apis:id/sms_recipient").sendKeys("04456");
		driver.findElementById("io.appium.android.apis:id/sms_content").sendKeys("DEMO OTP: 6549");
		driver.findElementByAccessibilityId("Send").click();
		String otpValue = getOTP();
		System.out.println("OTP VALUE : "+otpValue);
	}
	
	
	public String getOTP()
	{
	//	Activity act= new Activity("com.android.messaging", "com.android.messaging.ui.conversationlist.ConversationListActivity");
		driver.executeScript("com.android.messaging", "com.android.messaging.ui.conversationlist.ConversationListActivity");
		//And_Driver.startActivity("com.android.messaging", "com.android.messaging.ui.conversationlist.ConversationListActivity");
		String getOTPValue = driver.findElementById("com.android.messaging:id/conversation_snippet").getText().split(":")[1].trim();
		return getOTPValue;
	}
	*/
	
	
	
	public void fillAndSubmitLoginDetails(LoginEntity logindata,CustomAssert assertReference,String stepGroup,AppiumDriver<MobileElement> mobileDriver) throws InterruptedException{
		if(isConfigTrue(logindata.getConfigExecute()))		
		{
			fillForgotPasswordDetails(logindata, assertReference, mobileDriver);
			//fillDenyAllowPopUp(logindata,assertReference);
			clickMenu(logindata,assertReference,stepGroup);
			
			fillNewLoginPageDetails(logindata, assertReference);
			
			fillLoginPageDetails(logindata, assertReference);
			clickOnSubmit(logindata, assertReference);
			
			
			clickOnRegisterButton(logindata, assertReference);
			fillRegistrationPageDetails(logindata, assertReference);
			clickOnSubmitRegister(logindata, assertReference);
			
			
			clickOnUserIDSubmitButton(logindata, assertReference, stepGroup);

			fillForgotUserIdAndPasswordDetails(logindata, assertReference);
			clickOnForgotSubmit(logindata, assertReference);
			clickOnForgotCancel(logindata, assertReference);
			clickOnReset(logindata, assertReference);
			clickOnGoBack(logindata, assertReference);
			
		}
	}
}