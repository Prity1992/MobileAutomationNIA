package NiaMobileAutomationPages;

import org.openqa.selenium.By;

import com.aqm.staf.framework.core.CustomAssert;
import com.aqm.staf.framework.core.MobileScreen;
import com.aqm.staf.framework.core.MobileScreenElement;
import com.aqm.staf.framework.core.WaitType;
import com.aqm.staf.library.databin.AdtionalDetalsInterEntity;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class AdditionalDetailsPageForIntermidiary  extends MobileScreen {
	
	MobileScreenElement BoardDescriptionjewelleryTextBox;
	MobileScreenElement WeightVolforjewelleryTextBox;
	MobileScreenElement EnterValuejewellerytextBox;
	MobileScreenElement makeAddapplienceTextBox;
	MobileScreenElement ModelapplienceTextBox;
	MobileScreenElement YearlapplienceTextBox;
	MobileScreenElement MaketvDesktopTextBox;
	MobileScreenElement ModeltvDesktop;
	MobileScreenElement YearTvDesktopTextBox;
	MobileScreenElement NextPageRadioButton;
	
	
	public AdditionalDetailsPageForIntermidiary(AppiumDriver driver, String screenName,String DeviceOS)
	{
		super(driver,screenName,DeviceOS);
		if(DeviceOS.equalsIgnoreCase("Android"))
		{	
			BoardDescriptionjewelleryTextBox=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Add Jewellery']//following::android.widget.EditText[1]"),"Add Jewellery", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			WeightVolforjewelleryTextBox=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Add Jewellery']//following::android.widget.EditText[2]"),"Enter weight volume in details ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			EnterValuejewellerytextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Enter value of jewellery and valuables section.']//preceding::android.widget.EditText[1]"),"Enter value of jewellery", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			makeAddapplienceTextBox=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Add Appliance']//following::android.widget.EditText[1]"),"Enter make of the domestic", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			ModelapplienceTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Enter model of the domestic appliances.']//preceding::android.widget.EditText[1]"),"Enter model of the domestic appliance", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			YearlapplienceTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Enter Year for domestic appliances.']//preceding::android.widget.EditText[1]"),"Enter Year for domestic ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			MaketvDesktopTextBox=new MobileScreenElement(By.xpath("//android.widget.Button[@text='Add TV/Desktop']//following::android.widget.EditText[1]"),"Enter make of the television", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			
			ModeltvDesktop=new MobileScreenElement(By.xpath("//android.view.View[@text='Enter model of the television/desktop section.']//preceding::android.widget.EditText[1]"),"Enter model of the television/desktop", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			YearTvDesktopTextBox=new MobileScreenElement(By.xpath("//android.view.View[@text='Enter Year for television/desktop.']//preceding::android.widget.EditText[1]"),"Buy Online", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			NextPageRadioButton=new MobileScreenElement(By.xpath("//android.widget.Button[@text='next']"),"Buy Online", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			
		}
	}

	           public void fillAddJwelleryDetails(AdtionalDetalsInterEntity additionalDetailsPageForIntermidiaryEntity,CustomAssert assertReference ) throws InterruptedException{
		         if(additionalDetailsPageForIntermidiaryEntity.getAction().equalsIgnoreCase("add")||additionalDetailsPageForIntermidiaryEntity.getAction().equalsIgnoreCase("edit")){

				if(additionalDetailsPageForIntermidiaryEntity.getBooleanValueForField("ConfigboardDescriptionjewelleryTextBox")){
					clearAndSendKeys(BoardDescriptionjewelleryTextBox, additionalDetailsPageForIntermidiaryEntity.getStringValueForField("boardDescriptionjewelleryTextBox"));
				}
				
				if(additionalDetailsPageForIntermidiaryEntity.getBooleanValueForField("ConfigweightVolforjewelleryTextBox")){
					clearAndSendKeys(WeightVolforjewelleryTextBox, additionalDetailsPageForIntermidiaryEntity.getStringValueForField("weightVolforjewelleryTextBox"));
				}
				
				if(additionalDetailsPageForIntermidiaryEntity.getBooleanValueForField("ConfigenterValuejewellerytextBox")){
					clearAndSendKeys(EnterValuejewellerytextBox, additionalDetailsPageForIntermidiaryEntity.getStringValueForField("enterValuejewellerytextBox"));
				}
				
				TouchAction action=new TouchAction(driver);
				action.longPress(PointOption.point(200,2423))
				.moveTo(PointOption.point(170,247)).release().perform();	
			}
				
	}
	           
	           public void fillAddApplienceDetails(AdtionalDetalsInterEntity additionalDetailsPageForIntermidiaryEntity,CustomAssert assertReference ) throws InterruptedException{
			         if(additionalDetailsPageForIntermidiaryEntity.getAction().equalsIgnoreCase("add")||additionalDetailsPageForIntermidiaryEntity.getAction().equalsIgnoreCase("edit")){
			        	 
			         if(additionalDetailsPageForIntermidiaryEntity.getBooleanValueForField("ConfigMakeAddapplienceTextBox")){
								clearAndSendKeys(makeAddapplienceTextBox, additionalDetailsPageForIntermidiaryEntity.getStringValueForField("MakeAddapplienceTextBox"));
								scrollDown();
							 }
			        	 
			         if(additionalDetailsPageForIntermidiaryEntity.getBooleanValueForField("ConfigmodelapplienceTextBox")){
								clearAndSendKeys(ModelapplienceTextBox, additionalDetailsPageForIntermidiaryEntity.getStringValueForField("modelapplienceTextBox"));
							}
			        	 
			         if(additionalDetailsPageForIntermidiaryEntity.getBooleanValueForField("ConfigyearlapplienceTextBox")){
								clearAndSendKeys(YearlapplienceTextBox, additionalDetailsPageForIntermidiaryEntity.getStringValueForField("yearlapplienceTextBox"));
			        	    }
			         TouchAction action=new TouchAction(driver);
			         action.longPress(PointOption.point(200,2423))
			         .moveTo(PointOption.point(170,247)).release().perform();     
			         }
	           }
	           
	           public void fillAddSubmitTvDesktopDetail(AdtionalDetalsInterEntity additionalDetailsPageForIntermidiaryEntity,CustomAssert assertReference ) throws InterruptedException{
			         if(additionalDetailsPageForIntermidiaryEntity.getAction().equalsIgnoreCase("add")||additionalDetailsPageForIntermidiaryEntity.getAction().equalsIgnoreCase("edit")){
			        	 
			         }
			        	 if(additionalDetailsPageForIntermidiaryEntity.getBooleanValueForField("ConfigmaketvDesktopTextBox")){
								clearAndSendKeys(MaketvDesktopTextBox, additionalDetailsPageForIntermidiaryEntity.getStringValueForField("maketvDesktopTextBox"));
								scrollDown();
							}
			        	 
			        	 if(additionalDetailsPageForIntermidiaryEntity.getBooleanValueForField("ConfigmodeltvDesktop")){
								clearAndSendKeys(ModeltvDesktop, additionalDetailsPageForIntermidiaryEntity.getStringValueForField("modetvDesktop"));
							}
			        	 
			        	 
			        	 if(additionalDetailsPageForIntermidiaryEntity.getBooleanValueForField("ConfigyearTvDesktopTextBox")){
								clearAndSendKeys(YearTvDesktopTextBox, additionalDetailsPageForIntermidiaryEntity.getStringValueForField("yearTvDesktopTextBox"));
							}
			        	 TouchAction action=new TouchAction(driver);
			        	 action.longPress(PointOption.point(200,2423))
			        	 .moveTo(PointOption.point(170,247)).release().perform();
			        	  }
	             
	                public void clickNextPageButton(AdtionalDetalsInterEntity additionalDetailsPageForIntermidiaryEntity ,CustomAssert assertReference ) {
	                	if(additionalDetailsPageForIntermidiaryEntity.getBooleanValueForField("ConfigNextButton1")){
	                	click(NextPageRadioButton);
	                	
	                }
			         
	                }
	           public void fillAndSubmitAddtionalDetailPage(AdtionalDetalsInterEntity additionalDetailsPageForIntermidiaryEntity,CustomAssert assertReference ) throws InterruptedException {
	           
	               if(isConfigTrue(additionalDetailsPageForIntermidiaryEntity.getConfigExecute())){
	        	   
	        	   
	            	   fillAddJwelleryDetails(additionalDetailsPageForIntermidiaryEntity,assertReference);
	            	  
	            	   fillAddApplienceDetails(additionalDetailsPageForIntermidiaryEntity,assertReference);
	            	
	            	   fillAddSubmitTvDesktopDetail(additionalDetailsPageForIntermidiaryEntity,assertReference);
	            	   
	            	   clickNextPageButton(additionalDetailsPageForIntermidiaryEntity,assertReference);
	            	   
	            	   
	        	   
	           
	          
	           
				}         
}}
			