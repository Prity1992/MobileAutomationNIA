package NiaMobileAutomationPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.HealthAddDetailEntity;
import com.aqm.staf.library.databin.HomepageEntity;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class HomePage extends MobileScreen {
	MobileScreenElement powerButton;
	MobileScreenElement myPoliciesIcon;
	MobileScreenElement linkAadharPanNumberIcon;
	MobileScreenElement buyNowIcon;
	MobileScreenElement recentActivitiesIcon;
	MobileScreenElement myClaimsIcon;
	MobileScreenElement quickRenewalsPaymentsIcon;
	MobileScreenElement productIcon;
	MobileScreenElement profileUpdateIcon;
	MobileScreenElement locatorIcon;
	MobileScreenElement userNameLabel;
	MobileScreenElement contactUsIcon;
	MobileScreenElement tollFreeNumLabel;
	MobileScreenElement emailLabel;
	MobileScreenElement chatLabel;
	MobileScreenElement callMeLabel;
	MobileScreenElement nameTextField;
	MobileScreenElement emailIDTextField;
	MobileScreenElement mobileTextField;
	MobileScreenElement preferedTimetoCallDropDown;
	MobileScreenElement descriptionTextField;
	MobileScreenElement submitButton;
	MobileScreenElement thankYouLabel;
	MobileScreenElement timeRadioButton;
	MobileScreenElement locatorTitleLabel;
	MobileScreenElement contactUsIconLabel;
	MobileScreenElement preLoginQuotesLabel;
	MobileScreenElement buyNowLabel;
	MobileScreenElement recentActivitiesLabel;
	MobileScreenElement preLoginQuoteListTitle;
	MobileScreenElement myPoliciesTitle;
	MobileScreenElement linkAadharPanNumberTitle;
	MobileScreenElement recentActivitiesTitleLabel;
	MobileScreenElement quickRenewalsPaymentsTitle;
	MobileScreenElement myClaimsTitle;
	MobileScreenElement address1TextField;
	MobileScreenElement address2TextField;
	MobileScreenElement address3TextField;
	MobileScreenElement pincodeTextField;
	MobileScreenElement mobileNumberTextField;
	MobileScreenElement emailIdTextField;
	MobileScreenElement alternateMobileNumberNumberTextField;
	MobileScreenElement saveButon;
	MobileScreenElement updateSuccessfulMessageLabel;
	MobileScreenElement motorIcon;
	MobileScreenElement healthIcon;
	MobileScreenElement travelIcon;
	MobileScreenElement homeAccidentIcon;
	MobileScreenElement logoutIcon;
	
	
	MobileScreenElement enterQouteNoTextField;
	MobileScreenElement enterCustomerIdTextField;
	MobileScreenElement getDetailsButton;
	MobileScreenElement enhancementRadioButton;
	MobileScreenElement emailIdRenewButton;
	MobileScreenElement GstRegestrationIDDropDownHelth;
	MobileScreenElement GstRegestrationIDRadioButton1;
	MobileScreenElement GstInHealth3TextBox;
	MobileScreenElement saveIcon;
	MobileScreenElement proceedToPayButton;
	MobileScreenElement confirmOkButton;
	
	MobileScreenElement quoteNoRenewLabel;
	MobileScreenElement productNameLabel;
	MobileScreenElement policyHolderLabel;
	MobileScreenElement policyStartDateLabel;
	MobileScreenElement policyEndDateLabel;
	MobileScreenElement totalIDVLabel;
	MobileScreenElement premiumLabel;
	MobileScreenElement termsAndConditionButton;
	MobileScreenElement agreeButton;
	MobileScreenElement optionsIcon;
	MobileScreenElement homeLabel;
	MobileScreenElement userName;
	MobileScreenElement homeIconLabel;
	MobileScreenElement healthLabel;
	MobileScreenElement twoWheeler;
	MobileScreenElement myProfile;
	MobileScreenElement pinCode;
	MobileScreenElement yesButton;
	MobileScreenElement travelLabel;
	MobileScreenElement productLabel;
	public HomePage(AppiumDriver driver, String screenName,String DeviceOS)
	{
		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android"))
		{	
			confirmOkButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='OK']"), "OK", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			enterQouteNoTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Policy No.']//following::android.widget.EditText[1]"), "Enter Quote No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			enterCustomerIdTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Policy No.']//following::android.widget.EditText[2]"), "Enter Customer ID", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			getDetailsButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Get Details']"), "Get Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			enhancementRadioButton= new MobileScreenElement(By.xpath("//android.view.View[@text='Enhancement']//following::android.widget.RadioButton[1]"), "Enhancement", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			emailIdRenewButton= new MobileScreenElement(By.xpath("//android.view.View[@text='Please Enter Correct Email ID']"), "Please Enter Correct Email ID", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			GstRegestrationIDDropDownHelth= new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Select']"), "GST Registration ID Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
			GstRegestrationIDRadioButton1= new MobileScreenElement(By.xpath("//android.view.View[@text='PRODUCTS']"), "Products", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			GstInHealth3TextBox= new MobileScreenElement(By.xpath("//android.view.View[@text='PROFILE UPDATE']"), "Profile Update", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			saveIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='Customer Details']//following::android.view.View[1]"), "Save Icon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			proceedToPayButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Proceed to Pay']"), "Proceed to Pay", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			
			quoteNoRenewLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Quote No.']//following::android.view.View[2]"), "Quote No", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			productNameLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Product Name']//following::android.view.View[2]"), "Product Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			policyHolderLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Policy Holder']//following::android.view.View[2]"), "Policy Holder", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
			policyStartDateLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Policy Start Date']//following::android.view.View[2]"), "Policy Start Date", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			policyEndDateLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Policy End Date']//following::android.view.View[2]"), "Policy End Date", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			totalIDVLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Total IDV']//following::android.view.View[2]"), "Total IDV", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			premiumLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Premium']//following::android.view.View[2]"), "Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			termsAndConditionButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Terms & Conditions']"), "Terms & Conditions", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			agreeButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Agree']"), "Agree", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	
			myPoliciesIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='My Policies']"), "My Policies", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			linkAadharPanNumberIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='Link Aadhaar/PAN Number']"), "Link Aadhaar/PAN Number", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			buyNowIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='BUY NOW']"), "Buy Now", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			recentActivitiesIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='Recent Activities']"), "Recent Activies", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			myClaimsIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='My Claims']"), "My Claims", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			quickRenewalsPaymentsIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='Quick Renew/Pay']"), "Quick Renewals And Payments", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			productIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='Products']"), "Products", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			profileUpdateIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='PROFILE UPDATE']"), "Profile Update", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			locatorIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='locate outline Locate'and @resource-id='tab-t0-1']"), "Locator", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			//userNameLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='DHWANI PATEL']"), "User Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	

			contactUsIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='contacts outline Contact']"), "CONTACT US", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			tollFreeNumLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Call Us @ Toll Free Number 1800-209-1415']"), "Toll Free", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			emailLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Email Us @ tech.support@newindia.co.in']"), "Email", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			chatLabel= new MobileScreenElement(By.xpath("//android.view.View[@text=\"Let's Chat\"]"), "Chat", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//chatLabel= new MobileScreenElement(By.xpath("//android.widget.Image[@text='icon-support-comment']//following::android.view.View[1]"), "Chat", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			callMeLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Call Me']"), "Call Me", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	

			nameTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Name *']//following::android.widget.EditText"), "Name *", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			emailIDTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Email ID *']//following::android.widget.EditText"), "Email ID *", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			mobileTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Mobile No *']//following::android.widget.EditText"), "Mobile No *", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			preferedTimetoCallDropDown= new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Preferred Time to Call']"), "Preferred Time to Call", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			descriptionTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Description *']//following::android.widget.EditText[1]"), "Description *", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			submitButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit' and resource-id='contact-btn']"), "Submit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			thankYouLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Thank You ! We will call you Shortly !']"), "Thank You ! We will call you Shortly !", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	

			locatorTitleLabel= new MobileScreenElement(By.xpath("//android.widget.Image[@text='newGPS']"), "Locator Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			contactUsIconLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='contacts outline Contact'and @resource-id='tab-t0-2']"), "Contact Us", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			preLoginQuotesLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='PRE-LOGIN QUOTES']"), "Pre Login Quotes", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			buyNowLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='BUY NOW']"), "Buy Now", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			recentActivitiesLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Recent Activities']"), "Recent Activies", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			preLoginQuoteListTitle = new MobileScreenElement(By.xpath("//android.view.View[@text='Pre-Login Quotes List']"), "Pre Login Quote list", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			myPoliciesTitle= new MobileScreenElement(By.xpath("//android.view.View[@text='My Policies']"), "My Policies", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			linkAadharPanNumberTitle= new MobileScreenElement(By.xpath("//android.view.View[@text='Link Aadhaar/PAN']"), "Link Aadhar and PAN", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			recentActivitiesTitleLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Recent Activities']"), "Recent Activities", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			quickRenewalsPaymentsTitle= new MobileScreenElement(By.xpath("//android.view.View[@text='Quick Renew/Pay']"), "Quick Renewals and Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			myClaimsTitle= new MobileScreenElement(By.xpath("//android.view.View[@text='My Claims']"), "My Claims", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			address1TextField= new MobileScreenElement(By.xpath("//android.widget.EditText[@index='3']"), "Address line 1", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			address2TextField= new MobileScreenElement(By.xpath("//android.widget.EditText[@index='5']"), "Address line 2", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			address3TextField= new MobileScreenElement(By.xpath("//android.widget.EditText[@index='7']"), "Address line 3", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			pincodeTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Pin Code *']//following::android.widget.EditText[1]"), "Pincode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			mobileNumberTextField= new MobileScreenElement(By.xpath("//android.widget.EditText[@index='11']"), "Mobile Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			emailIdTextField= new MobileScreenElement(By.xpath("//android.widget.EditText[@index='13']"), "Email Id", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			alternateMobileNumberNumberTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Alternate Mobile Number']//following::android.widget.EditText[1]"), "Landline Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			saveButon= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save']"), "Save", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			updateSuccessfulMessageLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='User Profile Updated Successfully']"), "User Profile Update Message", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			motorIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='MOTOR' and @index='1']"),"Motor", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			healthIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='HEALTH' and @index='1']"),"Health", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			travelIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='TRAVEL']"),"Travel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			homeAccidentIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='HOME AND ACCIDENT']"),"Home And Accident", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			logoutIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='Last Login:']//preceding::android.view.View[2]"),"Logout", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);

			optionsIcon=new MobileScreenElement(By.xpath("//android.widget.Button[@index='1']"),"Option Icon",false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			homeLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Home']"),"Home Label", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			homeIconLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='home Home']"),"Home Icon Label", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			
			healthLabel=new  MobileScreenElement(By.xpath("//android.view.View[@text='Health']"),"Health Label", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			
			twoWheeler= new MobileScreenElement(By.xpath("//android.view.View[@text='Two Wheeler']"),"Two Wheeler Label", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			myProfile= new MobileScreenElement(By.xpath("//android.view.View[@text='My Profile']"),"My Profile Label", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			pinCode= new MobileScreenElement(By.xpath("//android.view.View[@text='400066']"),"Pin Code Label", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			yesButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='YES']"),"Yes Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			travelLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Travel']"),"Travel Label", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			productLabel= new MobileScreenElement(By.xpath("//android.view.View[@index='0']"),"Travel Label", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		}	
	}

	public void clickOnMyPolicies(HomepageEntity homepageEntity,CustomAssert assertReference) throws InterruptedException{
		if(homepageEntity.getBooleanValueForField("ConfigMyPolicies")){
			click(myPoliciesIcon);                                                                                                     
		}
	}

	public void clickOnLinkAadharPancard(HomepageEntity homepageEntity,CustomAssert assertReference) throws InterruptedException{
		if(homepageEntity.getBooleanValueForField("ConfigLinkAadharPancard")){
			click(linkAadharPanNumberIcon);
		}
	}

	public void clickOnBuyNow(HomepageEntity homepageEntity,CustomAssert assertReference) throws InterruptedException{
		if(homepageEntity.getBooleanValueForField("ConfigBuyNow")){
			click(buyNowIcon);
			
		}
	}

	public void clickOnRecentActivies(HomepageEntity homepageEntity,CustomAssert assertReference) throws InterruptedException{
		if(homepageEntity.getBooleanValueForField("ConfigRecentActivies")){
			click(recentActivitiesIcon);
		}
	}

	public void clickOnMyClaim(HomepageEntity homepageEntity,CustomAssert assertReference) throws InterruptedException{
		if(homepageEntity.getBooleanValueForField("ConfigMyClaim")){
			click(myClaimsIcon);
		}
	}

	public void clickOnQuickRenewalsPayments(HomepageEntity homepageEntity,CustomAssert assertReference) throws InterruptedException{
		if(homepageEntity.getBooleanValueForField("ConfigQuickRenewalsPayments")){
			click(quickRenewalsPaymentsIcon);
		}
	}

	public void clickOnProduct(HomepageEntity homepageEntity,CustomAssert assertReference) throws InterruptedException{
		if(homepageEntity.getBooleanValueForField("ConfigProduct")){
			//click(productIcon);
			if(homepageEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")) {
				Thread.sleep(2000);
				/*TouchAction action=new TouchAction(driver);
				action.press(PointOption.point(763,222)).release().perform();*/
				//click(productLabel);
			//	scrollDown();
				        click(healthLabel);   
				        
				/*TouchAction action=new TouchAction(driver);
				action.press(PointOption.point(655,1815)).release().perform();*/
			}
			if(homepageEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor")) {
		        click(twoWheeler);                                      
	}
			if(homepageEntity.getStringValueForField("LOB").equalsIgnoreCase("Travel")) {
		        click(travelLabel);                                      
	}		
			
		}
	}

	public void clickOnOptionLabel(HomepageEntity homepageEntity,CustomAssert assertReference) throws InterruptedException{
		if(homepageEntity.getBooleanValueForField("ConfigOptions")) {
			
			click(optionsIcon);
			if(homepageEntity.getTestScenario().equalsIgnoreCase("NIAMobile_Automation_TC_0013")) {
				click(myProfile);
			}
			scrollDown();
			
			if (homepageEntity.getBooleanValueForField("ConfigAddress1")) {
				clearAndSendKeys(address1TextField, homepageEntity.getStringValueForField("Address1"));
			}
			if (homepageEntity.getBooleanValueForField("ConfigAddress2")) {
				clearAndSendKeys(address2TextField, homepageEntity.getStringValueForField("Address2"));
			}
			if (homepageEntity.getBooleanValueForField("ConfigAddress3")) {
				clearAndSendKeys(address3TextField, homepageEntity.getStringValueForField("Address3"));
			}
			if (homepageEntity.getBooleanValueForField("ConfigPincode")) {
				clearAndSendKeys(pincodeTextField, homepageEntity.getStringValueForField("Pincode"));
				click(pinCode);
			}
			if (homepageEntity.getBooleanValueForField("ConfigMobileNumber")) {
				clearAndSendKeys(mobileNumberTextField, homepageEntity.getStringValueForField("MobileNumber"));
			}
			if (homepageEntity.getBooleanValueForField("ConfigUserEmailId")) {
				clearAndSendKeys(emailIdTextField, homepageEntity.getStringValueForField("UserEmailId"));
			}
			if (homepageEntity.getBooleanValueForField("ConfigAlternateMobileNumber")) {
				clearAndSendKeys(alternateMobileNumberNumberTextField                                                                                                                                     , homepageEntity.getStringValueForField("AlternateMobileNumber"));
			}
			if(homepageEntity.getTestScenario().equalsIgnoreCase("NIAMobile_Automation_TC_0013")) {
			click(saveButon);
			click(yesButton);
			}
			
			/*Alert alert=driver.switchTo().alert();
			alert.accept();*/
		}
	}

	public void clickOnLocator(HomepageEntity homepageEntity,CustomAssert assertReference) throws InterruptedException{
		if(homepageEntity.getBooleanValueForField("ConfigLocator")){
			click(locatorIcon);
		}
	}
	public void clickOnContactUs(HomepageEntity homepageEntity,CustomAssert assertReference) throws InterruptedException{
		if(homepageEntity.getBooleanValueForField("ConfigContactUs")){
			click(contactUsIcon);
		}
	}
	public void clickOnPreLoginQuotes(HomepageEntity homepageEntity,CustomAssert assertReference) throws InterruptedException{
		if(homepageEntity.getBooleanValueForField("ConfigPreLoginQuotes")){
			click(preLoginQuotesLabel);
		}
	}
		public void clickOnLogout(HomepageEntity homepageEntity,CustomAssert assertReference) throws InterruptedException{
		if(homepageEntity.getBooleanValueForField("ConfigLogout")){
			click(logoutIcon);
			click(yesButton);
		}
	}
	
	public void HomePageDetails(HomepageEntity homepageEntity,CustomAssert assertReference) throws InterruptedException {
		if(homepageEntity.getAction().equalsIgnoreCase("add")||homepageEntity.getAction().equalsIgnoreCase("edit")){
			if(homepageEntity.getBooleanValueForField("ConfigName")){
				clearAndSendKeys(nameTextField, homepageEntity.getStringValueForField("Name"));
			}
				if(homepageEntity.getBooleanValueForField("ConfigEmailID")){
					clearAndSendKeys(emailIDTextField, homepageEntity.getStringValueForField("EmailID"));
				}
				if(homepageEntity.getBooleanValueForField("ConfigMobileNo")){
					clearAndSendKeys(mobileTextField, homepageEntity.getStringValueForField("MobileNo"));
				}
				if(homepageEntity.getBooleanValueForField("ConfigPreferredTime")){
					click(preferedTimetoCallDropDown);
					String time=homepageEntity.getStringValueForField("PreferredTime");
					timeRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+time+"'"+"]"), "Time", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(timeRadioButton);
				}
				if(homepageEntity.getBooleanValueForField("ConfigDescription")){
					clearAndSendKeys(descriptionTextField, homepageEntity.getStringValueForField("Description"));
				}
				
				/*if(homepageEntity.getBooleanValueForField("ConfigDescription")){
					clearAndSendKeys(descriptionTextField, homepageEntity.getStringValueForField("Description"));
				}
				if(homepageEntity.getBooleanValueForField("ConfigGstRegestrationIDDropDown")){
					click(GstRegestrationIDDropDownHelth);
					String registrationId=homepageEntity.getStringValueForField("GstRegestrationIDDropDown");
					GstRegestrationIDRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+registrationId+"'"+"]"), "Dependency Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(GstRegestrationIDRadioButton1);
				}

				if(homepageEntity.getBooleanValueForField("ConfigGstIntextbox")){
					clearAndSendKeys(GstInHealth3TextBox, homepageEntity.getStringValueForField("GstIntextbox"));
					scrollToElementForward();
				}*/
				
				if(homepageEntity.getBooleanValueForField("ConfigEnterQuoteNo")){
					clearAndSendKeys(enterQouteNoTextField, homepageEntity.getStringValueForField("EnterQuoteNo"));
				}
				if(homepageEntity.getBooleanValueForField("ConfigEnterCustomerID")){
					clearAndSendKeys(enterCustomerIdTextField, homepageEntity.getStringValueForField("EnterCustomerID"));
				}
				if(homepageEntity.getBooleanValueForField("ConfigGetDetails")){
					click(getDetailsButton);
					scrollDown();
				}
				if(homepageEntity.getBooleanValueForField("ConfigEnhancement")){
					click(enhancementRadioButton);
					scrollDown();
					scrollDown();
				}
				if(homepageEntity.getBooleanValueForField("ConfigProceedToPay")){
					click(proceedToPayButton);
					click(confirmOkButton);
				}
				
				/*if(homepageEntity.getBooleanValueForField("ConfigStateTextBox")){				
					clearAndSendKeys(StateMotorTextBox, homepageEntity.getStringValueForField("State"));
					click(StateHealthname);
				}
				if(homepageEntity.getBooleanValueForField("ConfigpincodeTextBox")){
					click(PinCodeHealth3TExtBox);
					clearAndSendKeys(PinCodeHealth3TExtBox, homepageEntity.getStringValueForField("pin"));
					//sendKeys(PinNoHealthTextField,("pin"));
					click(PinNoHealthTextField);
				}
				if(homepageEntity.getBooleanValueForField("ConfigCityTextBox")){
					clearAndSendKeys(CityHealthTextBox, homepageEntity.getStringValueForField("CityTextBox"));
				}*/

				
			}
		
		else if(homepageEntity.getAction().equalsIgnoreCase("verify")){
		
			if(homepageEntity.getBooleanValueForField("ConfigQuoteNoRenew")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("QuoteNoRenew"),fetchValueFromFields(quoteNoRenewLabel),AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigProductName")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("ProductName"),fetchValueFromFields(productNameLabel),AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigPolicyHolder")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("PolicyHolder"),fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigPolicyStartDate")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("PolicyStartDate"),fetchValueFromFields(policyStartDateLabel),AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigPolicyEndDate")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("PolicyEndDate"),fetchValueFromFields(policyEndDateLabel),AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigTotalIDV")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("TotalIDV"),fetchValueFromFields(totalIDVLabel),AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigPremium")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("Premium"),fetchValueFromFields(premiumLabel),AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigTermsAndComdition")){
				click(termsAndConditionButton);	
			}
			if(homepageEntity.getBooleanValueForField("ConfigAgree")){
				click(agreeButton);	
			}
			/*if(homepageEntity.getBooleanValueForField("ConfigUserName")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("UserName"),fetchValueFromFields(userNameLabel),AssertionType.WARNING);
			}*/
			if(homepageEntity.getBooleanValueForField("ConfigUserName")){
			String userNameLabel=homepageEntity.getStringValueForField("UserName");
			userName=new MobileScreenElement(By.xpath("//android.view.View[@text="+"'"+userNameLabel+"'"+"]"), "User Name Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			assertReference.assertEquals(homepageEntity.getStringValueForField("UserName"),fetchValueFromFields(userName),AssertionType.WARNING);
			}
			
			if(homepageEntity.getBooleanValueForField("ConfigHomeLabel")) {
				assertReference.assertEquals(homepageEntity.getStringValueForField("HomeLabel"), fetchValueFromFields(homeLabel), AssertionType.WARNING);
				
			}
			if(homepageEntity.getBooleanValueForField("ConfigTollFree")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("TollFree"),fetchValueFromFields(tollFreeNumLabel),AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigEmail")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("Email"),fetchValueFromFields(emailLabel),AssertionType.WARNING);
			}
			/*if(homepageEntity.getBooleanValueForField("ConfigChat")){
				assertReference.assertEquals("Let's Chat",fetchValueFromFields(chatLabel),AssertionType.WARNING);
			}*/
			if(homepageEntity.getBooleanValueForField("ConfigChat")){
				String str = fetchValueFromFields(chatLabel);
				assertReference.customLogger("Verify Chat: "+str, !str.equals(""),AssertionType.WARNING);		
			}
			if(homepageEntity.getBooleanValueForField("ConfigCallMe")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("CallMe"),fetchValueFromFields(callMeLabel),AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigThankYou")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("ThankYou"),fetchValueFromFields(thankYouLabel),AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigMyPoliciesLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("MyPoliciesLabel"), fetchValueFromFields(myPoliciesIcon), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigLinkAadharPanNumberLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("LinkAadharPanNumberLabel"), fetchValueFromFields(linkAadharPanNumberIcon), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigBuyNowLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("BuyNowLabel"), fetchValueFromFields(buyNowLabel), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigMyClaimsLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("MyClaimsLabel"), fetchValueFromFields(myClaimsIcon), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigRecentsActivitiesLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("RecentsActivitiesLabel"), fetchValueFromFields(recentActivitiesLabel), AssertionType.WARNING);
			}
			
			if(homepageEntity.getBooleanValueForField("ConfigQuickRenewalPaymentsLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("QuickRenewalPaymentsLabel"), fetchValueFromFields(quickRenewalsPaymentsIcon), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigProductsLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("ProductsLabel"), fetchValueFromFields(productIcon), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigProfileUpdateLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("ProfileUpdateLabel"), fetchValueFromFields(profileUpdateIcon), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigLocatorLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("LocatorLabel"), fetchValueFromFields(locatorIcon), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigContactUsLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("ContactUsLabel"), fetchValueFromFields(contactUsIconLabel), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigHomeIconLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("HomeIconLabel"), fetchValueFromFields(homeIconLabel), AssertionType.WARNING);
			}
			
			if(homepageEntity.getBooleanValueForField("ConfigPreLoginQuotesLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("PreLoginQuotesLabel"), fetchValueFromFields(preLoginQuotesLabel), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigLocatorTitleLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("LocatorTitleLabel"), fetchValueFromFields(locatorTitleLabel), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigPreLoginQuotesTitleLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("PreLoginQuotesTitleLabel"), fetchValueFromFields(preLoginQuoteListTitle), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigMyPoliciesTitleLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("MyPoliciesTitleLabel"), fetchValueFromFields(myPoliciesTitle), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigLinkAadharPanNumberTitleLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("LinkAadharPanNumberTitleLabel"), fetchValueFromFields(linkAadharPanNumberTitle), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigRecentsActivitiesTitleLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("RecentsActivitiesTitleLabel"), fetchValueFromFields(recentActivitiesTitleLabel), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigMyClaimsTitleLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("MyClaimsTitleLabel"), fetchValueFromFields(myClaimsTitle), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigQuickRenewalPaymentsTitleLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("QuickRenewalPaymentsTitleLabel"), fetchValueFromFields(quickRenewalsPaymentsTitle), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigUpdateSuccessfullMsg")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("UpdateSuccessfullMsg"), fetchValueFromFields(updateSuccessfulMessageLabel), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigMotorLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("MotorLabel"), fetchValueFromFields(motorIcon), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigHealthLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("HealthLabel"), fetchValueFromFields(healthIcon), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigTravelLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("TravelLabel"), fetchValueFromFields(travelIcon), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigHomeAndAccidentLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("HomeAndAccidentLabel"), fetchValueFromFields(homeAccidentIcon), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigUpdateSuccessfullMsg")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("UpdateSuccessfullMsg"), fetchValueFromFields(updateSuccessfulMessageLabel), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigMotorLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("MotorLabel"), fetchValueFromFields(motorIcon), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigHealthLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("HealthLabel"), fetchValueFromFields(healthIcon), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigTravelLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("TravelLabel"), fetchValueFromFields(travelIcon), AssertionType.WARNING);
			}
			if(homepageEntity.getBooleanValueForField("ConfigHomeAndAccidentLabel")){
				assertReference.assertEquals(homepageEntity.getStringValueForField("HomeAndAccidentLabel"), fetchValueFromFields(homeAccidentIcon), AssertionType.WARNING);
			}
		}
	}

	public void clickOnCallMeButton(HomepageEntity homepageEntity,CustomAssert assertReference) {
		if(homepageEntity.getBooleanValueForField("ConfigCallMeButton")){
			click(callMeLabel);
		}
	}
	public void clickOnSubmitButton(HomepageEntity homepageEntity,CustomAssert assertReference) {
		if(homepageEntity.getBooleanValueForField("ConfigSubmit")){
			scrollDown();
			//click(submitButton);
			
			TouchAction action=new TouchAction(driver);
			action.press(PointOption.point(353, 1113)).release().perform();
		}
	}


	public void fillAndSubmitHomepageDetails(HomepageEntity homepageEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(homepageEntity.getConfigExecute()))		
		{
			clickOnMyPolicies(homepageEntity, assertReference);
			clickOnLinkAadharPancard(homepageEntity, assertReference);
			clickOnBuyNow(homepageEntity, assertReference);
			clickOnRecentActivies(homepageEntity, assertReference);
			clickOnMyClaim(homepageEntity, assertReference);
			clickOnQuickRenewalsPayments(homepageEntity, assertReference);
			clickOnProduct(homepageEntity, assertReference);
			clickOnOptionLabel(homepageEntity, assertReference);
			clickOnLocator(homepageEntity, assertReference);
			clickOnContactUs(homepageEntity, assertReference);
			clickOnCallMeButton(homepageEntity, assertReference);
			clickOnPreLoginQuotes(homepageEntity, assertReference);
			HomePageDetails(homepageEntity, assertReference);
			clickOnSubmitButton(homepageEntity, assertReference);
			clickOnLogout(homepageEntity, assertReference);
		//	clickOnLogout(homepageEntity, assertReference);



		}
	}
}