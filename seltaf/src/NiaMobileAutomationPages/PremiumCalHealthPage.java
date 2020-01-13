package NiaMobileAutomationPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.BuyNowInterEntity;
import com.aqm.staf.library.databin.PremiumCalEntity;
import com.aqm.staf.library.databin.TopUpMediEntity;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class PremiumCalHealthPage extends MobileScreen {
	MobileScreenElement floaterCoverRadioButton;
	MobileScreenElement thresholdLimitDropDown;
	MobileScreenElement sumInsuredDropDown;
	MobileScreenElement proposer1DOBTextField;
	MobileScreenElement individualCoverRadioButton;
	MobileScreenElement thresholdRadioButton1;
	MobileScreenElement SIRadioButton1;
	MobileScreenElement termsAndConditionsCheckBox;
	MobileScreenElement calculatePremiumButton;
	MobileScreenElement addSpouseButton;
	MobileScreenElement addChildButton;
	MobileScreenElement planARadioButton1;
	MobileScreenElement planADropDown;
	MobileScreenElement spouse1DOBTextField;
	MobileScreenElement continueButton;
	MobileScreenElement yearDropdown;
	MobileScreenElement yearOption;
	MobileScreenElement dateOption;
	MobileScreenElement sumInsuredDropDown2;
	MobileScreenElement termsAndConditionsCheckBox2;
	public PremiumCalHealthPage(AppiumDriver driver, String screenName,String DeviceOS)
	{
		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android"))
		{
			floaterCoverRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[contains(@text=' Floater')]"),"Floater", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			individualCoverRadioButton=new MobileScreenElement(By.xpath("//android.widget.RadioButton[@text='Individual']"),"Individual", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			proposer1DOBTextField= new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='proposerDateOfBirth']"), "DOB", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			thresholdLimitDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Select Threshold Limit' and @resource-id='proposerthresholdLmt']"),"Thershold Limit", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	        
			
			//thresholdLimitDropDown=new MobileScreenElement(MobileBy.AndroidUIAutomator(String.format("new UiSelector().index(6).clickable(true).resource-id(\"proposerthresholdLmt\")")),"Thershold Limit", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			sumInsuredDropDown=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Select Sum Insured']"),"Sum Insured", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			termsAndConditionsCheckBox= new MobileScreenElement(By.xpath("//android.widget.CheckBox[@index='3']"), "Terms And Conditions", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			calculatePremiumButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Save and Calculate Premium']"), "Calculate Premium", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			addSpouseButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Add Spouse']"), "Add Spouse", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			addChildButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Add Child']"), "Add Child", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			planADropDown= new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Plan A']"), "Plan A", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			spouse1DOBTextField= new MobileScreenElement(By.xpath("//android.widget.EditText[@resource-id='spouseDateOfBirth']"), "Spouse", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			continueButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Continue']"), "Continue", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			yearDropdown= new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='2019']"), "Year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			yearOption= new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text='1995']"), "Year", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			dateOption= new MobileScreenElement(By.xpath("//android.view.View[@text='21']"), "Date", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			sumInsuredDropDown2=new MobileScreenElement(By.xpath("//android.widget.Spinner[@text='Select Sum Insured(in Rs.)']"),"Sum Insured", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
			//termsAndConditionsCheckBox2= new MobileScreenElement(By.xpath("//android.view.View[@text='I agree with the ']/preceding::android.widget.CheckBox[1]"), "Terms And Conditions", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
			termsAndConditionsCheckBox2= new MobileScreenElement(By.xpath("//android.view.View[@text='I agree with the ']/preceding::android.widget.CheckBox"), "Terms And Conditions", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		}
	}

	public void fillNewIndiaTopUpMediclaimDetails(PremiumCalEntity premiumCalculator,CustomAssert assertReference ) throws InterruptedException{
		if(premiumCalculator.getAction().equalsIgnoreCase("add")||premiumCalculator.getAction().equalsIgnoreCase("edit")){
			if((premiumCalculator.getStringValueForField("Product").equalsIgnoreCase("New India Top Up"))) {
				if(premiumCalculator.getBooleanValueForField("ConfigFloater")){
					click(floaterCoverRadioButton);
					if(premiumCalculator.getBooleanValueForField("ConfigThresholdLimit")){
						selectValueFromList(thresholdLimitDropDown, premiumCalculator.getStringValueForField("ThresholdLimit"));
					}
					if(premiumCalculator.getBooleanValueForField("ConfigSumInsured")){
						selectValueFromList(sumInsuredDropDown, premiumCalculator.getStringValueForField("SumInsured"));
					}

					if(premiumCalculator.getBooleanValueForField("ConfigFirstMemberDOB")){
						clearAndSendKeys(proposer1DOBTextField, premiumCalculator.getStringValueForField("FirstMemberDOB"));
					}

				}

				else if (premiumCalculator.getBooleanValueForField("ConfigIndividual")){
					click(individualCoverRadioButton);


					if(premiumCalculator.getBooleanValueForField("ConfigFirstMemberDOB")){
						click(proposer1DOBTextField);
						click(yearDropdown);
						//scrollUp();
						//scrollUp();
						//scrollUp();
						TouchAction action=new TouchAction(driver);
						action.longPress(PointOption.point(170,247))
						.moveTo(PointOption.point(200,2423)).release().perform();
												
						TouchAction action1=new TouchAction(driver);
						action1.longPress(PointOption.point(170,247))
						.moveTo(PointOption.point(200,2423)).release().perform();
						click(yearOption);
						click(dateOption);
					}
					scrollDown();
					//scrollToElementForward();
					if(premiumCalculator.getBooleanValueForField("ConfigThresholdLimit")){
						//touchactionClick(thresholdLimitDropDown);
						
						TouchAction action= new TouchAction(driver);
						action.press(PointOption.point(1158, 958)).release().perform();
						
						String Amount=premiumCalculator.getStringValueForField("ThresholdLimit");
						thresholdRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+Amount+"'"+"]"), "Threshold amount", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
						click(thresholdRadioButton1);
						//selectValueFromList(thresholdLimitDropDown, topUpMediclaimEntity.getStringValueForField("ThresholdLimit"));
					}
					if(premiumCalculator.getBooleanValueForField("ConfigSumInsured")){
						//touchactionClick(sumInsuredDropDown);
						
						TouchAction action= new TouchAction(driver);
						action.press(PointOption.point(1156, 1315
								)).release().perform();
						
						String SIAmount=premiumCalculator.getStringValueForField("SumInsured");
						SIRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+SIAmount+"'"+"]"), "Sum Insured amount", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
						click(SIRadioButton1);
						//selectValueFromList(sumInsuredDropDown, topUpMediclaimEntity.getStringValueForField("SumInsured"));

					}		
				}
			}

			if((premiumCalculator.getStringValueForField("Product").equalsIgnoreCase("New Premier Mediclaim"))) {
				if(premiumCalculator.getBooleanValueForField("ConfigPlanA")){
					click(planADropDown);
					String planA=premiumCalculator.getStringValueForField("PlanA");
					planARadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+planA+"'"+"]"), "Plan A", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(planARadioButton1);
					//selectValueFromList(sumInsuredDropDown, topUpMediclaimEntity.getStringValueForField("SumInsured"));
					if(premiumCalculator.getBooleanValueForField("ConfigSumInsured")){
						click(sumInsuredDropDown);
						String SIAmount=premiumCalculator.getStringValueForField("SumInsured");
						SIRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+SIAmount+"'"+"]"), "Sum Insured amount", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
						click(SIRadioButton1);
						//selectValueFromList(sumInsuredDropDown, topUpMediclaimEntity.getStringValueForField("SumInsured"));

					}	
					if(premiumCalculator.getBooleanValueForField("ConfigFirstMemberDOB")){
						clearAndSendKeys(proposer1DOBTextField, premiumCalculator.getStringValueForField("FirstMemberDOB"));
					}
				}		
				else if(premiumCalculator.getBooleanValueForField("ConfigPlanB")){
				}
			}

			if((premiumCalculator.getStringValueForField("Product").equalsIgnoreCase("New India Mediclaim"))) {
				if(premiumCalculator.getBooleanValueForField("ConfigFirstMemberDOB")){
					clearAndSendKeys(proposer1DOBTextField, premiumCalculator.getStringValueForField("FirstMemberDOB"));
				}
				if(premiumCalculator.getBooleanValueForField("ConfigSumInsured")){
					click(sumInsuredDropDown);
					String SIAmount=premiumCalculator.getStringValueForField("SumInsured");
					SIRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+SIAmount+"'"+"]"), "Sum Insured amount", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(SIRadioButton1);
					//selectValueFromList(sumInsuredDropDown, topUpMediclaimEntity.getStringValueForField("SumInsured"));

				}	
			}
			if((premiumCalculator.getStringValueForField("Product").equalsIgnoreCase("New India Floater Mediclaim"))) {
				if(premiumCalculator.getBooleanValueForField("ConfigSumInsured")){
					/*scrollToElementBackward();*/
					click(sumInsuredDropDown2);
					String SIAmount=premiumCalculator.getStringValueForField("SumInsured");
					SIRadioButton1=new MobileScreenElement(By.xpath("//android.widget.CheckedTextView[@text="+"'"+SIAmount+"'"+"]"), "Sum Insured amount", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
					click(SIRadioButton1);
					/*scrollToElementForward();*/
					scrollDown();
					if(premiumCalculator.getBooleanValueForField("ConfigFirstMemberDOB")){
						click(proposer1DOBTextField);
						click(yearDropdown);
						/*scrollToElementBackward();
						scrollToElementBackward();
						scrollToElementBackward();*/
						TouchAction action=new TouchAction(driver);
						action.longPress(PointOption.point(170,247))
						.moveTo(PointOption.point(200,2423)).release().perform();
						
						TouchAction action1=new TouchAction(driver);
						action1.longPress(PointOption.point(170,247))
						.moveTo(PointOption.point(200,2423)).release().perform();
						
						click(yearOption);
						click(dateOption);
					}
					if(premiumCalculator.getBooleanValueForField("ConfigSpousebu")){
					click(addSpouseButton);
					}
					
					if(premiumCalculator.getBooleanValueForField("ConfigSpouseDob")){
						click(spouse1DOBTextField);
						click(yearDropdown);
						TouchAction action=new TouchAction(driver);
						action.longPress(PointOption.point(170,247))
						.moveTo(PointOption.point(200,2423)).release().perform();
						
						TouchAction action1=new TouchAction(driver);
						action1.longPress(PointOption.point(170,247))
						.moveTo(PointOption.point(200,2423)).release().perform();
						click(yearOption);
						click(dateOption);
					}
				}	
				
				
			}
			if((premiumCalculator.getStringValueForField("Product").equalsIgnoreCase("New India Asha Kiran"))) {
			}		
		}
	}

	public void checkTermsAndConditions(PremiumCalEntity premiumCalculator,CustomAssert assertReference ) throws InterruptedException{
		if(premiumCalculator.getBooleanValueForField("ConfigTermsAndConditions")){
			scrollToElementForward();
			check(termsAndConditionsCheckBox);
			//scrollToElementForward();
		}
	}
	
	
	
	public void checkTermsAndConditions2(PremiumCalEntity premiumCalculator,CustomAssert assertReference ) throws InterruptedException{
		if(premiumCalculator.getBooleanValueForField("ConfigTermsAndConditio")){
			scrollDown();
			Thread.sleep(2000);
			click(termsAndConditionsCheckBox2);
		}
	}
	
	
	public void clickOnContinueButton(PremiumCalEntity premiumCalculator,CustomAssert assertReference ) throws InterruptedException{
		if(premiumCalculator.getBooleanValueForField("ConfigContinue")){
			click(continueButton);
		}
	}

	public void clickOnCalculatePremium(PremiumCalEntity premiumCalculator,CustomAssert assertReference ) throws InterruptedException{
		if(premiumCalculator.getBooleanValueForField("ConfigCalculatePremium")){
			click(calculatePremiumButton);
		}
	}

	public void fillAndSubmitPremiumCalculDetails(PremiumCalEntity premiumCalculator,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(premiumCalculator.getConfigExecute()))		
		{
			fillNewIndiaTopUpMediclaimDetails(premiumCalculator, assertReference);
			checkTermsAndConditions(premiumCalculator, assertReference);
			checkTermsAndConditions2(premiumCalculator, assertReference);
			clickOnCalculatePremium(premiumCalculator, assertReference);
			clickOnContinueButton(premiumCalculator, assertReference);

		}
	}
}