package NiaMobileAutomationPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.touch.TouchActions;

import com.aqm.staf.framework.core.AssertionType;
import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.BuyNowEntity;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;import io.appium.java_client.touch.offset.PointOption;


public class BuyNowPage extends MobileScreen {
	MobileScreenElement motorIcon;
	MobileScreenElement healthIcon;
	MobileScreenElement travelIcon;
	MobileScreenElement homeAccidentIcon;
	MobileScreenElement newIndiaTopUpMediClaimButton;
	MobileScreenElement buyOnlineButton;
	MobileScreenElement yesRadioButton;
	MobileScreenElement noRadioButton;
	MobileScreenElement continueButon;
	MobileScreenElement newIndiaFloaterMediClaimButton;
	MobileScreenElement newIndiaMediClaimButton;
	MobileScreenElement newIndiaAshaKiranButton;
	MobileScreenElement newIndiaPremierButton;
	MobileScreenElement okButton;
	MobileScreenElement privateCarButton;
	MobileScreenElement businessAndHolidayButton;
	MobileScreenElement overseasMediButton;
	MobileScreenElement buyInsuranceForNewVehicleButton;
	MobileScreenElement  PersonalAccidentButton;
	MobileScreenElement  grihaSuvidhaButton;
    MobileScreenElement buyInsuForNewVehicleButton;
    MobileScreenElement renewExistingPolicyButton;
    MobileScreenElement submitButton;
    MobileScreenElement submitButtonMediclaim;
	MobileScreenElement productLabel;
    MobileScreenElement newIndiaPremierMediClaimButton;
	public BuyNowPage(AppiumDriver driver, String screenName,String DeviceOS)
	{
		super(driver,screenName,DeviceOS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		if(DeviceOS.equalsIgnoreCase("Android"))
		{	
			motorIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='MOTOR' and @index='1']"),"Motor", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			healthIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='Health']"),"Health", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			travelIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='Travel']"),"Travel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			homeAccidentIcon=new MobileScreenElement(By.xpath("//android.view.View[@text='HOME AND ACCIDENT']"),"Home And Accident", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			newIndiaTopUpMediClaimButton=new MobileScreenElement(By.xpath("//android.view.View[@index='1' and @text='New India Top up Mediclaim']"),"New India Top Up Mediclaim", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			
			newIndiaFloaterMediClaimButton=new MobileScreenElement(By.xpath("//android.view.View[@text='New India Floater Mediclaim']"),"New India Floater Mediclaim", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			newIndiaMediClaimButton=new MobileScreenElement(By.xpath("//android.view.View[@text='New India Mediclaim']"),"New India Mediclaim", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			newIndiaAshaKiranButton=new MobileScreenElement(By.xpath("//android.widget.Image[@text='Asha Kiran']"),"New India Asha Kiran", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			newIndiaPremierButton= new MobileScreenElement(By.xpath("//android.view.View[@text='New India Premier']"),"New India Asha Kiran", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			buyOnlineButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Buy Online']"),"Buy Online", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			yesRadioButton=new MobileScreenElement(By.id("com.nia.customer:id/healthConfirm1"),"Yes", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			noRadioButton=new MobileScreenElement(By.id("com.nia.customer:id/healthConfirm2"),"No", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			continueButon=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Continue']"),"Continue", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			okButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='OK']"),"OK", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			privateCarButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Private Car']"),"Private Car", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);		
			businessAndHolidayButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Overseas Mediclaim (Bus & Hol)']"),"Business And Holiday", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			
			
			overseasMediButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Overseas Mediclaim (Bus & Hol)']"),"Overseas Mediclaim Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			buyInsuranceForNewVehicleButton=new MobileScreenElement(By.xpath("//android.view.View[@text='Buy insurance for a new vehicle' and @index='0']"),"Buy Insurance For New Vehicle", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			PersonalAccidentButton=new MobileScreenElement(By.xpath("//android.view.View[@text='PERSONAL ACCIDENT' and @index='0']"),"PERSONAL ACCIDEN", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			grihaSuvidhaButton=new MobileScreenElement(By.xpath("//android.view.View[@text='GRIHA SUVIDHA' and @index='1']"),"GRIHA SUVIDHA", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			buyInsuForNewVehicleButton= new MobileScreenElement(By.xpath("//android.view.View[@text='Buy insurance for a new vehicle']"),"Buy insurance for a new vehicle", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
			renewExistingPolicyButton= new MobileScreenElement(By.xpath("//android.view.View[@text='Renew existing policy from any insurer']"),"Renew existing policy from any insurer", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
			submitButton= new MobileScreenElement(By.xpath("//android.widget.Button[@text='Submit']"),"Click on Submit Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);  
			submitButtonMediclaim= new MobileScreenElement(By.xpath("//android.view.View[@text='Has any person to be insured been suffering /diagnosed / under treatment for any Hypertension / diabetes / critical illness / Adverse Medical History / chronic illness / recurring illness / Psychiatric and Psychosomatic Disorder during any time in past?']//following::android.widget.Button[1]"),"Click on Submit Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
			productLabel= new MobileScreenElement(By.xpath("//android.view.View[@index='0']"),"Submit Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
			newIndiaPremierMediClaimButton= new MobileScreenElement(By.xpath("//android.view.View[@text='New India Premier Mediclaim']"),"New India Premier Mediclaim Lable", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		}
	}

	public void fillBuyNowDetails(BuyNowEntity buyNowEntity,CustomAssert assertReference ) throws InterruptedException{
		if(buyNowEntity.getAction().equalsIgnoreCase("add")||buyNowEntity.getAction().equalsIgnoreCase("edit")){
			if(buyNowEntity.getBooleanValueForField("ConfigMotor")){
				//click(motorIcon);
				if(buyNowEntity.getBooleanValueForField("ConfigPrivateCar")){
					click(privateCarButton);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigTwoWheeler")){
					//click(overseasMediButton);
					if(buyNowEntity.getBooleanValueForField("ConfigBuyInsuranceForNewVehicle")){
						click(buyInsuranceForNewVehicleButton);
						
					}
				}
			}
			if(buyNowEntity.getBooleanValueForField("ConfigHealth")){
				if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaTopUpMediClaim")){
					/*TouchAction action=new TouchAction(driver);
					action.press(PointOption.point(763,222)).release().perform();*/
					//click(productLabel);
					//scrollDown();
					click(newIndiaTopUpMediClaimButton);
					if(buyNowEntity.getBooleanValueForField("ConfigBuyOnline")){
						/*waitForElementVisibilityLocated(By.className("android.widget.Image"));*/
						if(buyNowEntity.getBooleanValueForField("ConfigIfPreExistingDisease")){
							click(yesRadioButton);
							click(continueButon);
							click(okButton);
						}
						else if(buyNowEntity.getBooleanValueForField("ConfigNoPreExistingDisease")){
							/*TouchAction action1=new TouchAction(driver);
							action1.press(PointOption.point(712,1396)).release().perform();*/
							
							click(submitButton);	
						}
					}
				}
				if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaFloaterMediClaim")){
					click(newIndiaFloaterMediClaimButton);
					if(buyNowEntity.getBooleanValueForField("ConfigBuyOnline")){
						
						if(buyNowEntity.getBooleanValueForField("ConfigIfPreExistingDisease")){
							click(yesRadioButton);
							click(continueButon);
							click(okButton);
						}
						else if(buyNowEntity.getBooleanValueForField("ConfigNoPreExistingDisease")){
							
							click(submitButton);
								
						}
					}
				}
				if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaMediClaim")){
					click(newIndiaMediClaimButton);
					if(buyNowEntity.getBooleanValueForField("ConfigBuyOnline")){
						if(buyNowEntity.getBooleanValueForField("ConfigIfPreExistingDisease")){
							click(yesRadioButton);
							click(continueButon);
							click(okButton);
						}
						else if(buyNowEntity.getBooleanValueForField("ConfigNoPreExistingDisease")){
							click(submitButtonMediclaim);
						}
					}
				}
				if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaAshaKiran")){
					Thread.sleep(5000);
					click(newIndiaAshaKiranButton);
					/*TouchAction action=new TouchAction(driver);
					action.press(PointOption.point(662,720)).release().perform();	*/

					if(buyNowEntity.getBooleanValueForField("ConfigBuyOnline")){
						/*scrollDown();
						Thread.sleep(2000);
						scrollDown();
						click(buyOnlineButton);*/
						if(buyNowEntity.getBooleanValueForField("ConfigIfPreExistingDisease")){
							click(yesRadioButton);
							click(continueButon);
							click(okButton);
						}
						else if(buyNowEntity.getBooleanValueForField("ConfigNoPreExistingDisease")){
							//click(noRadioButton);
							//click(continueButon);
							click(submitButton);
							Thread.sleep(5000);
							/*TouchAction action1=new TouchAction(driver);
							action1.press(PointOption.point(725,1711)).release().perform();*/
						}
					}
				}
				if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaPremierMediClaim")){
					click(newIndiaPremierMediClaimButton);
					if(buyNowEntity.getBooleanValueForField("ConfigBuyOnline")){
						if(buyNowEntity.getBooleanValueForField("ConfigIfPreExistingDisease")){
							click(yesRadioButton);
							click(continueButon);
							click(okButton);
						}
						else if(buyNowEntity.getBooleanValueForField("ConfigNoPreExistingDisease")){
							click(submitButtonMediclaim);
						}
					}
				}
			}
			if(buyNowEntity.getBooleanValueForField("ConfigTravel")){
				//click(travelIcon);
				if(buyNowEntity.getBooleanValueForField("ConfigBusinessAndHoliday")){
					click(businessAndHolidayButton);
					
					if(buyNowEntity.getBooleanValueForField("ConfigBuyOnline")){
						
						/*MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
								"new UiScrollable(new UiSelector().className(\"" + android.webkit.WebView + "\")).getChildByDescription("
								+ "new UiSelector().resource-id(\"" + buyOnline + "\")"));*/
						/*TouchActions action = new TouchActions(driver);
						action.down(10, 10);*/
						/*action.scroll(element, 10, 100);*/
						//action.perform();
						//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)", "");
						//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buyOnlineButton);
						//click(buyOnlineButton);
						if(buyNowEntity.getBooleanValueForField("ConfigIfPreExistingDisease")){
							click(yesRadioButton);
							click(continueButon);
							click(okButton);
						}
						else if(buyNowEntity.getBooleanValueForField("ConfigNoPreExistingDisease")){
							//click(noRadioButton);
							
							click(submitButton);
							
						}
					}
				}
			}
			if(buyNowEntity.getBooleanValueForField("ConfigHomeAndAccident")){
				click(homeAccidentIcon);
				if(buyNowEntity.getBooleanValueForField("ConfigPersonalAccident")){
					click(PersonalAccidentButton);
				}
				else if(buyNowEntity.getBooleanValueForField("ConfigGrihaSuvidha")){
					click(grihaSuvidhaButton);
				}
			}

		}
			if(buyNowEntity.getAction().equalsIgnoreCase("verify")) {
				if(buyNowEntity.getBooleanValueForField("ConfigMotorLabel")){
					assertReference.assertEquals(buyNowEntity.getStringValueForField("MotorLabel"), fetchValueFromFields(motorIcon), AssertionType.WARNING);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigHealthLabel")){
					assertReference.assertEquals(buyNowEntity.getStringValueForField("HealthLabel"), fetchValueFromFields(healthIcon), AssertionType.WARNING);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigTravelLabel")){
					assertReference.assertEquals(buyNowEntity.getStringValueForField("TravelLabel"), fetchValueFromFields(travelIcon), AssertionType.WARNING);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigHomeAndAccidentLabel")){
					assertReference.assertEquals(buyNowEntity.getStringValueForField("HomeAndAccidentLabel"), fetchValueFromFields(homeAccidentIcon), AssertionType.WARNING);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigBusinessAndHolidayLabel")){
					assertReference.assertEquals(buyNowEntity.getStringValueForField("BusinessAndHolidayLabel"), fetchValueFromFields(businessAndHolidayButton), AssertionType.WARNING);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigPersonalAccidentLabel")){
					assertReference.assertEquals(buyNowEntity.getStringValueForField("PersonalAccidentLabel"), fetchValueFromFields(PersonalAccidentButton), AssertionType.WARNING);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigGrihaSuvidhaLabel")){
					assertReference.assertEquals(buyNowEntity.getStringValueForField("GrihaSuvidhaLabel"), fetchValueFromFields(grihaSuvidhaButton), AssertionType.WARNING);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaTopUpLabel")){
					//click(healthIcon);
					assertReference.assertEquals(buyNowEntity.getStringValueForField("NewIndiaTopUpLabel"), fetchValueFromFields(newIndiaTopUpMediClaimButton), AssertionType.WARNING);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaFloaterLabel")){
					assertReference.assertEquals(buyNowEntity.getStringValueForField("NewIndiaFloaterLabel"), fetchValueFromFields(newIndiaFloaterMediClaimButton), AssertionType.WARNING);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaMediclaimLabel")){
					assertReference.assertEquals(buyNowEntity.getStringValueForField("NewIndiaMediclaimLabel"), fetchValueFromFields(newIndiaMediClaimButton), AssertionType.WARNING);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaAshaKiranLabel")){
					assertReference.assertEquals(buyNowEntity.getStringValueForField("NewIndiaAshaKiranLabel"), fetchValueFromFields(newIndiaAshaKiranButton), AssertionType.WARNING);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigNewIndiaPremierLabel")){
					assertReference.assertEquals(buyNowEntity.getStringValueForField("NewIndiaPremierLabel"), fetchValueFromFields(newIndiaPremierButton), AssertionType.WARNING);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigPrivateCarLabel")){
					//click(motorIcon);
					assertReference.assertEquals(buyNowEntity.getStringValueForField("PrivateCarLabel"), fetchValueFromFields(privateCarButton), AssertionType.WARNING);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigTwoWheelerLabel")){
					assertReference.assertEquals(buyNowEntity.getStringValueForField("TwoWheelerLabel"), fetchValueFromFields(overseasMediButton), AssertionType.WARNING);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigBuyInsuForNewVehicle")){
					assertReference.assertEquals(buyNowEntity.getStringValueForField("BuyInsuForNewVehicleLabel"), fetchValueFromFields(buyInsuForNewVehicleButton), AssertionType.WARNING);
				}
				if(buyNowEntity.getBooleanValueForField("ConfigRenewExistingPolicy")){
					assertReference.assertEquals(buyNowEntity.getStringValueForField("RenewExistingPolicyLabel"), fetchValueFromFields(renewExistingPolicyButton), AssertionType.WARNING);
				}
		}

		else if(buyNowEntity.getAction().equalsIgnoreCase("verify")) {
			if(buyNowEntity.getBooleanValueForField("ConfigBusinessAndHolidayLabel")){
				assertReference.assertEquals(buyNowEntity.getStringValueForField("BusinessAndHolidayLabel"), fetchValueFromFields(businessAndHolidayButton), AssertionType.WARNING);
			}
			if(buyNowEntity.getBooleanValueForField("ConfigPersonalAccidentLabel")){
				assertReference.assertEquals(buyNowEntity.getStringValueForField("PersonalAccidentLabel"), fetchValueFromFields(PersonalAccidentButton), AssertionType.WARNING);
			}
			if(buyNowEntity.getBooleanValueForField("ConfigGrihaSuvidhaLabel")){
				assertReference.assertEquals(buyNowEntity.getStringValueForField("GrihaSuvidhaLabel"), fetchValueFromFields(grihaSuvidhaButton), AssertionType.WARNING);
			}
			}

		}
	

	public void fillAndSubmitBuyDetails(BuyNowEntity buyNowEntity,CustomAssert assertReference,String stepGroup) throws InterruptedException{
		if(isConfigTrue(buyNowEntity.getConfigExecute()))		
		{
			fillBuyNowDetails(buyNowEntity, assertReference);
		}
	}
}