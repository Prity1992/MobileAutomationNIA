package NiaMobileAutomationPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.BuyNowEntity;
import com.aqm.staf.library.databin.TopUpMediEntity;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class NewIndiaTopUpMediclaimPage extends MobileScreen {
	MobileScreenElement policyPeriodMaximize;
	MobileScreenElement polStartDateTextfield;
	MobileScreenElement polEndDateTextfield;
	MobileScreenElement basicInformationMaximize;
	MobileScreenElement floaterCoverRadioButton;
	MobileScreenElement individualCoverRadioButton;
	MobileScreenElement thresholdLimitDropDown;
	MobileScreenElement sumInsuredDropDown;
	MobileScreenElement memberInformationMaximize;
	MobileScreenElement proposer1DOBTextField;
	MobileScreenElement proposer2DOBTextField;
	MobileScreenElement addSpouseButton;
	MobileScreenElement addProposerButton;
	MobileScreenElement addChildButton;
	MobileScreenElement termsAndConditionsCheckBox;
	MobileScreenElement calculatePremiumButton;
	MobileScreenElement saveAndContinueButton;
	MobileScreenElement viewBreakUpLink;
	MobileScreenElement quoteNumberLabel;
	MobileScreenElement estimatedPremiumLabel;
	MobileScreenElement sumInsuredLabel;
	MobileScreenElement noOfMembersLabel;
	MobileScreenElement thresholdRadioButton1;
	MobileScreenElement SIRadioButton1;
	MobileScreenElement sumInsuredAshaKiranDropDown;
	MobileScreenElement proposer1floaterDOBTextField;
	MobileScreenElement proposer2floaterDOBTextField;
	MobileScreenElement basicInformationFloaterMaximize;
	MobileScreenElement memberInformationFloaterMaximize;
	MobileScreenElement cityOfResidenceDropDown;
	MobileScreenElement CityRadioButton1;
    MobileScreenElement memberInformationAshaKiranMaximize;
    MobileScreenElement dependencyDropDown;
    MobileScreenElement DependencyRadioButton1;
    MobileScreenElement okButton;
    MobileScreenElement termsAndConditionsCheckBox1;
    MobileScreenElement continueButton;
    MobileScreenElement cancelButton;
    MobileScreenElement sumInsuredFloaterLabel;
    MobileScreenElement spouseDateOfBirth;
	MobileScreenElement productLabel;
	MobileScreenElement individualRadioButton;
	MobileScreenElement familyInfoPremiumMediclaimDropDown;
	MobileScreenElement heightInMeter;
	MobileScreenElement weightInKG;
	MobileScreenElement sumInsPremiumMediclaimDropDown;
	private MobileScreenElement sumInsPremierRadioButton;
    
	public NewIndiaTopUpMediclaimPage(AppiumDriver driver, String screenName,String DeviceOS)
	{
		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android"))
		{
			basicInformationFloaterMaximize=new MobileScreenElement(By.xpath("//android.view.View[@text='Basic Information error icon 1 mandatory fields pending']"),"Basic Information", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			basicInformationMaximize=new MobileScreenElement(By.xpath("//android.view.View[@text='Basic Information error icon 2 mandatory fields pending']"),"Basic Information", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			memberInformationMaximize=new MobileScreenElement(By.xpath("//android.view.View[@text='Your Insured Family Information ']"),"Insured Family Information", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			
			memberInformationFloaterMaximize=new MobileScreenElement(By.xpath("//android.view.View[@text='Your Insured Family Information ']//following::android.widget.Image[2]"),"Insured Family Information", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			floaterCoverRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[contains(@resource-id,'typeOfCover1')]"),"Floater", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			individualCoverRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@resource-id='rb-2-1']"),"Individual Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			thresholdLimitDropDown=new MobileScreenElement(By.xpath("//android.view.View[@text='Thresold Limit*']//following::android.widget.Image[1]"),"Thershold Limit DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			sumInsuredDropDown=new MobileScreenElement(By.xpath("//android.view.View[@text='Sum Insured*']//following::android.widget.Image[1]"),"Sum Insured DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			//sumInsuredFloaterDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Select Sum Insured'and @index='2']"),"Sum Insured", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	        
			sumInsuredAshaKiranDropDown=new MobileScreenElement(By.xpath("//android.view.View[@text='Select Sum Insured']"),"Click on Sum Insured DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			quoteNumberLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Estimated Premium:1,620.00' and @index='2']//preceding::android.view.View"),"Quote NO", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			estimatedPremiumLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Estimated Premium:1,620.00' and @index='2']") ,"Estimated Premium", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			sumInsuredLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Sum Insured:500,000.00' and @index='1']") ,"Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			noOfMembersLabel= new MobileScreenElement(By.xpath("//android.view.View(@text='No.of.Members')") ,"No Of Members", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			addSpouseButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Spouse']//following::android.widget.Button[1]"),"Add Spouse Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			addProposerButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Add Proposer']"),"Add Proposer", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			addChildButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Add Child']"),"Add Child", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			termsAndConditionsCheckBox=new MobileScreenElement(By.xpath("//android.widget.CheckBox[@resource-id='undefined']"),"Click on Terms And Conditions CheckBox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			calculatePremiumButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save & Calculate Premium']"),"Calculate Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			saveAndContinueButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save & Calculate Premium']"),"Click on Save And Continue Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			proposer1DOBTextField= new MobileScreenElement(By.xpath("//android.widget.EditText[@index='0']"), "DOB", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			proposer1floaterDOBTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Date of Birth']//following::android.widget.EditText[1]"), "DOB", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			proposer2floaterDOBTextField= new MobileScreenElement(By.xpath("//android.view.View[@text='Dependent Type']//preceding::android.widget.EditText[1]"), "DOB", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			cityOfResidenceDropDown=  new MobileScreenElement(By.xpath("//android.view.View[@text='City of Residence']//following::android.widget.Image[2]"), "City of Residence DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			memberInformationAshaKiranMaximize=new MobileScreenElement(By.xpath("//android.view.View[@text='Your Insured Family Information ']//following::android.widget.Image[2]"),"Click on Member Information DropDown", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			dependencyDropDown= new MobileScreenElement(By.xpath("//android.view.View[@text='Dependent Type']//following::android.widget.Image[1]"),"Dependency DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			okButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='OK']"),"Ok Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
			termsAndConditionsCheckBox1= new MobileScreenElement(By.xpath("//android.widget.CheckBox[@resource-id='undefined']"),"Click on Terms And Conditions CheckBox", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			continueButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Continue']"),"Click on Continue Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			cancelButton= new MobileScreenElement(By.xpath("//android.view.View[@resource-id='alert-hdr-1']//preceding::android.widget.Button"),"Click on Cancel Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			sumInsuredFloaterLabel= new MobileScreenElement(By.xpath("//android.view.View[@text='Select Sum Insured']//following::android.widget.Image[1]"),"Sum Insured Floater Maximize", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			spouseDateOfBirth= new MobileScreenElement(By.xpath("//android.view.View[@text='Spouse']//following::android.widget.EditText[1]"),"Sum Insured Floater Maximize", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		    productLabel= new MobileScreenElement(By.xpath("//android.view.View[@index='0']"),"Product Label", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		    individualRadioButton= new MobileScreenElement(By.xpath("//android.view.View[@text='Individual']//preceding::android.widget.RadioButton[1]"),"Individual Radio Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		    
		    
		    familyInfoPremiumMediclaimDropDown= new MobileScreenElement(By.xpath("//android.view.View[@text='Your Insured Family Information ']"),"Family Infotmation Drop Down", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		    heightInMeter= new MobileScreenElement(By.xpath("//android.view.View[@text='Height(meter)*']//following::android.widget.EditText[1]"),"Height Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		    weightInKG= new MobileScreenElement(By.xpath("//android.view.View[@text='Weight(Kg)*']//following::android.widget.EditText[1]"),"Weight Text Field", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		    sumInsPremiumMediclaimDropDown= new MobileScreenElement(By.xpath("//android.view.View[@text='Sum Insured*']//following::android.widget.Spinner"),"Sum Insured Drop Down", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		
		}
	}

	public void fillNewIndiaTopUpMediclaimDetails(TopUpMediEntity topUpMediclaimEntity,CustomAssert assertReference ) throws InterruptedException{
		if(topUpMediclaimEntity.getAction().equalsIgnoreCase("add")||topUpMediclaimEntity.getAction().equalsIgnoreCase("edit")){
			//	List<MobileScreenElement> inputs = (List<MobileScreenElement>) driver.findElements(By.className("android.widget.EditText"));
			//	proposer1DOBTextField = inputs.get(0);
			//proposer2DOBTextField = inputs.get(1);
			//click(productLabel);
			if(topUpMediclaimEntity.getBooleanValueForField("ConfigBasicInformation")){

				if(topUpMediclaimEntity.getBooleanValueForField("ConfigFloater")){
					
					click(floaterCoverRadioButton);
					
					if(topUpMediclaimEntity.getBooleanValueForField("ConfigThresholdLimit")){
						selectValueFromList(thresholdLimitDropDown, topUpMediclaimEntity.getStringValueForField("ThresholdLimit"));
					}
					if(topUpMediclaimEntity.getBooleanValueForField("ConfigSumInsured")){
						selectValueFromList(sumInsuredDropDown, topUpMediclaimEntity.getStringValueForField("SumInsured"));
						click(okButton);
					}
					if(topUpMediclaimEntity.getBooleanValueForField("ConfigMemberInformation")){
						
						click(memberInformationMaximize);
						
						if(topUpMediclaimEntity.getBooleanValueForField("ConfigFirstMemberDOB")){
							clearAndSendKeys(proposer1DOBTextField, topUpMediclaimEntity.getStringValueForField("FirstMemberDOB"));
							click(addSpouseButton);
						}
						if(topUpMediclaimEntity.getBooleanValueForField("ConfigSecondtMemberDOB")){
							clearAndSendKeys(proposer2DOBTextField, topUpMediclaimEntity.getStringValueForField("SecondtMemberDOB"));
						}

					}
				}
				else if (topUpMediclaimEntity.getBooleanValueForField("ConfigIndividual")){
					click(individualCoverRadioButton);
					scrollDown();
					if(topUpMediclaimEntity.getBooleanValueForField("ConfigMemberInformation")){
						/*TouchAction action=new TouchAction(driver);
						action.press(PointOption.point(744, 1903)).release().perform();*/
						
						click(memberInformationMaximize);
                         scrollDown();
						if(topUpMediclaimEntity.getBooleanValueForField("ConfigFirstMemberDOB")){
							clearAndSendKeys(proposer1DOBTextField, topUpMediclaimEntity.getStringValueForField("FirstMemberDOB"));
						}
						if(topUpMediclaimEntity.getBooleanValueForField("ConfigThresholdLimit")){
							click(thresholdLimitDropDown);
							String Amount=topUpMediclaimEntity.getStringValueForField("ThresholdLimit");
							thresholdRadioButton1=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+Amount+"'"+"]"), "Threshold amount", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
							click(thresholdRadioButton1);
							click(okButton);
							//selectValueFromList(thresholdLimitDropDown, topUpMediclaimEntity.getStringValueForField("ThresholdLimit"));
						}
						if(topUpMediclaimEntity.getBooleanValueForField("ConfigSumInsured")){
							click(sumInsuredDropDown);
							String SIAmount=topUpMediclaimEntity.getStringValueForField("SumInsured");
							SIRadioButton1=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+SIAmount+"'"+"]"), "Sum Insured amount", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
							click(SIRadioButton1);
							click(okButton);
							//selectValueFromList(sumInsuredDropDown, topUpMediclaimEntity.getStringValueForField("SumInsured"));

						}		
					}
				}
				else if ((topUpMediclaimEntity.getStringValueForField("Product").equalsIgnoreCase("New India Floater"))) {
					if(topUpMediclaimEntity.getBooleanValueForField("ConfigSumInsured")){
						//Thread.sleep(2000);
					//click(sumInsuredFloaterDropDown);
					
					click(sumInsuredFloaterLabel);
					//click(sumInsuredFloaterDropDown);
					String SIAmount=topUpMediclaimEntity.getStringValueForField("SumInsured");
					SIRadioButton1=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+SIAmount+"'"+"]"), "Sum Insured amount", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(SIRadioButton1);
					click(okButton);
					//selectValueFromList(sumInsuredDropDown, topUpMediclaimEntity.getStringValueForField("SumInsured"));
					if(topUpMediclaimEntity.getBooleanValueForField("ConfigMemberInformation")){
						click(memberInformationFloaterMaximize);
						scrollDown();
						
						if(topUpMediclaimEntity.getBooleanValueForField("ConfigFirstMemberDOB")){
							click(addSpouseButton);
							clearAndSendKeys(spouseDateOfBirth, topUpMediclaimEntity.getStringValueForField("FirstMemberDOB"));
							
						}
						if(topUpMediclaimEntity.getBooleanValueForField("ConfigSecondtMemberDOB")){
							clearAndSendKeys(proposer2floaterDOBTextField, topUpMediclaimEntity.getStringValueForField("SecondtMemberDOB"));
						}
					}		
				}
			}
		}
		}

		else if(topUpMediclaimEntity.getAction().equalsIgnoreCase("verify")) {
			if(topUpMediclaimEntity.getBooleanValueForField("ConfigQuoteNumber")){
				assertReference.assertEquals(topUpMediclaimEntity.getStringValueForField("QuoteNumber"), fetchValueFromFields(quoteNumberLabel), AssertionType.WARNING);
			}
			if(topUpMediclaimEntity.getBooleanValueForField("ConfigEstimatedPremium")){
				assertReference.assertEquals(topUpMediclaimEntity.getStringValueForField("EstimatedPremium"), fetchValueFromFields(estimatedPremiumLabel), AssertionType.WARNING);
			}
			if(topUpMediclaimEntity.getBooleanValueForField("ConfigSumInsured")){
				assertReference.assertEquals(topUpMediclaimEntity.getStringValueForField("SumInsured"), fetchValueFromFields(sumInsuredLabel), AssertionType.WARNING);
			}
			if(topUpMediclaimEntity.getBooleanValueForField("ConfigNoOfMembers")){
				assertReference.assertEquals(topUpMediclaimEntity.getStringValueForField("NoOfMembers"), fetchValueFromFields(noOfMembersLabel), AssertionType.WARNING);
			}
		}

	}

	public void fillNewIndiaMediclaimDetails(TopUpMediEntity topUpMediclaimEntity,CustomAssert assertReference ) throws InterruptedException{
		if((topUpMediclaimEntity.getStringValueForField("Product").equalsIgnoreCase("New India Mediclaim"))) {
			if(topUpMediclaimEntity.getAction().equalsIgnoreCase("add")||topUpMediclaimEntity.getAction().equalsIgnoreCase("edit")){
				if(topUpMediclaimEntity.getBooleanValueForField("ConfigMemberInformation")){
					if(topUpMediclaimEntity.getBooleanValueForField("ConfigFirstMemberDOB")){
						clearAndSendKeys(proposer1DOBTextField, topUpMediclaimEntity.getStringValueForField("FirstMemberDOB"));

					}
					if(topUpMediclaimEntity.getBooleanValueForField("ConfigSumInsured")){
						scrollDown();
						click(sumInsuredDropDown);
						String SIAmount=topUpMediclaimEntity.getStringValueForField("SumInsured");
						SIRadioButton1=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+SIAmount+"'"+"]"), "Sum Insured amount", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
						click(SIRadioButton1);
						click(okButton);
					}
				}
			}
		}
	}
	public void fillNewIndiaAshaKiranDetails(TopUpMediEntity topUpMediclaimEntity,CustomAssert assertReference ) throws InterruptedException{
		if((topUpMediclaimEntity.getStringValueForField("Product").equalsIgnoreCase("New India AshaKiran"))) {
			if(topUpMediclaimEntity.getAction().equalsIgnoreCase("add")||topUpMediclaimEntity.getAction().equalsIgnoreCase("edit")){
				if(topUpMediclaimEntity.getBooleanValueForField("ConfigBasicInformation")){
					/*click(basicInformationMaximize);*/
			
				if(topUpMediclaimEntity.getBooleanValueForField("ConfigSumInsured")){
					click(sumInsuredAshaKiranDropDown);
					/*TouchAction action=new TouchAction(driver);
					action.press(PointOption.point(217,458)).release().perform();*/
					
					String SIAmount=topUpMediclaimEntity.getStringValueForField("SumInsured");
					SIRadioButton1=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+SIAmount+"'"+"]"), "Sum Insured amount", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(SIRadioButton1);
					click(okButton);
			}
				
				if(topUpMediclaimEntity.getBooleanValueForField("ConfigCityOfResidence")){
					/*click(cancelButton);*/
					/*TouchAction action=new TouchAction(driver);
					action.press(PointOption.point(701,1910)).release().perform();
					*/
					click(cityOfResidenceDropDown);
					String city=topUpMediclaimEntity.getStringValueForField("CityOfResidence");
					CityRadioButton1=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+city+"'"+"]"), "City Of Residence", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(CityRadioButton1);
					click(okButton);
					scrollDown();
			}
				}
				
				if(topUpMediclaimEntity.getBooleanValueForField("ConfigMemberInformation")){
					click(memberInformationAshaKiranMaximize);
					scrollDown();
					if(topUpMediclaimEntity.getBooleanValueForField("ConfigFirstMemberDOB")){
						clearAndSendKeys(proposer1floaterDOBTextField, topUpMediclaimEntity.getStringValueForField("FirstMemberDOB"));
					}
					if(topUpMediclaimEntity.getBooleanValueForField("ConfigSecondtMemberDOB")){
						clearAndSendKeys(proposer2floaterDOBTextField, topUpMediclaimEntity.getStringValueForField("SecondtMemberDOB"));
					}
					
					if(topUpMediclaimEntity.getBooleanValueForField("ConfigDependencyType")){
						click(dependencyDropDown);
						String dependency=topUpMediclaimEntity.getStringValueForField("DependencyType");
						DependencyRadioButton1=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+dependency+"'"+"]"), "Dependency Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
						click(DependencyRadioButton1);
						click(okButton);
				}

				}	
				
			}
				
			}
	
		
		
		

		
		
		
		
	}
	/*public void fetchQuoteNumber(TopUpMediEntity topUpMediclaimEntity) throws InterruptedException {
		topUpMediclaimEntity.setStringValueForField("QuoteNumber", fetchValueFromFields(quoteNumberLabel));
	}*/
	


	public void clickOnCalculatePremium(TopUpMediEntity topUpMediclaimEntity,CustomAssert assertReference ) throws InterruptedException{
		if(topUpMediclaimEntity.getBooleanValueForField("ConfigCalculatePremium")){
			
			if(!(topUpMediclaimEntity.getTestScenario().equalsIgnoreCase("NIAHealthMobile_Automation_TC_0004")||topUpMediclaimEntity.getTestScenario().equalsIgnoreCase("NIAHealthMobile_Automation_TC_0001")
				||topUpMediclaimEntity.getTestScenario().equalsIgnoreCase("NIAHealthMobile_Automation_TC_0005"))) {
			scrollDown();
			}
			click(calculatePremiumButton);
		}
		
	}

	public void clickOnSaveAndContinue(TopUpMediEntity topUpMediclaimEntity,CustomAssert assertReference ) throws InterruptedException{
		if(topUpMediclaimEntity.getBooleanValueForField("ConfigSaveAndContinue")){
			//scrollDown(); 
			
			Thread.sleep(2000);
			click(termsAndConditionsCheckBox1);
			Thread.sleep(2000);
			click(continueButton);
		}
	}

	public void clickOnViewBreakUpLink(TopUpMediEntity topUpMediclaimEntity,CustomAssert assertReference ) throws InterruptedException{
		if(topUpMediclaimEntity.getBooleanValueForField("ConfigViewBreakUp")){
			click(viewBreakUpLink);
		}
	}
	public void checkTermsAndConditions(TopUpMediEntity topUpMediclaimEntity,CustomAssert assertReference ) throws InterruptedException{
		if(topUpMediclaimEntity.getBooleanValueForField("ConfigTermsAndConditions")){
			check(termsAndConditionsCheckBox);
		}
	}
	private void fillNewIndiaPremierMediclaimDetails(TopUpMediEntity topUpMediclaimEntity,CustomAssert assertReference) {
		
		if(topUpMediclaimEntity.getStringValueForField("Product").equalsIgnoreCase("New India Premier Mediclaim")) {
			if(topUpMediclaimEntity.getAction().equalsIgnoreCase("add")||(topUpMediclaimEntity.getAction().equalsIgnoreCase("edit"))){
				if(topUpMediclaimEntity.getBooleanValueForField("ConfigBasicInformation")) {
					
					if(topUpMediclaimEntity.getBooleanValueForField("ConfigTypeOfCover")) {
						click(individualRadioButton);
						scrollDown();
						}
					if(topUpMediclaimEntity.getBooleanValueForField("ConfigMemberInformation")) {
						click(familyInfoPremiumMediclaimDropDown);
						scrollDown();
						clearAndSendKeys(heightInMeter, topUpMediclaimEntity.getStringValueForField("Height"));
						clearAndSendKeys(weightInKG, topUpMediclaimEntity.getStringValueForField("Weight"));
					}
					if(topUpMediclaimEntity.getBooleanValueForField("ConfigSumInsured")) {
						click(sumInsPremiumMediclaimDropDown);
						String SumIns=topUpMediclaimEntity.getStringValueForField("SumInsured");
						sumInsPremierRadioButton= new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text="+"'"+SumIns+"'"+"]"),"Sum Insured radiobutton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
					click(sumInsPremierRadioButton);
					click(okButton);
					scrollDown();
					}
				}
			}
		}
		
	}

	public void fillAndSubmitDetailedQuoteDetails(TopUpMediEntity topUpMediclaimEntity,CustomAssert assertReference,String stepGroup ) throws InterruptedException{
		if(isConfigTrue(topUpMediclaimEntity.getConfigExecute())) {
			fillNewIndiaTopUpMediclaimDetails(topUpMediclaimEntity, assertReference);	
			fillNewIndiaMediclaimDetails(topUpMediclaimEntity, assertReference);
			fillNewIndiaAshaKiranDetails(topUpMediclaimEntity, assertReference);
			fillNewIndiaPremierMediclaimDetails(topUpMediclaimEntity,assertReference);
			checkTermsAndConditions(topUpMediclaimEntity, assertReference);
			clickOnCalculatePremium(topUpMediclaimEntity, assertReference);
			//fetchQuoteNumber(topUpMediclaimEntity);
			clickOnSaveAndContinue(topUpMediclaimEntity, assertReference);
			clickOnViewBreakUpLink(topUpMediclaimEntity, assertReference);

		}
	}

	

	
	
}