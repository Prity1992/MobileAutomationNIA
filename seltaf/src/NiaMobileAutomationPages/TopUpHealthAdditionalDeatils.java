package NiaMobileAutomationPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.HealthAddDetailEntity;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TopUpHealthAdditionalDeatils extends MobileScreen {

	MobileScreenElement relationshipWithUserDropDown;
	MobileScreenElement relationshipWithregisteredusertext;
	MobileScreenElement relationshipWithregistereduservalue;
	MobileScreenElement firstNameTextField;
	MobileScreenElement middleNameTextField;
	MobileScreenElement lastNameTextField;
	MobileScreenElement maleRadioButton;
	MobileScreenElement femaleRadioButton;
	MobileScreenElement dobTextField;
	MobileScreenElement buildingNumberTextField;
	MobileScreenElement localityTextField;
	MobileScreenElement gstRegistrationIdTypeDropDown;
	MobileScreenElement gstinTextField;
	MobileScreenElement stateTextField;
	MobileScreenElement pinCodeTextField;
	MobileScreenElement cityTextField;
	MobileScreenElement mobileNumberTextField;
	MobileScreenElement landlineNumberTextField;
	MobileScreenElement emailIdTextField;
	MobileScreenElement panNoTextField;
	MobileScreenElement eInsuranceAccountNoTxtField;
	//Done
	MobileScreenElement memberInformationMaximize;
	MobileScreenElement proposerDetailsButton;
	MobileScreenElement spouseDetailsButton;
	MobileScreenElement proposerNameTextField;
	MobileScreenElement proposerOccupationDropDown;
	MobileScreenElement proposerMaleRadioButton;
	MobileScreenElement proposerFemaleRadioButton;
	MobileScreenElement spouseNameTextField;
	MobileScreenElement spouseOccupationDropDown;
	MobileScreenElement spouseMaleRadioButton;
	MobileScreenElement spouseFemaleRadioButton;
	MobileScreenElement nomineeDetailsMaximize;
	MobileScreenElement nomimeeNameTextField;
	MobileScreenElement relationshipWithNomineeDropDown;
	MobileScreenElement backLink;
	MobileScreenElement viewBreakUpLink;
	MobileScreenElement saveAndContinueButton;
	//summary details
	MobileScreenElement quoteNumberLabel;
	MobileScreenElement estimatedPremiumLabel;
	MobileScreenElement sumInsuredLabel;
	MobileScreenElement gstLabel;
	MobileScreenElement numberOfMembersLabel;
	MobileScreenElement netPremiumAmountLabel;
	MobileScreenElement passportNo;
	MobileScreenElement passportExpiryDate;
	MobileScreenElement visaType;
	MobileScreenElement occupation;	
	MobileScreenElement relationRadioButton1;
	MobileScreenElement relationshipWithNomineeRadioButton1;
	MobileScreenElement gstTypeRadioButton1;
	MobileScreenElement proposerOccupationRadioButton1;
	MobileScreenElement stateCodeLink;
	MobileScreenElement pinCodeLink;
	MobileScreenElement okButton;
	MobileScreenElement submitQuoteButton;
	MobileScreenElement proposerNoHealthRadioButton;
	MobileScreenElement proposerYesHealthRadioButton;
	MobileScreenElement spouseNoHealthRadioButton;
	MobileScreenElement spouseYesHealthRadioButton;
	MobileScreenElement travellerDetailsMaximizeButton;
	MobileScreenElement travelMediclaimNoRadioButton;
	MobileScreenElement sourceCodeTextField;
	MobileScreenElement occupationRadiobutton;
	MobileScreenElement travelNomineeDetailsMaximizeButton;
	MobileScreenElement spouseOccupationRadioButton1;
	MobileScreenElement daughterNameTextField;
	MobileScreenElement daughterDetailsButton;
	MobileScreenElement daughterOccupationDropDown;
	MobileScreenElement daughterOccupationRadioButton1;
	MobileScreenElement natureOfIdDropDown;
	MobileScreenElement idNoTextField;
	MobileScreenElement natureOfIdRadioButton1;
	MobileScreenElement browseButton;
	MobileScreenElement picturesButton;
	MobileScreenElement imageButton;
	MobileScreenElement screenshotbutton;
	MobileScreenElement RelationshipwithNomineeDropdowntext;
	MobileScreenElement RelationshipwithNomineeDropdownvalue;
	MobileScreenElement Nomineenameforaccident;
	MobileScreenElement SaveandContinuebutton;
	
	MobileScreenElement addressOfTheBuildingMaximizeButton;
	MobileScreenElement bldgNoTextField;
	MobileScreenElement hAlocalityTextField;
	MobileScreenElement hApinCodeTextField;

	MobileScreenElement pictureIcon;
	MobileScreenElement uploadButton;
	MobileScreenElement additonalCoversMaximize;
	MobileScreenElement noProportionateRadioButton;
	MobileScreenElement noRevisionInCataractRadioButton;
	MobileScreenElement noNoVoluntaryCoPayRadioButton;
	MobileScreenElement menuButton;
	MobileScreenElement proposerDelatilDropdown;
	MobileScreenElement insuredFamilyDelatilDropdown;
	MobileScreenElement spouseOccupationRadioButton2;
    MobileScreenElement relationshipWithNomineeRadioButton2;
	MobileScreenElement relationshipWithNomineeRadioButton3;
	MobileScreenElement galleryOption;
	MobileScreenElement galleryLabel;
	MobileScreenElement doneButton;
	MobileScreenElement proposerDetailsMinimizeButton;

	
	public TopUpHealthAdditionalDeatils(AppiumDriver driver, String screenName, String DeviceOS) {
		super(driver, screenName, DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (DeviceOS.equalsIgnoreCase("Android")) {
			relationshipWithUserDropDown = new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Select' and @index='1']"), "Relationship", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			maleRadioButton = new MobileScreenElement(By.xpath("//android.widget.RadioButton[contains(@resource-id,'gender1')]"), "Gender", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			femaleRadioButton = new MobileScreenElement(By.xpath("//android.widget.RadioButton[contains(@resource-id,'gender2')]"), "Gender", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			gstRegistrationIdTypeDropDown = new MobileScreenElement(By.xpath("//android.view.View[@text='GST Registration ID Type']//following::android.widget.Spinner"), "GST Registration Type", false,WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			memberInformationMaximize = new MobileScreenElement(By.xpath("//android.view.View[@text='Member Information']"), "Member Information", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			proposerOccupationDropDown = new MobileScreenElement(By.xpath("//android.view.View[@text='Select']//following::android.widget.Image[1]"), "Click on Proposer Occupation DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			proposerMaleRadioButton = new MobileScreenElement(By.id("com.nia.customer:id/propGender0"), "Gender", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			proposerFemaleRadioButton = new MobileScreenElement(By.id("com.nia.customer:id/propGender1"), "Gender", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			proposerDetailsButton = new MobileScreenElement(By.xpath("//android.view.View[contains(text(),' Proposer ( ) minimize ')]"), "Proposer minimize", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			spouseDetailsButton = new MobileScreenElement(By.xpath("//android.view.View[@text =' Spouse minimize ' and @index='0']"), "Spouse minimize", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			proposerMaleRadioButton = new MobileScreenElement(By.id("com.nia.customer:id/spousegender0"), "Gender", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			proposerFemaleRadioButton = new MobileScreenElement(By.id("com.nia.customer:id/spousegender1"), "Gender", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			nomineeDetailsMaximize = new MobileScreenElement(By.xpath("//android.view.View[@text='Nominee Details ']"), "Nominee Details DropDown", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			
			
			spouseOccupationDropDown = new MobileScreenElement(By.xpath("//android.view.View[@text='Spouse']//following::android.widget.Image[1]"), "Spouse Occupation DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			spouseMaleRadioButton = new MobileScreenElement(By.id("spousegender0"), "Spouse Gender Male", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			spouseFemaleRadioButton = new MobileScreenElement(By.id("spousegender1"), "Spouse Gender Female", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			relationshipWithNomineeDropDown = new MobileScreenElement(By.xpath("//android.view.View[@text='Relationship with Nominee*']//following::android.widget.Spinner[1]"), "Relationship With Nominee DropDown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			
			backLink = new MobileScreenElement(By.xpath("//android.view.View[@text=' Back']"), "Back Line", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			viewBreakUpLink = new MobileScreenElement(By.xpath("//android.view.View[@text='View Breakup']"), "View Break Up Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			saveAndContinueButton = new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save & Calculate Premium']"), "Save And Continue Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			passportNo = new MobileScreenElement(By.xpath("//android.view.View[@text='Passport Number*']//following::android.widget.EditText[1]"), "Passport No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			passportExpiryDate = new MobileScreenElement(By.xpath("//android.view.View[@text='Passport Expiry Date*']//following::android.widget.EditText[1]"), "Passport Expiry Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			visaType = new MobileScreenElement(By.xpath("//android.view.View[@text='Visa Type*']//following::android.widget.EditText[1]"), "Visa Type", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			occupation = new MobileScreenElement(By.xpath("//android.view.View[@text='Occupation*']//following::android.widget.Spinner[1]"), "Occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			firstNameTextField = new MobileScreenElement(By.xpath("//android.view.View[@text='First Name']//following::android.widget.EditText"), "First Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			middleNameTextField = new MobileScreenElement(By.xpath("//android.view.View[@text='Middle Name']//following::android.widget.EditText"), "Middle Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			lastNameTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Last Name']//following::android.widget.EditText"), "Last Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			dobTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Date of Birth (dd/mm/yyyy)']//following::android.widget.EditText"), "DOB", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			localityTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Locality']//following::android.widget.EditText"), "Locality", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			buildingNumberTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Building No., Street']//following::android.widget.EditText"), "Building No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			gstinTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='GSTIN']//following::android.widget.EditText"), "GSTIN", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			stateTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='State']//following::android.widget.EditText"), "State", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			pinCodeTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='PIN Code']//following::android.widget.EditText"), "PIN Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			cityTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='City']//following::android.widget.EditText"), "City", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			mobileNumberTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Mobile No.']//following::android.widget.EditText"), "Mobile No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			landlineNumberTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Landline No.']//following::android.widget.EditText"), "Landline No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			emailIdTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Email ID']//following::android.widget.EditText"), "Email ID", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			panNoTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='PAN No.']//following::android.widget.EditText"), "PAN No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			eInsuranceAccountNoTxtField= new MobileScreenElement(By.xpath("//android.view.View[@text='E-Insurance account No.']//following::android.widget.EditText"), "E-Insurance account No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			proposerNameTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Name']//following::android.widget.EditText"), "Proposer Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			nomimeeNameTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Nominee Name*']//following::android.widget.EditText[1]"), "Fill in the Nominee Name in text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			stateCodeLink= new MobileScreenElement(By.xpath("//android.view.View[@text='MAHARASHTRA']"), "State Code Link", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);	
			pinCodeLink = new MobileScreenElement(By.xpath("//android.view.View[@text='401209']"), "Pin Code", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			okButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='OK']"), "Click on Ok Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			submitQuoteButton =new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit Quote']"), "Cick on Submit Quote button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			/*quoteNumberLabel = new MobileScreenElement(By.xpath("//android.view.View[@content-desc='Quote No.:8300001810002747Estimated Premium:3,690.00 Or @index='0']"), "Quote Number Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			sumInsuredLabel = new MobileScreenElement(By.xpath("//android.view.View[@content-desc='Sum Insured:500,000.00Goods & Services Tax (GST):664.00' Or @index='1']"), "Sum Insured Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			numberOfMembersLabel = new MobileScreenElement(By.xpath("//android.view.View[@content-desc='No.of.Members:4Net Premium:4,354.00']"), "Number Of Members", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			 */
			spouseNameTextField=new MobileScreenElement(By.xpath("//android.view.View[@text ='Spouse']//following::android.widget.EditText[1]"), "Spouse Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			/*submitQuoteButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit Quote']"), "Submit Quote", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			submitQuoteButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit Quote']"), "Submit Quote", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			submitQuoteButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit Quote']"), "Submit Quote", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			submitQuoteButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit Quote']"), "Submit Quote", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);*/
			//Travel
			travellerDetailsMaximizeButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Traveller Details ']"), "Traveller Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			travelMediclaimNoRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text='  No']"), "Do you have mediclaim 2007 policy with New India", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			daughterNameTextField= new MobileScreenElement(By.xpath("//android.view.View[@text ='Daughter 1']//following::android.widget.EditText[1]"), "Fill in the Daughter name in text field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			daughterDetailsButton = new MobileScreenElement(By.xpath("//android.view.View[@text=' Daughter1 minimize ' and @index='0']"), "Daughter minimize", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			daughterOccupationDropDown = new MobileScreenElement(By.xpath("//android.view.View[@text='Select']//following::android.widget.Image[1]"), "Click on Daughter Occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			natureOfIdDropDown =  new MobileScreenElement(By.xpath("//android.view.View[@text='Select']//following::android.widget.Image[1]"), "Nature Of Id Occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			idNoTextField =  new MobileScreenElement(By.xpath("//android.view.View[@text='ID Doc Number*']//following::android.widget.EditText[1]"), "Nature Of Id Occupation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			browseButton = new MobileScreenElement(By.xpath("//android.widget.Image[@text='Camera']"), "Click Here", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			picturesButton = new MobileScreenElement(By.xpath("//android.widget.LinearLayout[@index='2']"), "Images", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			imageButton = new MobileScreenElement(By.xpath("//android.widget.TextView[@text='Screenshots']"), "Image", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			//pictureIcon = new MobileScreenElement(By.xpath("//android.widget.TextView[@text='Oct 12']"), "Image Icon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			screenshotbutton=new MobileScreenElement(By.xpath("//android.widget.FrameLayout[@index='0']"),"Images",false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			//pictureIcon = new MobileScreenElement(By.xpath("//android.widget.TextView[@text='Oct 12']"), "Image Icon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); @text='Screenshots' and
			pictureIcon = new MobileScreenElement(By.xpath("//android.view.View[@text='PICTURES']//following::com.sec.samsung.gallery.glview.composeView.ThumbObject[@index='1']"), "Image Icon", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		    uploadButton  = new MobileScreenElement(By.xpath("//android.widget.Button[@text='Upload' and @index='0']"), "Upload Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			additonalCoversMaximize = new MobileScreenElement(By.xpath("//android.view.View[@text='Additional Coversno errors icon']"), "Additional Covers", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			sourceCodeTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Preferred Business Source Code']//following::android.widget.EditText"), "Preferred Business Source Code", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			travelNomineeDetailsMaximizeButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Nominee Details ']"), "Nominee Details Maximize", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		    addressOfTheBuildingMaximizeButton = new MobileScreenElement(By.xpath("//android.view.View[@text='Address of the Building to be Insured error icon 3 mandatory fields pending' and @index='0']"), "Address of the Building to be Insured", false,WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			bldgNoTextField = new MobileScreenElement(By.xpath("//android.view.View[@text='Building No., Street' and @index='0']//following::android.widget.EditText"), "Building No., Street", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			hAlocalityTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='Locality' and @index='0']//following::android.widget.EditText"), "Locality", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			hApinCodeTextField=new MobileScreenElement(By.xpath("//android.view.View[@text='PIN Code' and @index='0']//following::android.widget.EditText"), "PIN Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		    relationshipWithregisteredusertext=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Select']"), "Relationship with", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			relationshipWithregistereduservalue= new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text='Self']"), "Son", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			RelationshipwithNomineeDropdowntext= new MobileScreenElement(By.xpath("//android.view.View[@text='Relationship with Nominee']//following::android.widget.Spinner[1]"), "Spouse Occupation", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			RelationshipwithNomineeDropdownvalue=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text='Son']"), "Son", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			Nomineenameforaccident=new MobileScreenElement(By.xpath("//android.view.View[@text='Nominee Name']/following::android.widget.EditText[1]"), "name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			SaveandContinuebutton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save & Continue']"), "Save & Continue", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
            noProportionateRadioButton = new MobileScreenElement(By.xpath("//android.widget.RadioButton[@id='proportionateDeduction1']"), "No Proportionate Deduction", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			noRevisionInCataractRadioButton = new MobileScreenElement(By.xpath("//android.widget.RadioButton[@id='cataractLimit1']"), "Revision In Cataract Limit", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			noNoVoluntaryCoPayRadioButton = new MobileScreenElement(By.xpath("//android.widget.RadioButton[@id='voluntaryCopay1']"), "Voluntary Co Pay", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			menuButton  = new MobileScreenElement(By.xpath("//android.widget.ImageButton[@index='0']"), "Menu", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			proposerDelatilDropdown= new MobileScreenElement(By.xpath("//android.view.View[@text='Proposer Details']//following::android.widget.Image[1]"), "Click on Proposer Detail DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			insuredFamilyDelatilDropdown= new MobileScreenElement(By.xpath("//android.view.View[@text='Your Insured Family Details ']//following::android.widget.Image[2]"), "Click on Insured Family DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			galleryOption= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Gallery']"), "Click on Gallery Option", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			galleryLabel= new MobileScreenElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1']"), "Click on Gallery Option", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			doneButton= new MobileScreenElement(By.xpath("//android.widget.TextView[@text='DONE']"),"Done Button", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			proposerDetailsMinimizeButton= new MobileScreenElement(By.xpath("//android.view.View[@text='Proposer Details']"),"Proposer Detail Drop Down", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		}
	}

	public void fillTopUpHealthAdditionalDeatils(HealthAddDetailEntity healthAddDetailEntity,CustomAssert assertReference) throws InterruptedException {
		if((healthAddDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Health"))) {
		if (healthAddDetailEntity.getAction().equalsIgnoreCase("add") || healthAddDetailEntity.getAction().equalsIgnoreCase("edit")) {
			if(healthAddDetailEntity.getStringValueForField("Product").equalsIgnoreCase("New India AshaKiran")) {
			click(proposerDelatilDropdown);
			
			
			}
			/*List<MobileScreenElement> inputs = driver.findElements(By.xpath("android.widget.EditText"));
			firstNameTextField = inputs.get(0);
			middleNameTextField = inputs.get(1);
			lastNameTextField = inputs.get(2);
			dobTextField = inputs.get(3);
			localityTextField = inputs.get(4);
			buildingNumberTextField = inputs.get(5);
			gstinTextField = inputs.get(6);
			stateTextField = inputs.get(7);
			pinCodeTextField = inputs.get(8);
			cityTextField = inputs.get(9);
			mobileNumberTextField = inputs.get(10);
			landlineNumberTextField = inputs.get(11);
			emailIdTextField = inputs.get(12);
			panNoTextField = inputs.get(13);
			eInsuranceAccountNoTxtField = inputs.get(14);
			//shirisha
			proposerNameTextField = inputs.get(15);
			spouseNameTextField = inputs.get(16);
			nomimeeNameTextField = inputs.get(17);*/

			if (healthAddDetailEntity.getBooleanValueForField("ConfigRelationshipWithUser")) {
				click(relationshipWithUserDropDown);
 				String relation=healthAddDetailEntity.getStringValueForField("RelationshipWithUser");
				relationRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+relation+"'"+"]"), "Relation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(relationRadioButton1);
				click(okButton);
				Thread.sleep(2000);
				//System.out.println(healthAddDetailEntity.getStringValueForField("TestScenario"));
				//if (!(healthAddDetailEntity.getStringValueForField("testScenario").equalsIgnoreCase("NIAHome and AccidentMobile_Automation_TC_0002"))) {
							//				try {
							//					String ID =healthAddDetailEntity.getStringValueForField("testScenario");
							//					System.out.println(healthAddDetailEntity.getTestScenario());
							//				} catch (Exception e) {
							//					 System.out.println(e.toString());
							//				}
				if((healthAddDetailEntity.getTestScenario().equalsIgnoreCase("NIAHome and AccidentMobile_Automation_TC_0002")))	{
					click(okButton);
				}
				
				}
				//	selectValueFromList(relationshipWithUserDropDown,healthAddDetailEntity.getStringValueForField("RelationshipWithUser"));
			}
			
			//if (healthAddDetailEntity.getBooleanValueForField("ConfigOkButton")) {
				//click(okButton);
			//}
			
			if (healthAddDetailEntity.getBooleanValueForField("Configpersonaldetailnextpage")) {
				
				
				
			
			}
			
			if (healthAddDetailEntity.getBooleanValueForField("ConfigFirstName")) {
				clearAndSendKeys(firstNameTextField, healthAddDetailEntity.getStringValueForField("FirstName"));
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigMiddleName")) {
				//scrollDown();
				clearAndSendKeys(middleNameTextField, healthAddDetailEntity.getStringValueForField("MiddleName"));
				
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigLastName")) {
				//scrollDown();
				clearAndSendKeys(lastNameTextField, healthAddDetailEntity.getStringValueForField("LastName"));
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigGenderMale")) {
				click(maleRadioButton);
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigGenderFemale")) {
				click(femaleRadioButton);
				scrollDown();
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigBackLink")) {
				click(backLink);
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigViewBreakUpLink")) {
				click(viewBreakUpLink);
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigDOB")) {
				clearAndSendKeys(dobTextField, healthAddDetailEntity.getStringValueForField("DOB"));
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigBuildingNo")) {
				
				clearAndSendKeys(buildingNumberTextField, healthAddDetailEntity.getStringValueForField("BuildingNo"));
			
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigLocality")) {
				clearAndSendKeys(localityTextField, healthAddDetailEntity.getStringValueForField("Locality"));
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigGSTType")) {
				click(gstRegistrationIdTypeDropDown);
				String gstType=healthAddDetailEntity.getStringValueForField("GSTType");
				gstTypeRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+gstType+"'"+"]"), "Gst Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(gstTypeRadioButton1);
				//selectValueFromList(gstRegistrationIdTypeDropDown,healthAddDetailEntity.getStringValueForField("GSTType"));
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigGstinNumber")) {
				clearAndSendKeys(gstinTextField, healthAddDetailEntity.getStringValueForField("GstinNumber"));
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigState")) {
				//scrollDown();
				
				clearAndSendKeys(stateTextField, healthAddDetailEntity.getStringValueForField("State"));
				click(stateCodeLink);
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigPinNumber")) {
				scrollDown();
				clearAndSendKeys(pinCodeTextField, healthAddDetailEntity.getStringValueForField("PinNumber"));
				click(pinCodeLink);
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigCity")) {
				clearAndSendKeys(cityTextField, healthAddDetailEntity.getStringValueForField("City"));
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigMobileNumber")) {
				clearAndSendKeys(mobileNumberTextField, healthAddDetailEntity.getStringValueForField("MobileNumber"));
				scrollDown();
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigLandline")) {
				scrollDown();
				clearAndSendKeys(landlineNumberTextField, healthAddDetailEntity.getStringValueForField("Landline"));
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigEmailId")) {
				clearAndSendKeys(emailIdTextField, healthAddDetailEntity.getStringValueForField("EmailId"));
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigPanNumber")) {
				clearAndSendKeys(panNoTextField, healthAddDetailEntity.getStringValueForField("PanNumber"));
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigEinsuranceAccNumber")) {
				clearAndSendKeys(eInsuranceAccountNoTxtField, healthAddDetailEntity.getStringValueForField("EinsuranceAccNumber"));
			}
			if (healthAddDetailEntity.getBooleanValueForField("ConfigMemberInformation")) {
				
				click(proposerDelatilDropdown);
	
				click(insuredFamilyDelatilDropdown);
				if (healthAddDetailEntity.getBooleanValueForField("ConfigProposer")) {
					//click(proposerDetailsButton);
					if (healthAddDetailEntity.getBooleanValueForField("ConfigProposerName")) {
						clearAndSendKeys(proposerNameTextField, healthAddDetailEntity.getStringValueForField("ProposerName"));
					}
					if (healthAddDetailEntity.getBooleanValueForField("ConfigProposerOccupation")) {
						click(proposerOccupationDropDown);
						String proposerOccupation=healthAddDetailEntity.getStringValueForField("ProposerOccupation");
						proposerOccupationRadioButton1=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+proposerOccupation+"'"+"]"), "Proposer Occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
						click(proposerOccupationRadioButton1);
						click(okButton);
						scrollDown();
						//selectValueFromList(proposerOccupationDropDown, healthAddDetailEntity.getStringValueForField("ProposerOccupation"));
					}
					if (healthAddDetailEntity.getBooleanValueForField("ConfigProposerGenderMale")) {
						clearAndSendKeys(proposerMaleRadioButton, healthAddDetailEntity.getStringValueForField("ProposerGenderMale"));
					}
					if (healthAddDetailEntity.getBooleanValueForField("ConfigProposerGenderFemale")) {
						clearAndSendKeys(proposerFemaleRadioButton, healthAddDetailEntity.getStringValueForField("ProposerGenderFemale"));
					}
					if (healthAddDetailEntity.getBooleanValueForField("ConfigProposerHealthPolYes")) {
						clearAndSendKeys(proposerFemaleRadioButton, healthAddDetailEntity.getStringValueForField("ProposerHealthPolYes"));
					}
					if (healthAddDetailEntity.getBooleanValueForField("ConfigProposerHealthPolNo")) {
						clearAndSendKeys(proposerFemaleRadioButton, healthAddDetailEntity.getStringValueForField("ProposerHealthPolNo"));
					}
					if((healthAddDetailEntity.getStringValueForField("Product").equalsIgnoreCase("New India Mediclaim")||healthAddDetailEntity.getStringValueForField("Product").equalsIgnoreCase("New India Premier Mediclaim"))) {
						if (healthAddDetailEntity.getBooleanValueForField("ConfigNatureOfId")) {
							click(natureOfIdDropDown);
							String natureOdId=healthAddDetailEntity.getStringValueForField("NatureOfId");
							natureOfIdRadioButton1=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+natureOdId+"'"+"]"), "Nature Of Id", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
							click(natureOfIdRadioButton1);
							click(okButton);
						}
						
						if (healthAddDetailEntity.getBooleanValueForField("ConfigIdNo")) {
							clearAndSendKeys(idNoTextField, healthAddDetailEntity.getStringValueForField("IdNo"));
						}	
						if (healthAddDetailEntity.getBooleanValueForField("ConfigBrowse")) {
							click(browseButton);
							click(galleryOption);
							click(galleryLabel);
							/*driver.context("NATIVE_APP");*/
							//click(menuButton);
							//click(picturesButton);
							//click(screenshotbutton);
							//click(imageButton);
							
							/*TouchAction touchAction = new TouchAction(driver);
						    touchAction.longPress(PointOption.point(0, 40)).moveTo(PointOption.point(0, 80)).release();   \"com.android.documentsui:id/date\"
						    driver.performTouchAction(touchAction);
						   //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(Apr 10).resourceId(\\\"com.android.documentsui:id/date\\\")"));
						     /*driver.findElement(MobileBy.AndroidUIAutomator(
					                "new UiSelector().resourceId(\"com.snapdeal.main:id/icon\").instance(0)")).click();*/
						//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"_TAGS_\"));");
							TouchAction action=new TouchAction(driver);
							action.press(PointOption.point(215,690)).release().perform();
							
							click(doneButton);
							
							//driver.context("CHROMIUM");
							click(uploadButton);
						}
						/*if (healthAddDetailEntity.getBooleanValueForField("ConfigScrollIntoView")) {
						   driver.findElementByXPath("//android.widget.TextView[@text='Apr 10' and @index='0']");
						   click(pictureIcon);

							
							
							
							
							
							
						}*/
						if (healthAddDetailEntity.getBooleanValueForField("ConfigAdditionalCovers")) {
							click(additonalCoversMaximize);
							if (healthAddDetailEntity.getBooleanValueForField("ConfigNoProportionateDeductionRadioButton")) {
								click(noProportionateRadioButton);
							}
							if (healthAddDetailEntity.getBooleanValueForField("ConfigNoRevisionInCataractRadioButton")) {
								click(noRevisionInCataractRadioButton);
							}
							if (healthAddDetailEntity.getBooleanValueForField("ConfigNoVoluntaryCoPayRadioButton")) {
								click(noNoVoluntaryCoPayRadioButton);
							}
						}	
						
					}
				}
				if (healthAddDetailEntity.getBooleanValueForField("ConfigSpouse")) {
					if(!healthAddDetailEntity.getTestScenario().equalsIgnoreCase("NIAHealthMobile_Automation_TC_0002")) {
					click(spouseDetailsButton);
					}
					/*if (healthAddDetailEntity.getBooleanValueForField("ConfigSpouseName")) {
						sendKeys(spouseNameTextField, ("SpouseName"));
					}*/
					
					if(healthAddDetailEntity.getBooleanValueForField("ConfigSpouse")){
						/*click(spouseNameTextField);	
						sendKeys(spouseNameTextField,  healthAddDetailEntity.getStringValueForField("SpouseName"));*/
					clearAndSendKeys(spouseNameTextField, healthAddDetailEntity.getStringValueForField("SpouseName"));
					}
					
					if (healthAddDetailEntity.getBooleanValueForField("ConfigSpouseOccupation")) {
						//selectValueFromList(spouseOccupationDropDown, healthAddDetailEntity.getStringValueForField("SpouseOccupation"));
						
						click(spouseOccupationDropDown);
						
						
						/*String proposerOccupation=healthAddDetailEntity.getStringValueForField("SpouseOccupation");
						spouseOccupationRadioButton1=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+proposerOccupation+"'"+"]"), "Spouse Occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 20);
						click(spouseOccupationRadioButton1);*/
					
						String proposerOccupation1=healthAddDetailEntity.getStringValueForField("SpouseOccupation1");
						spouseOccupationRadioButton2=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+proposerOccupation1+"'"+"]"), "Spouse Occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 20);
						click(spouseOccupationRadioButton2);
					//	System.out.println(spouseOccupationRadioButton2.getAttribute("value"));
						/*srollToVisibleText(spouseOccupationRadioButton1,healthAddDetailEntity.getStringValueForField("SpouseOccupation"));*/
						click(okButton);
						//selectValueFromList(proposerOccupationDropDown, healthAddDetailEntity.getStringValueForField("ProposerOccupation"));
					}			
					if (healthAddDetailEntity.getBooleanValueForField("ConfigSpouseGenderMale")) {
						clearAndSendKeys(spouseMaleRadioButton, healthAddDetailEntity.getStringValueForField("SpouseGenderMale"));
					}
				
					if (healthAddDetailEntity.getBooleanValueForField("ConfigSpouseGenderFemale")) {
						clearAndSendKeys(spouseFemaleRadioButton, healthAddDetailEntity.getStringValueForField("SpouseGenderFemale"));
					}
					if (healthAddDetailEntity.getBooleanValueForField("ConfigSpouseHealthPolYes")) {
						clearAndSendKeys(proposerFemaleRadioButton, healthAddDetailEntity.getStringValueForField("SpouseHealthPolYes"));
					}
					if (healthAddDetailEntity.getBooleanValueForField("ConfigSpouseHealthPolNo")) {
						clearAndSendKeys(proposerFemaleRadioButton, healthAddDetailEntity.getStringValueForField("SpouseHealthPolNo"));
					}
				}
				
				if (healthAddDetailEntity.getBooleanValueForField("ConfigDaughter")) {
					/*click(daughterDetailsButton);*/
					
					if(healthAddDetailEntity.getBooleanValueForField("ConfigDaughterName")){
						
						clearAndSendKeys(daughterNameTextField,  healthAddDetailEntity.getStringValueForField("DaughterName"));
					}
					
					if (healthAddDetailEntity.getBooleanValueForField("ConfigDaughterOccupation")) {
						//selectValueFromList(spouseOccupationDropDown, healthAddDetailEntity.getStringValueForField("SpouseOccupation"));
						
						click(daughterOccupationDropDown);
						String daughterOccupation=healthAddDetailEntity.getStringValueForField("DaughterOccupation");
						daughterOccupationRadioButton1=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+daughterOccupation+"'"+"]"), "Daughtre's Occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
						click(daughterOccupationRadioButton1);
						click(okButton);
						//selectValueFromList(proposerOccupationDropDown, healthAddDetailEntity.getStringValueForField("ProposerOccupation"));
					}
				}
				
				
				
				
				
			}

			if (healthAddDetailEntity.getBooleanValueForField("ConfigNomineeDetails")) {
				click(nomineeDetailsMaximize);
				if (healthAddDetailEntity.getBooleanValueForField("ConfigNomineeName")) {
					clearAndSendKeys(nomimeeNameTextField, healthAddDetailEntity.getStringValueForField("Nameofthenominee"));
				}
				if (healthAddDetailEntity.getBooleanValueForField("ConfigRelationshipWithNominee")) {
					click(relationshipWithNomineeDropDown);
					if(healthAddDetailEntity.getTestScenario().equalsIgnoreCase("NIAHealthMobile_Automation_TC_0002")) {
						
					String relationshipWithNomineeEndElement=healthAddDetailEntity.getStringValueForField("RelationshipWithNomineeEndElement");
					relationshipWithNomineeRadioButton1=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+relationshipWithNomineeEndElement+"'"+"]"), "Relationship", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					
					String relationshipWithNomineeStartElement=healthAddDetailEntity.getStringValueForField("RelationshipWithNomineeStartElement");
					relationshipWithNomineeRadioButton2=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+relationshipWithNomineeStartElement+"'"+"]"), "Relationship", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					
					scrollUp(relationshipWithNomineeRadioButton2,relationshipWithNomineeRadioButton1);
					
					click(okButton);
					}
					else{
						String relationshipWithNomineeStartElement=healthAddDetailEntity.getStringValueForField("RelationshipWithNomineeStartElement");
						relationshipWithNomineeRadioButton1=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+relationshipWithNomineeStartElement+"'"+"]"), "Relationship", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
						click(relationshipWithNomineeRadioButton1);
						click(okButton);
					}
					}
					
					/*click(saveAndContinueButton);
					Thread.sleep(2000);
					click(submitQuoteButton);*/


					//selectValueFromList(relationshipWithNomineeDropDown,healthAddDetailEntity.getStringValueForField("relationshipWithNomineeDropDown"));
				}

			}
		
	}
	

	public void fillTravelAdditionalDeatils(HealthAddDetailEntity healthAddDetailEntity,CustomAssert assertReference) throws InterruptedException {
		if((healthAddDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Travel"))) {
			if (healthAddDetailEntity.getAction().equalsIgnoreCase("add") || healthAddDetailEntity.getAction().equalsIgnoreCase("edit")) {
				if (healthAddDetailEntity.getBooleanValueForField("ConfigTravellerDetails")) {
					click(proposerDetailsMinimizeButton);
					click(travellerDetailsMaximizeButton);
				}
				if (healthAddDetailEntity.getBooleanValueForField("ConfigPassportNo")) {
					clearAndSendKeys(passportNo, healthAddDetailEntity.getStringValueForField("PassportNo"));
				}
				if (healthAddDetailEntity.getBooleanValueForField("ConfigPassportExpiryDate")) {
					clearAndSendKeys(passportExpiryDate, healthAddDetailEntity.getStringValueForField("PassportExpiryDate"));
				}
				if (healthAddDetailEntity.getBooleanValueForField("ConfigVisaType")) {
					clearAndSendKeys(visaType, healthAddDetailEntity.getStringValueForField("VisaType"));
				}
				if (healthAddDetailEntity.getBooleanValueForField("ConfigOccupation")) {
					click(occupation);
					String Occ=healthAddDetailEntity.getStringValueForField("Occupation");
					occupationRadiobutton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+Occ+"'"+"]"), "Occupation Radio Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(occupationRadiobutton);
					click(okButton);
				}
			}
		}
	}
	public void travelOtherDetails(HealthAddDetailEntity healthAddDetailEntity,CustomAssert assertReference) throws InterruptedException {
		if((healthAddDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Travel"))) {
			if (healthAddDetailEntity.getAction().equalsIgnoreCase("add") || healthAddDetailEntity.getAction().equalsIgnoreCase("edit")) {
				if (healthAddDetailEntity.getBooleanValueForField("ConfigTravelNomineeDetails")) {
					click(travelNomineeDetailsMaximizeButton);
					if (healthAddDetailEntity.getBooleanValueForField("ConfigNomineeName")) {
						clearAndSendKeys(nomimeeNameTextField, healthAddDetailEntity.getStringValueForField("Nameofthenominee"));
					}
					if (healthAddDetailEntity.getBooleanValueForField("ConfigRelationshipWithNominee")) {
						click(relationshipWithNomineeDropDown);
						String relationshipWithNomineeStartElement=healthAddDetailEntity.getStringValueForField("RelationshipWithNomineeStartElement");
						relationshipWithNomineeRadioButton1=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+relationshipWithNomineeStartElement+"'"+"]"), "Relationship", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
						click(relationshipWithNomineeRadioButton1);
						click(okButton);
						//click(travelMediclaimNoRadioButton);
					}
					if (healthAddDetailEntity.getBooleanValueForField("ConfigSourceCode")) {
						clearAndSendKeys(sourceCodeTextField, healthAddDetailEntity.getStringValueForField("SourceCode"));
					}
				}
			}
		}
	}
	public void clickOnSaveAndContinue(HealthAddDetailEntity healthAddDetailEntity,CustomAssert assertReference) throws InterruptedException{
		if(healthAddDetailEntity.getBooleanValueForField("ConfigSaveAndContinue")){
			
			click(saveAndContinueButton);
			
			
			Thread.sleep(2000);
			}
			click(submitQuoteButton);
		
		
	}
	
	public void PersonalAccidentdetail(HealthAddDetailEntity healthAddDetailEntity,CustomAssert assertReference) throws InterruptedException {
		if((healthAddDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("HomeAndAccident"))) {
	
			if (healthAddDetailEntity.getAction().equalsIgnoreCase("add") || healthAddDetailEntity.getAction().equalsIgnoreCase("edit")) {
	
	
				if (healthAddDetailEntity.getBooleanValueForField("ConfigrelationshipWithregisteredusertext")) {
	               click(relationshipWithregisteredusertext);
	               click(relationshipWithregistereduservalue);
				}
	
				if (healthAddDetailEntity.getBooleanValueForField("ConfigNomineedetail")) {
					clearAndSendKeys(Nomineenameforaccident, healthAddDetailEntity.getStringValueForField("Nomineenameforacci"));
					click(RelationshipwithNomineeDropdowntext);
					click(RelationshipwithNomineeDropdownvalue);
					click(SaveandContinuebutton);
					click(submitQuoteButton);
				}
			}
		}}
	
	
	
	public void verifySummaryDeatils(HealthAddDetailEntity healthAddDetailEntity,CustomAssert assertReference) throws InterruptedException {
		if(healthAddDetailEntity.getAction().equalsIgnoreCase("verify")) {
			if(healthAddDetailEntity.getBooleanValueForField("ConfigQuoteNumber")){
				assertReference.assertEquals(healthAddDetailEntity.getStringValueForField("QuoteNumber"), fetchValueFromFields(quoteNumberLabel), AssertionType.WARNING);
			}
			if(healthAddDetailEntity.getBooleanValueForField("ConfigSumInsured")){
				assertReference.assertEquals(healthAddDetailEntity.getStringValueForField("SumInsured"), fetchValueFromFields(sumInsuredLabel), AssertionType.WARNING);
			}
			if(healthAddDetailEntity.getBooleanValueForField("ConfigNoOfMembers")){
				assertReference.assertEquals(healthAddDetailEntity.getStringValueForField("NoOfMembers"), fetchValueFromFields(numberOfMembersLabel), AssertionType.WARNING);
			}
			//if(healthAddDetailEntity.getBooleanValueForField("ConfigNetPremiumAmount")){
			//	assertReference.assertEquals(healthAddDetailEntity.getStringValueForField("NetPremiumAmount"), fetchValueFromFields(netPremiumAmountLabel), AssertionType.WARNING);
			//}
			//if(healthAddDetailEntity.getBooleanValueForField("ConfigEstimatedPremium")){
			//assertReference.assertEquals(healthAddDetailEntity.getStringValueForField("EstimatedPremium"), fetchValueFromFields(estimatedPremiumLabel), AssertionType.WARNING);
			//}
			//if(healthAddDetailEntity.getBooleanValueForField("ConfigGst")){
			//assertReference.assertEquals(healthAddDetailEntity.getStringValueForField("Gst"), fetchValueFromFields(gstLabel), AssertionType.WARNING);
			//}
		}
	}
	public void addressOfTheBuildingDetails(HealthAddDetailEntity healthAddDetailEntity,CustomAssert assertReference) throws InterruptedException {
		if((healthAddDetailEntity.getStringValueForField("LOB").equalsIgnoreCase("Home And Accident"))) {
			if (healthAddDetailEntity.getAction().equalsIgnoreCase("add") || healthAddDetailEntity.getAction().equalsIgnoreCase("edit")) {
				if (healthAddDetailEntity.getBooleanValueForField("ConfigAddressOfTheBuilding")) {
					scrollDown();
					scrollDown();
					scrollDown();
					click(addressOfTheBuildingMaximizeButton);
					if (healthAddDetailEntity.getBooleanValueForField("ConfigHABuildingNo")) {
						clearAndSendKeys(bldgNoTextField, healthAddDetailEntity.getStringValueForField("HABuildingNo"));
					}
					if (healthAddDetailEntity.getBooleanValueForField("ConfigHALocality")) {
						clearAndSendKeys(hAlocalityTextField, healthAddDetailEntity.getStringValueForField("HALocality"));
					}
					if (healthAddDetailEntity.getBooleanValueForField("ConfigHAPincode")) {
						//scrollDown();
						clearAndSendKeys(hApinCodeTextField, healthAddDetailEntity.getStringValueForField("HAPincode"));
					}
				}
			}
		}
	}
	public void fillAndSubmitHomepageDetails(HealthAddDetailEntity healthAddDetailEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(healthAddDetailEntity.getConfigExecute()))		
		{
			fillTopUpHealthAdditionalDeatils(healthAddDetailEntity, assertReference);
			fillTravelAdditionalDeatils(healthAddDetailEntity, assertReference);
			PersonalAccidentdetail(healthAddDetailEntity, assertReference);
			travelOtherDetails(healthAddDetailEntity, assertReference);
			addressOfTheBuildingDetails(healthAddDetailEntity, assertReference);
			
			clickOnSaveAndContinue(healthAddDetailEntity, assertReference);
			verifySummaryDeatils(healthAddDetailEntity, assertReference);
		}
	}
}