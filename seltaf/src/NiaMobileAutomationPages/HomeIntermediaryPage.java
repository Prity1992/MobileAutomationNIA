
package NiaMobileAutomationPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.HomeIntermediaryEntity;
import com.aqm.staf.library.databin.HomepageEntity;
import com.aqm.staf.library.databin.LoginEntity;
import com.aqm.staf.library.databin.PolicyInfoIntermidiaryEntity;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class HomeIntermediaryPage extends MobileScreen {

	private	MobileScreenElement productListIcon;
	private MobileScreenElement motorIcon;
	private MobileScreenElement healthIcon;
	private MobileScreenElement homeAndAccidentIcon;
	private MobileScreenElement productName;
	private MobileScreenElement buyNowIcon; 
	private MobileScreenElement buyIssuranceButton;
	private MobileScreenElement renewExistingPolicyButton;
	private MobileScreenElement continueButton;
	private MobileScreenElement productListintrIcon;
	private MobileScreenElement BuyNowButton;
	private MobileScreenElement buyNowHealthIcon;
	private MobileScreenElement logoutIcon;
	private MobileScreenElement okButton;
	private MobileScreenElement apdBalanceLabel;
	private MobileScreenElement welcomeMsgInterLabel;
	private MobileScreenElement buyNowLabel;
	private MobileScreenElement quickRenewalsLabel;
	private MobileScreenElement profileUpdateLabel;
	private MobileScreenElement managePoliciesLabel;
	private MobileScreenElement manageRenewalsLabel;
	private MobileScreenElement manageClaimsLabel;
	private MobileScreenElement locatorLabel;
	private MobileScreenElement appointmentLabel;
	private MobileScreenElement contactUsLabel;
	private MobileScreenElement productListLabel;
	private MobileScreenElement uploadPhotoLabel;
	private MobileScreenElement locatorTitleLabel;
	private MobileScreenElement chatbutton;
	private MobileScreenElement callMebutton;
	private MobileScreenElement nameTextField;
//	private MobileScreenElement emailIDTextField;
	private MobileScreenElement mobileTextField;
	private MobileScreenElement preferedTimeRadioButton;
	private MobileScreenElement descriptionTextField;
	private MobileScreenElement submitButton;
	private MobileScreenElement thankYouLabel;
	private MobileScreenElement timeRadioButton;
	private MobileScreenElement firstNameTextfield;
	private MobileScreenElement lastNameTextfield;
	private MobileScreenElement changePasswordButton;
	private MobileScreenElement oldPasswordTextfield;
	private MobileScreenElement newPasswordTextfield;
	private MobileScreenElement confirmPasswordTextfield;
	private MobileScreenElement submitProfileButton;
	private MobileScreenElement streetTextfield;
	private MobileScreenElement pincodeTextfield;
	private MobileScreenElement landlineTextfield;
	private MobileScreenElement mobileNumberTextfield;
	private MobileScreenElement emailIdTextfield;
	private MobileScreenElement branchCodeTextfield;
	private MobileScreenElement saveButton;
	private MobileScreenElement profileSuccessMsgLabel;
	private MobileScreenElement errorMsgLabel;
	private MobileScreenElement emailIdMotorLabel;
	private MobileScreenElement tollFreeNumberLabel;

	private MobileScreenElement motorLabel;
	private MobileScreenElement healthLabel;
	private MobileScreenElement travelLabel;
	private MobileScreenElement homeAndAccidentLabel;
	private MobileScreenElement twoWheelerLabel;
	private MobileScreenElement grihaSuvidhaLabel;
	
	private MobileScreenElement searchByDropDown;
	private MobileScreenElement quoteNoRadioButton;
	private MobileScreenElement quoteNoTextField;
	private MobileScreenElement SearchIconbutton;
	private MobileScreenElement productNameLabel;
	private MobileScreenElement policyHolderLabel;
	private MobileScreenElement startDateendDateLabel;
	private MobileScreenElement policyStatusLabel;
	
	private MobileScreenElement uploadDucumenetButton;
	private MobileScreenElement viewDocumentButton;
	
	
	private MobileScreenElement passwordChangedSuccessfullyLabel;

	private MobileScreenElement claimQuoteNoTextField;
	
	private MobileScreenElement claimFormAddButton;
	private MobileScreenElement registerCertificationAddButton;
	private MobileScreenElement drivingLicenceAddButton;
	
	private MobileScreenElement claimFormJpgLabel;
	private MobileScreenElement registerCertificationLabel;
	private MobileScreenElement drivingLicenceLabel;
	
	private MobileScreenElement galleryButton;
	private MobileScreenElement uploadButton;
	private MobileScreenElement backArrowIcon;
	private MobileScreenElement claimDetails;
	private MobileScreenElement regNumSearchLabel;
	private MobileScreenElement ok;
	
	
	
	
	public HomeIntermediaryPage(AppiumDriver driver, String screenName,String DeviceOS)
	{
		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android"))
		{	
			productListIcon= new MobileScreenElement(By.xpath("//android.view.View[text(),'UPLOAD PHOTO UPLOAD PHOTO']"), "Product List Icon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			motorIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='MOTOR' and @index='1']"), "Motor Icon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			healthIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='HEALTH']"), "Health Icon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			homeAndAccidentIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='HOME AND ACCIDENT']"), "Home And Accident Icon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			buyNowIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='Buy Now']"), "Buy Now Icon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			buyNowHealthIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='Buy Now BUY NOW']"), "Buy Now Icon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			continueButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Continue']"), "Continue Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			buyIssuranceButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Buy insurance for a new vehicle']"), "Buy Issurance Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			renewExistingPolicyButton= new MobileScreenElement(By.id("renewInsurance-btn"), "Renew Existing Policy Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			productListintrIcon= new MobileScreenElement(By.xpath("//android.view.View[@text='PRODUCT LIST PRODUCT LIST' and @index='0']"), "Product List", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			BuyNowButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Buy Now']"), "Buy Now Icon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			logoutIcon= new MobileScreenElement(By.xpath("//android.widget.EditText[@text='UAT TEST']//following::android.view.View[1]"), "Logout Icon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			okButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='OK']"), "Ok Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			apdBalanceLabel= new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='apdDetails']"), "APD Balance", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			welcomeMsgInterLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Welcome']"),"Welcome", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			buyNowLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Buy Now BUY NOW']"),"Buy Now", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			quickRenewalsLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='QUICK RENEWAL/ PAYMENTS QUICK RENEWAL/ PAYMENTS']"),"Quick Renewals", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			profileUpdateLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='PROFILE UPDATE PROFILE UPDATE']"),"Profile Update", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			managePoliciesLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='MANAGE POLICIES/ QUOTES MANAGE POLICIES/ QUOTES']"),"Manage Policies", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			manageRenewalsLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='MANAGE RENEWALS MANAGE RENEWALS']"),"Manage Renewals", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			manageClaimsLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='MANAGE CLAIMS MANAGE CLAIMS']"),"Manage Claims", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			locatorLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='LOCATOR LOCATOR']"),"Locators", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			appointmentLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='APPOINTMENTS APPOINTMENTS']"),"Appointments", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			contactUsLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='CONTACT US CONTACT US']"),"Contact Us", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			productListLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='PRODUCT LIST PRODUCT LIST']"),"Product List", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			uploadPhotoLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='UPLOAD PHOTO/VIDEO UPLOAD PHOTO/VIDEO']"),"Upload", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			locatorTitleLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='LOCATOR']"),"Locator", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			chatbutton= new MobileScreenElement(By.xpath("//android.view.View[@text='Chat']"),"Chat", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			callMebutton= new MobileScreenElement(By.xpath("//android.view.View[@text='Call Me']"),"Call Me", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			firstNameTextfield= new MobileScreenElement(By.xpath("//android.view.View[@text='First Name']//following::android.widget.EditText[1]"),"First Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			lastNameTextfield= new MobileScreenElement(By.xpath("//android.view.View[@text='Last Name']//following::android.widget.EditText[1]"),"Last Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			changePasswordButton= new MobileScreenElement(By.xpath("//android.widget.EditText[@text='Change Password']"),"Change Password", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			oldPasswordTextfield= new MobileScreenElement(By.xpath("//android.view.View[@text='Agent Application']//following::android.widget.EditText[1]"),"old Password", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			newPasswordTextfield= new MobileScreenElement(By.xpath("//android.view.View[@text='Agent Application']//following::android.widget.EditText[2]"),"new Password", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			confirmPasswordTextfield= new MobileScreenElement(By.xpath("//android.view.View[@text='Agent Application']//following::android.widget.EditText[3]"),"Confirm Password", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			submitProfileButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit']"),"Submit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			streetTextfield= new MobileScreenElement(By.xpath("//android.view.View[@text='Street']//following::android.widget.EditText[1]"),"Street", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			pincodeTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='Pin Code']//following::android.widget.EditText[1]"),"Pin Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			landlineTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='LandLine Number']//following::android.widget.EditText[1]"),"LandLine Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			mobileNumberTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='Mobile Number']//following::android.widget.EditText[1]"),"Mobile Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			emailIdTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='Email ID']//following::android.widget.EditText[1]"),"Email ID", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			branchCodeTextfield= new MobileScreenElement(By.xpath("//android.view.View[@text='Branch Code']//following::android.widget.EditText[1]"),"Branch Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			saveButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save']"),"Save", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			profileSuccessMsgLabel= new MobileScreenElement(By.xpath("//android.widget.TextView[@text='User profile updated']"),"Message", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			errorMsgLabel= new MobileScreenElement(By.xpath("//android.widget.TextView[@text='Old password and new password should not be same.']"),"Error Message", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			nameTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Name']//following::android.widget.EditText[1]"), "Name *", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		//	emailIDTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Email ID']//following::android.widget.EditText[1]"), "Email ID *", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			mobileTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Mobile Number']//following::android.widget.EditText[1]"), "Mobile No *", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			preferedTimeRadioButton= new MobileScreenElement(By.xpath("//android.view.View[@text=' 8 AM to 1 PM']//preceding::android.widget.RadioButton[1]"), "Preferred Time to Call", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			descriptionTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Description']//following::android.widget.EditText[1]"), "Description *", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			submitButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit']"), "Submit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			thankYouLabel= new MobileScreenElement(By.xpath("//android.widget.TextView[@text='Alert']//following::android.widget.TextView[1]"), "Thank You ! We will call you Shortly !", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			tollFreeNumberLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Toll Free']//following::android.view.View[1]"), "Toll Free", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			emailIdMotorLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Email']//following::android.view.View[1]"), "Email ID", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	

			motorLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='MOTOR']"), "MOTOR", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			healthLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='HEALTH']"), "HEALTH", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			travelLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='TRAVEL']"), "TRAVEL", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			homeAndAccidentLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='HOME AND ACCIDENT']"), "HOME AND ACCIDENT", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	

			twoWheelerLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='TWO WHEELER']"), "TWO WHEELER", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			grihaSuvidhaLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='GRIHA SUVIDHA']"), "GRIHA SUVIDHA", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			
			searchByDropDown= new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Search by']"), "Search by", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);	
			quoteNoRadioButton= new MobileScreenElement(By.xpath("//android.view.View[@text='HEALTH']"), "HEALTH", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			quoteNoTextField= new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Quote No.']//following::android.widget.EditText[1]"), "Quote Policy Num", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			
			SearchIconbutton= new MobileScreenElement(By.xpath("//android.view.View[@text='HOME AND ACCIDENT']"), "HOME AND ACCIDENT", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			policyHolderLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Policy HolderABC XYZ']"), "Policy Holder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			productNameLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Product NameAsha Kiran']"), "Product Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			startDateendDateLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Action']//preceding::android.view.View[2]"), "Start Date - End Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			policyStatusLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Action']//preceding::android.view.View[1]"), "Policy Status ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
		    passwordChangedSuccessfullyLabel=new MobileScreenElement(By.xpath("//android.widget.TextView[@text='Alert']//following::android.widget.TextView[1]"), "Password Changed Successfully", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
	        uploadDucumenetButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Upload Document']"), "Upload Document", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			viewDocumentButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='View Document']"), "View Document", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			claimQuoteNoTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Manage Claims']//following::android.widget.EditText[1]"), "Claim No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
	        claimFormAddButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Claim Form']//following::android.view.View[1]"), "Upload Claim Form", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			registerCertificationAddButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Registration Certificates']//following::android.view.View[1]"), "Upload Registration Certificates", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			drivingLicenceAddButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Driving License']//following::android.view.View[1]"), "Upload Driving License", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			galleryButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Gallery']"), "Gallery", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			claimFormJpgLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Claim Form']//following::android.view.View[2]"), "Upload Claim Form", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			registerCertificationLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Registration Certificates']//following::android.view.View[1]"), "Upload Registration Certificates", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			drivingLicenceLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='Driving License']//following::android.view.View[1]"), "Upload Driving License", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			uploadButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Upload']"), "Upload", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			backArrowIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='Document Upload']//following::android.view.View[1]"), "Back Arrow", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			claimDetails = new MobileScreenElement(By.xpath("//android.view.View[@text='Claim Number']"), "Claim Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			regNumSearchLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='REG NO. SEARCH REG NO. SEARCH']"), "Reg No. Search", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		    ok= new MobileScreenElement(By.xpath("//android.widget.Button[@text='OK']"), "OK", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		    //profileSucessMsgLabel=new MobileScreenElement(By.xpath("//android.widget.TextView[@text='User profile updated']"), "Profile Update Message", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		}
	}
	public  void ClickBuyNowIcon(HomeIntermediaryEntity homeIntermediaryEntity) {
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigProductListIcon")) {
			click(productListintrIcon);
		}



		if(homeIntermediaryEntity.getBooleanValueForField("ConfigBuyNowIcon")) {
			click(buyNowHealthIcon);
		}



	}
	public void ClickProductIcons(HomeIntermediaryEntity homeIntermediaryEntity) throws InterruptedException {
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigLOBName")) {
			String lobNmae;
			lobNmae=homeIntermediaryEntity.getStringValueForField("LOBName");
			String productName1;
			productName1=homeIntermediaryEntity.getStringValueForField("ProductName");
			productName= new MobileScreenElement(By.xpath("//android.view.View[@text='"+productName1+"']"), "Product Icon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			switch (lobNmae) {
			case "MOTOR":
				click(motorIcon);
				click(productName);
				if(homeIntermediaryEntity.getBooleanValueForField("ConfigBuyInsurance")) {
					click(buyIssuranceButton);
				}
				if(homeIntermediaryEntity.getBooleanValueForField("ConfigRenewExistingPolicy")) {
					click(renewExistingPolicyButton);
				}
				break;
			case "HEALTH":
				click(healthIcon);
				click(productName);
				if(homeIntermediaryEntity.getBooleanValueForField("ConfigContinueButton")) {
					/*scrollToElementForward();
					scrollToElementForward();*/
					scrollDown();
					/*scrollDown();*/
					click(continueButton);
				}
				break;
			case "HOME AND ACCIDENT":
				click(homeAndAccidentIcon);
				click(productName);
				if(homeIntermediaryEntity.getBooleanValueForField("ConfigContinueButton")) {
					click(BuyNowButton);
					click(continueButton);
				}

				break;
			}
		}

	}

	public void clickOnLocatorButton(HomeIntermediaryEntity homeIntermediaryEntity,CustomAssert  assertReference  ){
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigLocator")){
			click(locatorLabel);
		}

	}
	public  void ClickOnManagePolicyIcon(HomeIntermediaryEntity homeIntermediaryEntity) {
		if(homeIntermediaryEntity.getAction().equalsIgnoreCase("add")||homeIntermediaryEntity.getAction().equalsIgnoreCase("edit")){
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigManagePolicyIcon")) {
				click(managePoliciesLabel);
				if(homeIntermediaryEntity.getBooleanValueForField("ConfigPolicyNumber")){
					//clearAndSendKeys(policyNumberTextfield, homeIntermediaryEntity.getStringValueForField("PolicyNumber"));
				}
			}
		}
	}
	public  void ClickOnProfileUpdateIcon(HomeIntermediaryEntity homeIntermediaryEntity) throws Exception {
		if(homeIntermediaryEntity.getAction().equalsIgnoreCase("add")||homeIntermediaryEntity.getAction().equalsIgnoreCase("edit")){
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigProfileUpdateIcon")) {
				click(profileUpdateLabel);
				if(homeIntermediaryEntity.getBooleanValueForField("ConfigChangePassword")){
					if(homeIntermediaryEntity.getBooleanValueForField("ConfigFirstName")){
						clearAndSendKeys(firstNameTextfield, homeIntermediaryEntity.getStringValueForField("FirstName"));
					}
					if(homeIntermediaryEntity.getBooleanValueForField("ConfigLastName")){
						clearAndSendKeys(lastNameTextfield, homeIntermediaryEntity.getStringValueForField("LastName"));
					}
					click(changePasswordButton);
					if(homeIntermediaryEntity.getBooleanValueForField("ConfigOldPassword")){
						clearAndSendKeys(oldPasswordTextfield, homeIntermediaryEntity.getStringValueForField("OldPassword"));
					}
					if(homeIntermediaryEntity.getBooleanValueForField("ConfigNewPassword")){
						clearAndSendKeys(newPasswordTextfield, homeIntermediaryEntity.getStringValueForField("NewPassword"));
					}
					if(homeIntermediaryEntity.getBooleanValueForField("ConfigConfirmPassword")){
						clearAndSendKeys(confirmPasswordTextfield, homeIntermediaryEntity.getStringValueForField("ConfirmPassword"));
						click(submitButton);
					}
				}
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigStreet")){
				clearAndSendKeys(streetTextfield, homeIntermediaryEntity.getStringValueForField("Street"));
			}
			
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigPincode")){
				clearAndSendKeys(pincodeTextfield, homeIntermediaryEntity.getStringValueForField("Pincode"));
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigLandline")){
				clearAndSendKeys(landlineTextfield, homeIntermediaryEntity.getStringValueForField("Landline"));
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigMobileNumberProfile")){
				clearAndSendKeys(mobileNumberTextfield, homeIntermediaryEntity.getStringValueForField("MobileNumberProfile"));
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigEmailIdProfileUpdate")){
				scrollDown();
				clearTextField(emailIdTextfield);
				Thread.sleep(500);
				sendKeys(emailIdTextfield, homeIntermediaryEntity.getStringValueForField("EmailIdProfileUpdate"));
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigBranchCode")){
				clearAndSendKeys(branchCodeTextfield, homeIntermediaryEntity.getStringValueForField("BranchCode"));
			}
		}
	}

	public void clickOnSave(HomeIntermediaryEntity homeIntermediaryEntity,CustomAssert assertReference) throws InterruptedException{
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigSave")){
			click(saveButton);
			Thread.sleep(2000);
			//click(ok);
		}
	}

	public void clickOnContactUsButton(HomeIntermediaryEntity homeIntermediaryEntity,CustomAssert  assertReference  ){
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigContactUsButton")){
			click(contactUsLabel);
		}

	}


	public void verifyHomeIntermediary(HomeIntermediaryEntity homeIntermediaryEntity,CustomAssert assertReference ) throws InterruptedException{
		if(homeIntermediaryEntity.getAction().equalsIgnoreCase("verify")) {
			/*if(homeIntermediaryEntity.getBooleanValueForField("ConfigProfileSucessMsg")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("ProfileSucessMsg"), fetchValueFromFields(profileSucessMsgLabel), AssertionType.WARNING);
			}*/
			
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigInterWelcomeMessage")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("InterWelcomeMessage"), fetchValueFromFields(welcomeMsgInterLabel), AssertionType.WARNING);
			}

			if(homeIntermediaryEntity.getBooleanValueForField("ConfigApdBalanceLabel")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("ApdBalanceLabel"), fetchValueFromFields(apdBalanceLabel), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigBuyNowLabel")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("BuyNowLabel"), fetchValueFromFields(buyNowLabel), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigQuickRenewalsPaymentsLabel")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("QuickRenewalsPaymentsLabel"), fetchValueFromFields(quickRenewalsLabel), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigProfileUpdateLabel")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("ProfileUpdateLabel"), fetchValueFromFields(profileUpdateLabel), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigManagePoliciesLabel")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("ManagePoliciesLabel"), fetchValueFromFields(managePoliciesLabel), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigManageRenewalsLabel")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("ManageRenewalsLabel"), fetchValueFromFields(manageRenewalsLabel), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigManageClaimLabel")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("ManageClaimLabel"), fetchValueFromFields(manageClaimsLabel), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigLocatorLabel")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("LocatorLabel"), fetchValueFromFields(locatorLabel), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigAppointmentLabel")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("AppointmentLabel"), fetchValueFromFields(appointmentLabel), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigContactUsLabel")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("ContactUsLabel"), fetchValueFromFields(contactUsLabel), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigProductListLabel")){
				scrollDown();
				scrollDown();
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("ProductListLabel"), fetchValueFromFields(productListLabel), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigUploadPhotoLabel")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("UploadPhotoLabel"), fetchValueFromFields(uploadPhotoLabel), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigRegNumSearch")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("RegNumSearch"), fetchValueFromFields(regNumSearchLabel), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigLocatorTitle")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("LocatorTitle"), fetchValueFromFields(locatorTitleLabel), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigProfileSucessMsg")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("ProfileSucessMsg"), fetchValueFromFields(profileSuccessMsgLabel), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigChat")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("Chat"), fetchValueFromFields(chatbutton), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigCallMe")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("CallMe"), fetchValueFromFields(callMebutton), AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigThankYou")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("ThankYou"),fetchValueFromFields(thankYouLabel),AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigErrorPopUpMsg")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("ErrorPopUpMsg"),fetchValueFromFields(errorMsgLabel),AssertionType.WARNING);
			}
		}
	}
	public void clickOnLogout(HomeIntermediaryEntity homeIntermediaryEntity,CustomAssert assertReference) throws InterruptedException{
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigLogout")){
			/*TouchAction action= new TouchAction(driver);
			action.press(PointOption.point(1341, 210));*/
			click(logoutIcon);
			Thread.sleep(2000);
			click(okButton);
		}
	}

	public void HomePageDetails(HomeIntermediaryEntity homeIntermediaryEntity,CustomAssert assertReference) {
		if(homeIntermediaryEntity.getAction().equalsIgnoreCase("add")||homeIntermediaryEntity.getAction().equalsIgnoreCase("edit")){
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigName")){
				clearAndSendKeys(nameTextField, homeIntermediaryEntity.getStringValueForField("Name"));
			}

			if(homeIntermediaryEntity.getBooleanValueForField("ConfigEmailID")){
				clearAndSendKeys(emailIdTextfield, homeIntermediaryEntity.getStringValueForField("EmailID"));
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigMobileNo")){
				clearAndSendKeys(mobileTextField, homeIntermediaryEntity.getStringValueForField("MobileNo"));
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigPreferredTime")){
				click(preferedTimeRadioButton);
				/*String time=homeIntermediaryEntity.getStringValueForField("PreferredTime");
				timeRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+time+"'"+"]"), "Gst Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(timeRadioButton);*/
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigDescription")){
				clearAndSendKeys(descriptionTextField, homeIntermediaryEntity.getStringValueForField("Description"));
				scrollToElementForward();
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigMotorIcon")){
				click(motorLabel);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigHomeAndAccidentIcon")){
				click(homeAndAccidentLabel);
			}
		}
		else if(homeIntermediaryEntity.getAction().equalsIgnoreCase("verify")){
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigThankYou")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("ThankYou"),fetchValueFromFields(thankYouLabel),AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigTollFreeNumber")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("TollFreeNumber"),fetchValueFromFields(tollFreeNumberLabel),AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigEmailIdMotor")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("EmailIdMotor"),fetchValueFromFields(emailIdMotorLabel),AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigMotor")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("Motor"),fetchValueFromFields(motorLabel),AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigHealth")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("Health"),fetchValueFromFields(healthLabel),AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigTravel")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("Travel"),fetchValueFromFields(travelLabel),AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigHomeAndAccident")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("HomeAndAccident"),fetchValueFromFields(homeAndAccidentLabel),AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigHomeAndAccident")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("HomeAndAccident"),fetchValueFromFields(homeAndAccidentLabel),AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigTwoWheeler")){
				click(motorLabel);
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("TwoWheeler"),fetchValueFromFields(twoWheelerLabel),AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigGrihaSuvidha")){
				click(homeAndAccidentLabel);
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("GrihaSuvidha"),fetchValueFromFields(grihaSuvidhaLabel),AssertionType.WARNING);
			}
			
			
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigProductNamePolicy")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("ProductNamePolicy"),fetchValueFromFields(productNameLabel),AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigPolicyHolder")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("PolicyHolder"),fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigStartDateEndDate")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("StartDateEndDate"),fetchValueFromFields(startDateendDateLabel),AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigPolicyStatus")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("PolicyStatus"),fetchValueFromFields(policyStatusLabel),AssertionType.WARNING);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigPasswordChangedSuccessfully")){
				assertReference.assertEquals(homeIntermediaryEntity.getStringValueForField("PasswordChangedSuccessfully"),fetchValueFromFields(passwordChangedSuccessfullyLabel),AssertionType.WARNING);
			}
			
			
		}
	}
	public void clickOnCallMeButton(HomeIntermediaryEntity homeIntermediaryEntity,CustomAssert assertReference) {
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigCallMeButton")){
			click(callMebutton);
		}
	}
	public void clickOnSubmitButton(HomeIntermediaryEntity homeIntermediaryEntity,CustomAssert assertReference) {
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigSubmit")){
			click(submitButton);
		}
	}
	public void clickOnManageRenewalsButton(HomeIntermediaryEntity homeIntermediaryEntity,CustomAssert assertReference) {
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigManageRenewals")){
			click(manageRenewalsLabel);
		}
	}
	public void clickOnQuickRenewalButton(HomeIntermediaryEntity homeIntermediaryEntity,CustomAssert assertReference) {
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigQuickRenwalButton")){
			click(quickRenewalsLabel);
		}
	}
	public void clickOnManagePoliciesQuotesButton(HomeIntermediaryEntity homeIntermediaryEntity,CustomAssert assertReference) {
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigManagePoliciesQuotes")){
			click(managePoliciesLabel);
		}
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigSearchBy")){
			click(searchByDropDown);
			String time=homeIntermediaryEntity.getStringValueForField("SearchBy");
			quoteNoRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+time+"'"+"]"), "Gst Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			click(quoteNoRadioButton);
		}
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigQuoteNoTextField")){
			clearAndSendKeys(quoteNoTextField, homeIntermediaryEntity.getStringValueForField("QuoteNoTextField"));
			TouchAction action1 = new TouchAction(driver);
			action1.press(PointOption.point(1293,538)).release().perform();
		}
		
	}
	public void clickOnManageClaimsButton(HomeIntermediaryEntity homeIntermediaryEntity,CustomAssert assertReference) throws InterruptedException {
		if(homeIntermediaryEntity.getAction().equalsIgnoreCase("add")||homeIntermediaryEntity.getAction().equalsIgnoreCase("edit")){
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigManageClaimsButton")){
			click(manageClaimsLabel);
		}
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigCliamsQuoteNoTextField")){
			clearAndSendKeys(claimQuoteNoTextField, homeIntermediaryEntity.getStringValueForField("CliamsQuoteNo"));
			Thread.sleep(2000);
			TouchAction action1 = new TouchAction(driver);
			action1.press(PointOption.point(1223,537)).release().perform();
		
			click(claimDetails);
		}
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigUploadDocument")){
			click(uploadDucumenetButton);
			Thread.sleep(2000);
		}
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigClaimForm")){
			click(claimFormAddButton);
			Thread.sleep(2000);
			click(galleryButton);
			TouchAction action3 = new TouchAction(driver);
			action3.press(PointOption.point(400,727)).release().perform();
			Thread.sleep(2000);
			scrollDown();
		}
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigRegistrationCertificate")){
			click(registerCertificationAddButton);
			Thread.sleep(2000);
			click(galleryButton);
			TouchAction action3 = new TouchAction(driver);
			action3.press(PointOption.point(400,727)).release().perform();
			Thread.sleep(2000);
			scrollDown();
		}
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigDrivingLicense")){
			click(drivingLicenceAddButton);
			Thread.sleep(2000);
			click(galleryButton);
			TouchAction action3 = new TouchAction(driver);
			action3.press(PointOption.point(400,727)).release().perform();
			Thread.sleep(2000);
			scrollDown();
		}
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigUpload")){
			click(uploadButton);
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='Upload']")));
			click(backArrowIcon);
		}
		
		if(homeIntermediaryEntity.getBooleanValueForField("ConfigViewDocument")){
			click(viewDocumentButton);
		}
		}
		if(homeIntermediaryEntity.getAction().equalsIgnoreCase("verify")) {
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigViewDocument")){
				click(viewDocumentButton);
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigClaimForm")){
				if(homeIntermediaryEntity.getBooleanValueForField("ConfigAssert")){
					String str = fetchValueFromFields(claimFormJpgLabel);
					assertReference.customLogger("Verify Chat: "+str, !str.equals(""),AssertionType.WARNING);		
								}
				//homeIntermediaryEntity.setStringValueForField("ClaimForm", fetchValueFromFields(claimFormJpgLabel));
				scrollDown();
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigRegistrationCertificate")){
				if(homeIntermediaryEntity.getBooleanValueForField("ConfigAssert1")){
					String str = fetchValueFromFields(registerCertificationLabel);
					assertReference.customLogger("Verify Chat: "+str, !str.equals(""),AssertionType.WARNING);
				}
					//homeIntermediaryEntity.setStringValueForField("RegistrationCertificate", fetchValueFromFields(registerCertificationLabel));
				scrollDown();
			}
			if(homeIntermediaryEntity.getBooleanValueForField("ConfigDrivingLicense")){
				
				if(homeIntermediaryEntity.getBooleanValueForField("ConfigAssert2")){
					String str = fetchValueFromFields(drivingLicenceLabel);
					assertReference.customLogger("Verify Chat: "+str, !str.equals(""),AssertionType.WARNING);
				}
				//homeIntermediaryEntity.setStringValueForField("DrivingLicense", fetchValueFromFields(drivingLicenceLabel));
				scrollDown();
			}
			
		}
		
	}
	

	public  void fillAndSubmitHomeIntermediaryPage(HomeIntermediaryEntity homeIntermediaryEntity,CustomAssert assertReference,String stepGroup) throws Exception {
		ClickBuyNowIcon(homeIntermediaryEntity);
		clickOnManageClaimsButton(homeIntermediaryEntity, assertReference);
		//scrollDown();
		clickOnQuickRenewalButton(homeIntermediaryEntity, assertReference);
		ClickProductIcons(homeIntermediaryEntity);
		clickOnLogout(homeIntermediaryEntity, assertReference);
		clickOnContactUsButton(homeIntermediaryEntity, assertReference);
		clickOnCallMeButton(homeIntermediaryEntity, assertReference);
		HomePageDetails(homeIntermediaryEntity, assertReference);
		clickOnLocatorButton(homeIntermediaryEntity, assertReference);
		clickOnSubmitButton(homeIntermediaryEntity, assertReference);
		ClickOnProfileUpdateIcon(homeIntermediaryEntity);
		clickOnSave(homeIntermediaryEntity, assertReference);
		verifyHomeIntermediary(homeIntermediaryEntity, assertReference);
		clickOnManageRenewalsButton(homeIntermediaryEntity, assertReference);
		clickOnManagePoliciesQuotesButton(homeIntermediaryEntity, assertReference);
		

	}

}
