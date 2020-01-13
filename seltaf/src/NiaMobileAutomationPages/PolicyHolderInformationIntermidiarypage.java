package NiaMobileAutomationPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.PolicyInfoIntermidiaryEntity;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class PolicyHolderInformationIntermidiarypage extends MobileScreen { 

	MobileScreenElement monthLabel;
	MobileScreenElement YearLabel;
	MobileScreenElement dateLabel;
	MobileScreenElement monthRadioButton;
	MobileScreenElement YearRadioButton;
	MobileScreenElement NewCustomerRadioButton;
	MobileScreenElement FirstNameTextBox;
	MobileScreenElement MiddleNameTextBox;
	MobileScreenElement LastNameTextBox;
	MobileScreenElement GenderMaleRadioButton;
	MobileScreenElement DateOfBirthTExtBox;
	MobileScreenElement BuildingnoStreetTextBox;
	MobileScreenElement GstRegestrationIDDropDown;
	MobileScreenElement GstIntextbox;
	MobileScreenElement StateTextBox;
	MobileScreenElement pincodeTextBox;
	MobileScreenElement CityTextBox;
	MobileScreenElement MobileNumberTextBox;
	MobileScreenElement EmailIDTextBox;
	MobileScreenElement PanNOTextBox;
	MobileScreenElement EinsurenceAccountNotextField;
	MobileScreenElement NextButton;
	MobileScreenElement CreateButton;
	MobileScreenElement yeardropdown;
	MobileScreenElement yearvalue;
	MobileScreenElement dayvalue;
	MobileScreenElement GstRegestrationIDDropDownvalue;
	MobileScreenElement StateNameLable;
	MobileScreenElement Statename;
	MobileScreenElement PinNoTExtField;
	MobileScreenElement AlertText;
	MobileScreenElement individualeRadioButton;
	MobileScreenElement GstRegestrationIDRadioButton1;
	MobileScreenElement FirstNameHealthTextBox;
	MobileScreenElement MiddleNameHealthTextBox;
	MobileScreenElement LastNameHealthTextBox;
	MobileScreenElement GenderMaleHealthRadioButton;
	MobileScreenElement DateOfBirthHealthTExtBox;
	MobileScreenElement BuildingnoStreetHealthTextBox;
	MobileScreenElement GstRegestrationIDHealthDropDown;
	MobileScreenElement GstInHealthtextbox;
	MobileScreenElement StateHealthTextBox;
	MobileScreenElement pincodeHealthTextBox;
	MobileScreenElement MobileNumberHealthTextBox;
	MobileScreenElement CityHealthTextBox;
	MobileScreenElement EmailIDHealthTextBox;
	MobileScreenElement PanNoHealthTextBox;
	MobileScreenElement proceedButton;
	MobileScreenElement editButton;
	MobileScreenElement proposerNameTextfield;
	MobileScreenElement proposerOccupationDropDown;
	MobileScreenElement proposerOccupationRadioButton1;
	MobileScreenElement nomineeNameTextfield;
	MobileScreenElement nomineeRelationRadioButton1;
	MobileScreenElement nomineeRelationDropDown;
	MobileScreenElement yesRadioButton;
	MobileScreenElement noRadioButton;
	MobileScreenElement saveAndRecalculateButton;
	MobileScreenElement StateHealthname;
	MobileScreenElement PinNoHealthTextField;
	MobileScreenElement dateOption;
	MobileScreenElement saveButton;
	MobileScreenElement NextbuttonHm;
	MobileScreenElement proposerIdTextfield;
	MobileScreenElement proposerNatureOfIdRadioButton1;
	MobileScreenElement proposerHeightTextfield;
	MobileScreenElement proposerWeightTextfield;
	MobileScreenElement proposerNatureOfIdDropDown;
	MobileScreenElement saveAndCalculateButton;
	MobileScreenElement StateMotorTextBox;
	MobileScreenElement pincodeMotorTextBox;
	MobileScreenElement okButton;
	MobileScreenElement FristNameHealthTextBox1;
	MobileScreenElement LastNameHealthHelthTextBox1;
	MobileScreenElement BuildingnoStreetHealth3TextBox;
	MobileScreenElement GstRegestrationIDDropDownHelth;
	MobileScreenElement GstRegestrationIDDrophealthvalueDown;
	MobileScreenElement GstInHealth3TextBox;
	MobileScreenElement pinCodeMotorLabel;
	MobileScreenElement StateHealth3TextBox;
	MobileScreenElement PinCodeHealth3TExtBox;
	MobileScreenElement CityHealth3TextBox;
	MobileScreenElement MobileNoHealth3TExtField;
	MobileScreenElement SpouseNameTextfield;
	MobileScreenElement SpouseOccupation;
	MobileScreenElement RelationWithNomineeDropDown;
	MobileScreenElement SaveAndRECalculatePrimiumHelth3Button;
	MobileScreenElement nextHAAButton;




	public PolicyHolderInformationIntermidiarypage(AppiumDriver driver, String screenName,String DeviceOS)
	{
		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android"))
		{	
			dateLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='10']"),"Date", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			individualeRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text='Individual']"), "Individual", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			NewCustomerRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text='New Customer' and @index='0']"),"New Customer", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			FirstNameTextBox=new MobileScreenElement(By.xpath("//android.view.View[@index='6']/following::android.widget.EditText[1]"), "This is first Name");
					//new MobileScreenElement(By.xpath("//android.widget.EditText[@text='First Name']//following::android.widget.EditText[1]"),"First Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 20);
			MiddleNameTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Last Name *' and @index='9']//preceding::android.widget.EditText"),"Enter value of jewellery", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			LastNameTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Last Name *']//following::android.widget.EditText[1]"),"Enter make of the domestic", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			GenderMaleRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@resource-id='male']"),"Enter model of the domestic appliance", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			DateOfBirthTExtBox=new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='dateOfBirth']"),"Date of Birth", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			BuildingnoStreetTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Building no., Street *']//following::android.widget.EditText[1]"),"Enter make of the television", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			GstRegestrationIDDropDown=new MobileScreenElement(By.xpath("//android.view.View[@text='GST Registration ID Type']"),"GST Registration ID", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			GstIntextbox=new MobileScreenElement(By.xpath("//android.view.View[@text='GSTIN*']//following::android.widget.EditText[1]"),"GST IN", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			StateTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='State *']//following::android.widget.EditText[1]"),"Buy Online", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			pincodeTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='PIN Code *']//following::android.widget.EditText[1]"),"Buy Online", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			CityTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='City *' and @index='26']//following::android.widget.EditText[1]"),"Buy Online", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			MobileNumberTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Mobile Number *']//following::android.widget.EditText[1]"),"Buy Online", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			EmailIDTextBox=new MobileScreenElement(By.xpath("android.view.View[@text='Email ID' and @index='30']//following::android.widget.EditText"),"Buy Online", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			PanNOTextBox=new MobileScreenElement(By.xpath("android.view.View[@text='Pan No.' and @index='32']//following::android.widget.EditText"),"Pan No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			EinsurenceAccountNotextField=new MobileScreenElement(By.xpath("android.view.View[@text='E-Insurance Account No.' and @index='34']//following::android.widget.EditText"),"E-Insurance Account No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			NextButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Next']"),"Next", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			CreateButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Create']"),"next", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			yeardropdown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='2019']"),"Year", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			yearvalue=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text='1995']"),"value", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			dayvalue=new MobileScreenElement(By.xpath("//android.view.View[@text='8']"),"value", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			GstRegestrationIDDropDownvalue=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text='GST Registration ID Type' and resource-id='android:id/text1']"),"Normal,Composite,Casual", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			AlertText=new MobileScreenElement(By.xpath("//android.widget.Button[@text='ok']//preceding::android.widget.TextView[1]"),"Buy Online", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			FirstNameHealthTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='First Name *']//following::android.widget.EditText[1]"),"First Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			MiddleNameHealthTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Middle Name']//following::android.widget.EditText[1]"),"Middle Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			LastNameHealthTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Last Name*']//following::android.widget.EditText[1]"),"Last Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			GenderMaleHealthRadioButton=new MobileScreenElement(By.xpath("//android.view.View[@text='MALE']"),"Male", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			DateOfBirthHealthTExtBox=new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='dateOfBirth']"),"Date Of Birthday", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			BuildingnoStreetHealthTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Building No / Street*']//following::android.widget.EditText[1]"),"Building No and Street", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			GstRegestrationIDHealthDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='GST Registration ID Type']"),"GST Registration Id", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			GstInHealthtextbox=new MobileScreenElement(By.xpath("//android.view.View[@text='GSTIN*']//following::android.widget.EditText[1]"),"GSTIN", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			StateHealthTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='State *']//following::android.widget.EditText[1]"),"State", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			StateMotorTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='State *']//following::android.widget.EditText[1]"),"State", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			pincodeMotorTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='PIN Code *']//following::android.widget.EditText[1]"),"Pincode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			pincodeHealthTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Pin Code *']//following::android.widget.EditText[1]"),"Pincode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			MobileNumberHealthTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Mobile No.*']//following::android.widget.EditText[1]"),"Mobile Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			CityHealthTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='City *']//following::android.widget.EditText[1]"),"City", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			EmailIDHealthTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='E-mail ID']//following::android.widget.EditText[1]"),"Email Id", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			PanNoHealthTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='PAN No']//following::android.widget.EditText[1]"),"Pan No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			proceedButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Edit']//following::android.view.View[1]"),"Proceed", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			editButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Select']//following::android.view.View[1]"),"Edit", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);	
			proposerNameTextfield=new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='idDocNoProposerDetails0']"),"Proposer Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			proposerOccupationDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Select your Occupation']"),"Proposer Occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			nomineeNameTextfield=new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='idDocNoNominee']"),"Nominee Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			nomineeRelationDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Relationship with the Nominee']"),"Nominee Relation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			yesRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text='Yes']"),"Yes", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			noRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text='No']"),"No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			saveAndRecalculateButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save & Re-calculate Premium']"),"Save & Re-caculate Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			StateHealthname=new MobileScreenElement(By.xpath("//android.view.View[@text='MAHARASHTRA']"),"State Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			PinNoHealthTextField=new MobileScreenElement(By.xpath("//android.widget.EditText[@text='400066']//following::android.view.View[2]"),"Pincode Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			NextbuttonHm=new MobileScreenElement(By.xpath("//android.widget.Button[@text='next']"),"next", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			dateOption= new MobileScreenElement(By.xpath("//android.view.View[@text='21']"), "Date", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			saveButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save']"),"Save", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			NextbuttonHm=new MobileScreenElement(By.xpath("//android.widget.Button[@text='next']"),"next", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			proposerHeightTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='Height (Meters)']//following::android.widget.EditText[1]"),"Proposer Height", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			proposerWeightTextfield=new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='weight0']"),"Proposer Height", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			proposerNatureOfIdDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@resource-id='natureOfId']"),"Nature of Id", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			proposerIdTextfield=new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='idDocNo']"),"Id Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			saveAndCalculateButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save & Calculate Premium']"),"Save & Calculate Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			okButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='ok']"),"Ok", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			FristNameHealthTextBox1=new MobileScreenElement(By.xpath("//android.view.View[@text='First Name']//following::android.widget.EditText[1]"),"frist name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);  
			LastNameHealthHelthTextBox1=new MobileScreenElement(By.xpath("//android.view.View[@text='Last Name']//following::android.widget.EditText[1]"),"Last Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			BuildingnoStreetHealth3TextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Building No / Street']//following::android.widget.EditText[1]"),"Building No and Street", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			GstRegestrationIDDropDownHelth=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Select Registration ID Type']"),"GST Registration ID Type", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			GstRegestrationIDDrophealthvalueDown=new MobileScreenElement(By.xpath("//android.widget.Button[@text='GST Registration ID Type']"),"GST Registration ID Type", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			GstInHealth3TextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='GSTIN']//following::android.widget.EditText[1]"),"Gst In", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			pinCodeMotorLabel=new MobileScreenElement(By.xpath("//android.view.View[@text='400006']"),"Pin Code", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			StateHealth3TextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='State']//following::android.widget.EditText[1]"),"State Text Box", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			PinCodeHealth3TExtBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Pin Code']//following::android.widget.EditText[1]"),"Pin Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			CityHealth3TextBox= new MobileScreenElement(By.xpath("//android.view.View[@text='City']//following::android.widget.EditText[1]"),"Pin Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			MobileNoHealth3TExtField=new MobileScreenElement(By.xpath("//android.view.View[@text='Mobile No.']//following::android.widget.EditText[1]"),"Mobile Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			//SpouseNameTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='Relationship with proposer*']//preceding::android.widget.EditText[1]"),"Mobile Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			SpouseNameTextfield=new MobileScreenElement(By.xpath("//android.view.View[@text='Name*']//following::android.widget.EditText[1]"),"Mobile Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			SpouseOccupation=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Select your Occupation']"),"Mobile Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			RelationWithNomineeDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Select']"),"Mobile Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			SaveAndRECalculatePrimiumHelth3Button=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save & Re-caculate Premium']"),"Save And RECalculate Primium Helth", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);


		}
	}

	public void fillAndsubmitpolicyholderInformation(PolicyInfoIntermidiaryEntity policyInfoIntermidiaryEntity,CustomAssert assertReference ) throws Exception{
		if(policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("add")||policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("edit")){
			if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("HomeAndAccident"))||policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor")) {

				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigNewCustomerRadioButton")){
					clearAndSendKeys(NewCustomerRadioButton, policyInfoIntermidiaryEntity.getStringValueForField("newCustomerRadioButton"));
				}
				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigIndividual")){
					click(individualeRadioButton);
				}

				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigFirstNameTextBox")){
					//System.out.println(FirstNameTextBox.getText());
					//clearAndSendKeys(FirstNameTextBox, policyInfoIntermidiaryEntity.getStringValueForField("FirstNameTextBox"));
					//driver.findElement(By.xpath("(//android.view.View[starts-with(@text,'First Name')]//following-sibling::view)[1]//android.widget.EditText")).sendKeys("Dhwani");
				driver.findElement(By.xpath("//android.widget.RadioButton[@text='First Name *']//following::android.widget.EditText[1]")).sendKeys("Dhwani");
				}

				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigMiddleNameTextBox")){
					clearAndSendKeys(MiddleNameTextBox, policyInfoIntermidiaryEntity.getStringValueForField("MiddleNameTextBox"));
				}

				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigLastNameTextBox")){
					clearAndSendKeys(LastNameTextBox, policyInfoIntermidiaryEntity.getStringValueForField("lastNameTextBox"));
				}


				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigGenderMaleRadioButton")){
					click(GenderMaleRadioButton);
					scrollDown();
				}

				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigDateOfBirthTExtBox")){
					click(DateOfBirthTExtBox);
					click(yeardropdown);
					TouchAction action=new TouchAction(driver);
					action.longPress(PointOption.point(170,247))
					.moveTo(PointOption.point(200,2423)).release().perform();
											
					TouchAction action1=new TouchAction(driver);
					action1.longPress(PointOption.point(170,247))
					.moveTo(PointOption.point(200,2423)).release().perform();
					//scrollToElementBackward();
					click(yearvalue);
					click(dayvalue);
				}
				/*if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigDateOfBirthMotor")) {
					click(DateOfBirthTExtBox);
					click(monthLabel);
					String month=policyInfoIntermidiaryEntity.getStringValueForField("Month");
					click(monthRadioButton);
					click(YearLabel);
					String year=policyInfoIntermidiaryEntity.getStringValueForField("Year");
					YearRadioButton=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+year+"'"+"]"), "Year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(YearRadioButton);
					click(dateLabel);
				}*/

				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigBuildingnoStreetTextBox")){
					clearAndSendKeys(BuildingnoStreetTextBox, policyInfoIntermidiaryEntity.getStringValueForField("BuildingnoStreetTextBo"));
				}





				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigGstRegestrationIDDropDown")){
					click(GstRegestrationIDDropDown);
					/*click(GstRegestrationIDDropDownvalue);*/
					String gstval=policyInfoIntermidiaryEntity.getStringValueForField("GstRegestrationIDDropDown");
					GstRegestrationIDDropDownvalue= new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+gstval+"'"+"]"),"GST Value", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
					click(GstRegestrationIDDropDownvalue);
					scrollDown();

				}

				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigGstIntextbox")){
					clearAndSendKeys(GstIntextbox, policyInfoIntermidiaryEntity.getStringValueForField("GstIntextbox"));
					
				}


				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigStateTextBox")){
					clearAndSendKeys(StateTextBox, policyInfoIntermidiaryEntity.getStringValueForField("State"));
					String StateName=policyInfoIntermidiaryEntity.getStringValueForField("StateFull");
					Statename=new MobileScreenElement(By.xpath("//android.view.View[@text="+"'"+StateName+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(Statename);
					
					

				}
				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigpincodeTextBox")){
					click(pincodeTextBox);
					clearAndSendKeys(pincodeTextBox, policyInfoIntermidiaryEntity.getStringValueForField("pin"));
					String pinNo=policyInfoIntermidiaryEntity.getStringValueForField("pinFull");
					PinNoTExtField=new MobileScreenElement(By.xpath("//android.view.View[@text="+"'"+pinNo+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(PinNoTExtField);

				}
				if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor"))){
					if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigStateMotorTextBox")){				
						clearAndSendKeys(StateMotorTextBox, policyInfoIntermidiaryEntity.getStringValueForField("State"));
						click(StateHealthname);
						scrollToElementForward();
					}
					if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigpincodeMotorTextBox")){
						click(pincodeMotorTextBox);

						/*clearAndSendKeys(pincodeMotorTextBox, policyInfoIntermidiaryEntity.getStringValueForField("pin"));
						String pinNo=policyInfoIntermidiaryEntity.getStringValueForField("pinFull");
						PinNoTExtField=new MobileScreenElement(By.xpath("//android.view.View[@text="+"'"+pinNo+"'"+"]"), "Make", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
						click(PinNoTExtField);*/

						clearAndSendKeys(pincodeMotorTextBox, policyInfoIntermidiaryEntity.getStringValueForField("pin"));
						//sendKeys(PinNoHealthTextField,("pin"));
						TouchAction action1 = new TouchAction(driver);
						action1.press(PointOption.point(130,930)).release().perform();
						
					}
				}


				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigCityTextBox")){
					clearAndSendKeys(CityTextBox, policyInfoIntermidiaryEntity.getStringValueForField("CityTextBox"));
				}

				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigMobileNumberTextBox")){
					click(MobileNumberTextBox);
					clearAndSendKeys(MobileNumberTextBox, policyInfoIntermidiaryEntity.getStringValueForField("MobileNumberTextBox"));
				}

				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigEmailIDTextBox")){
					clearAndSendKeys(EmailIDTextBox, policyInfoIntermidiaryEntity.getStringValueForField("EmailIDTextBox"));
				}

				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigPanNOTextBox")){
					clearAndSendKeys(PanNOTextBox, policyInfoIntermidiaryEntity.getStringValueForField("PanNOTextBox"));
				}
			}
		}
		if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")))  {	
			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigFirstNameTextBox")){
				clearAndSendKeys(FirstNameHealthTextBox, policyInfoIntermidiaryEntity.getStringValueForField("FirstNameTextBox"));
			}
			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigMiddleNameTextBox")){
				clearAndSendKeys(MiddleNameHealthTextBox, policyInfoIntermidiaryEntity.getStringValueForField("MiddleNameTextBox"));
			}
			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigLastNameTextBox")){
				clearAndSendKeys(LastNameHealthTextBox, policyInfoIntermidiaryEntity.getStringValueForField("lastNameTextBox"));
			}

			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigGenderMaleRadioButton")){
				click(GenderMaleHealthRadioButton);
			}
			scrollToElementForward();
			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigDateOfBirthTExtBox")){
				click(DateOfBirthHealthTExtBox);
				click(yeardropdown);
				//scrollUp();
				//scrollUp();
				//scrollUp();
				TouchAction action=new TouchAction(driver);
				action.longPress(PointOption.point(170,247))
				.moveTo(PointOption.point(200,2423)).release().perform();
				Thread.sleep(2000);
				
				TouchAction action1=new TouchAction(driver);
				action1.longPress(PointOption.point(170,247))
				.moveTo(PointOption.point(200,2423)).release().perform();
				click(yearvalue);
				click(dateOption);
				//	click(okButton);
			}

			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigBuildingnoStreetTextBox")){
				clearAndSendKeys(BuildingnoStreetHealthTextBox, policyInfoIntermidiaryEntity.getStringValueForField("BuildingnoStreetTextBo"));
			}

			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigGstRegestrationIDDropDown")){
				click(GstRegestrationIDHealthDropDown);
				String registrationId=policyInfoIntermidiaryEntity.getStringValueForField("GstRegestrationIDDropDown");
				GstRegestrationIDRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+registrationId+"'"+"]"), "Dependency Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(GstRegestrationIDRadioButton1);
				scrollDown();
			}

			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigGstIntextbox")){
				clearAndSendKeys(GstInHealthtextbox, policyInfoIntermidiaryEntity.getStringValueForField("GstIntextbox"));
			}
			scrollToElementForward();
			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigStateTextBox")){				
				clearAndSendKeys(StateHealthTextBox, policyInfoIntermidiaryEntity.getStringValueForField("State"));
				click(StateHealthname);
			}
			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigpincodeTextBox")){
				click(pincodeHealthTextBox);
				clearAndSendKeys(pincodeHealthTextBox, policyInfoIntermidiaryEntity.getStringValueForField("pin"));
				//sendKeys(PinNoHealthTextField,("pin"));
				click(PinNoHealthTextField);
			}
			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigCityTextBox")){
				clearAndSendKeys(CityHealthTextBox, policyInfoIntermidiaryEntity.getStringValueForField("CityTextBox"));
			}

			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigMobileNumberTextBox")){
				click(MobileNumberHealthTextBox);
				clearAndSendKeys(MobileNumberHealthTextBox, policyInfoIntermidiaryEntity.getStringValueForField("MobileNumberTextBox"));
			}

			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigEmailIDTextBox")){
				clearAndSendKeys(EmailIDHealthTextBox, policyInfoIntermidiaryEntity.getStringValueForField("EmailIDTextBox"));
			}
			scrollDown();
			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigPanNOTextBox")){
				clearAndSendKeys(PanNoHealthTextBox, policyInfoIntermidiaryEntity.getStringValueForField("PanNOTextBox"));
			}
		}


		else	if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Health3")))  {	
			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigFirstNameTextBox")){
				clearAndSendKeys(FristNameHealthTextBox1, policyInfoIntermidiaryEntity.getStringValueForField("FirstNameTextBox"));
			}
			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigMiddleNameTextBox")){
				//	clearAndSendKeys(MiddleNameHealthTextBox, policyInfoIntermidiaryEntity.getStringValueForField("MiddleNameTextBox"));
			}
			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigLastNameTextBox")){
				clearAndSendKeys(LastNameHealthHelthTextBox1, policyInfoIntermidiaryEntity.getStringValueForField("lastNameTextBox"));
			}

			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigGenderMaleRadioButton")){
				click(GenderMaleHealthRadioButton);
			}
			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigDateOfBirthTExtBox")){
				click(DateOfBirthHealthTExtBox);
				click(yeardropdown);
				TouchAction action=new TouchAction(driver);
				action.longPress(PointOption.point(170,247))
				.moveTo(PointOption.point(200,2423)).release().perform();
				
				TouchAction action1=new TouchAction(driver);
				action1.longPress(PointOption.point(170,247))
				.moveTo(PointOption.point(200,2423)).release().perform();
				click(yearvalue);
				click(dateOption);
				//	click(okButton);
			}

			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigBuildingnoStreetTextBox")){
				scrollDown();
				clearAndSendKeys(BuildingnoStreetHealth3TextBox, policyInfoIntermidiaryEntity.getStringValueForField("BuildingnoStreetTextBo"));
				
			}

			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigGstRegestrationIDDropDown")){
				click(GstRegestrationIDDropDownHelth);
				String registrationId=policyInfoIntermidiaryEntity.getStringValueForField("GstRegestrationIDDropDown");
				GstRegestrationIDRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+registrationId+"'"+"]"), "Dependency Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
				click(GstRegestrationIDRadioButton1);
			}

			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigGstIntextbox")){
				clearAndSendKeys(GstInHealth3TextBox, policyInfoIntermidiaryEntity.getStringValueForField("GstIntextbox"));
				//scrollToElementForward();
			}
			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigStateTextBox")){				
				clearAndSendKeys(StateHealth3TextBox, policyInfoIntermidiaryEntity.getStringValueForField("State"));
				click(StateHealthname);
			}
			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigpincodeTextBox")){
				scrollDown();
				
				click(PinCodeHealth3TExtBox);
				clearAndSendKeys(PinCodeHealth3TExtBox, policyInfoIntermidiaryEntity.getStringValueForField("pin"));
				//sendKeys(PinNoHealthTextField,("pin"));
				click(PinNoHealthTextField);
			}
			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigCityTextBox")){
				clearAndSendKeys(CityHealth3TextBox, policyInfoIntermidiaryEntity.getStringValueForField("CityTextBox"));
			}

			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigMobileNumberTextBox")){
				click(MobileNoHealth3TExtField);
				clearAndSendKeys(MobileNoHealth3TExtField, policyInfoIntermidiaryEntity.getStringValueForField("MobileNumberTextBox"));
			}

			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigEmailIDTextBox")){
				clearAndSendKeys(EmailIDHealthTextBox, policyInfoIntermidiaryEntity.getStringValueForField("EmailIDTextBox"));
			}

			if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigPanNOTextBox")){
				clearAndSendKeys(PanNoHealthTextBox, policyInfoIntermidiaryEntity.getStringValueForField("PanNOTextBox"));
			}

		}
	}

	public void fetchQuoteNumber(PolicyInfoIntermidiaryEntity policyInfoIntermidiaryEntity) throws InterruptedException {
		if(policyInfoIntermidiaryEntity.getBooleanValueForField("Configpartycode")){
			policyInfoIntermidiaryEntity.setStringValueForField("QuoteNo", fetchValueFromFields(AlertText));
		}
	}


	public void clickOnCreateButton(PolicyInfoIntermidiaryEntity policyInfoIntermidiaryEntity,CustomAssert assertReference ) throws InterruptedException{
		if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigCreateButton")){
			scrollDown();
			click(CreateButton);
			if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Motor"))||policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("HomeAndAccident"))   {	
				click(okButton);
			}
		}
		if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigSaveAndCalculatePremium")){
			click(saveAndCalculateButton);
			if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Health")))  {
				click(saveAndRecalculateButton);
			}
		}
	}


	public void clickNextPageButton(PolicyInfoIntermidiaryEntity policyInfoIntermidiaryEntity,CustomAssert  assertReference  ){
		if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigNextButton")){
			if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Health"))) {
				click(NextButton);
			}
			if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Health3"))) {
				click(NextButton);
			}
			if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("HomeAndAccident"))) {
				click(NextbuttonHm);	
			}
		}
	}



	public void clickNextPageButtonHM(PolicyInfoIntermidiaryEntity policyInfoIntermidiaryEntity,CustomAssert  assertReference  ){
		if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigNextButtonHM")){

			if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Health"))) {
				click(NextButton);
			}
			if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("HomeAndAccident"))) {
				click(NextbuttonHm);	
			}
		}

	}
	public void clickOnProceedOption(PolicyInfoIntermidiaryEntity policyInfoIntermidiaryEntity,CustomAssert  assertReference  ) throws InterruptedException{
		if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProceed")){
				//click(proceedButton);

			TouchAction action = new TouchAction(driver);
			action.press(PointOption.point(1029,1198)).release().perform();
			
		}
		if (policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigHEalthOk")){

			TouchAction action1 = new TouchAction(driver);
			action1.press(PointOption.point(1063 ,1663)).release().perform();

		}
	}

	public void clickEditButton(PolicyInfoIntermidiaryEntity policyInfoIntermidiaryEntity,CustomAssert  assertReference  ){
		if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigEdit")){
			click(editButton);
		}
	}
	public void fillRelationDetails(PolicyInfoIntermidiaryEntity policyInfoIntermidiaryEntity,CustomAssert assertReference ) throws InterruptedException{
		if(policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("add")||policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("edit")){
			if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Health"))) {
				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigRelations")){
					if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigAgentRequired")){
						click(yesRadioButton);
					}
					if (policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigAgentNotRequired")) {
						click(noRadioButton);
					}
					click(saveAndRecalculateButton);
				}
			}
		}
	}

	public void fillHealth3RelationDetails(PolicyInfoIntermidiaryEntity policyInfoIntermidiaryEntity,CustomAssert assertReference ) throws InterruptedException{
		if(policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("add")||policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("edit")){
			if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Health3"))) {
				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigRelations")){
					if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigAgentRequired")){
						click(yesRadioButton);
					}
					if (policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigAgentNotRequired")) {
						click(noRadioButton);
					}
					click(SaveAndRECalculatePrimiumHelth3Button);
				}
			}
		}
	}
	public void fillProposerDetails(PolicyInfoIntermidiaryEntity policyInfoIntermidiaryEntity,CustomAssert assertReference ) throws InterruptedException{
		if(policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("add")||policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("edit")){
			if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Health"))) {
				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProposer")){
					if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProposerName")){
						clearAndSendKeys(proposerNameTextfield, policyInfoIntermidiaryEntity.getStringValueForField("ProposerName"));
					}
					if (policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProposerOccupation")) {
						click(proposerOccupationDropDown);
						String proposerOccupation=policyInfoIntermidiaryEntity.getStringValueForField("ProposerOccupation");
						proposerOccupationRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+proposerOccupation+"'"+"]"), "Occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
						click(proposerOccupationRadioButton1);
						//selectValueFromList(proposerOccupationDropDown, healthAddDetailEntity.getStringValueForField("ProposerOccupation"));
					}
					if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProposerHeight")){
						clearAndSendKeys(proposerHeightTextfield, policyInfoIntermidiaryEntity.getStringValueForField("ProposerHeight"));
					}
					if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProposerWeight")){
						clearAndSendKeys(proposerWeightTextfield, policyInfoIntermidiaryEntity.getStringValueForField("ProposerWeight"));
					}
					if (policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProposerNatureOfId")) {
						click(proposerNatureOfIdDropDown);
						String proposerNatureOfId=policyInfoIntermidiaryEntity.getStringValueForField("ProposerNatureOfId");
						proposerNatureOfIdRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+proposerNatureOfId+"'"+"]"), "Nature Of Id", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
						click(proposerNatureOfIdRadioButton1);
						//selectValueFromList(proposerOccupationDropDown, healthAddDetailEntity.getStringValueForField("ProposerOccupation"));
					}
					if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProposerId")){
						clearAndSendKeys(proposerIdTextfield, policyInfoIntermidiaryEntity.getStringValueForField("ProposerId"));
					}

				}
				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigSpouse")){
					/*if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigSpouseName")){
						clearAndSendKeys(spouseNameTextfield, policyInfoIntermidiaryEntity.getStringValueForField("SpouseName"));
					}*/
				}
			}
		}
	}
	//start
	public void fillProposerHEalth3Details(PolicyInfoIntermidiaryEntity policyInfoIntermidiaryEntity,CustomAssert assertReference ) throws InterruptedException{
		if(policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("add")||policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("edit")){
			if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Health3"))) {
				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProposer")){
					if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProposerName")){
						clearAndSendKeys(proposerNameTextfield, policyInfoIntermidiaryEntity.getStringValueForField("ProposerName"));
					}
					if (policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProposerOccupation")) {
						click(proposerOccupationDropDown);
						String proposerOccupation=policyInfoIntermidiaryEntity.getStringValueForField("ProposerOccupation");
						proposerOccupationRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+proposerOccupation+"'"+"]"), "Occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
						click(proposerOccupationRadioButton1);
						//selectValueFromList(proposerOccupationDropDown, healthAddDetailEntity.getStringValueForField("ProposerOccupation"));
					}
					if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProposerHeight")){
						clearAndSendKeys(proposerHeightTextfield, policyInfoIntermidiaryEntity.getStringValueForField("ProposerHeight"));
					}
					if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProposerWeight")){
						clearAndSendKeys(proposerWeightTextfield, policyInfoIntermidiaryEntity.getStringValueForField("ProposerWeight"));
					}
					if (policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProposerNatureOfId")) {
						click(proposerNatureOfIdDropDown);
						String proposerNatureOfId=policyInfoIntermidiaryEntity.getStringValueForField("ProposerNatureOfId");
						proposerNatureOfIdRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+proposerNatureOfId+"'"+"]"), "Nature Of Id", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
						click(proposerNatureOfIdRadioButton1);
						//selectValueFromList(proposerOccupationDropDown, healthAddDetailEntity.getStringValueForField("ProposerOccupation"));
					}
					if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProposerId")){
						clearAndSendKeys(proposerIdTextfield, policyInfoIntermidiaryEntity.getStringValueForField("ProposerId"));
					}

				}
				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigSpouse")){
					/*if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigSpouseName")){
						clearAndSendKeys(spouseNameTextfield, policyInfoIntermidiaryEntity.getStringValueForField("SpouseName"));
					}*/
				}
			}
		}
	}


	public void fillSpouseHEalth3Details(PolicyInfoIntermidiaryEntity policyInfoIntermidiaryEntity,CustomAssert assertReference ) throws InterruptedException{
		if(policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("add")||policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("edit")){
			if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Health"))) {
				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigSpouseName")){
					clearAndSendKeys(SpouseNameTextfield, policyInfoIntermidiaryEntity.getStringValueForField("ProposerName"));
				}
				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigProposerOccupation")){
					click(SpouseOccupation);
					String proposerOccupation=policyInfoIntermidiaryEntity.getStringValueForField("ProposerOccupation");
					proposerOccupationRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+proposerOccupation+"'"+"]"), "Occupation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(proposerOccupationRadioButton1);
				}


			}

		}
	}






	public void fillNomineeDetails(PolicyInfoIntermidiaryEntity policyInfoIntermidiaryEntity,CustomAssert assertReference ) throws InterruptedException{
		if(policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("add")||policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("edit")){
			if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Health"))) {
				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigNomineeName")){
					clearAndSendKeys(nomineeNameTextfield, policyInfoIntermidiaryEntity.getStringValueForField("NomineeName"));
				}
				if (policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigNomineeOccupation")) {
					click(nomineeRelationDropDown);
					String nomineeRelation=policyInfoIntermidiaryEntity.getStringValueForField("NomineeOccupation");
					nomineeRelationRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+nomineeRelation+"'"+"]"), "Relation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(nomineeRelationRadioButton1);
					//selectValueFromList(proposerOccupationDropDown, healthAddDetailEntity.getStringValueForField("ProposerOccupation"));
				}
				click(NextButton);
			}
		}
	}



	public void fillNomineeHealth3Details(PolicyInfoIntermidiaryEntity policyInfoIntermidiaryEntity,CustomAssert assertReference ) throws InterruptedException{
		if(policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("add")||policyInfoIntermidiaryEntity.getAction().equalsIgnoreCase("edit")){
			if((policyInfoIntermidiaryEntity.getStringValueForField("LOB").equalsIgnoreCase("Health3"))) {
				if(policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigNomineeName")){
					clearAndSendKeys(nomineeNameTextfield, policyInfoIntermidiaryEntity.getStringValueForField("NomineeName"));
				}
				if (policyInfoIntermidiaryEntity.getBooleanValueForField("ConfigNomineeOccupation")) {
					click(RelationWithNomineeDropDown);
					String nomineeRelation=policyInfoIntermidiaryEntity.getStringValueForField("NomineeOccupation");
					nomineeRelationRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+nomineeRelation+"'"+"]"), "Relation", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(nomineeRelationRadioButton1);
					//selectValueFromList(proposerOccupationDropDown, healthAddDetailEntity.getStringValueForField("ProposerOccupation"));
				}
				click(NextButton);
			}
		}
	}


	public void fillAndSubmitHolderInformationIntermidiaryEntity(PolicyInfoIntermidiaryEntity policyInfoIntermidiaryEntity,CustomAssert assertReference ) throws Exception {
		if(isConfigTrue(policyInfoIntermidiaryEntity.getConfigExecute())){		
			{
				fillAndsubmitpolicyholderInformation(policyInfoIntermidiaryEntity,assertReference);
				clickOnCreateButton(policyInfoIntermidiaryEntity, assertReference);
				fetchQuoteNumber(policyInfoIntermidiaryEntity);
				clickOnProceedOption(policyInfoIntermidiaryEntity, assertReference);
				clickEditButton(policyInfoIntermidiaryEntity, assertReference);
				fillProposerDetails(policyInfoIntermidiaryEntity, assertReference);
				fillProposerHEalth3Details(policyInfoIntermidiaryEntity, assertReference);
				clickNextPageButton(policyInfoIntermidiaryEntity,assertReference);
				fillSpouseHEalth3Details(policyInfoIntermidiaryEntity,assertReference);
				clickNextPageButtonHM(policyInfoIntermidiaryEntity,assertReference);
				fillNomineeHealth3Details(policyInfoIntermidiaryEntity, assertReference);
				fillNomineeDetails(policyInfoIntermidiaryEntity, assertReference);
				fillRelationDetails(policyInfoIntermidiaryEntity, assertReference);
				fillHealth3RelationDetails(policyInfoIntermidiaryEntity, assertReference);
			}         
		}
	}
}